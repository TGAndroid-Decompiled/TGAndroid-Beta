package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.util.HashSet;
import java.util.Locale;
public final class sld implements r9, f69, OnSuccessListener, x4d, OnCompleteListener {
    public Object a;

    public sld(Object obj) {
        this.a = obj;
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int g(int i, String str) {
        int m = m(i);
        int a = a(str);
        return n(a) + a + m;
    }

    public static void j(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            char c = 57343;
            int i2 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i3 = remaining + arrayOffset;
                    while (i2 < length) {
                        int i4 = i2 + arrayOffset;
                        if (i4 >= i3 || (charAt = charSequence.charAt(i2)) >= 128) {
                            break;
                        }
                        array[i4] = (byte) charAt;
                        i2++;
                    }
                    if (i2 == length) {
                        i = arrayOffset + length;
                    } else {
                        i = arrayOffset + i2;
                        while (i2 < length) {
                            char charAt2 = charSequence.charAt(i2);
                            if (charAt2 < 128 && i < i3) {
                                array[i] = (byte) charAt2;
                                i++;
                            } else if (charAt2 < 2048 && i <= i3 - 2) {
                                int i5 = i + 1;
                                array[i] = (byte) ((charAt2 >>> 6) | 960);
                                i += 2;
                                array[i5] = (byte) ((charAt2 & '?') | 128);
                            } else if ((charAt2 < 55296 || c < charAt2) && i <= i3 - 3) {
                                array[i] = (byte) ((charAt2 >>> '\f') | 480);
                                int i6 = i + 2;
                                array[i + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i += 3;
                                array[i6] = (byte) ((charAt2 & '?') | 128);
                            } else if (i <= i3 - 4) {
                                int i7 = i2 + 1;
                                if (i7 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i7);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        array[i] = (byte) ((codePoint >>> 18) | 240);
                                        array[i + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i8 = i + 3;
                                        array[i + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i += 4;
                                        array[i8] = (byte) ((codePoint & 63) | 128);
                                        i2 = i7;
                                    } else {
                                        i2 = i7;
                                    }
                                }
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2 - 1);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i2++;
                            c = 57343;
                        }
                    }
                    byteBuffer.position(i - byteBuffer.arrayOffset());
                    return;
                } catch (ArrayIndexOutOfBoundsException e) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e);
                    throw bufferOverflowException;
                }
            }
            int length2 = charSequence.length();
            while (i2 < length2) {
                char charAt4 = charSequence.charAt(i2);
                char c2 = charAt4;
                if (charAt4 >= 128) {
                    if (charAt4 < 2048) {
                        byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                    } else if (charAt4 >= 55296 && 57343 >= charAt4) {
                        int i9 = i2 + 1;
                        if (i9 != charSequence.length()) {
                            char charAt5 = charSequence.charAt(i9);
                            if (Character.isSurrogatePair(charAt4, charAt5)) {
                                int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                i2 = i9;
                                i2++;
                            } else {
                                i2 = i9;
                            }
                        }
                        haf.c(39, i2 - 1, "Unpaired surrogate at index ");
                        return;
                    } else {
                        byteBuffer.put((byte) ((charAt4 >>> '\f') | 480));
                        byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                    }
                    c2 = (charAt4 & '?') | 128;
                }
                byteBuffer.put((byte) c2);
                i2++;
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }

    public static int l(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        if ((j & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int m(int i) {
        return n(i << 3);
    }

    public static int n(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        if ((i & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        cse cseVar = new cse((TaskCompletionSource) obj2, (byte) 1);
        n7d n7dVar = (n7d) ((e5f) obj).k();
        Parcel R = n7dVar.R();
        jgd.d(R, cseVar);
        R.writeStringArray((String[]) this.a);
        n7dVar.W(R, 6);
    }

    @Override
    public final void b(Bitmap bitmap) {
        dc6 dc6Var = kgf.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f = width;
            int height = bitmap.getHeight();
            int d = (int) ls6.d(f, 9.0f, 16.0f, 0.5f);
            float f2 = (d - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f2, f, height + f2);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, d, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((kgf) this.a).e(0, bitmap2);
    }

    public final void c(int i, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.a;
        h(i, 2);
        try {
            int n = n(str.length());
            if (n == n(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= n) {
                    byteBuffer.position(position + n);
                    j(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    f((position2 - position) - n);
                    byteBuffer.position(position2);
                    return;
                }
                throw new bk2(position + n, byteBuffer.limit());
            }
            f(a(str));
            j(str, byteBuffer);
        } catch (BufferOverflowException e) {
            bk2 bk2Var = new bk2(byteBuffer.position(), byteBuffer.limit());
            bk2Var.initCause(e);
            throw bk2Var;
        }
    }

    public final void d(int i, byte[] bArr) {
        h(i, 2);
        f(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.a;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new bk2(byteBuffer.position(), byteBuffer.limit());
    }

    public final void e(int i) {
        byte b = (byte) i;
        ByteBuffer byteBuffer = (ByteBuffer) this.a;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b);
            return;
        }
        throw new bk2(byteBuffer.position(), byteBuffer.limit());
    }

    public final void f(int i) {
        while ((i & (-128)) != 0) {
            e((i & 127) | 128);
            i >>>= 7;
        }
        e(i);
    }

    public final void h(int i, int i2) {
        f((i << 3) | i2);
    }

    @Override
    public final void i(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.a;
        q9 q9Var = (q9) obj;
        Intent intent = q9Var.b;
        int i = xgd.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i, extras);
        }
        int i2 = q9Var.a;
        if (i2 != -1 || i != 0) {
            xgd.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
        }
        proxyBillingActivityV2.finish();
    }

    public final void k(long j) {
        while (((-128) & j) != 0) {
            e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        e((int) j);
    }

    @Override
    public final void onComplete(Task task) {
        ed1.h((ed1) ((r5d) this.a).c, "launchApplication", task);
    }

    @Override
    public final void onSuccess(Object obj) {
        int i;
        byte b;
        i5f i5fVar;
        k1f b2;
        ad1 ad1Var = (ad1) this.a;
        Bundle bundle = (Bundle) obj;
        if (h6e.j) {
            Context context = ad1Var.a;
            u84 u84Var = ad1Var.f;
            h6e h6eVar = new h6e(context, u84Var, ad1Var.c, ad1Var.j, ad1Var.g);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE")) {
                i = bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0);
            } else if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) {
                i = 1;
            } else {
                i = 0;
            }
            boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i == 0) {
                if (z) {
                    i = 0;
                    z = true;
                } else {
                    return;
                }
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String o = tb4.o(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                b = 1;
            } else {
                b = 2;
            }
            h6eVar.h = b;
            i1c.b(context);
            h6eVar.g = i1c.a().c(i51.e).a("CAST_SENDER_SDK", new s24("proto"), o5f.f);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                h6eVar.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(o, 0);
            if (i != 0) {
                agb b3 = bgb.b();
                ?? obj2 = new Object();
                obj2.a = new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"};
                b3.a = obj2;
                b3.c = new f84[]{ied.c};
                b3.b = false;
                b3.d = (char) 8426;
                u84Var.e(0, b3.a()).addOnSuccessListener(new igf(h6eVar, packageName, i, sharedPreferences));
            }
            if (z) {
                fre.h(sharedPreferences);
                dc6 dc6Var = i5f.i;
                synchronized (i5f.class) {
                    i5fVar = i5f.k;
                    if (i5fVar == null) {
                        i5fVar = new i5f(sharedPreferences, h6eVar, packageName);
                        i5f.k = i5fVar;
                    }
                }
                String str = i5fVar.c;
                SharedPreferences sharedPreferences2 = i5fVar.b;
                HashSet hashSet = i5fVar.f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = i5fVar.g;
                hashSet2.clear();
                i5fVar.h = 0L;
                String str2 = i5f.j;
                if (str2.equals(string) && str.equals(string2)) {
                    i5fVar.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j = sharedPreferences2.getLong(str3, 0L);
                            if (j != 0 && currentTimeMillis - j > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                k1f b4 = i5f.b(str3.substring(41));
                                if (b4 != null) {
                                    hashSet2.add(b4);
                                    hashSet.add(b4);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b2 = i5f.b(str3.substring(41))) != null) {
                                hashSet.add(b2);
                            }
                        }
                    }
                    i5fVar.c(hashSet3);
                    i5fVar.e.post(i5fVar.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    i5fVar.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                i5f.a(k1f.CAST_CONTEXT);
            }
        }
    }
}
