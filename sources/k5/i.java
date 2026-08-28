package k5;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.biometric.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.a0;
import androidx.recyclerview.widget.RecyclerView;
import bg.i2;
import c2.t;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.u;
import f2.a1;
import f2.v1;
import f2.z0;
import f7.h5;
import i8.e0;
import ih.i9;
import ih.j9;
import ih.k4;
import ih.n3;
import j3.m;
import j3.m0;
import j3.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kh.ya;
import m.f2;
import m.j1;
import m6.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;
import org.telegram.ui.oy0;
import x6.l1;
import x6.m1;
import xf.q1;
import xf.s0;
public final class i implements a0, androidx.activity.result.b, o, s, k0, v0, l0, v1, j1, OnCompleteListener, i9, q, kd.b, yf.v1, f2, m.l {
    public static i f14657c;
    public final int f14658a;
    public Object f14659b;

    public i(int i9, boolean z10) {
        this.f14658a = i9;
    }

    public static boolean L(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String P(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public static synchronized i Q(Context context) {
        i S;
        synchronized (i.class) {
            S = S(context.getApplicationContext());
        }
        return S;
    }

    public static synchronized i S(Context context) {
        synchronized (i.class) {
            i iVar = f14657c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            f14657c = iVar2;
            return iVar2;
        }
    }

    @Override
    public boolean A() {
        return true;
    }

    @Override
    public int B(View view) {
        return z0.v(view) + ((ViewGroup.MarginLayoutParams) ((a1) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public com.google.android.gms.common.api.internal.e C(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    public void D() {
        h3.l0 l0Var = ((m0) this.f14659b).O0;
        if (l0Var != null) {
            l0Var.f9581a.f9649n.d(2);
        }
    }

    @Override
    public void E(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        f0 f0Var = (f0) this.f14659b;
        Handler handler = f0Var.f541w0;
        androidx.activity.i iVar = f0Var.f542x0;
        handler.removeCallbacks(iVar);
        TextView textView = f0Var.C0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(iVar, 2000L);
    }

    public void F(int i9, boolean z10) {
        t tVar = (t) this.f14659b;
        if (z10) {
            tVar.b(i9);
        } else {
            tVar.getClass();
        }
    }

    public boolean G(String str) {
        String K = K(str);
        if (!"1".equals(K) && !Boolean.parseBoolean(K)) {
            return false;
        }
        return true;
    }

    public Integer H(String str) {
        String K = K(str);
        if (!TextUtils.isEmpty(K)) {
            try {
                return Integer.valueOf(Integer.parseInt(K));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + P(str) + "(" + K + ") into an int");
                return null;
            }
        }
        return null;
    }

    public JSONArray I(String str) {
        String K = K(str);
        if (!TextUtils.isEmpty(K)) {
            try {
                return new JSONArray(K);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + P(str) + ": " + K + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public String J(Resources resources, String str, String str2) {
        String[] strArr;
        String K = K(str2);
        if (!TextUtils.isEmpty(K)) {
            return K;
        }
        String K2 = K(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(K2)) {
            return null;
        }
        int identifier = resources.getIdentifier(K2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", P(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray I = I(str2.concat("_loc_args"));
        if (I == null) {
            strArr = null;
        } else {
            int length = I.length();
            strArr = new String[length];
            for (int i9 = 0; i9 < length; i9++) {
                strArr[i9] = I.optString(i9);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + P(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e10);
            return null;
        }
    }

    public String K(String str) {
        String replace;
        Bundle bundle = (Bundle) this.f14659b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle M() {
        Bundle bundle = (Bundle) this.f14659b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public l9.a N(JSONObject jSONObject) {
        l9.b uVar;
        int i9 = jSONObject.getInt("settings_version");
        if (i9 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i9 + ". Using default settings values.", null);
            uVar = new za.a(13);
        } else {
            uVar = new u(14);
        }
        return uVar.t((ya.b) this.f14659b, jSONObject);
    }

    public void O(int i9) {
        RecyclerView recyclerView = (RecyclerView) this.f14659b;
        View childAt = recyclerView.getChildAt(i9);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i9);
    }

    public synchronized void R() {
        synchronized (this) {
            b bVar = (b) this.f14659b;
            ReentrantLock reentrantLock = bVar.f14640a;
            reentrantLock.lock();
            bVar.f14641b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public void T(long j10, int i9, n3 n3Var) {
        int i10 = ProfileStoriesView.f36197o0;
        ((oy0) this.f14659b).f(true, false);
        n3Var.run();
    }

    @Override
    public void a(long j10) {
        m mVar = ((m0) this.f14659b).F0;
        Handler handler = mVar.f13291a;
        if (handler != null) {
            handler.post(new i2(mVar, j10, 8));
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f14658a) {
            case 7:
                c6.f fVar = new c6.f(0, (TaskCompletionSource) obj2);
                c6.e eVar = (c6.e) ((c6.h) obj).u();
                Parcel G0 = eVar.G0();
                u6.a.d(G0, fVar);
                u6.a.c(G0, (c6.a) this.f14659b);
                eVar.H0(G0, 1);
                return;
            case 14:
                f8.e eVar2 = (f8.e) this.f14659b;
                o7.b bVar = (o7.b) obj;
                bVar.getClass();
                o7.a aVar = new o7.a(1, (TaskCompletionSource) obj2);
                try {
                    o7.i iVar = (o7.i) bVar.u();
                    Bundle G = bVar.G();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i9 = o7.c.f19011a;
                    obtain.writeInt(1);
                    eVar2.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    iVar.f19019a.transact(14, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e10) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e10);
                    Bundle bundle = Bundle.EMPTY;
                    h5.a(Status.h, Boolean.FALSE, aVar.f19010b);
                    return;
                }
            default:
                l6.b bVar2 = new l6.b(0, (TaskCompletionSource) obj2);
                m1 m1Var = (m1) ((l1) obj).u();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(m1Var.f49041b);
                int i10 = x6.j.f49024a;
                obtain2.writeStrongBinder(bVar2);
                obtain2.writeInt(1);
                ((v) this.f14659b).writeToParcel(obtain2, 0);
                Parcel obtain3 = Parcel.obtain();
                try {
                    m1Var.f49040a.transact(1, obtain2, obtain3, 0);
                    obtain3.readException();
                    return;
                } finally {
                    obtain2.recycle();
                    obtain3.recycle();
                }
        }
    }

    @Override
    public int c(View view) {
        return z0.z(view) - ((ViewGroup.MarginLayoutParams) ((a1) view.getLayoutParams())).topMargin;
    }

    @Override
    public void f(Object obj) {
        int i9;
        Bundle extras;
        switch (this.f14658a) {
            case 3:
                Map map = (Map) obj;
                j0 j0Var = (j0) this.f14659b;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((Boolean) arrayList.get(i10)).booleanValue()) {
                        i9 = 0;
                    } else {
                        i9 = -1;
                    }
                    iArr[i10] = i9;
                }
                androidx.fragment.app.f0 f0Var = (androidx.fragment.app.f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = f0Var.f936a;
                if (j0Var.f950c.q(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f14659b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f400b;
                int i11 = aVar.f399a;
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                if (i11 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i11);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i11);
                }
                int i12 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f18319a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.K;
                if (resultReceiver != null) {
                    resultReceiver.send(i12, extras);
                } else {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i12 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i12);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public void g() {
        h3.l0 l0Var = ((m0) this.f14659b).O0;
        if (l0Var != null) {
            l0Var.f9581a.S = true;
        }
    }

    @Override
    public void g0(float f10) {
        ya yaVar = (ya) this.f14659b;
        s0.e(yaVar.B1).k(String.valueOf(xf.m.f49272a.indexOf(yaVar.K0.getCurrentBrush())), f10);
        q1 q1Var = yaVar.f15310w1;
        q1Var.f49335c = f10;
        yaVar.E0(q1Var, null, false);
    }

    @Override
    public float get() {
        ya yaVar = (ya) this.f14659b;
        int i9 = yaVar.B1;
        xf.m currentBrush = yaVar.K0.getCurrentBrush();
        if (currentBrush == null) {
            return s0.e(i9).f49364i;
        }
        return s0.e(i9).f(String.valueOf(xf.m.f49272a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public com.google.android.exoplayer2.upstream.k0 h(n0 n0Var, IOException iOException, int i9) {
        m4.g gVar = ((m4.d) this.f14659b).f17290a;
        d5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
        return q0.f2591e;
    }

    @Override
    public void i(Object obj) {
        n nVar;
        q7.c cVar = (q7.c) obj;
        androidx.activity.o oVar = ((b7.k) this.f14659b).f1565b;
        synchronized (oVar) {
            oVar.f387a = false;
            nVar = ((p) oVar.f388b).f2873c;
        }
        if (nVar != null) {
            ((b7.e) oVar.f389c).c(nVar, 2441);
        }
    }

    @Override
    public void j() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.f14659b;
        m0Var.f2850a.lock();
        try {
            m0Var.f2859m = new g0(m0Var, m0Var.f2856j, m0Var.f2857k, m0Var.d, m0Var.f2858l, m0Var.f2850a, m0Var.f2852c);
            m0Var.f2859m.v();
            m0Var.f2851b.signalAll();
        } finally {
            m0Var.f2850a.unlock();
        }
    }

    @Override
    public void k(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f14659b).f16534f.removeCallbacksAndMessages(kVar);
    }

    @Override
    public int l() {
        return ((z0) this.f14659b).G();
    }

    @Override
    public void m(n0 n0Var, long j10, long j11) {
        boolean z10;
        m4.d dVar = (m4.d) this.f14659b;
        synchronized (d5.a.f4327i) {
            z10 = d5.a.f4328j;
        }
        if (!z10) {
            IOException iOException = new IOException(new ConcurrentModificationException());
            m4.g gVar = dVar.f17290a;
            d5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
            gVar.u(true);
            return;
        }
        dVar.a();
    }

    @Override
    public void n(int i9) {
        x xVar = (x) this.f14659b;
        Lock lock = xVar.f2929o;
        lock.lock();
        try {
            if (xVar.f2928n) {
                xVar.f2928n = false;
                x.k(xVar, i9);
            } else {
                xVar.f2928n = true;
                xVar.d.onConnectionSuspended(i9);
            }
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override
    public void o(int i9, long j10, long j11) {
        m mVar = ((m0) this.f14659b).F0;
        Handler handler = mVar.f13291a;
        if (handler != null) {
            handler.post(new com.google.android.exoplayer2.upstream.d(mVar, i9, j10, j11, 1));
        }
    }

    @Override
    public void onComplete(Task task) {
        e0 e0Var = (e0) this.f14659b;
        if (task.isSuccessful()) {
            h8.m.K0(e0Var, true, (byte[]) task.getResult());
            return;
        }
        Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
        h8.m.K0(e0Var, false, null);
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        m mVar = ((m0) this.f14659b).F0;
        Handler handler = mVar.f13291a;
        if (handler != null) {
            handler.post(new eh.f(5, mVar, z10));
        }
    }

    @Override
    public java.lang.Object q(kd.c r7, sc.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: k5.i.q(kd.c, sc.c):java.lang.Object");
    }

    @Override
    public void s(Bundle bundle) {
        x xVar = (x) this.f14659b;
        xVar.f2929o.lock();
        try {
            xVar.f2927m = u5.a.f48098e;
            x.l(xVar);
        } finally {
            xVar.f2929o.unlock();
        }
    }

    @Override
    public void t(u5.a aVar) {
        x xVar = (x) this.f14659b;
        xVar.f2929o.lock();
        try {
            xVar.f2927m = aVar;
            x.l(xVar);
        } finally {
            xVar.f2929o.unlock();
        }
    }

    @Override
    public int u() {
        z0 z0Var = (z0) this.f14659b;
        return z0Var.f5573n - z0Var.C();
    }

    @Override
    public void v() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.f14659b;
        for (com.google.android.gms.common.api.c cVar : m0Var.f2854f.values()) {
            cVar.disconnect();
        }
        m0Var.f2861o.B = Collections.EMPTY_SET;
    }

    @Override
    public void w(Exception exc) {
        d5.a.p("MediaCodecAudioRenderer", "Audio sink error", exc);
        m mVar = ((m0) this.f14659b).F0;
        Handler handler = mVar.f13291a;
        if (handler != null) {
            handler.post(new j3.k(mVar, exc, 1));
        }
    }

    @Override
    public void x() {
        ((m0) this.f14659b).M0 = true;
    }

    @Override
    public void y(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.f14659b;
        Handler handler = eVar.f16534f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f16535n;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                if (kVar == ((l.d) arrayList.get(i9)).f16528b) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 == -1) {
            return;
        }
        int i10 = i9 + 1;
        if (i10 < arrayList.size()) {
            dVar = (l.d) arrayList.get(i10);
        }
        handler.postAtTime(new af.f(this, dVar, mVar, kVar, 7), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override
    public boolean y0(long j10, int i9, int i10, int i11, j9 j9Var) {
        ImageReceiver imageReceiver;
        k4 k4Var;
        k4 k4Var2;
        k4 k4Var3;
        k4 k4Var4;
        j9Var.f11643b = null;
        j9Var.f11644c = null;
        oy0 oy0Var = (oy0) this.f14659b;
        iz0 iz0Var = oy0Var.h;
        ArrayList arrayList = oy0Var.f36219w;
        if (oy0Var.J < 0.2f) {
            j9Var.f11643b = iz0Var.getImageReceiver();
            j9Var.f11644c = null;
            j9Var.f11642a = iz0Var;
            j9Var.h = 0.0f;
            j9Var.f11648i = AndroidUtilities.displaySize.y;
            j9Var.f11647g = (View) oy0Var.getParent();
            j9Var.d = oy0Var.f36221y;
            j9Var.f11653n = true;
            return true;
        }
        int i12 = 0;
        while (true) {
            if (i12 < arrayList.size()) {
                k4 k4Var5 = (k4) arrayList.get(i12);
                if (k4Var5.f11674e >= 1.0f && k4Var5.f11671a == i10) {
                    int i13 = i12 - 1;
                    if (i13 >= 0) {
                        k4Var3 = (k4) arrayList.get(i13);
                    } else {
                        k4Var3 = null;
                    }
                    int i14 = i12 - 2;
                    if (i14 >= 0) {
                        k4Var4 = (k4) arrayList.get(i14);
                    } else {
                        k4Var4 = null;
                    }
                    k4 d = ProfileStoriesView.d(k4Var3, k4Var4, k4Var5);
                    imageReceiver = k4Var5.f11672b;
                    k4Var2 = d;
                    k4Var = k4Var5;
                }
                i12++;
            } else {
                imageReceiver = null;
                k4Var = null;
                k4Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        j9Var.f11644c = imageReceiver;
        j9Var.f11643b = null;
        j9Var.f11642a = oy0Var;
        j9Var.h = 0.0f;
        j9Var.f11648i = AndroidUtilities.displaySize.y;
        j9Var.f11647g = (View) oy0Var.getParent();
        if (k4Var != null && k4Var2 != null) {
            j9Var.f11646f = new f1.a(this, new RectF(k4Var.f11681m), k4Var, new RectF(k4Var2.f11681m), k4Var2);
            return true;
        }
        j9Var.f11646f = null;
        return true;
    }

    @Override
    public View z(int i9) {
        return ((z0) this.f14659b).q(i9);
    }

    public i(com.google.android.gms.common.api.j jVar, y5.a aVar, int i9) {
        this.f14658a = i9;
        this.f14659b = aVar;
    }

    public i(Object obj, int i9) {
        this.f14658a = i9;
        this.f14659b = obj;
    }

    public i(Context context) {
        String d;
        this.f14658a = 0;
        b a2 = b.a(context);
        this.f14659b = a2;
        a2.b();
        String d9 = a2.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(d9) || (d = a2.d(b.f("googleSignInOptions", d9))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(d);
        } catch (JSONException unused) {
        }
    }

    public i(int i9) {
        this.f14658a = i9;
        switch (i9) {
            case 16:
                this.f14659b = new t();
                return;
            default:
                this.f14659b = new LinkedHashMap(0, 0.75f, true);
                return;
        }
    }

    public i(Bundle bundle) {
        this.f14658a = 10;
        this.f14659b = new Bundle(bundle);
    }

    @Override
    public void b(Bundle bundle) {
    }

    @Override
    public void d(boolean z10) {
    }

    @Override
    public void r(int i9) {
    }

    @Override
    public void p(u5.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override
    public void e(n0 n0Var, long j10, long j11, boolean z10) {
    }
}
