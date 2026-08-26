package org.telegram.messenger.wallpaper.pgm;

import android.graphics.Bitmap;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zzig;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
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

public abstract class PGMImage {
    public static String nextToken(BufferedInputStream bufferedInputStream, ArrayList arrayList) throws IOException {
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
            } else {
                if (i != 35) {
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
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int i3 = bufferedInputStream.read();
                    if (i3 == -1 || i3 == 10) {
                        break;
                    }
                    if (i3 != 13) {
                        sb2.append((char) i3);
                    }
                }
                arrayList.add(sb2.toString());
                if (sb.length() > 0) {
                    return sb.toString();
                }
            }
        }
    }

    public static int parsePositiveInt(String str, String str2) throws IOException {
        try {
            int i = Integer.parseInt(str);
            if (i > 0) {
                return i;
            }
            throw new IOException("Invalid " + str2 + ": " + i);
        } catch (NumberFormatException e) {
            throw new IOException(Fragment$$ExternalSyntheticOutline0.m("Invalid ", str2, ": ", str), e);
        }
    }

    public static Bitmap read(GZIPInputStream gZIPInputStream, ArrayList arrayList) throws IOException {
        String strNextToken;
        String strNextToken2;
        String strNextToken3;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(gZIPInputStream);
        String strNextToken4 = nextToken(bufferedInputStream, arrayList);
        if (!"P5".equals(strNextToken4)) {
            throw new IOException(zzii.m("Not a binary PGM (P5), got: ", strNextToken4));
        }
        do {
            strNextToken = nextToken(bufferedInputStream, arrayList);
            if (strNextToken == null) {
                throw new IOException("Unexpected EOF in header");
            }
        } while (strNextToken.startsWith("#"));
        int positiveInt = parsePositiveInt(strNextToken, "width");
        do {
            strNextToken2 = nextToken(bufferedInputStream, arrayList);
            if (strNextToken2 == null) {
                throw new IOException("Unexpected EOF in header");
            }
        } while (strNextToken2.startsWith("#"));
        int positiveInt2 = parsePositiveInt(strNextToken2, "height");
        do {
            strNextToken3 = nextToken(bufferedInputStream, arrayList);
            if (strNextToken3 == null) {
                throw new IOException("Unexpected EOF in header");
            }
        } while (strNextToken3.startsWith("#"));
        int positiveInt3 = parsePositiveInt(strNextToken3, "maxval");
        if (positiveInt3 != 255) {
            throw new IOException(DiffUtil.m(positiveInt3, "Only 8-bit PGM supported (maxval=255), got: "));
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(positiveInt, positiveInt2, Bitmap.Config.ALPHA_8);
        int rowBytes = bitmapCreateBitmap.getRowBytes();
        byte[] bArr = new byte[rowBytes * positiveInt2];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byte[] bArr2 = new byte[positiveInt];
        int i = 0;
        for (int i2 = 0; i2 < positiveInt2; i2++) {
            int i3 = 0;
            while (i3 < positiveInt) {
                int i4 = bufferedInputStream.read(bArr2, i3, positiveInt - i3);
                if (i4 < 0) {
                    throw new IOException("Unexpected EOF");
                }
                i3 += i4;
            }
            System.arraycopy(bArr2, 0, bArr, i, positiveInt);
            i += rowBytes;
        }
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferWrap);
        return bitmapCreateBitmap;
    }

    public static void write(Bitmap bitmap, GZIPOutputStream gZIPOutputStream, List list) throws IOException {
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
                gZIPOutputStream.write(zzig.m("#", str == null ? "" : str.replace('\r', ' ').replace('\n', ' '), "\n").getBytes(StandardCharsets.US_ASCII));
            }
        }
        Charset charset = StandardCharsets.US_ASCII;
        gZIPOutputStream.write((width + " " + height + "\n").getBytes(charset));
        gZIPOutputStream.write("255\n".getBytes(charset));
        int rowBytes = bitmap.getRowBytes();
        byte[] bArr = new byte[rowBytes * height];
        bitmap.copyPixelsToBuffer(ByteBuffer.wrap(bArr));
        int i = 0;
        int i2 = 0;
        while (i < height) {
            gZIPOutputStream.write(bArr, i2, width);
            i++;
            i2 += rowBytes;
        }
    }
}
