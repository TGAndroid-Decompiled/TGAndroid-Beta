package cb;

import a8.ja;
import a8.sa;
import aa.n;
import aa.p;
import ai.p0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.j0;
import androidx.lifecycle.a0;
import b3.i;
import b3.j;
import b3.l;
import c8.j1;
import ci.n0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.internal.h1;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.internal.cast.a1;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.m0;
import com.google.android.gms.internal.cast.x;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d3.i0;
import d8.d;
import d8.f;
import di.i6;
import di.t;
import e2.x1;
import f6.y;
import f7.v;
import fi.d4;
import fi.e9;
import fi.f9;
import fi.g3;
import g.s;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import l.k;
import l.w;
import m.o3;
import o9.g;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.messenger.kc;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.o0;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ft0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.av0;
import org.telegram.ui.vv0;
import q6.m;
import q7.l1;
import q7.m1;
public final class c implements SuccessContinuation, p0, a0, androidx.activity.result.b, j, te.b, q0, i0, q, ft0, kc, WebMessageListenerBoundaryInterface, e9, w, OnSuccessListener, OnCompleteListener, ib.b {
    public static volatile c f4866c;
    public final int f4867a;
    public final Object f4868b;

    public c(f0 f0Var) {
        this.f4867a = 13;
        this.f4868b = new WeakReference(f0Var);
    }

    public static o h(Looper looper, Object obj, String str) {
        m.h(obj, "Listener must not be null");
        m.h(looper, "Looper must not be null");
        return new o(looper, obj, str);
    }

    @Override
    public void E(float f10, int i7) {
        ch.o oVar = (ch.o) this.f4868b;
        oVar.f5175c.setLayerType(0, null);
        if (f10 == 0.0f && !oVar.P) {
            oVar.f5175c.setVisibility(4);
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                oVar.F.setFocusableInTouchMode(false);
            }
        }
        ns.e().k(ns.f25523k1, 512);
    }

    @Override
    public void F(boolean z10) {
        te.a aVar = ((t) this.f4868b).f9435s;
        if (aVar != null) {
            aVar.a(z10, true);
        }
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        ((ch.o) this.f4868b).j0(f10);
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ch0 B;
        boolean[] zArr = (boolean[]) this.f4868b;
        if (z10 && (B = imageReceiver.B()) != null && !zArr[0]) {
            B.N(0, false, false);
            g0.h3(new o0(B, 0));
            zArr[0] = true;
        }
    }

    @Override
    public float U0() {
        return i5.c.d(9.66f, ri.a.d(t.f0((t) this.f4868b).f15575b), 0);
    }

    public void a(f3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f4868b;
        long[] jArr = jVar.f10848e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(jVar.f10848e[0]), jVar);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i7 = this.f4867a;
        Object obj3 = this.f4868b;
        switch (i7) {
            case 16:
                d dVar = new d(0, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = d8.a.f7601a;
                obtain.writeStrongBinder(dVar);
                obtain.writeInt(1);
                ((o8.a) obj3).writeToParcel(obtain, 0);
                ((d8.c) ((f) obj).n()).h1(obtain, 2);
                return;
            default:
                e7.b bVar = new e7.b(0, (TaskCompletionSource) obj2);
                m1 m1Var = (m1) ((l1) obj).n();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(m1Var.f55454b);
                int i11 = q7.j.f55437a;
                obtain2.writeStrongBinder(bVar);
                obtain2.writeInt(1);
                ((v) obj3).writeToParcel(obtain2, 0);
                Parcel obtain3 = Parcel.obtain();
                try {
                    m1Var.f55453a.transact(1, obtain2, obtain3, 0);
                    obtain3.readException();
                    return;
                } finally {
                    obtain2.recycle();
                    obtain3.recycle();
                }
        }
    }

    @Override
    public int b1() {
        return t.g0((t) this.f4868b).d;
    }

    @Override
    public void d(long j3, int i7, g3 g3Var) {
        int i10 = ProfileStoriesView.f43351t0;
        ((av0) this.f4868b).f(true, false);
        g3Var.run();
    }

    @Override
    public void e(k kVar, boolean z10) {
        ((s) this.f4868b).g(kVar);
    }

    @Override
    public void f(Object obj) {
        Bundle extras;
        switch (this.f4867a) {
            case 7:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                j0 j0Var = (j0) this.f4868b;
                androidx.fragment.app.f0 f0Var = (androidx.fragment.app.f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str = f0Var.f2342a;
                int i7 = f0Var.f2343b;
                androidx.fragment.app.s o4 = j0Var.f2356c.o(str);
                if (o4 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    return;
                }
                o4.x(i7, aVar.f1808a, aVar.f1809b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f4868b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f1809b;
                int i10 = aVar2.f1808a;
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                if (i10 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
                }
                int i11 = u.e("ProxyBillingActivityV2", intent).f10978a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.P;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, extras);
                } else {
                    u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i11 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public void g(n6.a aVar) {
        h1 h1Var = (h1) this.f4868b;
        h1Var.f6012o.lock();
        try {
            h1Var.f6010m = aVar;
            h1Var.j();
        } finally {
            h1Var.f6012o.unlock();
        }
    }

    @Override
    public Object mo24get() {
        g firebaseApp = (g) ((d9.o) this.f4868b).f7643b;
        kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
        gb.p0 p0Var = gb.p0.f13081a;
        return gb.p0.a(firebaseApp);
    }

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override
    public void i(int i7) {
        h1 h1Var = (h1) this.f4868b;
        Lock lock = h1Var.f6012o;
        Lock lock2 = h1Var.f6012o;
        lock.lock();
        try {
            if (h1Var.f6011n) {
                h1Var.f6011n = false;
                h1Var.f6002b.i(i7);
                h1Var.f6010m = null;
                h1Var.f6009l = null;
            } else {
                h1Var.f6011n = true;
                h1Var.d.onConnectionSuspended(i7);
            }
            lock2.unlock();
        } catch (Throwable th2) {
            lock2.unlock();
            throw th2;
        }
    }

    @Override
    public void j(Bundle bundle) {
        h1 h1Var = (h1) this.f4868b;
        h1Var.f6012o.lock();
        try {
            h1Var.f6010m = n6.a.f21056f;
            h1Var.j();
        } finally {
            h1Var.f6012o.unlock();
        }
    }

    @Override
    public i k(l lVar, long j3, long j10, IOException iOException, int i7) {
        ((o2.d) this.f4868b).f21249a.y(iOException);
        return b3.o.f2917e;
    }

    @Override
    public boolean l(long j3, int i7, int i10, int i11, f9 f9Var) {
        ImageReceiver imageReceiver;
        d4 d4Var;
        d4 d4Var2;
        d4 d4Var3;
        d4 d4Var4;
        f9Var.f11711b = null;
        f9Var.f11712c = null;
        av0 av0Var = (av0) this.f4868b;
        vv0 vv0Var = av0Var.h;
        ArrayList arrayList = av0Var.f43379x;
        if (av0Var.O < 0.2f) {
            f9Var.f11711b = vv0Var.getImageReceiver();
            f9Var.f11712c = null;
            f9Var.f11710a = vv0Var;
            f9Var.h = 0.0f;
            f9Var.f11716i = g0.f23611q.y;
            f9Var.f11715g = (View) av0Var.getParent();
            f9Var.d = av0Var.E;
            f9Var.f11721n = true;
            return true;
        }
        int i12 = 0;
        while (true) {
            if (i12 < arrayList.size()) {
                d4 d4Var5 = (d4) arrayList.get(i12);
                if (d4Var5.f11627e >= 1.0f && d4Var5.f11624a == i10) {
                    int i13 = i12 - 1;
                    if (i13 >= 0) {
                        d4Var3 = (d4) arrayList.get(i13);
                    } else {
                        d4Var3 = null;
                    }
                    int i14 = i12 - 2;
                    if (i14 >= 0) {
                        d4Var4 = (d4) arrayList.get(i14);
                    } else {
                        d4Var4 = null;
                    }
                    d4 d = ProfileStoriesView.d(d4Var3, d4Var4, d4Var5);
                    imageReceiver = d4Var5.f11625b;
                    d4Var2 = d;
                    d4Var = d4Var5;
                } else {
                    i12++;
                }
            } else {
                imageReceiver = null;
                d4Var = null;
                d4Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        f9Var.f11712c = imageReceiver;
        f9Var.f11711b = null;
        f9Var.f11710a = av0Var;
        f9Var.h = 0.0f;
        f9Var.f11716i = g0.f23611q.y;
        f9Var.f11715g = (View) av0Var.getParent();
        if (d4Var != null && d4Var2 != null) {
            f9Var.f11714f = new i6(this, new RectF(d4Var.f11634m), d4Var, new RectF(d4Var2.f11634m), d4Var2);
            return true;
        }
        f9Var.f11714f = null;
        return true;
    }

    @Override
    public void n() {
        d3.l lVar = (d3.l) this.f4868b;
        if (lVar.f7440s1 != null) {
            lVar.R0(0, 1);
        }
    }

    @Override
    public void o(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.g0 g0Var = (androidx.biometric.g0) this.f4868b;
        Handler handler = g0Var.B0;
        sa saVar = g0Var.C0;
        handler.removeCallbacks(saVar);
        TextView textView = g0Var.H0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(saVar, 2000L);
    }

    @Override
    public void onComplete(Task task) {
        g6.c.h((g6.c) ((g6.j) this.f4868b).f12913c, "joinApplication", task);
    }

    @Override
    public void onFirstFrameRendered() {
        d3.l lVar = (d3.l) this.f4868b;
        Surface surface = lVar.f7440s1;
        if (surface != null) {
            lVar.f7426c1.O(surface);
            lVar.f7443v1 = true;
        }
    }

    @Override
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: cb.c.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override
    public void onSuccess(Object obj) {
        int i7;
        int i10;
        a2 a2Var;
        a1 b10;
        g6.a aVar = (g6.a) this.f4868b;
        Bundle bundle = (Bundle) obj;
        if (m0.f6298j) {
            Context context = aVar.f12872a;
            j6.s sVar = aVar.f12876f;
            m0 m0Var = new m0(context, sVar, aVar.f12874c, aVar.f12879j, aVar.f12877g);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE")) {
                i7 = bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0);
            } else if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i7 == 0) {
                if (z10) {
                    i7 = 0;
                    z10 = true;
                } else {
                    return;
                }
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String v = r.b.v(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            m0Var.h = i10;
            o5.t.b(context);
            m0Var.f6304g = o5.t.a().c(m5.a.f20466e).a("CAST_SENDER_SDK", new l5.c("proto"), x.f6446a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                m0Var.f6302e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(v, 0);
            if (i7 != 0) {
                com.google.android.gms.common.api.internal.t b11 = com.google.android.gms.common.api.internal.u.b();
                b11.f6074c = new ia.d(sVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, 1);
                b11.d = new n6.c[]{y.f11161c};
                b11.f6073b = false;
                b11.f6072a = 8426;
                Task e10 = sVar.e(0, b11.a());
                ?? obj2 = new Object();
                obj2.f20518b = m0Var;
                obj2.f20519c = packageName;
                obj2.f20517a = i7;
                obj2.d = sharedPreferences;
                e10.addOnSuccessListener(obj2);
            }
            if (z10) {
                m.g(sharedPreferences);
                j6.b bVar = a2.f6182i;
                synchronized (a2.class) {
                    try {
                        if (a2.f6184k == null) {
                            a2.f6184k = new a2(sharedPreferences, m0Var, packageName);
                        }
                        a2Var = a2.f6184k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = a2Var.f6187c;
                SharedPreferences sharedPreferences2 = a2Var.f6186b;
                HashSet hashSet = a2Var.f6189f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = a2Var.f6190g;
                hashSet2.clear();
                a2Var.h = 0L;
                String str2 = a2.f6183j;
                if (str2.equals(string) && str.equals(string2)) {
                    a2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j3 = sharedPreferences2.getLong(str3, 0L);
                            if (j3 != 0 && currentTimeMillis - j3 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                a1 b12 = a2.b(str3.substring(41));
                                if (b12 != null) {
                                    hashSet2.add(b12);
                                    hashSet.add(b12);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = a2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    a2Var.c(hashSet3);
                    m.g(a2Var.f6188e);
                    m.g(a2Var.d);
                    a2Var.f6188e.post(a2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    a2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                a2.a(a1.CAST_CONTEXT);
            }
        }
    }

    public android.support.v4.media.session.a0 p(wf.b r42) {
        throw new UnsupportedOperationException("Method not decompiled: cb.c.p(wf.b):android.support.v4.media.session.a0");
    }

    public Set q() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f4868b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f4868b);
        }
        return unmodifiableSet;
    }

    @Override
    public void s() {
        l2.i0 i0Var = ((d3.l) this.f4868b).Z;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    public f3.j t() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (f3.j jVar : ((LinkedHashMap) this.f4868b).values()) {
            arrayList.add(jVar.f10846b);
            arrayList2.add(jVar.f10847c);
            arrayList3.add(jVar.d);
            arrayList4.add(jVar.f10848e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()]);
        long j3 = 0;
        for (int[] iArr2 : iArr) {
            j3 += iArr2.length;
        }
        int i7 = (int) j3;
        if (j3 == i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.d(j3, "the total number of elements (%s) in the arrays must fit in an int", z10);
        int[] iArr3 = new int[i7];
        int i10 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i10, iArr4.length);
            i10 += iArr4.length;
        }
        return new f3.j(iArr3, j1.a((long[][]) arrayList2.toArray(new long[arrayList2.size()])), j1.a((long[][]) arrayList3.toArray(new long[arrayList3.size()])), j1.a((long[][]) arrayList4.toArray(new long[arrayList4.size()])));
    }

    @Override
    public Task then(Object obj) {
        ia.b bVar = (ia.b) obj;
        p pVar = ((n) this.f4868b).f826e;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        return Tasks.whenAll(p.b(pVar), pVar.f841m.h(null, pVar.f834e.f3093a));
    }

    public void u() {
        ((androidx.fragment.app.u) this.f4868b).d.R();
    }

    public void v(h6.m mVar) {
        o3 o3Var = (o3) this.f4868b;
        o3Var.f19795b = mVar;
        Iterator it = ((LinkedList) o3Var.f19796c).iterator();
        while (it.hasNext()) {
            ((a7.c) it.next()).b();
        }
        ((LinkedList) o3Var.f19796c).clear();
    }

    @Override
    public void w(l lVar, long j3, long j10) {
        boolean z10;
        o2.d dVar = (o2.d) this.f4868b;
        synchronized (c3.b.f4088b) {
            z10 = c3.b.f4089c;
        }
        if (!z10) {
            dVar.f21249a.y(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.b();
    }

    public void x(int i7) {
        boolean z10;
        TLRPC.TL_exportedNoPaidMessagesToken c10;
        n0 n0Var = ((ci.i0) this.f4868b).f5394e;
        if (n0Var != null && n0Var.d != i7) {
            boolean z11 = true;
            if (n0Var.f5444c.d && i7 == 2) {
                i7 = 1;
            }
            n0Var.d = i7;
            SharedPreferences.Editor edit = n0Var.f().edit();
            if (n0Var.d == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            edit.putBoolean("qrNoPaidPermanent", z10).apply();
            int i10 = n0Var.d;
            if (i10 == 0) {
                if (n0Var.f5447n != 0) {
                    ConnectionsManager.getInstance(n0Var.f5442a).cancelRequest(n0Var.f5447n, true);
                    n0Var.f5447n = 0;
                    return;
                }
                return;
            }
            if (i10 == 2 && (c10 = n0Var.c()) != null) {
                n0Var.f5446f = c10;
                n0Var.f5443b.setFreeLink(n0Var.d(c10));
            }
            if (n0Var.d != 1) {
                z11 = false;
            }
            n0Var.n(false, z11);
        }
    }

    @Override
    public boolean y(k kVar) {
        Window.Callback callback = ((s) this.f4868b).f12712f.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    public void z() {
        f0 f0Var = (f0) ((WeakReference) this.f4868b).get();
        if (f0Var == null) {
            return;
        }
        f0Var.l();
    }

    public c(e7.a aVar, v vVar) {
        this.f4867a = 20;
        this.f4868b = vVar;
    }

    public c(Object obj, int i7) {
        this.f4867a = i7;
        this.f4868b = obj;
    }

    public c(ob.c cVar) {
        this.f4867a = 22;
        this.f4868b = (r) cVar.f21417b;
    }

    public c(int i7) {
        this.f4867a = i7;
        switch (i7) {
            case 8:
                this.f4868b = new CopyOnWriteArrayList();
                return;
            case 12:
                this.f4868b = Collections.newSetFromMap(new WeakHashMap());
                return;
            case 21:
                this.f4868b = new LinkedHashMap();
                return;
            case 24:
                this.f4868b = new gc.b(0);
                return;
            default:
                this.f4868b = new HashSet();
                return;
        }
    }

    public c(n nVar, String str) {
        this.f4867a = 2;
        this.f4868b = nVar;
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
    }

    @Override
    public void b(x1 x1Var) {
    }

    @Override
    public void c(boolean z10) {
    }

    @Override
    public void O(int i7, Drawable drawable) {
    }

    @Override
    public void m(l lVar, long j3, long j10, boolean z10) {
    }

    @Override
    public void r(l lVar, long j3, long j10, int i7) {
    }
}
