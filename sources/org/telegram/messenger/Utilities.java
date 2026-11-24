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
    public static final Pattern a = Pattern.compile("[\\-0-9]+");
    public static final SecureRandom b;
    public static final z0d c;
    public static volatile mp3 d;
    public static volatile mp3 e;
    public static volatile mp3 f;
    public static volatile mp3 g;
    public static volatile mp3 h;
    public static volatile mp3 i;
    public static volatile mp3 j;
    public static volatile np3 k;
    public static final char[] l;

    static {
        SecureRandom secureRandom = new SecureRandom();
        b = secureRandom;
        long nextLong = secureRandom.nextLong();
        ?? random = new Random(0L);
        long a2 = pre.a(nextLong);
        random.a = a2;
        long a3 = pre.a(a2);
        random.b = a3;
        if (random.a == 0 && a3 == 0) {
            long a4 = pre.a(3735928559L);
            random.a = a4;
            random.b = pre.a(a4);
        }
        c = random;
        d = new mp3("stageQueue");
        e = new mp3("globalQueue");
        f = new mp3("cacheClearQueue");
        g = new mp3("searchQueue");
        h = new mp3("phoneBookQueue");
        i = new mp3("themeQueue");
        j = new mp3("externalNetworkQueue");
        l = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("/dev/urandom"));
            byte[] bArr = new byte[1024];
            fileInputStream.read(bArr);
            fileInputStream.close();
            secureRandom.setSeed(bArr);
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    public static Long A(String str) {
        long j2 = 0;
        if (str == null) {
            return 0L;
        }
        try {
            Matcher matcher = a.matcher(str);
            if (matcher.find()) {
                j2 = Long.parseLong(matcher.group(0));
            }
        } catch (Exception unused) {
        }
        return Long.valueOf(j2);
    }

    public static void B(Runnable runnable, qac... qacVarArr) {
        if (qacVarArr.length == 0) {
            runnable.run();
            return;
        }
        j2b j2bVar = new j2b(new int[]{0}, qacVarArr, runnable, (byte) 28);
        for (qac qacVar : qacVarArr) {
            qacVar.a(j2bVar);
        }
    }

    public static Bitmap C(Bitmap bitmap) {
        return D(bitmap, false);
    }

    public static Bitmap D(Bitmap bitmap, boolean z) {
        int L = gm.L(20.0f);
        int L2 = (int) ((gm.L(20.0f) * bitmap.getHeight()) / bitmap.getWidth());
        Bitmap createBitmap = Bitmap.createBitmap(L, L2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.scale(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
        if (z) {
            Path path = new Path();
            path.addCircle(bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f, (Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2.0f) - 1.0f, Path.Direction.CW);
            canvas.clipPath(path);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        stackBlurBitmap(createBitmap, Math.max(10, Math.max(L, L2) / 150));
        return createBitmap;
    }

    public static Bitmap E(float f2, Bitmap bitmap) {
        int max = (int) Math.max(gm.L(20.0f), bitmap.getWidth() / f2);
        int max2 = (int) Math.max((gm.L(20.0f) * bitmap.getHeight()) / bitmap.getWidth(), bitmap.getHeight() / f2);
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
            byte[] digest = MessageDigest.getInstance("MD5").digest(gm.g1(str));
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            fc4.g(e2, true);
            return null;
        }
    }

    public static native void aesCbcEncryption(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, int i2, int i3, int i4);

    private static native void aesCbcEncryptionByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int i3, int i4, int i5);

    public static native void aesCtrDecryption(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, int i2, int i3);

    public static native void aesCtrDecryptionByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, long j2, int i3);

    private static native void aesIgeEncryption(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, boolean z, int i2, int i3);

    private static native void aesIgeEncryptionByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, int i2, int i3);

    public static native boolean applyAlphaInvert(Bitmap bitmap, Bitmap bitmap2, int i2);

    public static native boolean applySoftLight(Bitmap bitmap, Bitmap bitmap2, int i2);

    public static native int averageBitmapColor(Bitmap bitmap, int i2, int i3, int i4, int i5);

    public static void b(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int i3, int i4, int i5) {
        aesCbcEncryptionByteArray(bArr, bArr2, (byte[]) bArr3.clone(), i2, i3, i4, i5);
    }

    public static native void blurBitmap(Object obj, int i2);

    public static void c(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, boolean z, boolean z2, int i2, int i3) {
        if (!z2) {
            bArr2 = (byte[]) bArr2.clone();
        }
        aesIgeEncryption(byteBuffer, bArr, bArr2, z, i2, i3);
    }

    public static native void calcCDT(ByteBuffer byteBuffer, int i2, int i3, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);

    public static native void clearDir(String str, int i2, long j2, boolean z);

    public static native boolean copyBitmaps(Bitmap bitmap, Bitmap bitmap2);

    public static boolean d(byte[] bArr, byte[] bArr2, int i2) {
        if (bArr == null || bArr2 == null || i2 < 0 || bArr.length > bArr2.length - i2 || bArr.length < 0 || bArr2.length - i2 < 0) {
            return false;
        }
        boolean z = true;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            if (bArr[i3] != bArr2[i3 + i2]) {
                z = false;
            }
        }
        return z;
    }

    public static native boolean drawDitheredGradient(Bitmap bitmap, int[] iArr, int i2, int i3, int i4, int i5);

    public static native boolean drawReplyLinePattern(Bitmap bitmap, int i2, int i3, int i4, int i5, boolean z);

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
        char[] cArr = new char[bArr.length << 1];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            int i3 = i2 << 1;
            char[] cArr2 = l;
            cArr[i3] = cArr2[(b2 & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static long g(byte[] bArr) {
        return (bArr[7] << 56) + ((bArr[6] & 255) << 48) + ((bArr[5] & 255) << 40) + ((bArr[4] & 255) << 32) + ((bArr[3] & 255) << 24) + ((bArr[2] & 255) << 16) + ((bArr[1] & 255) << 8) + (bArr[0] & 255);
    }

    public static native void generateGradient(Bitmap bitmap, int i2, float f2, int[] iArr);

    public static native void generateQrBackdrop(Bitmap bitmap, Bitmap bitmap2, float f2, int i2, float[] fArr, int[] iArr, float[] fArr2);

    public static native long getDirSize(String str, int i2, boolean z);

    public static native long getLastUsageFileTime(String str);

    public static double h(double d2, double d3) {
        if (Double.isNaN(d2)) {
            return 0.0d;
        }
        if (Double.isInfinite(d2)) {
            return d3;
        }
        return Math.max(Math.min(d2, d3), 0.0d);
    }

    public static float i(float f2, float f3, float f4) {
        if (Float.isNaN(f2)) {
            return f4;
        }
        if (Float.isInfinite(f2)) {
            return f3;
        }
        return Math.max(Math.min(f2, f3), f4);
    }

    public static int j(int i2, int i3, int i4) {
        return Math.max(Math.min(i2, i3), i4);
    }

    public static long k(long j2, long j3, long j4) {
        return Math.max(Math.min(j2, j3), j4);
    }

    public static float l(float f2) {
        return i(f2, 1.0f, 0.0f);
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
        } catch (Exception e2) {
            fc4.g(e2, true);
            return new byte[20];
        }
    }

    private static native boolean nLibyuvARGBSaleBitmap(Bitmap bitmap, Bitmap bitmap2, int i2);

    public static native int needInvert(Object obj);

    public static byte[] o(long j2, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr, 0, (int) j2);
            return messageDigest.digest();
        } catch (Exception e2) {
            fc4.g(e2, true);
            return new byte[32];
        }
    }

    public static byte[] p(byte[] bArr, int i2, ByteBuffer byteBuffer, int i3, int i4) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bArr, i2, 32);
                byteBuffer.position(i3);
                byteBuffer.limit(i4);
                messageDigest.update(byteBuffer);
                return messageDigest.digest();
            } catch (Exception e2) {
                fc4.g(e2, true);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                return new byte[32];
            }
        } finally {
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }

    private static native int pbkdf2(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2);

    public static byte[] q(byte[]... bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (byte[] bArr2 : bArr) {
                messageDigest.update(bArr2, 0, bArr2.length);
            }
            return messageDigest.digest();
        } catch (Exception e2) {
            fc4.g(e2, true);
            return new byte[32];
        }
    }

    public static byte[] r(byte[] bArr, byte[] bArr2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(bArr, 0, bArr.length);
            messageDigest.update(bArr2, 0, bArr2.length);
            return messageDigest.digest();
        } catch (Exception e2) {
            fc4.g(e2, true);
            return new byte[64];
        }
    }

    public static native String readlink(String str);

    public static native String readlinkFd(int i2);

    public static byte[] s(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(bArr, 0, bArr.length);
            messageDigest.update(bArr2, 0, bArr2.length);
            messageDigest.update(bArr3, 0, bArr3.length);
            return messageDigest.digest();
        } catch (Exception e2) {
            fc4.g(e2, true);
            return new byte[64];
        }
    }

    public static native void setupNativeCrashesListener(String str);

    public static native void stackBlurBitmap(Bitmap bitmap, int i2);

    public static float t(float f2, float f3, float f4, float f5) {
        float f6 = f2 - f4;
        float f7 = f3 - f5;
        return (float) Math.sqrt((f7 * f7) + (f6 * f6));
    }

    public static void u(int i2, qac... qacVarArr) {
        if (qacVarArr.length > i2) {
            qacVarArr[i2].a(new ge7(i2, qacVarArr, (byte) 23));
        }
    }

    public static byte[] v(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i2 = 0; i2 < length; i2 += 2) {
            bArr[i2 / 2] = (byte) (Character.digit(str.charAt(i2 + 1), 16) + (Character.digit(str.charAt(i2), 16) << 4));
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
        nLibyuvARGBSaleBitmap(bitmap, bitmap2, wi8.F(4));
    }

    public static Integer z(CharSequence charSequence) {
        boolean z;
        int i2 = 0;
        if (charSequence == null) {
            return 0;
        }
        int i3 = -1;
        int i4 = 0;
        while (i4 < charSequence.length()) {
            try {
                char charAt = charSequence.charAt(i4);
                if (charAt != '-' && (charAt < '0' || charAt > '9')) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (i3 < 0) {
                        i3 = i4;
                    }
                } else if (i3 >= 0) {
                    break;
                }
                i4++;
            } catch (Exception unused) {
            }
        }
        if (i3 >= 0 && (i4 - i3 > 1 || charSequence.charAt(i3) != '-')) {
            i2 = Integer.parseInt(charSequence.subSequence(i3, i4).toString());
        }
        return Integer.valueOf(i2);
    }
}
