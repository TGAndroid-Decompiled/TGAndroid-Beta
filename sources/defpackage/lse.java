package defpackage;

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
public abstract class lse {
    public static String a(BufferedInputStream bufferedInputStream, ArrayList arrayList) {
        String b;
        do {
            b = b(bufferedInputStream, arrayList);
            if (b == null) {
                wa3.d("Unexpected EOF in header");
                return null;
            }
        } while (b.startsWith("#"));
        return b;
    }

    public static java.lang.String b(java.io.BufferedInputStream r5, java.util.ArrayList r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lse.b(java.io.BufferedInputStream, java.util.ArrayList):java.lang.String");
    }

    public static int c(String str, String str2) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt > 0) {
                return parseInt;
            }
            throw new IOException("Invalid " + str2 + ": " + parseInt);
        } catch (NumberFormatException e) {
            throw new IOException(td4.r("Invalid ", str2, ": ", str), e);
        }
    }

    public static Bitmap d(GZIPInputStream gZIPInputStream, ArrayList arrayList) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(gZIPInputStream);
        String b = b(bufferedInputStream, arrayList);
        if ("P5".equals(b)) {
            int c = c(a(bufferedInputStream, arrayList), "width");
            int c2 = c(a(bufferedInputStream, arrayList), "height");
            int c3 = c(a(bufferedInputStream, arrayList), "maxval");
            if (c3 == 255) {
                Bitmap createBitmap = Bitmap.createBitmap(c, c2, Bitmap.Config.ALPHA_8);
                int rowBytes = createBitmap.getRowBytes();
                byte[] bArr = new byte[rowBytes * c2];
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                byte[] bArr2 = new byte[c];
                int i = 0;
                for (int i2 = 0; i2 < c2; i2++) {
                    int i3 = 0;
                    while (i3 < c) {
                        int read = bufferedInputStream.read(bArr2, i3, c - i3);
                        if (read >= 0) {
                            i3 += read;
                        } else {
                            wa3.d("Unexpected EOF");
                            return null;
                        }
                    }
                    System.arraycopy(bArr2, 0, bArr, i, c);
                    i += rowBytes;
                }
                createBitmap.copyPixelsFromBuffer(wrap);
                return createBitmap;
            }
            wa3.d(hg9.j(c3, "Only 8-bit PGM supported (maxval=255), got: "));
            return null;
        }
        wa3.d(b10.h("Not a binary PGM (P5), got: ", b));
        return null;
    }

    public static void e(Bitmap bitmap, GZIPOutputStream gZIPOutputStream, List list) {
        String replace;
        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            gZIPOutputStream.write("P5\n".getBytes(StandardCharsets.US_ASCII));
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str == null) {
                        replace = "";
                    } else {
                        replace = str.replace('\r', ' ').replace('\n', ' ');
                    }
                    gZIPOutputStream.write(kt6.o("#", replace, "\n").getBytes(StandardCharsets.US_ASCII));
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
            return;
        }
        u36.j("Only Bitmap.Config.ALPHA_8 is supported");
    }
}
