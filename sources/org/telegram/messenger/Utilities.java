package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public class Utilities {
    private static final String RANDOM_STRING_CHARS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static volatile DispatchQueue cacheClearQueue;
    public static volatile DispatchQueue externalNetworkQueue;
    public static Random fastRandom;
    public static volatile DispatchQueue globalQueue;
    protected static final char[] hexArray;
    public static volatile DispatchQueue phoneBookQueue;
    public static volatile DispatchQueue searchQueue;
    public static volatile DispatchQueue stageQueue;
    public static volatile DispatchQueue themeQueue;
    public static volatile DispatchQueue videoPlayerQueue;
    public static Pattern pattern = Pattern.compile("[\\-0-9]+");
    public static SecureRandom random = new SecureRandom();

    public interface Callback<T> {
        void run(T t10);
    }

    public interface Callback0Return<ReturnType> {
        ReturnType run();
    }

    public interface Callback2<T, T2> {
        void run(T t10, T2 t22);
    }

    public interface Callback2Return<T1, T2, ReturnType> {
        ReturnType run(T1 t12, T2 t22);
    }

    public interface Callback3<T, T2, T3> {
        void run(T t10, T2 t22, T3 t32);
    }

    public interface Callback3Return<T1, T2, T3, ReturnType> {
        ReturnType run(T1 t12, T2 t22, T3 t32);
    }

    public interface Callback4<T, T2, T3, T4> {
        void run(T t10, T2 t22, T3 t32, T4 t42);
    }

    public interface Callback4Return<T, T2, T3, T4, ReturnType> {
        ReturnType run(T t10, T2 t22, T3 t32, T4 t42);
    }

    public interface Callback5<T, T2, T3, T4, T5> {
        void mo17run(T t10, T2 t22, T3 t32, T4 t42, T5 t52);
    }

    public interface Callback5Return<T, T2, T3, T4, T5, ReturnType> {
        ReturnType run(T t10, T2 t22, T3 t32, T4 t42, T5 t52);
    }

    public interface CallbackReturn<Arg, ReturnType> {
        ReturnType run(Arg arg);
    }

    public interface CallbackVoidReturn<ReturnType> {
        ReturnType run();
    }

    public interface IndexedConsumer<T> {
        void accept(T t10, int i10);
    }

    public enum libyuv_ScaleFilter {
        None,
        Linear,
        Bilinear,
        Box
    }

    static {
        long nextLong = random.nextLong();
        ?? random2 = new Random(0L);
        long a2 = v7.q6.a(nextLong);
        random2.f6571a = a2;
        long a10 = v7.q6.a(a2);
        random2.f6572b = a10;
        if (random2.f6571a == 0 && a10 == 0) {
            long a11 = v7.q6.a(3735928559L);
            random2.f6571a = a11;
            random2.f6572b = v7.q6.a(a11);
        }
        fastRandom = random2;
        stageQueue = new DispatchQueue("stageQueue");
        globalQueue = new DispatchQueue("globalQueue");
        cacheClearQueue = new DispatchQueue("cacheClearQueue");
        searchQueue = new DispatchQueue("searchQueue");
        phoneBookQueue = new DispatchQueue("phoneBookQueue");
        themeQueue = new DispatchQueue("themeQueue");
        externalNetworkQueue = new DispatchQueue("externalNetworkQueue");
        hexArray = "0123456789ABCDEF".toCharArray();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("/dev/urandom"));
            byte[] bArr = new byte[1024];
            fileInputStream.read(bArr);
            fileInputStream.close();
            random.setSeed(bArr);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static String MD5(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(AndroidUtilities.getStringBytes(str));
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public static String SHA256(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(AndroidUtilities.getStringBytes(str));
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public static native void aesCbcEncryption(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, int i10, int i11, int i12);

    private static native void aesCbcEncryptionByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int i11, int i12, int i13);

    public static void aesCbcEncryptionByteArraySafe(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int i11, int i12, int i13) {
        aesCbcEncryptionByteArray(bArr, bArr2, (byte[]) bArr3.clone(), i10, i11, i12, i13);
    }

    public static native void aesCtrDecryption(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, int i10, int i11);

    public static native void aesCtrDecryptionByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, long j3, int i11);

    private static native void aesIgeEncryption(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, boolean z10, int i10, int i11);

    public static void aesIgeEncryption(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, boolean z10, boolean z11, int i10, int i11) {
        if (!z11) {
            bArr2 = (byte[]) bArr2.clone();
        }
        aesIgeEncryption(byteBuffer, bArr, bArr2, z10, i10, i11);
    }

    private static native void aesIgeEncryptionByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z10, int i10, int i11);

    public static void aesIgeEncryptionByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z10, boolean z11, int i10, int i11) {
        if (!z11) {
            bArr3 = (byte[]) bArr3.clone();
        }
        aesIgeEncryptionByteArray(bArr, bArr2, bArr3, z10, i10, i11);
    }

    public static native boolean applyAlphaInvert(Bitmap bitmap, Bitmap bitmap2, int i10);

    public static native boolean applySoftLight(Bitmap bitmap, Bitmap bitmap2, int i10);

    public static boolean arraysEquals(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (bArr == null || bArr2 == null || i10 < 0 || i11 < 0 || bArr.length - i10 > bArr2.length - i11 || bArr.length - i10 < 0 || bArr2.length - i11 < 0) {
            return false;
        }
        boolean z10 = true;
        for (int i12 = i10; i12 < bArr.length; i12++) {
            if (bArr[i12 + i10] != bArr2[i12 + i11]) {
                z10 = false;
            }
        }
        return z10;
    }

    public static native int averageBitmapColor(Bitmap bitmap, int i10, int i11, int i12, int i13);

    public static native void blurBitmap(Object obj, int i10);

    public static Bitmap blurWallpaper(Bitmap bitmap) {
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

    public static String bytesToHex(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = hexArray;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static int bytesToInt(byte[] bArr) {
        return ((bArr[3] & 255) << 24) + ((bArr[2] & 255) << 16) + ((bArr[1] & 255) << 8) + (bArr[0] & 255);
    }

    public static long bytesToLong(byte[] bArr) {
        return (bArr[7] << 56) + ((bArr[6] & 255) << 48) + ((bArr[5] & 255) << 40) + ((bArr[4] & 255) << 32) + ((bArr[3] & 255) << 24) + ((bArr[2] & 255) << 16) + ((bArr[1] & 255) << 8) + (bArr[0] & 255);
    }

    public static native void calcCDT(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);

    public static int clamp(int i10, int i11, int i12) {
        return Math.max(Math.min(i10, i11), i12);
    }

    public static float clamp01(float f7) {
        return clamp(f7, 1.0f, 0.0f);
    }

    public static native void clearDir(String str, int i10, long j3, boolean z10);

    public static byte[] computePBKDF2(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        pbkdf2(bArr, bArr2, bArr3, 100000);
        return bArr3;
    }

    public static byte[] computeSHA1(byte[] bArr, int i10, int i11) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, i10, i11);
            return messageDigest.digest();
        } catch (Exception e7) {
            FileLog.e(e7);
            return new byte[20];
        }
    }

    public static byte[] computeSHA256(byte[] bArr) {
        return computeSHA256(bArr, 0, bArr.length);
    }

    public static byte[] computeSHA512(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(bArr, 0, bArr.length);
            return messageDigest.digest();
        } catch (Exception e7) {
            FileLog.e(e7);
            return new byte[64];
        }
    }

    public static native boolean copyBitmaps(Bitmap bitmap, Bitmap bitmap2);

    public static float dist(float f7, float f10, float f11, float f12) {
        float f13 = f7 - f11;
        float f14 = f10 - f12;
        return (float) Math.sqrt((f14 * f14) + (f13 * f13));
    }

    public static int divCeil(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static void doCallbacks(Callback<Runnable>... callbackArr) {
        doCallbacks(0, callbackArr);
    }

    public static native boolean drawDitheredGradient(Bitmap bitmap, int[] iArr, int i10, int i11, int i12, int i13);

    public static native boolean drawReplyLinePattern(Bitmap bitmap, int i10, int i11, int i12, int i13, boolean z10);

    public static native boolean expandAlphaToBlack(Bitmap bitmap, Bitmap bitmap2);

    public static native boolean extractAlpha(Bitmap bitmap, Bitmap bitmap2);

    public static native void generateGradient(Bitmap bitmap, int i10, float f7, int[] iArr);

    public static String generateRandomString() {
        return generateRandomString(16);
    }

    public static native long getDirSize(String str, int i10, boolean z10);

    public static String getExtension(String str) {
        String str2;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str2 = str.substring(lastIndexOf + 1);
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        return str2.toUpperCase();
    }

    public static native long getLastUsageFileTime(String str);

    public static DispatchQueue getOrCreatePlayerQueue() {
        if (videoPlayerQueue == null) {
            videoPlayerQueue = new DispatchQueue("playerQueue");
        }
        return videoPlayerQueue;
    }

    public static <Key, Value> Value getOrDefault(HashMap<Key, Value> hashMap, Key key, Value value) {
        Value value2 = hashMap.get(key);
        if (value2 == null) {
            return value;
        }
        return value2;
    }

    public static byte[] hexToBytes(String str) {
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

    public static byte[] intToBytes(int i10) {
        return new byte[]{(byte) (i10 >>> 24), (byte) (i10 >>> 16), (byte) (i10 >>> 8), (byte) i10};
    }

    public static boolean isGoodGaAndGb(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.compareTo(BigInteger.valueOf(1L)) > 0 && bigInteger.compareTo(bigInteger2.subtract(BigInteger.valueOf(1L))) < 0) {
            return true;
        }
        return false;
    }

    public static boolean isGoodPrime(byte[] bArr, int i10) {
        return ConnectionsManager.native_isGoodPrime(bArr, i10);
    }

    public static boolean isNullOrEmpty(Collection<?> collection) {
        if (collection != null && !collection.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void lambda$doCallbacks$0(int i10, Callback[] callbackArr) {
        doCallbacks(i10 + 1, callbackArr);
    }

    public static void lambda$raceCallbacks$1(int[] iArr, Callback[] callbackArr, Runnable runnable) {
        int i10 = iArr[0] + 1;
        iArr[0] = i10;
        if (i10 == callbackArr.length && runnable != null) {
            runnable.run();
        }
    }

    public static boolean libyuvARGBSaleBitmap(Bitmap bitmap, Bitmap bitmap2, libyuv_ScaleFilter libyuv_scalefilter) {
        return nLibyuvARGBSaleBitmap(bitmap, bitmap2, libyuv_scalefilter.ordinal());
    }

    private static native boolean nLibyuvARGBSaleBitmap(Bitmap bitmap, Bitmap bitmap2, int i10);

    public static native int needInvert(Object obj);

    public static Integer parseInt(CharSequence charSequence) {
        boolean z10;
        int i10 = 0;
        if (charSequence == null) {
            return 0;
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            try {
                if (i12 >= charSequence.length()) {
                    break;
                }
                char charAt = charSequence.charAt(i12);
                if (charAt != '-' && (charAt < '0' || charAt > '9')) {
                    z10 = false;
                    if (!z10 && i11 < 0) {
                        i11 = i12;
                    } else if (!z10 && i11 >= 0) {
                        i12++;
                        break;
                    }
                    i12++;
                }
                z10 = true;
                if (!z10) {
                }
                if (!z10) {
                    i12++;
                    break;
                }
                continue;
                i12++;
            } catch (Exception unused) {
            }
        }
        if (i11 >= 0) {
            i10 = Integer.parseInt(charSequence.subSequence(i11, i12).toString());
        }
        return Integer.valueOf(i10);
    }

    public static String parseIntToString(String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(0);
        }
        return null;
    }

    public static Long parseLong(String str) {
        long j3 = 0;
        if (str == null) {
            return 0L;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                j3 = Long.parseLong(matcher.group(0));
            }
        } catch (Exception unused) {
        }
        return Long.valueOf(j3);
    }

    private static native int pbkdf2(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10);

    public static void raceCallbacks(Runnable runnable, Callback<Runnable>... callbackArr) {
        if (callbackArr != null && callbackArr.length != 0) {
            z8 z8Var = new z8(new int[]{0}, callbackArr, runnable, 28);
            for (Callback<Runnable> callback : callbackArr) {
                callback.run(z8Var);
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public static native String readlink(String str);

    public static native String readlinkFd(int i10);

    public static native void setupNativeCrashesListener(String str);

    public static native void stackBlurBitmap(Bitmap bitmap, int i10);

    public static Bitmap stackBlurBitmapMax(Bitmap bitmap) {
        return stackBlurBitmapMax(bitmap, false);
    }

    public static Bitmap stackBlurBitmapWithScaleFactor(Bitmap bitmap, float f7) {
        int max = (int) Math.max(AndroidUtilities.dp(20.0f), bitmap.getWidth() / f7);
        int max2 = (int) Math.max((AndroidUtilities.dp(20.0f) * bitmap.getHeight()) / bitmap.getWidth(), bitmap.getHeight() / f7);
        Bitmap createBitmap = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.scale(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        stackBlurBitmap(createBitmap, Math.max(10, Math.max(max, max2) / 150));
        return createBitmap;
    }

    public static <T> void swapItems(List<T> list, int i10, int i11) {
        T t10 = list.get(i10);
        list.set(i10, list.get(i11));
        list.set(i11, t10);
    }

    public static long tryParseLong(String str, long j3) {
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return j3;
        }
    }

    public static Uri uriParseSafe(String str) {
        try {
            return Uri.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static long clamp(long j3, long j10, long j11) {
        return Math.max(Math.min(j3, j10), j11);
    }

    public static byte[] computeSHA256(byte[] bArr, int i10, long j3) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr, i10, (int) j3);
            return messageDigest.digest();
        } catch (Exception e7) {
            FileLog.e(e7);
            return new byte[32];
        }
    }

    private static void doCallbacks(int i10, Callback<Runnable>... callbackArr) {
        if (callbackArr == null || callbackArr.length <= i10) {
            return;
        }
        callbackArr[i10].run(new o6(i10, callbackArr, 11));
    }

    public static String generateRandomString(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(fastRandom.nextInt(62)));
        }
        return sb2.toString();
    }

    public static Bitmap stackBlurBitmapMax(Bitmap bitmap, boolean z10) {
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = (int) ((AndroidUtilities.dp(20.0f) * bitmap.getHeight()) / bitmap.getWidth());
        Bitmap createBitmap = Bitmap.createBitmap(dp, dp2, Bitmap.Config.ARGB_8888);
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
        stackBlurBitmap(createBitmap, Math.max(10, Math.max(dp, dp2) / 150));
        return createBitmap;
    }

    public static float clamp(float f7, float f10, float f11) {
        return Float.isNaN(f7) ? f11 : Float.isInfinite(f7) ? f10 : Math.max(Math.min(f7, f10), f11);
    }

    public static double clamp(double d, double d10, double d11) {
        return Double.isNaN(d) ? d11 : Double.isInfinite(d) ? d10 : Math.max(Math.min(d, d10), d11);
    }

    public static byte[] computeSHA1(ByteBuffer byteBuffer, int i10, int i11) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                byteBuffer.position(i10);
                byteBuffer.limit(i11);
                messageDigest.update(byteBuffer);
                return messageDigest.digest();
            } catch (Exception e7) {
                FileLog.e(e7);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                return new byte[20];
            }
        } finally {
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }

    public static byte[] computeSHA512(byte[] bArr, byte[] bArr2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(bArr, 0, bArr.length);
            messageDigest.update(bArr2, 0, bArr2.length);
            return messageDigest.digest();
        } catch (Exception e7) {
            FileLog.e(e7);
            return new byte[64];
        }
    }

    public static byte[] computeSHA256(byte[]... bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (byte[] bArr2 : bArr) {
                messageDigest.update(bArr2, 0, bArr2.length);
            }
            return messageDigest.digest();
        } catch (Exception e7) {
            FileLog.e(e7);
            return new byte[32];
        }
    }

    private static int parseInt(String str) {
        boolean z10;
        int length = str.length();
        int i10 = 0;
        char charAt = str.charAt(0);
        if (charAt == '-') {
            z10 = false;
        } else {
            i10 = '0' - charAt;
            z10 = true;
        }
        for (int i11 = 1; i11 < length; i11++) {
            i10 = ((i10 * 10) + 48) - str.charAt(i11);
        }
        return z10 ? -i10 : i10;
    }

    public static byte[] computeSHA512(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(bArr, 0, bArr.length);
            messageDigest.update(bArr2, 0, bArr2.length);
            messageDigest.update(bArr3, 0, bArr3.length);
            return messageDigest.digest();
        } catch (Exception e7) {
            FileLog.e(e7);
            return new byte[64];
        }
    }

    public static byte[] computeSHA256(byte[] bArr, int i10, int i11, ByteBuffer byteBuffer, int i12, int i13) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bArr, i10, i11);
                byteBuffer.position(i12);
                byteBuffer.limit(i13);
                messageDigest.update(byteBuffer);
                return messageDigest.digest();
            } catch (Exception e7) {
                FileLog.e(e7);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                return new byte[32];
            }
        } finally {
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }

    public static byte[] computeSHA1(ByteBuffer byteBuffer) {
        return computeSHA1(byteBuffer, 0, byteBuffer.limit());
    }

    public static byte[] computeSHA1(byte[] bArr) {
        return computeSHA1(bArr, 0, bArr.length);
    }
}
