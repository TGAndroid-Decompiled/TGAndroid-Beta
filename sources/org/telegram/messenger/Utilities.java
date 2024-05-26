package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import com.carrotsearch.randomizedtesting.Xoroshiro128PlusRandom;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public class Utilities {
    private static final String RANDOM_STRING_CHARS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static volatile DispatchQueue videoPlayerQueue;
    public static Pattern pattern = Pattern.compile("[\\-0-9]+");
    public static SecureRandom random = new SecureRandom();
    public static Random fastRandom = new Xoroshiro128PlusRandom(random.nextLong());
    public static volatile DispatchQueue stageQueue = new DispatchQueue("stageQueue");
    public static volatile DispatchQueue globalQueue = new DispatchQueue("globalQueue");
    public static volatile DispatchQueue cacheClearQueue = new DispatchQueue("cacheClearQueue");
    public static volatile DispatchQueue searchQueue = new DispatchQueue("searchQueue");
    public static volatile DispatchQueue phoneBookQueue = new DispatchQueue("phoneBookQueue");
    public static volatile DispatchQueue themeQueue = new DispatchQueue("themeQueue");
    public static volatile DispatchQueue externalNetworkQueue = new DispatchQueue("externalNetworkQueue");
    protected static final char[] hexArray = "0123456789ABCDEF".toCharArray();

    public interface Callback<T> {
        void run(T t);
    }

    public interface Callback0Return<ReturnType> {
        ReturnType run();
    }

    public interface Callback2<T, T2> {
        void run(T t, T2 t2);
    }

    public interface Callback2Return<T1, T2, ReturnType> {
        ReturnType run(T1 t1, T2 t2);
    }

    public interface Callback3<T, T2, T3> {
        void run(T t, T2 t2, T3 t3);
    }

    public interface Callback3Return<T1, T2, T3, ReturnType> {
        ReturnType run(T1 t1, T2 t2, T3 t3);
    }

    public interface Callback4<T, T2, T3, T4> {
        void run(T t, T2 t2, T3 t3, T4 t4);
    }

    public interface Callback4Return<T, T2, T3, T4, ReturnType> {
        ReturnType run(T t, T2 t2, T3 t3, T4 t4);
    }

    public interface Callback5<T, T2, T3, T4, T5> {
        void run(T t, T2 t2, T3 t3, T4 t4, T5 t5);
    }

    public interface Callback5Return<T, T2, T3, T4, T5, ReturnType> {
        ReturnType run(T t, T2 t2, T3 t3, T4 t4, T5 t5);
    }

    public interface CallbackReturn<Arg, ReturnType> {
        ReturnType run(Arg arg);
    }

    public interface CallbackVoidReturn<ReturnType> {
        ReturnType run();
    }

    public interface IndexedConsumer<T> {
        void accept(T t, int i);
    }

    public static native void aesCbcEncryption(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, int i, int i2, int i3);

    private static native void aesCbcEncryptionByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4);

    public static native void aesCtrDecryption(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, int i, int i2);

    public static native void aesCtrDecryptionByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, long j, int i2);

    private static native void aesIgeEncryption(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, boolean z, int i, int i2);

    private static native void aesIgeEncryptionByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, int i, int i2);

    public static native void blurBitmap(Object obj, int i, int i2, int i3, int i4, int i5);

    public static native void calcCDT(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);

    public static native void clearDir(String str, int i, long j, boolean z);

    public static native int convertVideoFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5);

    public static native void drawDitheredGradient(Bitmap bitmap, int[] iArr, int i, int i2, int i3, int i4);

    public static native void generateGradient(Bitmap bitmap, boolean z, int i, float f, int i2, int i3, int i4, int[] iArr);

    public static native long getDirSize(String str, int i, boolean z);

    public static native long getLastUsageFileTime(String str);

    public static byte[] intToBytes(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) (i >>> 16), (byte) (i >>> 8), (byte) i};
    }

    public static native boolean loadWebpImage(Bitmap bitmap, ByteBuffer byteBuffer, int i, BitmapFactory.Options options, boolean z);

    public static native int needInvert(Object obj, int i, int i2, int i3, int i4);

    private static native int pbkdf2(byte[] bArr, byte[] bArr2, byte[] bArr3, int i);

    public static native int pinBitmap(Bitmap bitmap);

    public static native String readlink(String str);

    public static native String readlinkFd(int i);

    public static native int saveProgressiveJpeg(Bitmap bitmap, int i, int i2, int i3, int i4, String str);

    public static native void setupNativeCrashesListener(String str);

    public static native void stackBlurBitmap(Bitmap bitmap, int i);

    public static native void unpinBitmap(Bitmap bitmap);

    static {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("/dev/urandom"));
            byte[] bArr = new byte[1024];
            fileInputStream.read(bArr);
            fileInputStream.close();
            random.setSeed(bArr);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static Bitmap stackBlurBitmapMax(Bitmap bitmap) {
        return stackBlurBitmapMax(bitmap, false);
    }

    public static Bitmap stackBlurBitmapMax(Bitmap bitmap, boolean z) {
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = (int) ((AndroidUtilities.dp(20.0f) * bitmap.getHeight()) / bitmap.getWidth());
        Bitmap createBitmap = Bitmap.createBitmap(dp, dp2, Bitmap.Config.ARGB_8888);
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
        stackBlurBitmap(createBitmap, Math.max(10, Math.max(dp, dp2) / ImageReceiver.DEFAULT_CROSSFADE_DURATION));
        return createBitmap;
    }

    public static Bitmap stackBlurBitmapWithScaleFactor(Bitmap bitmap, float f) {
        int max = (int) Math.max(AndroidUtilities.dp(20.0f), bitmap.getWidth() / f);
        int max2 = (int) Math.max((AndroidUtilities.dp(20.0f) * bitmap.getHeight()) / bitmap.getWidth(), bitmap.getHeight() / f);
        Bitmap createBitmap = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.scale(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        stackBlurBitmap(createBitmap, Math.max(10, Math.max(max, max2) / ImageReceiver.DEFAULT_CROSSFADE_DURATION));
        return createBitmap;
    }

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

    public static void aesIgeEncryption(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, boolean z, boolean z2, int i, int i2) {
        if (!z2) {
            bArr2 = (byte[]) bArr2.clone();
        }
        aesIgeEncryption(byteBuffer, bArr, bArr2, z, i, i2);
    }

    public static void aesIgeEncryptionByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, boolean z2, int i, int i2) {
        if (!z2) {
            bArr3 = (byte[]) bArr3.clone();
        }
        aesIgeEncryptionByteArray(bArr, bArr2, bArr3, z, i, i2);
    }

    public static void aesCbcEncryptionByteArraySafe(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4) {
        aesCbcEncryptionByteArray(bArr, bArr2, (byte[]) bArr3.clone(), i, i2, i3, i4);
    }

    public static Integer parseInt(CharSequence charSequence) {
        boolean z;
        int i = 0;
        if (charSequence == null) {
            return 0;
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            try {
                if (i3 >= charSequence.length()) {
                    break;
                }
                char charAt = charSequence.charAt(i3);
                if (charAt != '-' && (charAt < '0' || charAt > '9')) {
                    z = false;
                    if (!z && i2 < 0) {
                        i2 = i3;
                    } else if (!z && i2 >= 0) {
                        i3++;
                        break;
                    }
                    i3++;
                }
                z = true;
                if (!z) {
                }
                if (!z) {
                    i3++;
                    break;
                }
                continue;
                i3++;
            } catch (Exception unused) {
            }
        }
        if (i2 >= 0) {
            i = Integer.parseInt(charSequence.subSequence(i2, i3).toString());
        }
        return Integer.valueOf(i);
    }

    private static int parseInt(String str) {
        boolean z;
        int length = str.length();
        int i = 0;
        char charAt = str.charAt(0);
        if (charAt == '-') {
            z = false;
        } else {
            i = '0' - charAt;
            z = true;
        }
        for (int i2 = 1; i2 < length; i2++) {
            i = ((i * 10) + 48) - str.charAt(i2);
        }
        return z ? -i : i;
    }

    public static Long parseLong(String str) {
        long j = 0;
        if (str == null) {
            return 0L;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                j = Long.parseLong(matcher.group(0));
            }
        } catch (Exception unused) {
        }
        return Long.valueOf(j);
    }

    public static String parseIntToString(String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(0);
        }
        return null;
    }

    public static String bytesToHex(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = hexArray;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static byte[] hexToBytes(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static boolean isGoodPrime(byte[] bArr, int i) {
        return ConnectionsManager.native_isGoodPrime(bArr, i);
    }

    public static boolean isGoodGaAndGb(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.compareTo(BigInteger.valueOf(1L)) > 0 && bigInteger.compareTo(bigInteger2.subtract(BigInteger.valueOf(1L))) < 0;
    }

    public static boolean arraysEquals(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr == null || bArr2 == null || i < 0 || i2 < 0 || bArr.length - i > bArr2.length - i2 || bArr.length - i < 0 || bArr2.length - i2 < 0) {
            return false;
        }
        boolean z = true;
        for (int i3 = i; i3 < bArr.length; i3++) {
            if (bArr[i3 + i] != bArr2[i3 + i2]) {
                z = false;
            }
        }
        return z;
    }

    public static byte[] computeSHA1(byte[] bArr, int i, int i2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, i, i2);
            return messageDigest.digest();
        } catch (Exception e) {
            FileLog.e(e);
            return new byte[20];
        }
    }

    public static byte[] computeSHA1(ByteBuffer byteBuffer, int i, int i2) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                byteBuffer.position(i);
                byteBuffer.limit(i2);
                messageDigest.update(byteBuffer);
                return messageDigest.digest();
            } catch (Exception e) {
                FileLog.e(e);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                return new byte[20];
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

    public static byte[] computeSHA256(byte[] bArr) {
        return computeSHA256(bArr, 0, bArr.length);
    }

    public static byte[] computeSHA256(byte[] bArr, int i, long j) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr, i, (int) j);
            return messageDigest.digest();
        } catch (Exception e) {
            FileLog.e(e);
            return new byte[32];
        }
    }

    public static byte[] computeSHA256(byte[]... bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (int i = 0; i < bArr.length; i++) {
                messageDigest.update(bArr[i], 0, bArr[i].length);
            }
            return messageDigest.digest();
        } catch (Exception e) {
            FileLog.e(e);
            return new byte[32];
        }
    }

    public static byte[] computeSHA512(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(bArr, 0, bArr.length);
            return messageDigest.digest();
        } catch (Exception e) {
            FileLog.e(e);
            return new byte[64];
        }
    }

    public static byte[] computeSHA512(byte[] bArr, byte[] bArr2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(bArr, 0, bArr.length);
            messageDigest.update(bArr2, 0, bArr2.length);
            return messageDigest.digest();
        } catch (Exception e) {
            FileLog.e(e);
            return new byte[64];
        }
    }

    public static byte[] computePBKDF2(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        pbkdf2(bArr, bArr2, bArr3, 100000);
        return bArr3;
    }

    public static byte[] computeSHA512(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(bArr, 0, bArr.length);
            messageDigest.update(bArr2, 0, bArr2.length);
            messageDigest.update(bArr3, 0, bArr3.length);
            return messageDigest.digest();
        } catch (Exception e) {
            FileLog.e(e);
            return new byte[64];
        }
    }

    public static byte[] computeSHA256(byte[] bArr, int i, int i2, ByteBuffer byteBuffer, int i3, int i4) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bArr, i, i2);
                byteBuffer.position(i3);
                byteBuffer.limit(i4);
                messageDigest.update(byteBuffer);
                return messageDigest.digest();
            } catch (Exception e) {
                FileLog.e(e);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                return new byte[32];
            }
        } finally {
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }

    public static long bytesToLong(byte[] bArr) {
        return (bArr[7] << 56) + ((bArr[6] & 255) << 48) + ((bArr[5] & 255) << 40) + ((bArr[4] & 255) << 32) + ((bArr[3] & 255) << 24) + ((bArr[2] & 255) << 16) + ((bArr[1] & 255) << 8) + (bArr[0] & 255);
    }

    public static int bytesToInt(byte[] bArr) {
        return ((bArr[3] & 255) << 24) + ((bArr[2] & 255) << 16) + ((bArr[1] & 255) << 8) + (bArr[0] & 255);
    }

    public static String MD5(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(AndroidUtilities.getStringBytes(str));
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 255) | LiteMode.FLAG_CHAT_BLUR).substring(1, 3));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            FileLog.e(e);
            return null;
        }
    }

    public static String SHA256(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(AndroidUtilities.getStringBytes(str));
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 255) | LiteMode.FLAG_CHAT_BLUR).substring(1, 3));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            FileLog.e(e);
            return null;
        }
    }

    public static int clamp(int i, int i2, int i3) {
        return Math.max(Math.min(i, i2), i3);
    }

    public static long clamp(long j, long j2, long j3) {
        return Math.max(Math.min(j, j2), j3);
    }

    public static float clamp(float f, float f2, float f3) {
        return Float.isNaN(f) ? f3 : Float.isInfinite(f) ? f2 : Math.max(Math.min(f, f2), f3);
    }

    public static double clamp(double d, double d2, double d3) {
        return Double.isNaN(d) ? d3 : Double.isInfinite(d) ? d2 : Math.max(Math.min(d, d2), d3);
    }

    public static String generateRandomString() {
        return generateRandomString(16);
    }

    public static String generateRandomString(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(RANDOM_STRING_CHARS.charAt(fastRandom.nextInt(62)));
        }
        return sb.toString();
    }

    public static String getExtension(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        String substring = lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : null;
        if (substring == null) {
            return null;
        }
        return substring.toUpperCase();
    }

    public static <Key, Value> Value getOrDefault(HashMap<Key, Value> hashMap, Key key, Value value) {
        Value value2 = hashMap.get(key);
        return value2 == null ? value : value2;
    }

    public static void doCallbacks(Callback<Runnable>... callbackArr) {
        doCallbacks(0, callbackArr);
    }

    private static void doCallbacks(final int i, final Callback<Runnable>... callbackArr) {
        if (callbackArr == null || callbackArr.length <= i) {
            return;
        }
        callbackArr[i].run(new Runnable() {
            @Override
            public final void run() {
                Utilities.lambda$doCallbacks$0(i, callbackArr);
            }
        });
    }

    public static void lambda$doCallbacks$0(int i, Callback[] callbackArr) {
        doCallbacks(i + 1, callbackArr);
    }

    public static void raceCallbacks(final Runnable runnable, final Callback<Runnable>... callbackArr) {
        if (callbackArr == null || callbackArr.length == 0) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        final int[] iArr = {0};
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                Utilities.lambda$raceCallbacks$1(iArr, callbackArr, runnable);
            }
        };
        for (Callback<Runnable> callback : callbackArr) {
            callback.run(runnable2);
        }
    }

    public static void lambda$raceCallbacks$1(int[] iArr, Callback[] callbackArr, Runnable runnable) {
        iArr[0] = iArr[0] + 1;
        if (iArr[0] != callbackArr.length || runnable == null) {
            return;
        }
        runnable.run();
    }

    public static DispatchQueue getOrCreatePlayerQueue() {
        if (videoPlayerQueue == null) {
            videoPlayerQueue = new DispatchQueue("playerQueue");
        }
        return videoPlayerQueue;
    }

    public static boolean isNullOrEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }
}
