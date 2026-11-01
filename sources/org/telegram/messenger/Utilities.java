package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Utilities {
    public static final Pattern f14519a = Pattern.compile("[\\-0-9]+");
    public static final SecureRandom f14520b;
    public static final d5.a f14521c;
    public static volatile r5 d;
    public static volatile r5 e;
    public static volatile r5 f14522f;
    public static volatile r5 f14523g;
    public static volatile r5 h;
    public static volatile r5 f14524i;
    public static volatile r5 f14525j;
    public static volatile s5 f14526k;
    public static final char[] f14527l;

    static {
        SecureRandom secureRandom = new SecureRandom();
        f14520b = secureRandom;
        long nextLong = secureRandom.nextLong();
        ?? random = new Random(0L);
        long a2 = v7.q6.a(nextLong);
        random.f5738a = a2;
        long a10 = v7.q6.a(a2);
        random.f5739b = a10;
        if (random.f5738a == 0 && a10 == 0) {
            long a11 = v7.q6.a(3735928559L);
            random.f5738a = a11;
            random.f5739b = v7.q6.a(a11);
        }
        f14521c = random;
        d = new r5("stageQueue");
        e = new r5("globalQueue");
        f14522f = new r5("cacheClearQueue");
        f14523g = new r5("searchQueue");
        h = new r5("phoneBookQueue");
        f14524i = new r5("themeQueue");
        f14525j = new r5("externalNetworkQueue");
        f14527l = "0123456789ABCDEF".toCharArray();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("/dev/urandom"));
            byte[] bArr = new byte[1024];
            fileInputStream.read(bArr);
            fileInputStream.close();
            secureRandom.setSeed(bArr);
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public static Long A(String str) {
        long j10 = 0;
        if (str == null) {
            return 0L;
        }
        try {
            Matcher matcher = f14519a.matcher(str);
            if (matcher.find()) {
                j10 = Long.parseLong(matcher.group(0));
            }
        } catch (Exception unused) {
        }
        return Long.valueOf(j10);
    }

    public static void B(Runnable runnable, r20... r20VarArr) {
        if (r20VarArr.length == 0) {
            runnable.run();
            return;
        }
        f00 f00Var = new f00(new int[]{0}, r20VarArr, runnable, 3);
        for (r20 r20Var : r20VarArr) {
            r20Var.a(f00Var);
        }
    }

    public static Bitmap C(Bitmap bitmap) {
        return D(bitmap, false);
    }

    public static Bitmap D(Bitmap bitmap, boolean z10) {
        int L = i0.L(20.0f);
        int L2 = (int) ((i0.L(20.0f) * bitmap.getHeight()) / bitmap.getWidth());
        Bitmap createBitmap = Bitmap.createBitmap(L, L2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.scale(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
        if (z10) {
            Path path = new Path();
            path.addCircle(bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f, (Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2.0f) - 1.0f, Path.Direction.CW);
            canvas.clipPath(path);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        stackBlurBitmap(createBitmap, Math.max(10, Math.max(L, L2) / 150));
        return createBitmap;
    }

    public static Bitmap E(float f7, Bitmap bitmap) {
        int max = (int) Math.max(i0.L(20.0f), bitmap.getWidth() / f7);
        int max2 = (int) Math.max((i0.L(20.0f) * bitmap.getHeight()) / bitmap.getWidth(), bitmap.getHeight() / f7);
        Bitmap createBitmap = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.scale(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        stackBlurBitmap(createBitmap, Math.max(10, Math.max(max, max2) / 150));
        return createBitmap;
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(i0.h1(str));
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException e7) {
            f8.g(e7, true);
            return null;
        }
    }

    public static native void aesCbcEncryption(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, int i10, int i11, int i12);

    private static native void aesCbcEncryptionByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int i11, int i12, int i13);

    public static native void aesCtrDecryption(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, int i10, int i11);

    public static native void aesCtrDecryptionByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, long j10, int i11);

    private static native void aesIgeEncryption(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, boolean z10, int i10, int i11);

    private static native void aesIgeEncryptionByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z10, int i10, int i11);

    public static native boolean applyAlphaInvert(Bitmap bitmap, Bitmap bitmap2, int i10);

    public static native boolean applySoftLight(Bitmap bitmap, Bitmap bitmap2, int i10);

    public static native int averageBitmapColor(Bitmap bitmap, int i10, int i11, int i12, int i13);

    public static void b(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int i11, int i12, int i13) {
        aesCbcEncryptionByteArray(bArr, bArr2, (byte[]) bArr3.clone(), i10, i11, i12, i13);
    }

    public static native void blurBitmap(Object obj, int i10);

    public static void c(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, boolean z10, boolean z11, int i10, int i11) {
        if (!z11) {
            bArr2 = (byte[]) bArr2.clone();
        }
        aesIgeEncryption(byteBuffer, bArr, bArr2, z10, i10, i11);
    }

    public static native void calcCDT(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);

    public static native void clearDir(String str, int i10, long j10, boolean z10);

    public static native boolean copyBitmaps(Bitmap bitmap, Bitmap bitmap2);

    public static boolean d(byte[] bArr, byte[] bArr2, int i10) {
        if (bArr == null || bArr2 == null || i10 < 0 || bArr.length > bArr2.length - i10 || bArr.length < 0 || bArr2.length - i10 < 0) {
            return false;
        }
        boolean z10 = true;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (bArr[i11] != bArr2[i11 + i10]) {
                z10 = false;
            }
        }
        return z10;
    }

    public static native boolean drawDitheredGradient(Bitmap bitmap, int[] iArr, int i10, int i11, int i12, int i13);

    public static native boolean drawReplyLinePattern(Bitmap bitmap, int i10, int i11, int i12, int i13, boolean z10);

    public static Bitmap e(Bitmap bitmap) {
        Bitmap createBitmap;
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getHeight() > bitmap.getWidth()) {
            createBitmap = Bitmap.createBitmap(Math.round((bitmap.getWidth() * 450.0f) / bitmap.getHeight()), 450, Bitmap.Config.ARGB_8888);
        } else {
            createBitmap = Bitmap.createBitmap(450, Math.round((bitmap.getHeight() * 450.0f) / bitmap.getWidth()), Bitmap.Config.ARGB_8888);
        }
        Paint paint = new Paint(2);
        new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()), paint);
        stackBlurBitmap(createBitmap, 12);
        return createBitmap;
    }

    public static native boolean expandAlphaToBlack(Bitmap bitmap, Bitmap bitmap2);

    public static native boolean extractAlpha(Bitmap bitmap, Bitmap bitmap2);

    public static String f(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f14527l;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static long g(byte[] bArr) {
        return (bArr[7] << 56) + ((bArr[6] & 255) << 48) + ((bArr[5] & 255) << 40) + ((bArr[4] & 255) << 32) + ((bArr[3] & 255) << 24) + ((bArr[2] & 255) << 16) + ((bArr[1] & 255) << 8) + (bArr[0] & 255);
    }

    public static native void generateGradient(Bitmap bitmap, int i10, float f7, int[] iArr);

    public static native void generateQrBackdrop(Bitmap bitmap, Bitmap bitmap2, float f7, int i10, float[] fArr, int[] iArr, float[] fArr2);

    public static native long getDirSize(String str, int i10, boolean z10);

    public static native long getLastUsageFileTime(String str);

    public static double h(double d10, double d11) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10)) {
            return d11;
        }
        return Math.max(Math.min(d10, d11), 0.0d);
    }

    public static float i(float f7, float f10, float f11) {
        if (Float.isNaN(f7)) {
            return f11;
        }
        if (Float.isInfinite(f7)) {
            return f10;
        }
        return Math.max(Math.min(f7, f10), f11);
    }

    public static int j(int i10, int i11, int i12) {
        return Math.max(Math.min(i10, i11), i12);
    }

    public static long k(long j10, long j11, long j12) {
        return Math.max(Math.min(j10, j11), j12);
    }

    public static float l(float f7) {
        return i(f7, 1.0f, 0.0f);
    }

    public static byte[] m(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        pbkdf2(bArr, bArr2, bArr3, 100000);
        return bArr3;
    }

    public static byte[] n(byte[] bArr) {
        int length = bArr.length;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 0, length);
            return messageDigest.digest();
        } catch (Exception e7) {
            f8.g(e7, true);
            return new byte[20];
        }
    }

    private static native boolean nLibyuvARGBSaleBitmap(Bitmap bitmap, Bitmap bitmap2, int i10);

    public static native int needInvert(Object obj);

    public static byte[] o(long j10, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr, 0, (int) j10);
            return messageDigest.digest();
        } catch (Exception e7) {
            f8.g(e7, true);
            return new byte[32];
        }
    }

    public static byte[] p(byte[] bArr, int i10, ByteBuffer byteBuffer, int i11, int i12) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bArr, i10, 32);
                byteBuffer.position(i11);
                byteBuffer.limit(i12);
                messageDigest.update(byteBuffer);
                return messageDigest.digest();
            } catch (Exception e7) {
                f8.g(e7, true);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                return new byte[32];
            }
        } finally {
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }

    private static native int pbkdf2(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10);

    public static byte[] q(byte[]... bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (byte[] bArr2 : bArr) {
                messageDigest.update(bArr2, 0, bArr2.length);
            }
            return messageDigest.digest();
        } catch (Exception e7) {
            f8.g(e7, true);
            return new byte[32];
        }
    }

    public static byte[] r(byte[] bArr, byte[] bArr2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(bArr, 0, bArr.length);
            messageDigest.update(bArr2, 0, bArr2.length);
            return messageDigest.digest();
        } catch (Exception e7) {
            f8.g(e7, true);
            return new byte[64];
        }
    }

    public static native String readlink(String str);

    public static native String readlinkFd(int i10);

    public static byte[] s(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(bArr, 0, bArr.length);
            messageDigest.update(bArr2, 0, bArr2.length);
            messageDigest.update(bArr3, 0, bArr3.length);
            return messageDigest.digest();
        } catch (Exception e7) {
            f8.g(e7, true);
            return new byte[64];
        }
    }

    public static native void setupNativeCrashesListener(String str);

    public static native void stackBlurBitmap(Bitmap bitmap, int i10);

    public static float t(float f7, float f10, float f11, float f12) {
        float f13 = f7 - f11;
        float f14 = f10 - f12;
        return (float) Math.sqrt((f14 * f14) + (f13 * f13));
    }

    public static void u(int i10, r20... r20VarArr) {
        if (r20VarArr.length > i10) {
            r20VarArr[i10].a(new a1(i10, r20VarArr, 13));
        }
    }

    public static byte[] v(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) (Character.digit(str.charAt(i10 + 1), 16) + (Character.digit(str.charAt(i10), 16) << 4));
        }
        return bArr;
    }

    public static boolean w(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.compareTo(BigInteger.valueOf(1L)) > 0 && bigInteger.compareTo(bigInteger2.subtract(BigInteger.valueOf(1L))) < 0) {
            return true;
        }
        return false;
    }

    public static boolean x(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void y(Bitmap bitmap, Bitmap bitmap2) {
        nLibyuvARGBSaleBitmap(bitmap, bitmap2, m1.j.c(4));
    }

    public static Integer z(CharSequence charSequence) {
        boolean z10;
        int i10 = 0;
        if (charSequence == null) {
            return 0;
        }
        int i11 = -1;
        int i12 = 0;
        while (i12 < charSequence.length()) {
            try {
                char charAt = charSequence.charAt(i12);
                if (charAt != '-' && (charAt < '0' || charAt > '9')) {
                    z10 = false;
                    if (!z10 && i11 < 0) {
                        i11 = i12;
                    } else if (!z10 && i11 >= 0) {
                        break;
                    }
                    i12++;
                }
                z10 = true;
                if (!z10) {
                }
                if (!z10) {
                    break;
                    break;
                }
                continue;
                i12++;
            } catch (Exception unused) {
            }
        }
        if (i11 >= 0 && (i12 - i11 > 1 || charSequence.charAt(i11) != '-')) {
            i10 = Integer.parseInt(charSequence.subSequence(i11, i12).toString());
        }
        return Integer.valueOf(i10);
    }
}
