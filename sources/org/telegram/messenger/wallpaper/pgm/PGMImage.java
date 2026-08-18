package org.telegram.messenger.wallpaper.pgm;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

public abstract class PGMImage {
    public static void write(Bitmap bitmap, OutputStream outputStream, List list) throws IOException {
        if (bitmap.getConfig() != Bitmap.Config.ALPHA_8) {
            throw new IllegalArgumentException("Only Bitmap.Config.ALPHA_8 is supported");
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        outputStream.write("P5\n".getBytes(StandardCharsets.US_ASCII));
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                outputStream.write(("#" + (str == null ? "" : str.replace('\r', ' ').replace('\n', ' ')) + "\n").getBytes(StandardCharsets.US_ASCII));
            }
        }
        Charset charset = StandardCharsets.US_ASCII;
        outputStream.write((width + " " + height + "\n").getBytes(charset));
        outputStream.write("255\n".getBytes(charset));
        int rowBytes = bitmap.getRowBytes();
        byte[] bArr = new byte[rowBytes * height];
        bitmap.copyPixelsToBuffer(ByteBuffer.wrap(bArr));
        int i = 0;
        int i2 = 0;
        while (i < height) {
            outputStream.write(bArr, i2, width);
            i++;
            i2 += rowBytes;
        }
    }

    public static Bitmap read(InputStream inputStream, List list) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        String strNextToken = nextToken(bufferedInputStream, list);
        if (!"P5".equals(strNextToken)) {
            throw new IOException("Not a binary PGM (P5), got: " + strNextToken);
        }
        int positiveInt = parsePositiveInt(nextNonCommentToken(bufferedInputStream, list), "width");
        int positiveInt2 = parsePositiveInt(nextNonCommentToken(bufferedInputStream, list), "height");
        int positiveInt3 = parsePositiveInt(nextNonCommentToken(bufferedInputStream, list), "maxval");
        if (positiveInt3 != 255) {
            throw new IOException("Only 8-bit PGM supported (maxval=255), got: " + positiveInt3);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(positiveInt, positiveInt2, Bitmap.Config.ALPHA_8);
        int rowBytes = bitmapCreateBitmap.getRowBytes();
        byte[] bArr = new byte[rowBytes * positiveInt2];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byte[] bArr2 = new byte[positiveInt];
        int i = 0;
        for (int i2 = 0; i2 < positiveInt2; i2++) {
            readFully(bufferedInputStream, bArr2, 0, positiveInt);
            System.arraycopy(bArr2, 0, bArr, i, positiveInt);
            i += rowBytes;
        }
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferWrap);
        return bitmapCreateBitmap;
    }

    private static int parsePositiveInt(String str, String str2) throws IOException {
        try {
            int i = Integer.parseInt(str);
            if (i > 0) {
                return i;
            }
            throw new IOException("Invalid " + str2 + ": " + i);
        } catch (NumberFormatException e) {
            throw new IOException("Invalid " + str2 + ": " + str, e);
        }
    }

    private static String nextToken(BufferedInputStream bufferedInputStream, List list) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            bufferedInputStream.mark(1);
            int i = bufferedInputStream.read();
            if (i == -1) {
                if (sb.length() == 0) {
                    return null;
                }
                return sb.toString();
            }
            if (Character.isWhitespace(i)) {
                if (sb.length() > 0) {
                    return sb.toString();
                }
            } else if (i == 35) {
                String lineAscii = readLineAscii(bufferedInputStream);
                if (list != null) {
                    list.add(lineAscii);
                }
                if (sb.length() > 0) {
                    return sb.toString();
                }
            } else {
                sb.append((char) i);
                while (true) {
                    bufferedInputStream.mark(1);
                    int i2 = bufferedInputStream.read();
                    if (i2 == -1 || Character.isWhitespace(i2)) {
                        break;
                    }
                    if (i2 == 35) {
                        bufferedInputStream.reset();
                        return sb.toString();
                    }
                    sb.append((char) i2);
                }
                return sb.toString();
            }
        }
    }

    private static String nextNonCommentToken(BufferedInputStream bufferedInputStream, List list) throws IOException {
        String strNextToken;
        do {
            strNextToken = nextToken(bufferedInputStream, list);
            if (strNextToken == null) {
                throw new IOException("Unexpected EOF in header");
            }
        } while (strNextToken.startsWith("#"));
        return strNextToken;
    }

    private static String readLineAscii(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = inputStream.read();
            if (i == -1 || i == 10) {
                break;
            }
            if (i != 13) {
                sb.append((char) i);
            }
        }
        return sb.toString();
    }

    private static void readFully(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i + i3, i2 - i3);
            if (i4 < 0) {
                throw new IOException("Unexpected EOF");
            }
            i3 += i4;
        }
    }
}
