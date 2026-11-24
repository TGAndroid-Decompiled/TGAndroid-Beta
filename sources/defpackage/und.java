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
public final class und implements r9, h89, OnSuccessListener, z6d, OnCompleteListener {
    public Object a;

    public und(Object obj) {
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
        int l = l(i);
        int a = a(str);
        return n(a) + a + l;
    }

    public static void i(CharSequence charSequence, ByteBuffer byteBuffer) {
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
                        i2d.c(39, i2 - 1, "Unpaired surrogate at index ");
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

    public static int k(long j) {
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

    public static int l(int i) {
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
        fue fueVar = new fue((TaskCompletionSource) obj2, (byte) 1);
        p9d p9dVar = (p9d) ((g7f) obj).k();
        Parcel R = p9dVar.R();
        kid.d(R, fueVar);
        R.writeStringArray((String[]) this.a);
        p9dVar.W(R, 6);
    }

    public final void b(int i, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.a;
        h(i, 2);
        try {
            int n = n(str.length());
            if (n == n(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= n) {
                    byteBuffer.position(position + n);
                    i(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    f((position2 - position) - n);
                    byteBuffer.position(position2);
                    return;
                }
                throw new ol2(position + n, byteBuffer.limit());
            }
            f(a(str));
            i(str, byteBuffer);
        } catch (BufferOverflowException e) {
            ol2 ol2Var = new ol2(byteBuffer.position(), byteBuffer.limit());
            ol2Var.initCause(e);
            throw ol2Var;
        }
    }

    public final void c(int i, byte[] bArr) {
        h(i, 2);
        f(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.a;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new ol2(byteBuffer.position(), byteBuffer.limit());
    }

    @Override
    public final void d(Bitmap bitmap) {
        ce6 ce6Var = lif.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f = width;
            int height = bitmap.getHeight();
            int d = (int) kt6.d(f, 9.0f, 16.0f, 0.5f);
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
        ((lif) this.a).e(0, bitmap2);
    }

    public final void e(int i) {
        byte b = (byte) i;
        ByteBuffer byteBuffer = (ByteBuffer) this.a;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b);
            return;
        }
        throw new ol2(byteBuffer.position(), byteBuffer.limit());
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

    public final void j(long j) {
        while (((-128) & j) != 0) {
            e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        e((int) j);
    }

    @Override
    public final void m(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.a;
        q9 q9Var = (q9) obj;
        Intent intent = q9Var.b;
        int i = yid.e("ProxyBillingActivityV2", intent).a;
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
            yid.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i2 + " and billing's responseCode: " + i);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public final void onComplete(Task task) {
        me1.h((me1) ((t7d) this.a).c, "launchApplication", task);
    }

    @Override
    public final void onSuccess(Object obj) {
        int i;
        byte b;
        k7f k7fVar;
        m3f b2;
        ie1 ie1Var = (ie1) this.a;
        Bundle bundle = (Bundle) obj;
        if (i8e.j) {
            Context context = ie1Var.a;
            ua4 ua4Var = ie1Var.f;
            i8e i8eVar = new i8e(context, ua4Var, ie1Var.c, ie1Var.j, ie1Var.g);
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
            String p = td4.p(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                b = 1;
            } else {
                b = 2;
            }
            i8eVar.h = b;
            i3c.b(context);
            i8eVar.g = i3c.a().c(p61.e).a("CAST_SENDER_SDK", new d44("proto"), q7f.f);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                i8eVar.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(p, 0);
            if (i != 0) {
                bib b3 = cib.b();
                ?? obj2 = new Object();
                obj2.a = new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"};
                b3.a = obj2;
                b3.c = new o94[]{jgd.c};
                b3.b = false;
                b3.d = (char) 8426;
                ua4Var.e(0, b3.a()).addOnSuccessListener(new jif(i8eVar, packageName, i, sharedPreferences));
            }
            if (z) {
                ite.h(sharedPreferences);
                ce6 ce6Var = k7f.i;
                synchronized (k7f.class) {
                    k7fVar = k7f.k;
                    if (k7fVar == null) {
                        k7fVar = new k7f(sharedPreferences, i8eVar, packageName);
                        k7f.k = k7fVar;
                    }
                }
                String str = k7fVar.c;
                SharedPreferences sharedPreferences2 = k7fVar.b;
                HashSet hashSet = k7fVar.f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = k7fVar.g;
                hashSet2.clear();
                k7fVar.h = 0L;
                String str2 = k7f.j;
                if (str2.equals(string) && str.equals(string2)) {
                    k7fVar.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j = sharedPreferences2.getLong(str3, 0L);
                            if (j != 0 && currentTimeMillis - j > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                m3f b4 = k7f.b(str3.substring(41));
                                if (b4 != null) {
                                    hashSet2.add(b4);
                                    hashSet.add(b4);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b2 = k7f.b(str3.substring(41))) != null) {
                                hashSet.add(b2);
                            }
                        }
                    }
                    k7fVar.c(hashSet3);
                    k7fVar.e.post(k7fVar.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    k7fVar.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                k7f.a(m3f.CAST_CONTEXT);
            }
        }
    }
}
