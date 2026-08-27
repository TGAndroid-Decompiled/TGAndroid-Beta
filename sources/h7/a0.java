package h7;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public abstract class a0 {
    public static String a(BufferedInputStream bufferedInputStream, ArrayList arrayList) throws IOException {
        String strB;
        do {
            strB = b(bufferedInputStream, arrayList);
            if (strB == null) {
                throw new IOException("Unexpected EOF in header");
            }
        } while (strB.startsWith("#"));
        return strB;
    }

    public static String b(BufferedInputStream bufferedInputStream, ArrayList arrayList) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            bufferedInputStream.mark(1);
            int i10 = bufferedInputStream.read();
            if (i10 == -1) {
                if (sb2.length() == 0) {
                    return null;
                }
                return sb2.toString();
            }
            if (Character.isWhitespace(i10)) {
                if (sb2.length() > 0) {
                    return sb2.toString();
                }
            } else {
                if (i10 != 35) {
                    sb2.append((char) i10);
                    while (true) {
                        bufferedInputStream.mark(1);
                        int i11 = bufferedInputStream.read();
                        if (i11 == -1 || Character.isWhitespace(i11)) {
                            break;
                        }
                        if (i11 == 35) {
                            bufferedInputStream.reset();
                            return sb2.toString();
                        }
                        sb2.append((char) i11);
                    }
                    return sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder();
                while (true) {
                    int i12 = bufferedInputStream.read();
                    if (i12 == -1 || i12 == 10) {
                        break;
                    }
                    if (i12 != 13) {
                        sb3.append((char) i12);
                    }
                }
                arrayList.add(sb3.toString());
                if (sb2.length() > 0) {
                    return sb2.toString();
                }
            }
        }
    }

    public static int c(String str, String str2) throws IOException {
        try {
            int i10 = Integer.parseInt(str);
            if (i10 > 0) {
                return i10;
            }
            throw new IOException("Invalid " + str2 + ": " + i10);
        } catch (NumberFormatException e9) {
            throw new IOException(i0.a.n("Invalid ", str2, ": ", str), e9);
        }
    }

    public static Bitmap d(GZIPInputStream gZIPInputStream, ArrayList arrayList) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(gZIPInputStream);
        String strB = b(bufferedInputStream, arrayList);
        if (!"P5".equals(strB)) {
            throw new IOException(s3.c.e("Not a binary PGM (P5), got: ", strB));
        }
        int iC = c(a(bufferedInputStream, arrayList), "width");
        int iC2 = c(a(bufferedInputStream, arrayList), "height");
        int iC3 = c(a(bufferedInputStream, arrayList), "maxval");
        if (iC3 != 255) {
            throw new IOException(i0.a.k(iC3, "Only 8-bit PGM supported (maxval=255), got: "));
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC, iC2, Bitmap.Config.ALPHA_8);
        int rowBytes = bitmapCreateBitmap.getRowBytes();
        byte[] bArr = new byte[rowBytes * iC2];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byte[] bArr2 = new byte[iC];
        int i10 = 0;
        for (int i11 = 0; i11 < iC2; i11++) {
            int i12 = 0;
            while (i12 < iC) {
                int i13 = bufferedInputStream.read(bArr2, i12, iC - i12);
                if (i13 < 0) {
                    throw new IOException("Unexpected EOF");
                }
                i12 += i13;
            }
            System.arraycopy(bArr2, 0, bArr, i10, iC);
            i10 += rowBytes;
        }
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferWrap);
        return bitmapCreateBitmap;
    }

    public static void e(Bitmap bitmap, GZIPOutputStream gZIPOutputStream, List list) throws IOException {
        if (bitmap.getConfig() != Bitmap.Config.ALPHA_8) {
            throw new IllegalArgumentException("Only Bitmap.Config.ALPHA_8 is supported");
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        gZIPOutputStream.write("P5\n".getBytes(StandardCharsets.US_ASCII));
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                gZIPOutputStream.write(a9.p.m("#", str == null ? "" : str.replace('\r', ' ').replace('\n', ' '), "\n").getBytes(StandardCharsets.US_ASCII));
            }
        }
        Charset charset = StandardCharsets.US_ASCII;
        gZIPOutputStream.write((width + " " + height + "\n").getBytes(charset));
        gZIPOutputStream.write("255\n".getBytes(charset));
        int rowBytes = bitmap.getRowBytes();
        byte[] bArr = new byte[rowBytes * height];
        bitmap.copyPixelsToBuffer(ByteBuffer.wrap(bArr));
        int i10 = 0;
        int i11 = 0;
        while (i10 < height) {
            gZIPOutputStream.write(bArr, i11, width);
            i10++;
            i11 += rowBytes;
        }
    }
}
