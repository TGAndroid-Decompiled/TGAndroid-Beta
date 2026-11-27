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
public class ko9 implements op9, uw8, tw8, m7b, heb, OnCompleteListener, s99 {
    public static ko9 e;
    public final byte a;
    public Object b;
    public Object c;
    public Object d;

    public ko9(ArrayList arrayList) {
        this.a = (byte) 17;
        this.b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() << 1];
        for (int i = 0; i < arrayList.size(); i++) {
            mzc mzcVar = (mzc) arrayList.get(i);
            int i2 = i << 1;
            long[] jArr = (long[]) this.c;
            jArr[i2] = mzcVar.b;
            jArr[i2 + 1] = mzcVar.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public static ko9 e(View view) {
        return new ko9(view);
    }

    public static Object f(Task task) {
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

    public static Object[] h(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        lib libVar = zib.T;
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

    public static ko9 j(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        ko9 ko9Var = new ko9(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) ko9Var.c)) {
            ((ArrayDeque) ko9Var.c).clear();
            String string = ((SharedPreferences) ko9Var.b).getString("topic_operation_queue", "");
            if (!TextUtils.isEmpty(string) && string.contains(",")) {
                String[] split = string.split(",", -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        ((ArrayDeque) ko9Var.c).add(str);
                    }
                }
                return ko9Var;
            }
            return ko9Var;
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

    public static ko9 v(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new ko9(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public final void A(int i, String str, String str2) {
        ((HashMap) this.b).put(str, str2);
        ((HashMap) this.c).put(str2, str);
        ((HashMap) this.d).put(str, Integer.valueOf(i));
    }

    public final void B(Object obj, String str) {
        ko9 ko9Var = new ko9((byte) 24, false);
        ((ko9) this.d).d = ko9Var;
        this.d = ko9Var;
        ko9Var.c = obj;
        ko9Var.b = str;
    }

    @Override
    public final void a(ArrayList arrayList) {
        lfc lfcVar = (lfc) this.d;
        if (lfcVar.b == ((r7b) this.c)) {
            lfcVar.g = arrayList;
        }
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        boolean z;
        rjd rjdVar = (rjd) this.b;
        String str = (String) this.c;
        f26 f26Var = (f26) this.d;
        bmf bmfVar = (bmf) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (rjdVar.G == 2) {
            z = true;
        } else {
            z = false;
        }
        xve.j("Not connected to device", z);
        qbd qbdVar = (qbd) bmfVar.k();
        Parcel R = qbdVar.R();
        R.writeString(str);
        ald.c(R, f26Var);
        qbdVar.W(R, 13);
        synchronized (rjdVar.s) {
            if (rjdVar.p != null) {
                rjdVar.i(2477);
            }
            rjdVar.p = taskCompletionSource;
        }
    }

    @Override
    public final int b(long j) {
        long[] jArr = (long[]) this.d;
        int b = gcc.b(jArr, j, false);
        if (b < jArr.length) {
            return b;
        }
        return -1;
    }

    @Override
    public final void c(long j, long j2, boolean z) {
        ((gd4) this.b).f(j, j2, z);
    }

    @Override
    public final void d() {
        lfc lfcVar = (lfc) this.d;
        if (lfcVar.b != ((r7b) this.c)) {
            return;
        }
        lfcVar.c();
        lfcVar.a.a();
    }

    public final String g(int i, long j, long j2, String str) {
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
    public final Object mo21get() {
        switch (this.a) {
            case 2:
                return new pm3((Context) ((pq5) this.b).a, (ds9) ((uw8) this.c).mo21get(), (la0) ((z6f) this.d).mo21get(), (byte) 12);
            case 3:
                return new yba((mx2) ((aj3) this.b).b, (srb) ((tw8) this.c).mo21get(), (o73) ((tw8) this.d).mo21get());
            default:
                return new h5c(new Object(), new z6f((byte) 28), (rc3) ((am2) this.b).mo21get(), (ba0) ((xq2) this.c).mo21get(), (u8a) ((lyc) this.d).mo21get());
        }
    }

    @Override
    public final long i(int i) {
        boolean z;
        long[] jArr = (long[]) this.d;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        if (i < jArr.length) {
            z2 = true;
        }
        yve.f(z2);
        return jArr[i];
    }

    @Override
    public final void k(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        allocateDirect.put(byteBuffer).flip();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ((ArrayList) this.b).add(allocateDirect);
        ((ArrayList) this.c).add(bufferInfo2);
    }

    @Override
    public final List l(long j) {
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.c;
            int i2 = i << 1;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                mzc mzcVar = (mzc) list.get(i);
                m43 m43Var = mzcVar.a;
                if (m43Var.e == -3.4028235E38f) {
                    arrayList2.add(mzcVar);
                } else {
                    arrayList.add(m43Var);
                }
            }
        }
        Collections.sort(arrayList2, new fna((byte) 16));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            m43 m43Var2 = ((mzc) arrayList2.get(i3)).a;
            arrayList.add(new m43(m43Var2.a, m43Var2.b, m43Var2.c, m43Var2.d, (-1) - i3, 1, m43Var2.g, m43Var2.h, m43Var2.i, m43Var2.n, m43Var2.o, m43Var2.j, m43Var2.k, m43Var2.l, m43Var2.m, m43Var2.p, m43Var2.q, m43Var2.r));
        }
        return arrayList;
    }

    public final ColorStateList m(int i) {
        int resourceId;
        ColorStateList e2;
        TypedArray typedArray = (TypedArray) this.c;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (e2 = sr.e((Context) this.b, resourceId)) != null) {
            return e2;
        }
        return typedArray.getColorStateList(i);
    }

    public final Drawable n(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return yqd.a((Context) this.b, resourceId);
        }
        return typedArray.getDrawable(i);
    }

    @Override
    public final void o(MediaFormat mediaFormat) {
        this.d = mediaFormat;
    }

    @Override
    public final void onComplete(Task task) {
        String str = (String) this.c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        vla vlaVar = ((up9) this.b).a;
        synchronized (vlaVar) {
            vlaVar.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public final Drawable p(int i) {
        int resourceId;
        Drawable f;
        if (((TypedArray) this.c).hasValue(i) && (resourceId = ((TypedArray) this.c).getResourceId(i, 0)) != 0) {
            gp a = gp.a();
            Context context = (Context) this.b;
            synchronized (a) {
                f = a.a.f(resourceId, context, true);
            }
            return f;
        }
        return null;
    }

    @Override
    public final int q() {
        return ((long[]) this.d).length;
    }

    public final Typeface r(int i, int i2, jq jqVar) {
        jq jqVar2;
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
            ThreadLocal threadLocal = yd9.a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence != null) {
                    String charSequence2 = charSequence.toString();
                    if (!charSequence2.startsWith("res/")) {
                        jqVar.b();
                        return null;
                    }
                    int i3 = typedValue.assetCookie;
                    ji6 ji6Var = r7c.b;
                    Typeface typeface = (Typeface) ji6Var.a(r7c.b(resources, resourceId, charSequence2, i3, i2));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new yz8(jqVar, typeface, (byte) 16));
                        return typeface;
                    }
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            bo4 a = tme.a(resources.getXml(resourceId), resources);
                            if (a == null) {
                                try {
                                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                                    jqVar.b();
                                    return null;
                                } catch (IOException e2) {
                                    iOException = e2;
                                    jqVar2 = jqVar;
                                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                    jqVar2.b();
                                    return null;
                                } catch (XmlPullParserException e3) {
                                    xmlPullParserException = e3;
                                    jqVar2 = jqVar;
                                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                    jqVar2.b();
                                    return null;
                                }
                            }
                            try {
                                return r7c.a(context, a, resources, resourceId, charSequence2, typedValue.assetCookie, i2, jqVar);
                            } catch (IOException e4) {
                                e = e4;
                                jqVar2 = jqVar;
                                iOException = e;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                jqVar2.b();
                                return null;
                            } catch (XmlPullParserException e5) {
                                e = e5;
                                jqVar2 = jqVar;
                                xmlPullParserException = e;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                jqVar2.b();
                                return null;
                            }
                        }
                        jqVar2 = jqVar;
                        try {
                            int i4 = typedValue.assetCookie;
                            Typeface d = r7c.a.d(context, resources, resourceId, charSequence2, i2);
                            if (d != null) {
                                ji6Var.b(r7c.b(resources, resourceId, charSequence2, i4, i2), d);
                                new Handler(Looper.getMainLooper()).post(new yz8(jqVar2, d, (byte) 16));
                            } else {
                                jqVar2.b();
                            }
                            return d;
                        } catch (IOException e6) {
                            e = e6;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            jqVar2.b();
                            return null;
                        } catch (XmlPullParserException e7) {
                            e = e7;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            jqVar2.b();
                            return null;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        jqVar2 = jqVar;
                    } catch (XmlPullParserException e9) {
                        e = e9;
                        jqVar2 = jqVar;
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

    public final void s(z05 z05Var) {
        try {
            b1f b1fVar = (b1f) this.c;
            k9d k9dVar = new k9d(z05Var);
            Parcel R = b1fVar.R();
            jld.c(R, k9dVar);
            b1fVar.V(R, 9);
        } catch (RemoteException e2) {
            p3d.i(e2);
        }
    }

    public final nhc t(ki2 ki2Var, String str) {
        boolean isInstance;
        nhc j;
        qhc qhcVar = (qhc) this.c;
        rhc rhcVar = (rhc) this.b;
        rhcVar.getClass();
        LinkedHashMap linkedHashMap = rhcVar.a;
        nhc nhcVar = (nhc) linkedHashMap.get(str);
        Class cls = ki2Var.a;
        cls.getClass();
        Map map = ki2.b;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = q7c.b(num.intValue(), nhcVar);
        } else {
            if (cls.isPrimitive()) {
                cls = iqe.a(s89.a(cls));
            }
            isInstance = cls.isInstance(nhcVar);
        }
        if (isInstance) {
            if (qhcVar instanceof wt9) {
                wt9 wt9Var = (wt9) qhcVar;
                nhcVar.getClass();
                a36 a36Var = wt9Var.d;
                if (a36Var != null) {
                    po poVar = wt9Var.e;
                    poVar.getClass();
                    cse.a(nhcVar, poVar, a36Var);
                }
            }
            nhcVar.getClass();
            return nhcVar;
        }
        pj7 pj7Var = new pj7((e23) this.d);
        ((LinkedHashMap) pj7Var.a).put(z3f.e, str);
        try {
            j = qhcVar.j(ki2Var, pj7Var);
        } catch (Error unused) {
            j = qhcVar.j(ki2Var, c23.b);
        }
        j.getClass();
        nhc nhcVar2 = (nhc) linkedHashMap.put(str, j);
        if (nhcVar2 != null) {
            nhcVar2.a();
        }
        return j;
    }

    public final String toString() {
        String str = "";
        switch (this.a) {
            case 22:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                k7b k7bVar = (k7b) this.c;
                while (true) {
                    k7bVar = (k7b) k7bVar.c;
                    if (k7bVar != null) {
                        Object obj = k7bVar.b;
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
                ko9 ko9Var = (ko9) ((ko9) this.c).d;
                while (ko9Var != null) {
                    Object obj2 = ko9Var.c;
                    sb2.append(str);
                    String str2 = (String) ko9Var.b;
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
                    ko9Var = (ko9) ko9Var.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 29:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                ko9 ko9Var2 = (ko9) ((ko9) this.c).d;
                while (ko9Var2 != null) {
                    Object obj3 = ko9Var2.c;
                    sb3.append(str);
                    String str3 = (String) ko9Var2.b;
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
                    ko9Var2 = (ko9) ko9Var2.d;
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
        ji4 ji4Var = (ji4) this.c;
        if (str2 != null && str3 != null) {
            ji4Var.a();
            yi4 yi4Var = ji4Var.c;
            String str5 = yi4Var.h;
            ji4Var.a();
            String str6 = yi4Var.a;
            if (str5 != null) {
                URL url = new URL(qu6.o(str, ":", str4, xnb.l("https://fcmregistrations.googleapis.com/v1/projects/", str5, "/registrations/", str3, "/topicSubscriptions/")));
                if (u()) {
                    StringBuilder l = xnb.l("Topic ", str4, " for: ", str, " with url: ");
                    l.append(url);
                    Log.d("FirebaseMessaging", l.toString());
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
                                Log.d("FirebaseMessaging", c00.j("Topic ", str4, " for: ", str, " succeeded."));
                                return;
                            }
                            return;
                        } else if (responseCode != 404 && responseCode != 403) {
                            if (responseCode >= 500) {
                                su3.e("INTERNAL_SERVER_ERROR");
                                return;
                            }
                            throw new IOException("Topic " + str4 + " failed with status: " + responseCode);
                        } else {
                            if (u()) {
                                Log.d("FirebaseMessaging", "Topic " + str4 + " failed: " + responseMessage);
                            }
                            su3.e(qd4.q("Topic ", str4, " failed: ", responseMessage));
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
            su3.e("Project ID or API Key is missing");
            return;
        }
        su3.e("FIS auth token or FIS ID is empty");
    }

    public final void y() {
        ((TypedArray) this.c).recycle();
    }

    public final boolean z(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.c)) {
            remove = ((ArrayDeque) this.c).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.d).execute(new ux9(this, (byte) 28));
            }
        }
        return remove;
    }

    public ko9(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public ko9(tt ttVar, b1f b1fVar) {
        this.a = (byte) 19;
        this.c = b1fVar;
        xve.h(ttVar);
        this.b = ttVar;
    }

    public ko9(v99 v99Var) {
        this.a = (byte) 23;
        this.d = v99Var;
        this.c = new AtomicLong((qd1.b.nextLong() & 65535) * 10000);
    }

    public ko9(String str, byte b) {
        this.a = b;
        switch (b) {
            case 25:
                ko9 ko9Var = new ko9((byte) 24, false);
                this.c = ko9Var;
                this.d = ko9Var;
                this.b = str;
                return;
            case 29:
                ko9 ko9Var2 = new ko9((byte) 26, false);
                this.c = ko9Var2;
                this.d = ko9Var2;
                this.b = str;
                return;
            default:
                k7b k7bVar = new k7b((byte) 15, false);
                this.c = k7bVar;
                this.d = k7bVar;
                this.b = str;
                return;
        }
    }

    public ko9(rhc rhcVar, qhc qhcVar, e23 e23Var) {
        this.a = (byte) 14;
        rhcVar.getClass();
        qhcVar.getClass();
        e23Var.getClass();
        this.b = rhcVar;
        this.c = qhcVar;
        this.d = e23Var;
    }

    public ko9(String str, Boolean bool, zc1 zc1Var, String str2) {
        this.a = (byte) 7;
        this.b = str;
        this.c = str2;
        this.d = zc1Var;
    }

    public ko9(byte b, boolean z) {
        this.a = b;
    }

    public ko9(View view) {
        this.a = (byte) 12;
        this.d = view;
        bec becVar = new bec(this, view);
        this.b = becVar;
        view.addOnLayoutChangeListener(becVar);
    }

    public ko9(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = (byte) 4;
        this.c = new ArrayDeque();
        this.b = sharedPreferences;
        this.d = scheduledThreadPoolExecutor;
    }

    public ko9(Context context, TypedArray typedArray) {
        this.a = (byte) 6;
        this.b = context;
        this.c = typedArray;
    }

    public ko9(Context context, LocationManager locationManager) {
        this.a = (byte) 10;
        this.d = new Object();
        this.b = context;
        this.c = locationManager;
    }

    public ko9(ji4 ji4Var, FirebaseMessaging firebaseMessaging, ri4 ri4Var) {
        this.a = (byte) 8;
        this.b = ri4Var;
        this.c = ji4Var;
        this.d = firebaseMessaging;
    }

    public ko9(lfc lfcVar, gd4 gd4Var, r7b r7bVar) {
        this.a = (byte) 13;
        this.d = lfcVar;
        this.b = gd4Var;
        this.c = r7bVar;
    }

    public ko9(byte b) {
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

    public ko9(View view, yic yicVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        this.a = (byte) 15;
        xc xcVar = new xc(this, (byte) 21);
        this.b = view;
        this.c = yicVar;
        view.addOnAttachStateChangeListener(xcVar);
        if (!view.isAttachedToWindow() || (viewTreeObserver2 = (ViewTreeObserver) this.d) == (viewTreeObserver = view.getViewTreeObserver())) {
            return;
        }
        if (viewTreeObserver2 != null) {
            if (viewTreeObserver2.isAlive()) {
                ((ViewTreeObserver) this.d).removeOnPreDrawListener(yicVar);
            }
            this.d = null;
        }
        this.d = viewTreeObserver;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(yicVar);
        }
    }

    public ko9(String str, String str2) {
        this.a = (byte) 16;
        this.b = str;
        this.c = str2;
        this.d = str2.isEmpty() ? str : qd4.y(str, "/", str2);
    }

    public ko9(Object[] objArr, Object[] objArr2) {
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
        this.c = h(objArr, iArr);
        this.d = h(objArr2, iArr);
    }
}
