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
    public static final Pattern f21333a = Pattern.compile("[\\-0-9]+");
    public static final SecureRandom f21334b;
    public static final g5.a f21335c;
    public static volatile p5 d;
    public static volatile p5 f21336e;
    public static volatile p5 f21337f;
    public static volatile p5 f21338g;
    public static volatile p5 h;
    public static volatile p5 f21339i;
    public static volatile p5 f21340j;
    public static volatile q5 f21341k;
    public static final char[] f21342l;

    static {
        SecureRandom secureRandom = new SecureRandom();
        f21334b = secureRandom;
        long nextLong = secureRandom.nextLong();
        ?? random = new Random(0L);
        long a10 = a8.fa.a(nextLong);
        random.f13516a = a10;
        long a11 = a8.fa.a(a10);
        random.f13517b = a11;
        if (random.f13516a == 0 && a11 == 0) {
            long a12 = a8.fa.a(3735928559L);
            random.f13516a = a12;
            random.f13517b = a8.fa.a(a12);
        }
        f21335c = random;
        d = new p5("stageQueue");
        f21336e = new p5("globalQueue");
        f21337f = new p5("cacheClearQueue");
        f21338g = new p5("searchQueue");
        h = new p5("phoneBookQueue");
        f21339i = new p5("themeQueue");
        f21340j = new p5("externalNetworkQueue");
        f21342l = "0123456789ABCDEF".toCharArray();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("/dev/urandom"));
            byte[] bArr = new byte[1024];
            fileInputStream.read(bArr);
            fileInputStream.close();
            secureRandom.setSeed(bArr);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static Long A(String str) {
        long j3 = 0;
        if (str == null) {
            return 0L;
        }
        try {
            Matcher matcher = f21333a.matcher(str);
            if (matcher.find()) {
                j3 = Long.parseLong(matcher.group(0));
            }
        } catch (Exception unused) {
        }
        return Long.valueOf(j3);
    }

    public static void B(Runnable runnable, c20... c20VarArr) {
        if (c20VarArr.length == 0) {
            runnable.run();
            return;
        }
        uz uzVar = new uz(new int[]{0}, c20VarArr, runnable, 2);
        for (c20 c20Var : c20VarArr) {
            c20Var.a(uzVar);
        }
    }

    public static Bitmap C(Bitmap bitmap) {
        return D(bitmap, false);
    }

    public static Bitmap D(Bitmap bitmap, boolean z9) {
        int L = g0.L(20.0f);
        int L2 = (int) ((g0.L(20.0f) * bitmap.getHeight()) / bitmap.getWidth());
        Bitmap createBitmap = Bitmap.createBitmap(L, L2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.scale(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
        if (z9) {
            Path path = new Path();
            path.addCircle(bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f, (Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2.0f) - 1.0f, Path.Direction.CW);
            canvas.clipPath(path);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        stackBlurBitmap(createBitmap, Math.max(10, Math.max(L, L2) / 150));
        return createBitmap;
    }

    public static Bitmap E(float f10, Bitmap bitmap) {
        int max = (int) Math.max(g0.L(20.0f), bitmap.getWidth() / f10);
        int max2 = (int) Math.max((g0.L(20.0f) * bitmap.getHeight()) / bitmap.getWidth(), bitmap.getHeight() / f10);
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
            byte[] digest = MessageDigest.getInstance("MD5").digest(g0.h1(str));
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static native void aesCbcEncryption(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, int i7, int i10, int i11);

    private static native void aesCbcEncryptionByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, int i7, int i10, int i11, int i12);

    public static native void aesCtrDecryption(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, int i7, int i10);

    public static native void aesCtrDecryptionByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, int i7, long j3, int i10);

    private static native void aesIgeEncryption(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, boolean z9, int i7, int i10);

    private static native void aesIgeEncryptionByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z9, int i7, int i10);

    public static native boolean applyAlphaInvert(Bitmap bitmap, Bitmap bitmap2, int i7);

    public static native boolean applySoftLight(Bitmap bitmap, Bitmap bitmap2, int i7);

    public static native int averageBitmapColor(Bitmap bitmap, int i7, int i10, int i11, int i12);

    public static void b(byte[] bArr, byte[] bArr2, byte[] bArr3, int i7, int i10, int i11, int i12) {
        aesCbcEncryptionByteArray(bArr, bArr2, (byte[]) bArr3.clone(), i7, i10, i11, i12);
    }

    public static native void blurBitmap(Object obj, int i7);

    public static void c(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, boolean z9, boolean z10, int i7, int i10) {
        if (!z10) {
            bArr2 = (byte[]) bArr2.clone();
        }
        aesIgeEncryption(byteBuffer, bArr, bArr2, z9, i7, i10);
    }

    public static native void calcCDT(ByteBuffer byteBuffer, int i7, int i10, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);

    public static native void clearDir(String str, int i7, long j3, boolean z9);

    public static native boolean copyBitmaps(Bitmap bitmap, Bitmap bitmap2);

    public static boolean d(byte[] bArr, byte[] bArr2, int i7) {
        if (bArr == null || bArr2 == null || i7 < 0 || bArr.length > bArr2.length - i7 || bArr.length < 0 || bArr2.length - i7 < 0) {
            return false;
        }
        boolean z9 = true;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10 + i7]) {
                z9 = false;
            }
        }
        return z9;
    }

    public static native boolean drawDitheredGradient(Bitmap bitmap, int[] iArr, int i7, int i10, int i11, int i12);

    public static native boolean drawReplyLinePattern(Bitmap bitmap, int i7, int i10, int i11, int i12, boolean z9);

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
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byte b10 = bArr[i7];
            int i10 = i7 * 2;
            char[] cArr2 = f21342l;
            cArr[i10] = cArr2[(b10 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static long g(byte[] bArr) {
        return (bArr[7] << 56) + ((bArr[6] & 255) << 48) + ((bArr[5] & 255) << 40) + ((bArr[4] & 255) << 32) + ((bArr[3] & 255) << 24) + ((bArr[2] & 255) << 16) + ((bArr[1] & 255) << 8) + (bArr[0] & 255);
    }

    public static native void generateGradient(Bitmap bitmap, int i7, float f10, int[] iArr);

    public static native void generateQrBackdrop(Bitmap bitmap, Bitmap bitmap2, float f10, int i7, float[] fArr, int[] iArr, float[] fArr2);

    public static native long getDirSize(String str, int i7, boolean z9);

    public static native long getLastUsageFileTime(String str);

    public static double h(double d2, double d10) {
        if (Double.isNaN(d2)) {
            return 0.0d;
        }
        if (Double.isInfinite(d2)) {
            return d10;
        }
        return Math.max(Math.min(d2, d10), 0.0d);
    }

    public static float i(float f10, float f11, float f12) {
        if (Float.isNaN(f10)) {
            return f12;
        }
        if (Float.isInfinite(f10)) {
            return f11;
        }
        return Math.max(Math.min(f10, f11), f12);
    }

    public static int j(int i7, int i10, int i11) {
        return Math.max(Math.min(i7, i10), i11);
    }

    public static long k(long j3, long j10, long j11) {
        return Math.max(Math.min(j3, j10), j11);
    }

    public static float l(float f10) {
        return i(f10, 1.0f, 0.0f);
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
        } catch (Exception e10) {
            a8.g(e10, true);
            return new byte[20];
        }
    }

    private static native boolean nLibyuvARGBSaleBitmap(Bitmap bitmap, Bitmap bitmap2, int i7);

    public static native int needInvert(Object obj);

    public static byte[] o(long j3, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr, 0, (int) j3);
            return messageDigest.digest();
        } catch (Exception e10) {
            a8.g(e10, true);
            return new byte[32];
        }
    }

    public static byte[] p(byte[] bArr, int i7, ByteBuffer byteBuffer, int i10, int i11) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bArr, i7, 32);
                byteBuffer.position(i10);
                byteBuffer.limit(i11);
                messageDigest.update(byteBuffer);
                return messageDigest.digest();
            } catch (Exception e10) {
                a8.g(e10, true);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                return new byte[32];
            }
        } finally {
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }

    private static native int pbkdf2(byte[] bArr, byte[] bArr2, byte[] bArr3, int i7);

    public static byte[] q(byte[]... bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (byte[] bArr2 : bArr) {
                messageDigest.update(bArr2, 0, bArr2.length);
            }
            return messageDigest.digest();
        } catch (Exception e10) {
            a8.g(e10, true);
            return new byte[32];
        }
    }

    public static byte[] r(byte[] bArr, byte[] bArr2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(bArr, 0, bArr.length);
            messageDigest.update(bArr2, 0, bArr2.length);
            return messageDigest.digest();
        } catch (Exception e10) {
            a8.g(e10, true);
            return new byte[64];
        }
    }

    public static native String readlink(String str);

    public static native String readlinkFd(int i7);

    public static byte[] s(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(bArr, 0, bArr.length);
            messageDigest.update(bArr2, 0, bArr2.length);
            messageDigest.update(bArr3, 0, bArr3.length);
            return messageDigest.digest();
        } catch (Exception e10) {
            a8.g(e10, true);
            return new byte[64];
        }
    }

    public static native void setupNativeCrashesListener(String str);

    public static native void stackBlurBitmap(Bitmap bitmap, int i7);

    public static float t(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        return (float) Math.sqrt((f15 * f15) + (f14 * f14));
    }

    public static void u(int i7, c20... c20VarArr) {
        if (c20VarArr.length > i7) {
            c20VarArr[i7].a(new x0(i7, c20VarArr, 13));
        }
    }

    public static byte[] v(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i7 = 0; i7 < length; i7 += 2) {
            bArr[i7 / 2] = (byte) (Character.digit(str.charAt(i7 + 1), 16) + (Character.digit(str.charAt(i7), 16) << 4));
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
        nLibyuvARGBSaleBitmap(bitmap, bitmap2, p1.g.c(4));
    }

    public static Integer z(CharSequence charSequence) {
        boolean z9;
        int i7 = 0;
        if (charSequence == null) {
            return 0;
        }
        int i10 = -1;
        int i11 = 0;
        while (i11 < charSequence.length()) {
            try {
                char charAt = charSequence.charAt(i11);
                if (charAt != '-' && (charAt < '0' || charAt > '9')) {
                    z9 = false;
                    if (!z9 && i10 < 0) {
                        i10 = i11;
                    } else if (!z9 && i10 >= 0) {
                        break;
                    }
                    i11++;
                }
                z9 = true;
                if (!z9) {
                }
                if (!z9) {
                    break;
                    break;
                }
                continue;
                i11++;
            } catch (Exception unused) {
            }
        }
        if (i10 >= 0 && (i11 - i10 > 1 || charSequence.charAt(i10) != '-')) {
            i7 = Integer.parseInt(charSequence.subSequence(i10, i11).toString());
        }
        return Integer.valueOf(i7);
    }
}
