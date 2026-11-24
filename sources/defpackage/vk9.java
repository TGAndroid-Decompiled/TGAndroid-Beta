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
public class vk9 implements zl9, lt8, kt8, p3b, kab, OnCompleteListener, f69 {
    public static vk9 e;
    public final byte a;
    public Object b;
    public Object c;
    public Object d;

    public vk9(ArrayList arrayList) {
        this.a = (byte) 17;
        this.b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() << 1];
        for (int i = 0; i < arrayList.size(); i++) {
            wuc wucVar = (wuc) arrayList.get(i);
            int i2 = i << 1;
            long[] jArr = (long[]) this.c;
            jArr[i2] = wucVar.b;
            jArr[i2 + 1] = wucVar.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public static vk9 c(View view) {
        return new vk9(view);
    }

    public static Object e(Task task) {
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

    public static Object[] i(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        qeb qebVar = efb.T;
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

    public static vk9 k(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        vk9 vk9Var = new vk9(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) vk9Var.c)) {
            ((ArrayDeque) vk9Var.c).clear();
            String string = ((SharedPreferences) vk9Var.b).getString("topic_operation_queue", "");
            if (!TextUtils.isEmpty(string) && string.contains(",")) {
                String[] split = string.split(",", -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        ((ArrayDeque) vk9Var.c).add(str);
                    }
                }
                return vk9Var;
            }
            return vk9Var;
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

    public static vk9 v(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new vk9(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public final void A(int i, String str, String str2) {
        ((HashMap) this.b).put(str, str2);
        ((HashMap) this.c).put(str2, str);
        ((HashMap) this.d).put(str, Integer.valueOf(i));
    }

    public final void B(Object obj, String str) {
        vk9 vk9Var = new vk9((byte) 24, false);
        ((vk9) this.d).d = vk9Var;
        this.d = vk9Var;
        vk9Var.c = obj;
        vk9Var.b = str;
    }

    @Override
    public final void a(ArrayList arrayList) {
        mbc mbcVar = (mbc) this.d;
        if (mbcVar.b == ((u3b) this.c)) {
            mbcVar.g = arrayList;
        }
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        boolean z;
        afd afdVar = (afd) this.b;
        String str = (String) this.c;
        b06 b06Var = (b06) this.d;
        lhf lhfVar = (lhf) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (afdVar.G == 2) {
            z = true;
        } else {
            z = false;
        }
        fre.j("Not connected to device", z);
        x6d x6dVar = (x6d) lhfVar.k();
        Parcel R = x6dVar.R();
        R.writeString(str);
        jgd.c(R, b06Var);
        x6dVar.W(R, 13);
        synchronized (afdVar.s) {
            if (afdVar.p != null) {
                afdVar.i(2477);
            }
            afdVar.p = taskCompletionSource;
        }
    }

    @Override
    public final int b(long j) {
        long[] jArr = (long[]) this.d;
        int b = g8c.b(jArr, j, false);
        if (b < jArr.length) {
            return b;
        }
        return -1;
    }

    @Override
    public final void d(long j, long j2, boolean z) {
        ((jb4) this.b).f(j, j2, z);
    }

    @Override
    public final void f() {
        mbc mbcVar = (mbc) this.d;
        if (mbcVar.b != ((u3b) this.c)) {
            return;
        }
        mbcVar.c();
        mbcVar.a.a();
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
    public final Object mo9get() {
        switch (this.a) {
            case 2:
                return new xl3((Context) ((pj4) this.b).b, (lo9) ((lt8) this.c).mo9get(), (ja0) ((i2f) this.d).mo9get(), (byte) 12);
            case 3:
                return new h8a((sw2) ((mo5) this.b).a, (snb) ((kt8) this.c).mo9get(), (v63) ((kt8) this.d).mo9get());
            default:
                return new i1c(new ie7((byte) 29), new i2f((byte) 28), (yb3) ((gl2) this.b).mo9get(), (z90) ((eq2) this.c).mo9get(), (wtc) ((c5a) this.d).mo9get());
        }
    }

    @Override
    public final long h(int i) {
        boolean z;
        long[] jArr = (long[]) this.d;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        if (i < jArr.length) {
            z2 = true;
        }
        gre.f(z2);
        return jArr[i];
    }

    @Override
    public final void j(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
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
                wuc wucVar = (wuc) list.get(i);
                u33 u33Var = wucVar.a;
                if (u33Var.e == -3.4028235E38f) {
                    arrayList2.add(wucVar);
                } else {
                    arrayList.add(u33Var);
                }
            }
        }
        Collections.sort(arrayList2, new pva((byte) 13));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            u33 u33Var2 = ((wuc) arrayList2.get(i3)).a;
            arrayList.add(new u33(u33Var2.a, u33Var2.b, u33Var2.c, u33Var2.d, (-1) - i3, 1, u33Var2.g, u33Var2.h, u33Var2.i, u33Var2.n, u33Var2.o, u33Var2.j, u33Var2.k, u33Var2.l, u33Var2.m, u33Var2.p, u33Var2.q, u33Var2.r));
        }
        return arrayList;
    }

    public final ColorStateList m(int i) {
        int resourceId;
        ColorStateList e2;
        TypedArray typedArray = (TypedArray) this.c;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (e2 = rr.e((Context) this.b, resourceId)) != null) {
            return e2;
        }
        return typedArray.getColorStateList(i);
    }

    public final Drawable n(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return hmd.a((Context) this.b, resourceId);
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
        aia aiaVar = ((fm9) this.b).a;
        synchronized (aiaVar) {
            aiaVar.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public final Drawable p(int i) {
        int resourceId;
        Drawable f;
        if (((TypedArray) this.c).hasValue(i) && (resourceId = ((TypedArray) this.c).getResourceId(i, 0)) != 0) {
            fp a = fp.a();
            Context context = (Context) this.b;
            synchronized (a) {
                f = a.a.f(resourceId, context, true);
            }
            return f;
        }
        return null;
    }

    public final Typeface q(int i, int i2, iq iqVar) {
        iq iqVar2;
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
            ThreadLocal threadLocal = ka9.a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence != null) {
                    String charSequence2 = charSequence.toString();
                    if (!charSequence2.startsWith("res/")) {
                        iqVar.b();
                        return null;
                    }
                    int i3 = typedValue.assetCookie;
                    fg6 fg6Var = s3c.b;
                    Typeface typeface = (Typeface) fg6Var.a(s3c.b(resources, resourceId, charSequence2, i3, i2));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new lw8(iqVar, typeface, (byte) 16));
                        return typeface;
                    }
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            wl4 a = zhe.a(resources.getXml(resourceId), resources);
                            if (a == null) {
                                try {
                                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                                    iqVar.b();
                                    return null;
                                } catch (IOException e2) {
                                    iOException = e2;
                                    iqVar2 = iqVar;
                                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                    iqVar2.b();
                                    return null;
                                } catch (XmlPullParserException e3) {
                                    xmlPullParserException = e3;
                                    iqVar2 = iqVar;
                                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                    iqVar2.b();
                                    return null;
                                }
                            }
                            try {
                                return s3c.a(context, a, resources, resourceId, charSequence2, typedValue.assetCookie, i2, iqVar);
                            } catch (IOException e4) {
                                e = e4;
                                iqVar2 = iqVar;
                                iOException = e;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                iqVar2.b();
                                return null;
                            } catch (XmlPullParserException e5) {
                                e = e5;
                                iqVar2 = iqVar;
                                xmlPullParserException = e;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                iqVar2.b();
                                return null;
                            }
                        }
                        iqVar2 = iqVar;
                        try {
                            int i4 = typedValue.assetCookie;
                            Typeface d = s3c.a.d(context, resources, resourceId, charSequence2, i2);
                            if (d != null) {
                                fg6Var.b(s3c.b(resources, resourceId, charSequence2, i4, i2), d);
                                new Handler(Looper.getMainLooper()).post(new lw8(iqVar2, d, (byte) 16));
                            } else {
                                iqVar2.b();
                            }
                            return d;
                        } catch (IOException e6) {
                            e = e6;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            iqVar2.b();
                            return null;
                        } catch (XmlPullParserException e7) {
                            e = e7;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            iqVar2.b();
                            return null;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        iqVar2 = iqVar;
                    } catch (XmlPullParserException e9) {
                        e = e9;
                        iqVar2 = iqVar;
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

    public final void r(vy4 vy4Var) {
        try {
            kwe kweVar = (kwe) this.c;
            r4d r4dVar = new r4d(vy4Var);
            Parcel R = kweVar.R();
            sgd.c(R, r4dVar);
            kweVar.V(R, 9);
        } catch (RemoteException e2) {
            fvc.g(e2);
        }
    }

    public final odc s(oh2 oh2Var, String str) {
        boolean isInstance;
        odc f;
        rdc rdcVar = (rdc) this.c;
        sdc sdcVar = (sdc) this.b;
        sdcVar.getClass();
        LinkedHashMap linkedHashMap = sdcVar.a;
        odc odcVar = (odc) linkedHashMap.get(str);
        Class cls = oh2Var.a;
        cls.getClass();
        Map map = oh2.b;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = r3c.b(num.intValue(), odcVar);
        } else {
            if (cls.isPrimitive()) {
                cls = qle.a(f59.a(cls));
            }
            isInstance = cls.isInstance(odcVar);
        }
        if (isInstance) {
            if (rdcVar instanceof eq9) {
                eq9 eq9Var = (eq9) rdcVar;
                odcVar.getClass();
                w06 w06Var = eq9Var.d;
                if (w06Var != null) {
                    oo ooVar = eq9Var.e;
                    ooVar.getClass();
                    kne.a(odcVar, ooVar, w06Var);
                }
            }
            odcVar.getClass();
            return odcVar;
        }
        fh7 fh7Var = new fh7((l13) this.d);
        ((LinkedHashMap) fh7Var.a).put(ize.e, str);
        try {
            f = rdcVar.f(oh2Var, fh7Var);
        } catch (Error unused) {
            f = rdcVar.f(oh2Var, j13.b);
        }
        f.getClass();
        odc odcVar2 = (odc) linkedHashMap.put(str, f);
        if (odcVar2 != null) {
            odcVar2.a();
        }
        return f;
    }

    @Override
    public final int t() {
        return ((long[]) this.d).length;
    }

    public final String toString() {
        String str = "";
        switch (this.a) {
            case 22:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                v8b v8bVar = (v8b) this.c;
                while (true) {
                    v8bVar = (v8b) v8bVar.c;
                    if (v8bVar != null) {
                        Object obj = v8bVar.b;
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
                vk9 vk9Var = (vk9) ((vk9) this.c).d;
                while (vk9Var != null) {
                    Object obj2 = vk9Var.c;
                    sb2.append(str);
                    String str2 = (String) vk9Var.b;
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
                    vk9Var = (vk9) vk9Var.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 29:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                vk9 vk9Var2 = (vk9) ((vk9) this.c).d;
                while (vk9Var2 != null) {
                    Object obj3 = vk9Var2.c;
                    sb3.append(str);
                    String str3 = (String) vk9Var2.b;
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
                    vk9Var2 = (vk9) vk9Var2.d;
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
        jg4 jg4Var = (jg4) this.c;
        if (str2 != null && str3 != null) {
            jg4Var.a();
            xg4 xg4Var = jg4Var.c;
            String str5 = xg4Var.h;
            jg4Var.a();
            String str6 = xg4Var.a;
            if (str5 != null) {
                URL url = new URL(ls6.o(str, ":", str4, yjb.l("https://fcmregistrations.googleapis.com/v1/projects/", str5, "/registrations/", str3, "/topicSubscriptions/")));
                if (u()) {
                    StringBuilder l = yjb.l("Topic ", str4, " for: ", str, " with url: ");
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
                                Log.d("FirebaseMessaging", b00.i("Topic ", str4, " for: ", str, " succeeded."));
                                return;
                            }
                            return;
                        } else if (responseCode != 404 && responseCode != 403) {
                            if (responseCode >= 500) {
                                k93.f("INTERNAL_SERVER_ERROR");
                                return;
                            }
                            throw new IOException("Topic " + str4 + " failed with status: " + responseCode);
                        } else {
                            if (u()) {
                                Log.d("FirebaseMessaging", "Topic " + str4 + " failed: " + responseMessage);
                            }
                            k93.f(tb4.q("Topic ", str4, " failed: ", responseMessage));
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
            k93.f("Project ID or API Key is missing");
            return;
        }
        k93.f("FIS auth token or FIS ID is empty");
    }

    public final void y() {
        ((TypedArray) this.c).recycle();
    }

    public final boolean z(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.c)) {
            remove = ((ArrayDeque) this.c).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.d).execute(new z6a(this, (byte) 11));
            }
        }
        return remove;
    }

    public vk9(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public vk9(st stVar, kwe kweVar) {
        this.a = (byte) 19;
        this.c = kweVar;
        fre.h(stVar);
        this.b = stVar;
    }

    public vk9(i69 i69Var) {
        this.a = (byte) 23;
        this.d = i69Var;
        this.c = new AtomicLong((id1.b.nextLong() & 65535) * 10000);
    }

    public vk9(String str, byte b) {
        this.a = b;
        switch (b) {
            case 25:
                vk9 vk9Var = new vk9((byte) 24, false);
                this.c = vk9Var;
                this.d = vk9Var;
                this.b = str;
                return;
            case 29:
                vk9 vk9Var2 = new vk9((byte) 26, false);
                this.c = vk9Var2;
                this.d = vk9Var2;
                this.b = str;
                return;
            default:
                v8b v8bVar = new v8b((byte) 14, false);
                this.c = v8bVar;
                this.d = v8bVar;
                this.b = str;
                return;
        }
    }

    public vk9(sdc sdcVar, rdc rdcVar, l13 l13Var) {
        this.a = (byte) 14;
        sdcVar.getClass();
        rdcVar.getClass();
        l13Var.getClass();
        this.b = sdcVar;
        this.c = rdcVar;
        this.d = l13Var;
    }

    public vk9(String str, Boolean bool, rc1 rc1Var, String str2) {
        this.a = (byte) 7;
        this.b = str;
        this.c = str2;
        this.d = rc1Var;
    }

    public vk9(byte b, boolean z) {
        this.a = b;
    }

    public vk9(View view) {
        this.a = (byte) 12;
        this.d = view;
        bac bacVar = new bac(this, view);
        this.b = bacVar;
        view.addOnLayoutChangeListener(bacVar);
    }

    public vk9(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = (byte) 4;
        this.c = new ArrayDeque();
        this.b = sharedPreferences;
        this.d = scheduledThreadPoolExecutor;
    }

    public vk9(Context context, TypedArray typedArray) {
        this.a = (byte) 6;
        this.b = context;
        this.c = typedArray;
    }

    public vk9(Context context, LocationManager locationManager) {
        this.a = (byte) 10;
        this.d = new Object();
        this.b = context;
        this.c = locationManager;
    }

    public vk9(jg4 jg4Var, FirebaseMessaging firebaseMessaging, rg4 rg4Var) {
        this.a = (byte) 8;
        this.b = rg4Var;
        this.c = jg4Var;
        this.d = firebaseMessaging;
    }

    public vk9(mbc mbcVar, jb4 jb4Var, u3b u3bVar) {
        this.a = (byte) 13;
        this.d = mbcVar;
        this.b = jb4Var;
        this.c = u3bVar;
    }

    public vk9(byte b) {
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

    public vk9(View view, zec zecVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        this.a = (byte) 15;
        wc wcVar = new wc(this, (byte) 20);
        this.b = view;
        this.c = zecVar;
        view.addOnAttachStateChangeListener(wcVar);
        if (!view.isAttachedToWindow() || (viewTreeObserver2 = (ViewTreeObserver) this.d) == (viewTreeObserver = view.getViewTreeObserver())) {
            return;
        }
        if (viewTreeObserver2 != null) {
            if (viewTreeObserver2.isAlive()) {
                ((ViewTreeObserver) this.d).removeOnPreDrawListener(zecVar);
            }
            this.d = null;
        }
        this.d = viewTreeObserver;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(zecVar);
        }
    }

    public vk9(String str, String str2) {
        this.a = (byte) 16;
        this.b = str;
        this.c = str2;
        this.d = str2.isEmpty() ? str : tb4.y(str, "/", str2);
    }

    public vk9(Object[] objArr, Object[] objArr2) {
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
        this.c = i(objArr, iArr);
        this.d = i(objArr2, iArr);
    }
}
