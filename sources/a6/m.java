package a6;

import ab.e0;
import ah.i1;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.View;
import androidx.biometric.o;
import androidx.biometric.q;
import androidx.biometric.u;
import androidx.biometric.y;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.xa;
import g6.n;
import g6.s;
import hg.z1;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import m.j1;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.LaunchActivity;
import qg.s1;
import rg.v1;
import v7.c8;
import v7.j5;
import v7.r8;
import v7.u6;
public final class m implements bl0, a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, u0, OnSuccessListener, n, ee.b, v1, j1, r, gb.n, z1 {
    public final int f309a;
    public Object f310b;

    public m(g6.r rVar, String[] strArr) {
        this.f309a = 23;
        this.f310b = strArr;
    }

    public static p d(Looper looper, Object obj, String str) {
        n6.l.i(obj, "Listener must not be null");
        n6.l.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    @Override
    public a0.h J() {
        return null;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public void U(float f7) {
        xa xaVar = (xa) this.f310b;
        qg.u0.e(xaVar.F1).k(String.valueOf(qg.m.f44561a.indexOf(xaVar.O0.getCurrentBrush())), f7);
        s1 s1Var = xaVar.A1;
        s1Var.f44647c = f7;
        xaVar.D0(s1Var, null, false);
    }

    @Override
    public void Y(ArrayList arrayList) {
        hg.j1 j1Var = (hg.j1) this.f310b;
        String str = j1Var.Z;
        if (str != null) {
            j1Var.U(str, j1Var.f11923c0, j1Var.f11924d0, j1Var.f11921b0, j1Var.f11920a0);
        }
    }

    @Override
    public void Z(Object obj) {
        switch (this.f309a) {
            case 4:
                q qVar = (q) this.f310b;
                if (((Boolean) obj).booleanValue()) {
                    if (qVar.R()) {
                        qVar.W(qVar.q(2131689613));
                    }
                    y yVar = qVar.f2837l0;
                    if (!yVar.f2853n) {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    } else {
                        Executor executor = yVar.d;
                        if (executor == null) {
                            executor = new o(1);
                        }
                        executor.execute(new androidx.biometric.h(qVar, 0));
                    }
                    y yVar2 = qVar.f2837l0;
                    if (yVar2.f2860u == null) {
                        yVar2.f2860u = new z();
                    }
                    y.h(yVar2.f2860u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                t tVar = (t) obj;
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.f310b;
                if (tVar != null && pVar.f3247r0) {
                    pVar.getClass();
                    throw new IllegalStateException("Fragment " + pVar + " did not return a View from onCreateView() or this was called before onCreateView().");
                }
                return;
        }
    }

    public void a(c3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f310b;
        long[] jArr = jVar.e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f309a) {
            case 23:
                g6.q qVar = new g6.q(1, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((s) obj).u();
                Parcel N0 = iVar.N0();
                v.d(N0, qVar);
                N0.writeStringArray((String[]) this.f310b);
                iVar.S0(N0, 6);
                return;
            default:
                h7.f fVar = new h7.f(1, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = q7.a.f44412a;
                obtain.writeStrongBinder(fVar);
                q7.a.b(obtain, (GetCredentialRequest) this.f310b);
                q7.a.b(obtain, gVar);
                ((h7.b) ((h7.d) ((h7.e) obj).u())).F0(obtain, 1);
                return;
        }
    }

    public void b(StringBuilder sb2, Iterator it) {
        d9.l lVar = (d9.l) this.f310b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(d9.l.f(entry.getKey()));
            sb2.append("=");
            sb2.append(d9.l.f(entry.getValue()));
            while (it.hasNext()) {
                sb2.append((CharSequence) lVar.f7893a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(d9.l.f(entry2.getKey()));
                sb2.append("=");
                sb2.append(d9.l.f(entry2.getValue()));
            }
        }
    }

    public void c(j6.l lVar, u uVar) {
        k0 k0Var = (k0) this.f310b;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            k0 k0Var2 = (k0) this.f310b;
            q qVar = (q) k0Var2.D("androidx.biometric.BiometricFragment");
            if (qVar == null) {
                qVar = new q();
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
            y yVar = qVar.f2837l0;
            yVar.f2846f = lVar;
            int i10 = lVar.f14288a;
            if (i10 == 0) {
                if (uVar != null) {
                    i10 = 15;
                } else {
                    i10 = 255;
                }
            }
            if (Build.VERSION.SDK_INT < 30 && i10 == 15 && uVar == null) {
                yVar.f2847g = v7.m.a();
            } else {
                yVar.f2847g = uVar;
            }
            if (qVar.Q()) {
                qVar.f2837l0.f2850k = qVar.q(2131689576);
            } else {
                qVar.f2837l0.f2850k = null;
            }
            if (qVar.Q() && new androidx.biometric.e(new k6.h(k10, 1)).i(255) != 0) {
                qVar.f2837l0.f2853n = true;
                qVar.S();
            } else if (qVar.f2837l0.f2855p) {
                qVar.f2836k0.postDelayed(new androidx.biometric.p(qVar), 600L);
            } else {
                qVar.X();
            }
        }
    }

    public c2.r e(c2.b r24) {
        throw new UnsupportedOperationException("Method not decompiled: a6.m.e(c2.b):c2.r");
    }

    @Override
    public void f(int i10) {
        ((hg.j1) this.f310b).l();
    }

    @Override
    public Object f2() {
        Constructor constructor = (Constructor) this.f310b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            r8 r8Var = jb.c.f14370a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + jb.c.b(constructor) + "' with no args", e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + jb.c.b(constructor) + "' with no args", e10.getCause());
        }
    }

    @Override
    public void g(k6.a aVar) {
        w wVar = (w) this.f310b;
        wVar.f6512o.lock();
        try {
            wVar.f6509l = aVar;
            w.l(wVar);
        } finally {
            wVar.f6512o.unlock();
        }
    }

    @Override
    public float get() {
        xa xaVar = (xa) this.f310b;
        int i10 = xaVar.F1;
        qg.m currentBrush = xaVar.O0.getCurrentBrush();
        if (currentBrush == null) {
            return qg.u0.e(i10).f44670i;
        }
        return qg.u0.e(i10).f(String.valueOf(qg.m.f44561a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public Boolean h() {
        Bundle bundle = (Bundle) this.f310b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override
    public void i(Object obj) {
        Bundle extras;
        switch (this.f309a) {
            case 7:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                j0 j0Var = (j0) this.f310b;
                f0 f0Var = (f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str = f0Var.f3180a;
                int i10 = f0Var.f3181b;
                androidx.fragment.app.s f7 = j0Var.f3194c.f(str);
                if (f7 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    return;
                }
                f7.x(i10, aVar.f2683a, aVar.f2684b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f310b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f2684b;
                int i11 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f4757a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i11, extras);
                }
                int i12 = aVar2.f2683a;
                if (i12 != -1 || i11 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public void l(View view, i1 i1Var, boolean z10, boolean z11) {
        ah.f0 f0Var = (ah.f0) this.f310b;
        f0Var.f725a.eb(null, f0Var.e, f0Var.f726b, view, 0.0f, 0.0f, i1Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new a3.d(this, 3));
    }

    @Override
    public void n(int i10) {
        k6.a aVar;
        w wVar = (w) this.f310b;
        Lock lock = wVar.f6512o;
        lock.lock();
        try {
            if (!wVar.f6511n && (aVar = wVar.f6510m) != null && aVar.c()) {
                wVar.f6511n = true;
                wVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            wVar.f6511n = false;
            w.k(wVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public void o(Bundle bundle) {
        w wVar = (w) this.f310b;
        wVar.f6512o.lock();
        try {
            Bundle bundle2 = wVar.f6508k;
            if (bundle2 == null) {
                wVar.f6508k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            wVar.f6509l = k6.a.e;
            w.l(wVar);
        } finally {
            wVar.f6512o.unlock();
        }
    }

    @Override
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: a6.m.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override
    public void onSuccess(Object obj) {
        ((d6.a) this.f310b).getClass();
        j5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public void p(String str, long j10, long j11, long j12) {
        e6.o oVar = (e6.o) this.f310b;
        try {
            oVar.a(new e6.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e) {
            g6.b bVar = e6.h.f8369k;
            Log.e(bVar.f10843a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = oVar.f8390q.f8375i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override
    public java.lang.Object r(ee.c r7, md.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: a6.m.r(ee.c, md.c):java.lang.Object");
    }

    @Override
    public boolean s() {
        return false;
    }

    @Override
    public void t(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: a6.m.t(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    public void u(e0 e0Var) {
        ((l5.r) ((i5.f) ((qa.b) this.f310b).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new a1.c(this, 2)).a(new i5.a(null, e0Var, i5.d.f12708a, null), new k2.f0(4));
    }

    public c3.j v() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (c3.j jVar : ((LinkedHashMap) this.f310b).values()) {
            arrayList.add(jVar.f4633b);
            arrayList2.add(jVar.f4634c);
            arrayList3.add(jVar.d);
            arrayList4.add(jVar.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()]);
        long j10 = 0;
        for (int[] iArr2 : iArr) {
            j10 += iArr2.length;
        }
        int i10 = (int) j10;
        if (j10 == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.c(j10, "the total number of elements (%s) in the arrays must fit in an int", z10);
        int[] iArr3 = new int[i10];
        int i11 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i11, iArr4.length);
            i11 += iArr4.length;
        }
        return new c3.j(iArr3, c8.a((long[][]) arrayList2.toArray(new long[arrayList2.size()])), c8.a((long[][]) arrayList3.toArray(new long[arrayList3.size()])), c8.a((long[][]) arrayList4.toArray(new long[arrayList4.size()])));
    }

    public JSONObject w() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f310b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(x9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        x9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    x9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            x9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            x9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override
    public a0.h y() {
        return null;
    }

    public m(Object obj, int i10) {
        this.f309a = i10;
        this.f310b = obj;
    }

    public m(JSONArray jSONArray) {
        this.f309a = 10;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new c5.m(optJSONObject));
                }
            }
        }
        this.f310b = arrayList;
    }

    public m(x6.a aVar) {
        this.f309a = 29;
        n6.l.h(aVar);
        this.f310b = aVar;
    }

    public m(Context context) {
        this.f309a = 12;
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f310b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public m(ca.c cVar) {
        this.f309a = 19;
        this.f310b = new File(cVar.f5049b, "com.crashlytics.settings.json");
    }

    public m(int i10) {
        this.f309a = i10;
        switch (i10) {
            case 13:
                this.f310b = Collections.newSetFromMap(new WeakHashMap());
                return;
            case 27:
                return;
            case 28:
                this.f310b = new ya.d(gc.a.h, 21);
                return;
            default:
                this.f310b = new LinkedHashMap();
                return;
        }
    }

    public m(LaunchActivity launchActivity, Executor executor, v7.l lVar) {
        this.f309a = 5;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s10 = launchActivity.s();
            y yVar = (y) new androidx.biometric.e(launchActivity).m(y.class);
            this.f310b = s10;
            yVar.d = executor;
            yVar.e = lVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void q() {
    }

    @Override
    public void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
