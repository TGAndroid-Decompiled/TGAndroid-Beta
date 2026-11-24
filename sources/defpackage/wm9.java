package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import org.xmlpull.v1.XmlPullParserException;
public class wm9 implements zn9, mv8, lv8, q5b, lcb, OnCompleteListener, h89 {
    public static wm9 e;
    public final byte a;
    public Object b;
    public Object c;
    public Object d;

    public wm9(ArrayList arrayList) {
        this.a = (byte) 17;
        this.b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() << 1];
        for (int i = 0; i < arrayList.size(); i++) {
            xwc xwcVar = (xwc) arrayList.get(i);
            int i2 = i << 1;
            long[] jArr = (long[]) this.c;
            jArr[i2] = xwcVar.b;
            jArr[i2 + 1] = xwcVar.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public static wm9 c(View view) {
        return new wm9(view);
    }

    public static Object d(Task task) {
        try {
            return Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e3);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e4) {
            e = e4;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static Object[] g(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        qgb qgbVar = ehb.T;
        int i = -1;
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, i + 1);
        for (int i3 = 0; i3 < length; i3++) {
            objArr2[iArr[i3]] = objArr[i3];
        }
        return objArr2;
    }

    public static wm9 h(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        wm9 wm9Var = new wm9(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) wm9Var.c)) {
            ((ArrayDeque) wm9Var.c).clear();
            String string = ((SharedPreferences) wm9Var.b).getString("topic_operation_queue", "");
            if (!TextUtils.isEmpty(string) && string.contains(",")) {
                String[] split = string.split(",", -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        ((ArrayDeque) wm9Var.c).add(str);
                    }
                }
                return wm9Var;
            }
            return wm9Var;
        }
    }

    public static boolean u() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static wm9 v(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new wm9(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public final void A(int i, String str, String str2) {
        ((HashMap) this.b).put(str, str2);
        ((HashMap) this.c).put(str2, str);
        ((HashMap) this.d).put(str, Integer.valueOf(i));
    }

    public final void B(Object obj, String str) {
        wm9 wm9Var = new wm9((byte) 24, false);
        ((wm9) this.d).d = wm9Var;
        this.d = wm9Var;
        wm9Var.c = obj;
        wm9Var.b = str;
    }

    @Override
    public final void a(ArrayList arrayList) {
        odc odcVar = (odc) this.d;
        if (odcVar.b == ((v5b) this.c)) {
            odcVar.g = arrayList;
        }
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        boolean z;
        bhd bhdVar = (bhd) this.b;
        String str = (String) this.c;
        b26 b26Var = (b26) this.d;
        mjf mjfVar = (mjf) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (bhdVar.G == 2) {
            z = true;
        } else {
            z = false;
        }
        ite.j("Not connected to device", z);
        z8d z8dVar = (z8d) mjfVar.k();
        Parcel R = z8dVar.R();
        R.writeString(str);
        kid.c(R, b26Var);
        z8dVar.W(R, 13);
        synchronized (bhdVar.s) {
            if (bhdVar.p != null) {
                bhdVar.i(2477);
            }
            bhdVar.p = taskCompletionSource;
        }
    }

    @Override
    public final int b(long j) {
        long[] jArr = (long[]) this.d;
        int b = hac.b(jArr, j, false);
        if (b < jArr.length) {
            return b;
        }
        return -1;
    }

    public final String e(int i, long j, long j2, String str) {
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.c;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int size = arrayList2.size();
            ArrayList arrayList3 = (ArrayList) this.b;
            if (i2 < size) {
                sb.append((String) arrayList3.get(i2));
                if (((Integer) arrayList2.get(i2)).intValue() == 1) {
                    sb.append(str);
                } else if (((Integer) arrayList2.get(i2)).intValue() == 2) {
                    sb.append(String.format(Locale.US, (String) arrayList.get(i2), Long.valueOf(j)));
                } else if (((Integer) arrayList2.get(i2)).intValue() == 3) {
                    sb.append(String.format(Locale.US, (String) arrayList.get(i2), Integer.valueOf(i)));
                } else if (((Integer) arrayList2.get(i2)).intValue() == 4) {
                    sb.append(String.format(Locale.US, (String) arrayList.get(i2), Long.valueOf(j2)));
                }
                i2++;
            } else {
                sb.append((String) arrayList3.get(arrayList2.size()));
                return sb.toString();
            }
        }
    }

    @Override
    public final void f(long j, long j2, boolean z) {
        ((jd4) this.b).f(j, j2, z);
    }

    @Override
    public final Object mo8get() {
        switch (this.a) {
            case 2:
                return new in3((Context) ((mq5) this.b).a, (mq9) ((mv8) this.c).mo8get(), (jb0) ((k4f) this.d).mo8get(), (byte) 12);
            case 3:
                return new haa((cy2) ((lq5) this.b).a, (tpb) ((lv8) this.c).mo8get(), (h83) ((lv8) this.d).mo8get());
            default:
                return new i3c(new kg7((byte) 29), new k4f((byte) 28), (kd3) ((sm2) this.b).mo8get(), (za0) ((pr2) this.c).mo8get(), (e7a) ((xvc) this.d).mo8get());
        }
    }

    public final ColorStateList i(int i) {
        int resourceId;
        ColorStateList e2;
        TypedArray typedArray = (TypedArray) this.c;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (e2 = rs.e((Context) this.b, resourceId)) != null) {
            return e2;
        }
        return typedArray.getColorStateList(i);
    }

    public final Drawable j(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return kod.a((Context) this.b, resourceId);
        }
        return typedArray.getDrawable(i);
    }

    @Override
    public final long k(int i) {
        boolean z;
        long[] jArr = (long[]) this.d;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        if (i < jArr.length) {
            z2 = true;
        }
        jte.f(z2);
        return jArr[i];
    }

    @Override
    public final void l(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        allocateDirect.put(byteBuffer).flip();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ((ArrayList) this.b).add(allocateDirect);
        ((ArrayList) this.c).add(bufferInfo2);
    }

    public final Drawable m(int i) {
        int resourceId;
        Drawable f;
        if (((TypedArray) this.c).hasValue(i) && (resourceId = ((TypedArray) this.c).getResourceId(i, 0)) != 0) {
            fq a = fq.a();
            Context context = (Context) this.b;
            synchronized (a) {
                f = a.a.f(resourceId, context, true);
            }
            return f;
        }
        return null;
    }

    @Override
    public final void n() {
        odc odcVar = (odc) this.d;
        if (odcVar.b != ((v5b) this.c)) {
            return;
        }
        odcVar.c();
        odcVar.a.a();
    }

    @Override
    public final void o(MediaFormat mediaFormat) {
        this.d = mediaFormat;
    }

    @Override
    public final void onComplete(Task task) {
        String str = (String) this.c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        cka ckaVar = ((fo9) this.b).a;
        synchronized (ckaVar) {
            ckaVar.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override
    public final List p(long j) {
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.c;
            int i2 = i << 1;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                xwc xwcVar = (xwc) list.get(i);
                f53 f53Var = xwcVar.a;
                if (f53Var.e == -3.4028235E38f) {
                    arrayList2.add(xwcVar);
                } else {
                    arrayList.add(f53Var);
                }
            }
        }
        Collections.sort(arrayList2, new zua((byte) 14));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            f53 f53Var2 = ((xwc) arrayList2.get(i3)).a;
            arrayList.add(new f53(f53Var2.a, f53Var2.b, f53Var2.c, f53Var2.d, (-1) - i3, 1, f53Var2.g, f53Var2.h, f53Var2.i, f53Var2.n, f53Var2.o, f53Var2.j, f53Var2.k, f53Var2.l, f53Var2.m, f53Var2.p, f53Var2.q, f53Var2.r));
        }
        return arrayList;
    }

    @Override
    public final int q() {
        return ((long[]) this.d).length;
    }

    public final Typeface r(int i, int i2, ir irVar) {
        ir irVar2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.c).getResourceId(i, 0);
        if (resourceId != 0) {
            TypedValue typedValue = (TypedValue) this.d;
            if (typedValue == null) {
                typedValue = new TypedValue();
                this.d = typedValue;
            }
            Context context = (Context) this.b;
            ThreadLocal threadLocal = kc9.a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence != null) {
                    String charSequence2 = charSequence.toString();
                    if (!charSequence2.startsWith("res/")) {
                        irVar.b();
                        return null;
                    }
                    int i3 = typedValue.assetCookie;
                    fi6 fi6Var = s5c.b;
                    Typeface typeface = (Typeface) fi6Var.a(s5c.b(resources, resourceId, charSequence2, i3, i2));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new ey8(irVar, typeface, (byte) 18));
                        return typeface;
                    }
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            xn4 a = ake.a(resources.getXml(resourceId), resources);
                            if (a == null) {
                                try {
                                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                                    irVar.b();
                                    return null;
                                } catch (IOException e2) {
                                    iOException = e2;
                                    irVar2 = irVar;
                                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                    irVar2.b();
                                    return null;
                                } catch (XmlPullParserException e3) {
                                    xmlPullParserException = e3;
                                    irVar2 = irVar;
                                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                    irVar2.b();
                                    return null;
                                }
                            }
                            try {
                                return s5c.a(context, a, resources, resourceId, charSequence2, typedValue.assetCookie, i2, irVar);
                            } catch (IOException e4) {
                                e = e4;
                                irVar2 = irVar;
                                iOException = e;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                irVar2.b();
                                return null;
                            } catch (XmlPullParserException e5) {
                                e = e5;
                                irVar2 = irVar;
                                xmlPullParserException = e;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                irVar2.b();
                                return null;
                            }
                        }
                        irVar2 = irVar;
                        try {
                            int i4 = typedValue.assetCookie;
                            Typeface d = s5c.a.d(context, resources, resourceId, charSequence2, i2);
                            if (d != null) {
                                fi6Var.b(s5c.b(resources, resourceId, charSequence2, i4, i2), d);
                                new Handler(Looper.getMainLooper()).post(new ey8(irVar2, d, (byte) 18));
                            } else {
                                irVar2.b();
                            }
                            return d;
                        } catch (IOException e6) {
                            e = e6;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            irVar2.b();
                            return null;
                        } catch (XmlPullParserException e7) {
                            e = e7;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            irVar2.b();
                            return null;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        irVar2 = irVar;
                    } catch (XmlPullParserException e9) {
                        e = e9;
                        irVar2 = irVar;
                    }
                } else {
                    String resourceName = resources.getResourceName(resourceId);
                    String hexString = Integer.toHexString(resourceId);
                    throw new Resources.NotFoundException("Resource \"" + resourceName + "\" (" + hexString + ") is not a Font: " + typedValue);
                }
            }
        }
        return null;
    }

    public final void s(u05 u05Var) {
        try {
            mye myeVar = (mye) this.c;
            t6d t6dVar = new t6d(u05Var);
            Parcel R = myeVar.R();
            tid.c(R, t6dVar);
            myeVar.V(R, 9);
        } catch (RemoteException e2) {
            i2d.h(e2);
        }
    }

    public final pfc t(cj2 cj2Var, String str) {
        boolean isInstance;
        pfc g;
        sfc sfcVar = (sfc) this.c;
        tfc tfcVar = (tfc) this.b;
        tfcVar.getClass();
        LinkedHashMap linkedHashMap = tfcVar.a;
        pfc pfcVar = (pfc) linkedHashMap.get(str);
        Class cls = cj2Var.a;
        cls.getClass();
        Map map = cj2.b;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = r5c.b(num.intValue(), pfcVar);
        } else {
            if (cls.isPrimitive()) {
                cls = sne.a(h79.a(cls));
            }
            isInstance = cls.isInstance(pfcVar);
        }
        if (isInstance) {
            if (sfcVar instanceof fs9) {
                fs9 fs9Var = (fs9) sfcVar;
                pfcVar.getClass();
                w26 w26Var = fs9Var.d;
                if (w26Var != null) {
                    op opVar = fs9Var.e;
                    opVar.getClass();
                    npe.a(pfcVar, opVar, w26Var);
                }
            }
            pfcVar.getClass();
            return pfcVar;
        }
        ij7 ij7Var = new ij7((x23) this.d);
        ((LinkedHashMap) ij7Var.a).put(k1f.e, str);
        try {
            g = sfcVar.g(cj2Var, ij7Var);
        } catch (Error unused) {
            g = sfcVar.g(cj2Var, v23.b);
        }
        g.getClass();
        pfc pfcVar2 = (pfc) linkedHashMap.put(str, g);
        if (pfcVar2 != null) {
            pfcVar2.a();
        }
        return g;
    }

    public final String toString() {
        String str = "";
        switch (this.a) {
            case 22:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                xab xabVar = (xab) this.c;
                while (true) {
                    xabVar = (xab) xabVar.c;
                    if (xabVar != null) {
                        Object obj = xabVar.b;
                        sb.append(str);
                        if (obj != null && obj.getClass().isArray()) {
                            String deepToString = Arrays.deepToString(new Object[]{obj});
                            sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                        } else {
                            sb.append(obj);
                        }
                        str = ", ";
                    } else {
                        sb.append('}');
                        return sb.toString();
                    }
                }
                break;
            case 25:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                wm9 wm9Var = (wm9) ((wm9) this.c).d;
                while (wm9Var != null) {
                    Object obj2 = wm9Var.c;
                    sb2.append(str);
                    String str2 = (String) wm9Var.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj2 != null && obj2.getClass().isArray()) {
                        String deepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb2.append((CharSequence) deepToString2, 1, deepToString2.length() - 1);
                    } else {
                        sb2.append(obj2);
                    }
                    wm9Var = (wm9) wm9Var.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 29:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                wm9 wm9Var2 = (wm9) ((wm9) this.c).d;
                while (wm9Var2 != null) {
                    Object obj3 = wm9Var2.c;
                    sb3.append(str);
                    String str3 = (String) wm9Var2.b;
                    if (str3 != null) {
                        sb3.append(str3);
                        sb3.append('=');
                    }
                    if (obj3 != null && obj3.getClass().isArray()) {
                        String deepToString3 = Arrays.deepToString(new Object[]{obj3});
                        sb3.append((CharSequence) deepToString3, 1, deepToString3.length() - 1);
                    } else {
                        sb3.append(obj3);
                    }
                    wm9Var2 = (wm9) wm9Var2.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public final String w() {
        String str;
        synchronized (((ArrayDeque) this.c)) {
            str = (String) ((ArrayDeque) this.c).peek();
        }
        return str;
    }

    public final void x(String str, String str2, String str3, String str4) {
        li4 li4Var = (li4) this.c;
        if (str2 != null && str3 != null) {
            li4Var.a();
            zi4 zi4Var = li4Var.c;
            String str5 = zi4Var.h;
            li4Var.a();
            String str6 = zi4Var.a;
            if (str5 != null) {
                URL url = new URL(kt6.p(str, ":", str4, mlb.m("https://fcmregistrations.googleapis.com/v1/projects/", str5, "/registrations/", str3, "/topicSubscriptions/")));
                if (u()) {
                    StringBuilder m = mlb.m("Topic ", str4, " for: ", str, " with url: ");
                    m.append(url);
                    Log.d("FirebaseMessaging", m.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("x-goog-api-key", str6);
                httpURLConnection.setRequestProperty("x-goog-firebase-installations-auth", str2);
                httpURLConnection.setDoOutput(false);
                try {
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        String responseMessage = httpURLConnection.getResponseMessage();
                        try {
                            InputStream inputStream = httpURLConnection.getInputStream();
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } catch (IOException unused) {
                        }
                        try {
                            InputStream errorStream = httpURLConnection.getErrorStream();
                            if (errorStream != null) {
                                errorStream.close();
                            }
                        } catch (IOException unused2) {
                        }
                        httpURLConnection.disconnect();
                        if (responseCode >= 200 && responseCode < 300) {
                            if (u()) {
                                Log.d("FirebaseMessaging", b10.i("Topic ", str4, " for: ", str, " succeeded."));
                                return;
                            }
                            return;
                        } else if (responseCode != 404 && responseCode != 403) {
                            if (responseCode >= 500) {
                                wa3.d("INTERNAL_SERVER_ERROR");
                                return;
                            }
                            throw new IOException("Topic " + str4 + " failed with status: " + responseCode);
                        } else {
                            if (u()) {
                                Log.d("FirebaseMessaging", "Topic " + str4 + " failed: " + responseMessage);
                            }
                            wa3.d(td4.r("Topic ", str4, " failed: ", responseMessage));
                            return;
                        }
                    } catch (IOException e2) {
                        throw new IOException("SERVICE_NOT_AVAILABLE", e2);
                    }
                } catch (Throwable th) {
                    try {
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                    } catch (IOException unused3) {
                    }
                    try {
                        InputStream errorStream2 = httpURLConnection.getErrorStream();
                        if (errorStream2 != null) {
                            errorStream2.close();
                        }
                    } catch (IOException unused4) {
                    }
                    httpURLConnection.disconnect();
                    throw th;
                }
            }
            wa3.d("Project ID or API Key is missing");
            return;
        }
        wa3.d("FIS auth token or FIS ID is empty");
    }

    public final void y() {
        ((TypedArray) this.c).recycle();
    }

    public final boolean z(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.c)) {
            remove = ((ArrayDeque) this.c).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.d).execute(new c0a(this, (byte) 19));
            }
        }
        return remove;
    }

    public wm9(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public wm9(su suVar, mye myeVar) {
        this.a = (byte) 19;
        this.c = myeVar;
        ite.h(suVar);
        this.b = suVar;
    }

    public wm9(k89 k89Var) {
        this.a = (byte) 23;
        this.d = k89Var;
        this.c = new AtomicLong((qe1.b.nextLong() & 65535) * 10000);
    }

    public wm9(String str, byte b) {
        this.a = b;
        switch (b) {
            case 25:
                wm9 wm9Var = new wm9((byte) 24, false);
                this.c = wm9Var;
                this.d = wm9Var;
                this.b = str;
                return;
            case 29:
                wm9 wm9Var2 = new wm9((byte) 26, false);
                this.c = wm9Var2;
                this.d = wm9Var2;
                this.b = str;
                return;
            default:
                xab xabVar = new xab((byte) 14, false);
                this.c = xabVar;
                this.d = xabVar;
                this.b = str;
                return;
        }
    }

    public wm9(tfc tfcVar, sfc sfcVar, x23 x23Var) {
        this.a = (byte) 14;
        tfcVar.getClass();
        sfcVar.getClass();
        x23Var.getClass();
        this.b = tfcVar;
        this.c = sfcVar;
        this.d = x23Var;
    }

    public wm9(String str, Boolean bool, zd1 zd1Var, String str2) {
        this.a = (byte) 7;
        this.b = str;
        this.c = str2;
        this.d = zd1Var;
    }

    public wm9(byte b, boolean z) {
        this.a = b;
    }

    public wm9(View view) {
        this.a = (byte) 12;
        this.d = view;
        ccc cccVar = new ccc(this, view);
        this.b = cccVar;
        view.addOnLayoutChangeListener(cccVar);
    }

    public wm9(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = (byte) 4;
        this.c = new ArrayDeque();
        this.b = sharedPreferences;
        this.d = scheduledThreadPoolExecutor;
    }

    public wm9(Context context, TypedArray typedArray) {
        this.a = (byte) 6;
        this.b = context;
        this.c = typedArray;
    }

    public wm9(Context context, LocationManager locationManager) {
        this.a = (byte) 10;
        this.d = new Object();
        this.b = context;
        this.c = locationManager;
    }

    public wm9(li4 li4Var, FirebaseMessaging firebaseMessaging, ti4 ti4Var) {
        this.a = (byte) 8;
        this.b = ti4Var;
        this.c = li4Var;
        this.d = firebaseMessaging;
    }

    public wm9(odc odcVar, jd4 jd4Var, v5b v5bVar) {
        this.a = (byte) 13;
        this.d = odcVar;
        this.b = jd4Var;
        this.c = v5bVar;
    }

    public wm9(byte b) {
        this.a = b;
        switch (b) {
            case 27:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = new HashMap();
                return;
            default:
                this.b = new ArrayList();
                this.c = new ArrayList();
                return;
        }
    }

    public wm9(View view, zgc zgcVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        this.a = (byte) 15;
        wd wdVar = new wd(this, (byte) 20);
        this.b = view;
        this.c = zgcVar;
        view.addOnAttachStateChangeListener(wdVar);
        if (!view.isAttachedToWindow() || (viewTreeObserver2 = (ViewTreeObserver) this.d) == (viewTreeObserver = view.getViewTreeObserver())) {
            return;
        }
        if (viewTreeObserver2 != null) {
            if (viewTreeObserver2.isAlive()) {
                ((ViewTreeObserver) this.d).removeOnPreDrawListener(zgcVar);
            }
            this.d = null;
        }
        this.d = viewTreeObserver;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(zgcVar);
        }
    }

    public wm9(String str, String str2) {
        this.a = (byte) 16;
        this.b = str;
        this.c = str2;
        this.d = str2.isEmpty() ? str : kt6.o(str, "/", str2);
    }

    public wm9(Object[] objArr, Object[] objArr2) {
        this.a = (byte) 5;
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap hashMap = new HashMap();
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Integer num = (Integer) hashMap.get(obj);
            if (num == null) {
                num = Integer.valueOf(hashMap.size());
                hashMap.put(obj, num);
            }
            iArr[i] = num.intValue();
        }
        this.b = iArr;
        this.c = g(objArr, iArr);
        this.d = g(objArr2, iArr);
    }
}
