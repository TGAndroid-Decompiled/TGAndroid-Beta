package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
public abstract class kfe {
    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(int i, InputStream inputStream) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                sc8.j(de9.k(i, "Not enough bytes to read: "));
                return null;
            }
        }
        return bArr;
    }

    public static byte[] c(java.io.FileInputStream r8, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfe.c(java.io.FileInputStream, int, int):byte[]");
    }

    public static long d(int i, InputStream inputStream) {
        byte[] b = b(i, inputStream);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (b[i2] & 255) << (i2 << 3);
        }
        return j;
    }

    public static void e(OutputStream outputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 << 3)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void f(ByteArrayOutputStream byteArrayOutputStream, int i) {
        e(byteArrayOutputStream, i, 2);
    }
}
