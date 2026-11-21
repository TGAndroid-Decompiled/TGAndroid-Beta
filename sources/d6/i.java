package d6;

import a8.la;
import a8.n1;
import a8.w9;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import androidx.biometric.z;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import ch.p;
import ci.o0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
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
import di.l6;
import di.t;
import e2.x1;
import f6.y;
import f7.v;
import fi.b4;
import fi.b9;
import fi.c9;
import fi.e3;
import g.s;
import gb.p0;
import hi.t5;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import l.w;
import m6.n;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.json.JSONException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.messenger.jc;
import org.telegram.messenger.ks;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cv0;
import org.telegram.ui.wv0;
import q6.m;
import q7.l1;
import q7.m1;
public final class i implements SuccessContinuation, androidx.activity.result.b, b3.k, te.b, q0, i0, q, qt0, jc, WebMessageListenerBoundaryInterface, b9, w, OnSuccessListener, OnCompleteListener, ib.b {
    public static i f7905c;
    public final int f7906a;
    public final Object f7907b;

    public i(cb.c cVar) {
        this.f7906a = 18;
        this.f7907b = (r) cVar.f5180b;
    }

    public static synchronized i B(Context context) {
        i F;
        synchronized (i.class) {
            F = F(context.getApplicationContext());
        }
        return F;
    }

    public static synchronized i F(Context context) {
        synchronized (i.class) {
            i iVar = f7905c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            f7905c = iVar2;
            return iVar2;
        }
    }

    public static o o(Looper looper, Object obj, String str) {
        m.i(obj, "Listener must not be null");
        m.i(looper, "Looper must not be null");
        return new o(looper, obj, str);
    }

    public void A() {
        f0 f0Var = (f0) ((WeakReference) this.f7907b).get();
        if (f0Var == null) {
            return;
        }
        f0Var.k();
    }

    @Override
    public boolean C(l.k kVar) {
        Window.Callback callback = ((s) this.f7907b).f13055f.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    @Override
    public void D(float f10, int i7) {
        p pVar = (p) this.f7907b;
        pVar.f5491c.setLayerType(0, null);
        if (f10 == 0.0f && !pVar.P) {
            pVar.f5491c.setVisibility(4);
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                pVar.F.setFocusableInTouchMode(false);
            }
        }
        ks.e().k(ks.f25168k1, 512);
    }

    public synchronized void E() {
        synchronized (this) {
            b bVar = (b) this.f7907b;
            ReentrantLock reentrantLock = bVar.f7888a;
            reentrantLock.lock();
            bVar.f7889b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public void G(boolean z10) {
        te.a aVar = ((t) this.f7907b).f9790s;
        if (aVar != null) {
            aVar.a(z10, true);
        }
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        ((p) this.f7907b).j0(f10);
    }

    public void I() {
        h6.h hVar = (h6.h) this.f7907b;
        Iterator it = hVar.h.iterator();
        if (!it.hasNext()) {
            Iterator it2 = hVar.f13954i.iterator();
            while (it2.hasNext()) {
                ((h6.g) it2.next()).a();
            }
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override
    public float U0() {
        return i5.c.d(9.66f, ri.a.d(t.g0((t) this.f7907b).f15915b), 0);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i7 = this.f7906a;
        Object obj3 = this.f7907b;
        switch (i7) {
            case 12:
                d8.d dVar = new d8.d(0, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = d8.a.f7910a;
                obtain.writeStrongBinder(dVar);
                obtain.writeInt(1);
                ((o8.a) obj3).writeToParcel(obtain, 0);
                ((d8.c) ((d8.f) obj).n()).h1(obtain, 2);
                return;
            default:
                e7.b bVar = new e7.b(0, (TaskCompletionSource) obj2);
                m1 m1Var = (m1) ((l1) obj).n();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(m1Var.f56069b);
                int i11 = q7.j.f56052a;
                obtain2.writeStrongBinder(bVar);
                obtain2.writeInt(1);
                ((v) obj3).writeToParcel(obtain2, 0);
                Parcel obtain3 = Parcel.obtain();
                try {
                    m1Var.f56068a.transact(1, obtain2, obtain3, 0);
                    obtain3.readException();
                    return;
                } finally {
                    obtain2.recycle();
                    obtain3.recycle();
                }
        }
    }

    public void c(f3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7907b;
        long[] jArr = jVar.f11196e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(jVar.f11196e[0]), jVar);
        }
    }

    @Override
    public void d(l.k kVar, boolean z10) {
        ((s) this.f7907b).i(kVar);
    }

    @Override
    public void e(long j3, int i7, e3 e3Var) {
        int i10 = ProfileStoriesView.f43838t0;
        ((cv0) this.f7907b).f(true, false);
        e3Var.run();
    }

    @Override
    public void f(Object obj) {
        int i7;
        Bundle extras;
        switch (this.f7906a) {
            case 3:
                Map map = (Map) obj;
                j0 j0Var = (j0) this.f7907b;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((Boolean) arrayList.get(i10)).booleanValue()) {
                        i7 = 0;
                    } else {
                        i7 = -1;
                    }
                    iArr[i10] = i7;
                }
                androidx.fragment.app.f0 f0Var = (androidx.fragment.app.f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = f0Var.f2346a;
                if (j0Var.f2360c.o(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f7907b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f1813b;
                int i11 = aVar.f1812a;
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                if (i11 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i11);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i11);
                }
                int i12 = u.e("ProxyBillingActivityV2", intent).f11312a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.P;
                if (resultReceiver != null) {
                    resultReceiver.send(i12, extras);
                } else {
                    u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i12 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i12);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    public void g(n nVar, androidx.biometric.v vVar) {
        Object obj = this.f7907b;
        k0 k0Var = (k0) obj;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            k0 k0Var2 = (k0) obj;
            androidx.biometric.q qVar = (androidx.biometric.q) k0Var2.D("androidx.biometric.BiometricFragment");
            if (qVar == null) {
                qVar = new androidx.biometric.q();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
                aVar.f(0, qVar, "androidx.biometric.BiometricFragment");
                aVar.e(true, true);
                k0Var2.A(true);
                k0Var2.E();
            }
            androidx.fragment.app.v k10 = qVar.k();
            if (k10 == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            z zVar = qVar.m0;
            zVar.f1985f = nVar;
            int i7 = nVar.f20906a;
            if (i7 == 0) {
                if (vVar != null) {
                    i7 = 15;
                } else {
                    i7 = 255;
                }
            }
            if (Build.VERSION.SDK_INT < 30 && i7 == 15 && vVar == null) {
                zVar.f1986g = n1.a();
            } else {
                zVar.f1986g = vVar;
            }
            if (qVar.Q()) {
                qVar.m0.f1989k = qVar.q(2131689577);
            } else {
                qVar.m0.f1989k = null;
            }
            if (qVar.Q() && new a0(new androidx.biometric.t(k10, 0)).c(255) != 0) {
                qVar.m0.f1992n = true;
                qVar.S();
            } else if (qVar.m0.f1994p) {
                qVar.f1974l0.postDelayed(new androidx.biometric.p(qVar), 600L);
            } else {
                qVar.X();
            }
        }
    }

    @Override
    public Object mo24get() {
        o9.g firebaseApp = (o9.g) ((d9.o) this.f7907b).f7951a;
        kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
        p0 p0Var = p0.f13424a;
        return p0.a(firebaseApp);
    }

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public float h(hc.c cVar, hc.c cVar2) {
        int i7 = (int) cVar.f3146b;
        int i10 = (int) cVar2.f3146b;
        float y10 = y((int) cVar.f3145a, i7, (int) cVar2.f3145a, i10);
        float y11 = y((int) cVar2.f3145a, i10, (int) cVar.f3145a, i7);
        if (Float.isNaN(y10)) {
            return y11 / 7.0f;
        }
        if (Float.isNaN(y11)) {
            return y10 / 7.0f;
        }
        return (y10 + y11) / 14.0f;
    }

    @Override
    public void i(n6.a aVar) {
        h1 h1Var = (h1) this.f7907b;
        h1Var.f6321o.lock();
        try {
            h1Var.f6319m = aVar;
            h1Var.j();
        } finally {
            h1Var.f6321o.unlock();
        }
    }

    @Override
    public void j(int i7) {
        h1 h1Var = (h1) this.f7907b;
        Lock lock = h1Var.f6321o;
        Lock lock2 = h1Var.f6321o;
        lock.lock();
        try {
            if (h1Var.f6320n) {
                h1Var.f6320n = false;
                h1Var.f6311b.j(i7);
                h1Var.f6319m = null;
                h1Var.f6318l = null;
            } else {
                h1Var.f6320n = true;
                h1Var.d.onConnectionSuspended(i7);
            }
            lock2.unlock();
        } catch (Throwable th2) {
            lock2.unlock();
            throw th2;
        }
    }

    @Override
    public int j1() {
        return t.h0((t) this.f7907b).d;
    }

    @Override
    public boolean k(long j3, int i7, int i10, int i11, c9 c9Var) {
        ImageReceiver imageReceiver;
        b4 b4Var;
        b4 b4Var2;
        b4 b4Var3;
        b4 b4Var4;
        c9Var.f11857b = null;
        c9Var.f11858c = null;
        cv0 cv0Var = (cv0) this.f7907b;
        wv0 wv0Var = cv0Var.h;
        ArrayList arrayList = cv0Var.f43866x;
        if (cv0Var.O < 0.2f) {
            c9Var.f11857b = wv0Var.getImageReceiver();
            c9Var.f11858c = null;
            c9Var.f11856a = wv0Var;
            c9Var.h = 0.0f;
            c9Var.f11862i = g0.f24146q.y;
            c9Var.f11861g = (View) cv0Var.getParent();
            c9Var.d = cv0Var.E;
            c9Var.f11867n = true;
            return true;
        }
        int i12 = 0;
        while (true) {
            if (i12 < arrayList.size()) {
                b4 b4Var5 = (b4) arrayList.get(i12);
                if (b4Var5.f11798e >= 1.0f && b4Var5.f11795a == i10) {
                    int i13 = i12 - 1;
                    if (i13 >= 0) {
                        b4Var3 = (b4) arrayList.get(i13);
                    } else {
                        b4Var3 = null;
                    }
                    int i14 = i12 - 2;
                    if (i14 >= 0) {
                        b4Var4 = (b4) arrayList.get(i14);
                    } else {
                        b4Var4 = null;
                    }
                    b4 d = ProfileStoriesView.d(b4Var3, b4Var4, b4Var5);
                    imageReceiver = b4Var5.f11796b;
                    b4Var2 = d;
                    b4Var = b4Var5;
                } else {
                    i12++;
                }
            } else {
                imageReceiver = null;
                b4Var = null;
                b4Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        c9Var.f11858c = imageReceiver;
        c9Var.f11857b = null;
        c9Var.f11856a = cv0Var;
        c9Var.h = 0.0f;
        c9Var.f11862i = g0.f24146q.y;
        c9Var.f11861g = (View) cv0Var.getParent();
        if (b4Var != null && b4Var2 != null) {
            c9Var.f11860f = new l6(this, new RectF(b4Var.f11805m), b4Var, new RectF(b4Var2.f11805m), b4Var2);
            return true;
        }
        c9Var.f11860f = null;
        return true;
    }

    @Override
    public b3.i l(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        ((o2.d) this.f7907b).f21638a.y(iOException);
        return b3.p.f2924e;
    }

    @Override
    public void m(Bundle bundle) {
        h1 h1Var = (h1) this.f7907b;
        h1Var.f6321o.lock();
        try {
            h1Var.f6319m = n6.a.f21445f;
            h1Var.j();
        } finally {
            h1Var.f6321o.unlock();
        }
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        oh0 B;
        boolean[] zArr = (boolean[]) this.f7907b;
        if (z10 && (B = imageReceiver.B()) != null && !zArr[0]) {
            B.N(0, false, false);
            g0.g3(new org.telegram.ui.Cells.p0(B, 0));
            zArr[0] = true;
        }
    }

    @Override
    public void n() {
        d3.l lVar = (d3.l) this.f7907b;
        if (lVar.f7749s1 != null) {
            lVar.R0(0, 1);
        }
    }

    @Override
    public void onComplete(Task task) {
        g6.c.h((g6.c) ((g6.j) this.f7907b).f13256c, "joinApplication", task);
    }

    @Override
    public void onFirstFrameRendered() {
        d3.l lVar = (d3.l) this.f7907b;
        Surface surface = lVar.f7749s1;
        if (surface != null) {
            lVar.f7735c1.P(surface);
            lVar.f7752v1 = true;
        }
    }

    @Override
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: d6.i.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override
    public void onSuccess(Object obj) {
        int i7;
        int i10;
        a2 a2Var;
        a1 b10;
        g6.a aVar = (g6.a) this.f7907b;
        Bundle bundle = (Bundle) obj;
        if (m0.f6607j) {
            Context context = aVar.f13215a;
            j6.s sVar = aVar.f13219f;
            m0 m0Var = new m0(context, sVar, aVar.f13217c, aVar.f13222j, aVar.f13220g);
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
            String v = p5.c.v(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            m0Var.h = i10;
            o5.s.b(context);
            m0Var.f6613g = o5.s.a().c(m5.a.f20855e).a("CAST_SENDER_SDK", new l5.c("proto"), x.f6755a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                m0Var.f6611e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(v, 0);
            if (i7 != 0) {
                com.google.android.gms.common.api.internal.t b11 = com.google.android.gms.common.api.internal.u.b();
                b11.f6383c = new t5(sVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, 4);
                b11.d = new n6.c[]{y.f11507c};
                b11.f6382b = false;
                b11.f6381a = 8426;
                Task e10 = sVar.e(0, b11.a());
                ?? obj2 = new Object();
                obj2.f20907b = m0Var;
                obj2.f20908c = packageName;
                obj2.f20906a = i7;
                obj2.d = sharedPreferences;
                e10.addOnSuccessListener(obj2);
            }
            if (z10) {
                m.h(sharedPreferences);
                j6.b bVar = a2.f6491i;
                synchronized (a2.class) {
                    try {
                        if (a2.f6493k == null) {
                            a2.f6493k = new a2(sharedPreferences, m0Var, packageName);
                        }
                        a2Var = a2.f6493k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = a2Var.f6496c;
                SharedPreferences sharedPreferences2 = a2Var.f6495b;
                HashSet hashSet = a2Var.f6498f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = a2Var.f6499g;
                hashSet2.clear();
                a2Var.h = 0L;
                String str2 = a2.f6492j;
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
                    m.h(a2Var.f6497e);
                    m.h(a2Var.d);
                    a2Var.f6497e.post(a2Var.d);
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

    public android.support.v4.media.session.a0 q(wf.b r42) {
        throw new UnsupportedOperationException("Method not decompiled: d6.i.q(wf.b):android.support.v4.media.session.a0");
    }

    @Override
    public void r() {
        l2.i0 i0Var = ((d3.l) this.f7907b).Z;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    public cc.e t(ab.q r23) {
        throw new UnsupportedOperationException("Method not decompiled: d6.i.t(ab.q):cc.e");
    }

    @Override
    public Task then(Object obj) {
        ia.b bVar = (ia.b) obj;
        q4.q qVar = (q4.q) this.f7907b;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        aa.p pVar = (aa.p) qVar.f55868c;
        aa.p.b((aa.p) qVar.f55868c);
        pVar.f840m.h(null, pVar.f833e.f3100a);
        pVar.f844q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public hc.a u(float f10, float f11, int i7, int i10) {
        int i11;
        hc.a b10;
        hc.a b11;
        int i12 = (int) (f11 * f10);
        int max = Math.max(0, i7 - i12);
        cc.b bVar = (cc.b) this.f7907b;
        int min = Math.min(bVar.f5184a - 1, i7 + i12) - max;
        float f12 = 3.0f * f10;
        if (min >= f12) {
            int max2 = Math.max(0, i10 - i12);
            int min2 = Math.min(bVar.f5185b - 1, i10 + i12) - max2;
            if (min2 >= f12) {
                cc.b bVar2 = (cc.b) this.f7907b;
                hc.b bVar3 = new hc.b(bVar2, max, max2, min, min2, f10);
                int i13 = bVar3.f14159e;
                int i14 = bVar3.f14158c;
                int i15 = i13 + i14;
                int i16 = bVar3.f14160f;
                int i17 = (i16 / 2) + bVar3.d;
                int[] iArr = new int[3];
                for (int i18 = 0; i18 < i16; i18++) {
                    if ((i18 & 1) == 0) {
                        i11 = (i18 + 1) / 2;
                    } else {
                        i11 = -((i18 + 1) / 2);
                    }
                    int i19 = i11 + i17;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i20 = i14;
                    while (i20 < i15 && !bVar2.b(i20, i19)) {
                        i20++;
                    }
                    int i21 = 0;
                    while (i20 < i15) {
                        if (bVar2.b(i20, i19)) {
                            if (i21 == 1) {
                                iArr[1] = iArr[1] + 1;
                            } else if (i21 == 2) {
                                if (bVar3.a(iArr) && (b11 = bVar3.b(i19, i20, iArr)) != null) {
                                    return b11;
                                }
                                iArr[0] = iArr[2];
                                iArr[1] = 1;
                                iArr[2] = 0;
                                i21 = 1;
                            } else {
                                i21++;
                                iArr[i21] = iArr[i21] + 1;
                            }
                        } else {
                            if (i21 == 1) {
                                i21++;
                            }
                            iArr[i21] = iArr[i21] + 1;
                        }
                        i20++;
                    }
                    if (bVar3.a(iArr) && (b10 = bVar3.b(i19, i15, iArr)) != null) {
                        return b10;
                    }
                }
                ArrayList arrayList = bVar3.f14157b;
                if (!arrayList.isEmpty()) {
                    return (hc.a) arrayList.get(0);
                }
                throw bc.e.a();
            }
            throw bc.e.a();
        }
        throw bc.e.a();
    }

    public f3.j v() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (f3.j jVar : ((LinkedHashMap) this.f7907b).values()) {
            arrayList.add(jVar.f11194b);
            arrayList2.add(jVar.f11195c);
            arrayList3.add(jVar.d);
            arrayList4.add(jVar.f11196e);
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
        la.d(j3, "the total number of elements (%s) in the arrays must fit in an int", z10);
        int[] iArr3 = new int[i7];
        int i10 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i10, iArr4.length);
            i10 += iArr4.length;
        }
        return new f3.j(iArr3, c8.l1.a((long[][]) arrayList2.toArray(new long[arrayList2.size()])), c8.l1.a((long[][]) arrayList3.toArray(new long[arrayList3.size()])), c8.l1.a((long[][]) arrayList4.toArray(new long[arrayList4.size()])));
    }

    public void w(int i7) {
        boolean z10;
        TLRPC.TL_exportedNoPaidMessagesToken c10;
        o0 o0Var = ((ci.j0) this.f7907b).f5706e;
        if (o0Var != null && o0Var.d != i7) {
            boolean z11 = true;
            if (o0Var.f5759c.d && i7 == 2) {
                i7 = 1;
            }
            o0Var.d = i7;
            SharedPreferences.Editor edit = o0Var.f().edit();
            if (o0Var.d == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            edit.putBoolean("qrNoPaidPermanent", z10).apply();
            int i10 = o0Var.d;
            if (i10 == 0) {
                if (o0Var.f5762n != 0) {
                    ConnectionsManager.getInstance(o0Var.f5757a).cancelRequest(o0Var.f5762n, true);
                    o0Var.f5762n = 0;
                    return;
                }
                return;
            }
            if (i10 == 2 && (c10 = o0Var.c()) != null) {
                o0Var.f5761f = c10;
                o0Var.f5758b.setFreeLink(o0Var.d(c10));
            }
            if (o0Var.d != 1) {
                z11 = false;
            }
            o0Var.n(false, z11);
        }
    }

    public float x(int i7, int i10, int i11, int i12) {
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z11;
        i iVar;
        int i21;
        boolean z12 = true;
        if (Math.abs(i12 - i10) > Math.abs(i11 - i7)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i14 = i7;
            i13 = i10;
            i16 = i11;
            i15 = i12;
        } else {
            i13 = i7;
            i14 = i10;
            i15 = i11;
            i16 = i12;
        }
        int abs = Math.abs(i15 - i13);
        int abs2 = Math.abs(i16 - i14);
        int i22 = 2;
        int i23 = (-abs) / 2;
        int i24 = -1;
        if (i13 < i15) {
            i17 = 1;
        } else {
            i17 = -1;
        }
        if (i14 < i16) {
            i24 = 1;
        }
        int i25 = i15 + i17;
        int i26 = i13;
        int i27 = i14;
        int i28 = 0;
        while (true) {
            if (i26 != i25) {
                if (z10) {
                    i19 = i27;
                } else {
                    i19 = i26;
                }
                if (z10) {
                    i20 = i26;
                } else {
                    i20 = i27;
                }
                boolean z13 = z10;
                if (i28 == z12) {
                    z11 = z12;
                    i21 = abs;
                    iVar = this;
                } else {
                    z11 = false;
                    iVar = this;
                    i21 = abs;
                }
                if (z11 == ((cc.b) iVar.f7907b).b(i19, i20)) {
                    if (i28 == 2) {
                        return w9.b(i26, i27, i13, i14);
                    }
                    i28++;
                }
                i23 += abs2;
                if (i23 > 0) {
                    if (i27 == i16) {
                        i18 = 2;
                        break;
                    }
                    i27 += i24;
                    i23 -= i21;
                }
                i26 += i17;
                abs = i21;
                z10 = z13;
                z12 = true;
                i22 = 2;
            } else {
                i18 = i22;
                break;
            }
        }
        if (i28 == i18) {
            return w9.b(i25, i16, i13, i14);
        }
        return Float.NaN;
    }

    public float y(int i7, int i10, int i11, int i12) {
        float f10;
        float f11;
        cc.b bVar = (cc.b) this.f7907b;
        float x10 = x(i7, i10, i11, i12);
        int i13 = i7 - (i11 - i7);
        int i14 = 0;
        if (i13 < 0) {
            f10 = i7 / (i7 - i13);
            i13 = 0;
        } else {
            int i15 = bVar.f5184a;
            if (i13 >= i15) {
                int i16 = i15 - 1;
                f10 = ((i15 - 1) - i7) / (i13 - i7);
                i13 = i16;
            } else {
                f10 = 1.0f;
            }
        }
        float f12 = i10;
        int i17 = (int) (f12 - ((i12 - i10) * f10));
        if (i17 < 0) {
            f11 = f12 / (i10 - i17);
        } else {
            int i18 = bVar.f5185b;
            if (i17 >= i18) {
                f11 = ((i18 - 1) - i10) / (i17 - i10);
                i14 = i18 - 1;
            } else {
                i14 = i17;
                f11 = 1.0f;
            }
        }
        return (x(i7, i10, (int) (((i13 - i7) * f11) + i7), i14) + x10) - 1.0f;
    }

    @Override
    public void z(b3.m mVar, long j3, long j10) {
        boolean z10;
        o2.d dVar = (o2.d) this.f7907b;
        synchronized (c3.b.f4395b) {
            z10 = c3.b.f4396c;
        }
        if (!z10) {
            dVar.f21638a.y(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.b();
    }

    public i(f0 f0Var) {
        this.f7906a = 9;
        this.f7907b = new WeakReference(f0Var);
    }

    public i(e7.a aVar, v vVar) {
        this.f7906a = 16;
        this.f7907b = vVar;
    }

    public i(Object obj, int i7) {
        this.f7906a = i7;
        this.f7907b = obj;
    }

    public i(int i7) {
        this.f7906a = i7;
        switch (i7) {
            case 17:
                this.f7907b = new LinkedHashMap();
                return;
            case 20:
                this.f7907b = new i(26);
                return;
            case 26:
                this.f7907b = new ob.c(ec.a.h, 18);
                return;
            default:
                this.f7907b = Collections.newSetFromMap(new WeakHashMap());
                return;
        }
    }

    public i(Context context) {
        String e10;
        this.f7906a = 0;
        b a10 = b.a(context);
        this.f7907b = a10;
        a10.b();
        String e11 = a10.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e11) || (e10 = a10.e(b.f("googleSignInOptions", e11))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(e10);
        } catch (JSONException unused) {
        }
    }

    public i(LaunchActivity launchActivity, Executor executor, a8.m1 m1Var) {
        this.f7906a = 2;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s5 = launchActivity.s();
            z zVar = (z) new a0(launchActivity).j(z.class);
            this.f7907b = s5;
            zVar.d = executor;
            zVar.f1984e = m1Var;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    @Override
    public void a(x1 x1Var) {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }

    @Override
    public void p(b3.m mVar, long j3, long j10, boolean z10) {
    }

    @Override
    public void s(b3.m mVar, long j3, long j10, int i7) {
    }
}
