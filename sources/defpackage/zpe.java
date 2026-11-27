package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
public abstract class zpe {
    public static int a(byte b) {
        if (b < 0) {
            return b + 256;
        }
        return b;
    }

    public static String b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            grb.m(e);
            return null;
        }
    }

    public static double c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255)) / 1.073741824E9d;
    }

    public static double d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255)) / 65536.0d;
    }

    public static float e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        return ((short) (((short) ((bArr[0] << 8) & 65280)) | (bArr[1] & 255))) / 256.0f;
    }

    public static int f(ByteBuffer byteBuffer) {
        return a(byteBuffer.get()) + (a(byteBuffer.get()) << 8);
    }

    public static long g(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        if (j < 0) {
            return j + 4294967296L;
        }
        return j;
    }

    public static long h(ByteBuffer byteBuffer) {
        long g = g(byteBuffer) << 32;
        if (g >= 0) {
            return g(byteBuffer) + g;
        }
        xi4.l("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        return 0L;
    }

    public static int i(ByteBuffer byteBuffer) {
        return a(byteBuffer.get());
    }
}
