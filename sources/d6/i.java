package d6;

import a8.ma;
import a8.n1;
import a8.o1;
import a8.x9;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.session.a0;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import androidx.biometric.z;
import androidx.fragment.app.f0;
import androidx.fragment.app.k0;
import ch.p;
import ci.j0;
import ci.o0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.e0;
import com.google.android.gms.common.api.internal.g1;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.common.api.internal.q;
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
import hi.u0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
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
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.j6;
import org.telegram.messenger.jc;
import org.telegram.messenger.ks;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bv0;
import org.telegram.ui.vv0;
import q6.m;
import q7.l1;
import q7.m1;
public final class i implements SuccessContinuation, androidx.activity.result.b, b3.k, te.b, p0, i0, q, pt0, jc, WebMessageListenerBoundaryInterface, b9, w, OnSuccessListener, OnCompleteListener, p90 {
    public static i f7870c;
    public final int f7871a;
    public final Object f7872b;

    public i(cb.c cVar) {
        this.f7871a = 19;
        this.f7872b = (r) cVar.f5146b;
    }

    public static synchronized i F(Context context) {
        i I;
        synchronized (i.class) {
            I = I(context.getApplicationContext());
        }
        return I;
    }

    public static synchronized i I(Context context) {
        synchronized (i.class) {
            i iVar = f7870c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            f7870c = iVar2;
            return iVar2;
        }
    }

    public static o p(Looper looper, Object obj, String str) {
        m.i(obj, "Listener must not be null");
        m.i(looper, "Looper must not be null");
        return new o(looper, obj, str);
    }

    public void A(int i7) {
        boolean z10;
        TLRPC.TL_exportedNoPaidMessagesToken c10;
        o0 o0Var = ((j0) this.f7872b).f5672e;
        if (o0Var != null && o0Var.d != i7) {
            boolean z11 = true;
            if (o0Var.f5725c.d && i7 == 2) {
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
                if (o0Var.f5728n != 0) {
                    ConnectionsManager.getInstance(o0Var.f5723a).cancelRequest(o0Var.f5728n, true);
                    o0Var.f5728n = 0;
                    return;
                }
                return;
            }
            if (i10 == 2 && (c10 = o0Var.c()) != null) {
                o0Var.f5727f = c10;
                o0Var.f5724b.setFreeLink(o0Var.d(c10));
            }
            if (o0Var.d != 1) {
                z11 = false;
            }
            o0Var.n(false, z11);
        }
    }

    public float B(int i7, int i10, int i11, int i12) {
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
                if (z11 == ((cc.b) iVar.f7872b).b(i19, i20)) {
                    if (i28 == 2) {
                        return x9.b(i26, i27, i13, i14);
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
            return x9.b(i25, i16, i13, i14);
        }
        return Float.NaN;
    }

    public float C(int i7, int i10, int i11, int i12) {
        float f10;
        float f11;
        cc.b bVar = (cc.b) this.f7872b;
        float B = B(i7, i10, i11, i12);
        int i13 = i7 - (i11 - i7);
        int i14 = 0;
        if (i13 < 0) {
            f10 = i7 / (i7 - i13);
            i13 = 0;
        } else {
            int i15 = bVar.f5150a;
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
            int i18 = bVar.f5151b;
            if (i17 >= i18) {
                f11 = ((i18 - 1) - i10) / (i17 - i10);
                i14 = i18 - 1;
            } else {
                i14 = i17;
                f11 = 1.0f;
            }
        }
        return (B(i7, i10, (int) (((i13 - i7) * f11) + i7), i14) + B) - 1.0f;
    }

    public void D() {
        e0 e0Var = (e0) ((WeakReference) this.f7872b).get();
        if (e0Var == null) {
            return;
        }
        e0Var.k();
    }

    @Override
    public void E(boolean z10) {
        te.a aVar = ((t) this.f7872b).f9754s;
        if (aVar != null) {
            aVar.a(z10, true);
        }
    }

    @Override
    public void G(float f10, int i7) {
        p pVar = (p) this.f7872b;
        pVar.f5457c.setLayerType(0, null);
        if (f10 == 0.0f && !pVar.P) {
            pVar.f5457c.setVisibility(4);
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                pVar.F.setFocusableInTouchMode(false);
            }
        }
        ks.e().k(ks.f25239k1, 512);
    }

    public synchronized void H() {
        synchronized (this) {
            b bVar = (b) this.f7872b;
            ReentrantLock reentrantLock = bVar.f7853a;
            reentrantLock.lock();
            bVar.f7854b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public void K(int i7, float f10, float f11, te.c cVar) {
        ((p) this.f7872b).j0(f10);
    }

    @Override
    public float K0() {
        return i5.c.d(9.66f, ri.a.d(t.g0((t) this.f7872b).f15979b), 0);
    }

    public void L() {
        h6.h hVar = (h6.h) this.f7872b;
        Iterator it = hVar.h.iterator();
        if (!it.hasNext()) {
            Iterator it2 = hVar.f13920i.iterator();
            while (it2.hasNext()) {
                ((h6.g) it2.next()).a();
            }
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public void M(IBinder iBinder) {
        synchronized (((HashMap) this.f7872b)) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            new b9.a();
            for (Map.Entry entry : ((HashMap) this.f7872b).entrySet()) {
                if (entry.getValue() == null) {
                    try {
                        throw null;
                        break;
                    } catch (RemoteException unused) {
                        String valueOf = String.valueOf(entry.getKey());
                        Log.w("WearableClient", "onPostInitHandler: Didn't add: " + valueOf + "/null");
                    }
                } else {
                    throw new ClassCastException();
                }
            }
        }
    }

    @Override
    public int T0() {
        return t.h0((t) this.f7872b).d;
    }

    public void a(f3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7872b;
        long[] jArr = jVar.f11166e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(jVar.f11166e[0]), jVar);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i7 = this.f7871a;
        Object obj3 = this.f7872b;
        switch (i7) {
            case 13:
                d8.d dVar = new d8.d(0, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = d8.a.f7875a;
                obtain.writeStrongBinder(dVar);
                obtain.writeInt(1);
                ((o8.a) obj3).writeToParcel(obtain, 0);
                ((d8.c) ((d8.f) obj).n()).h1(obtain, 2);
                return;
            default:
                e7.b bVar = new e7.b(0, (TaskCompletionSource) obj2);
                m1 m1Var = (m1) ((l1) obj).n();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(m1Var.f56151b);
                int i11 = q7.j.f56134a;
                obtain2.writeStrongBinder(bVar);
                obtain2.writeInt(1);
                ((v) obj3).writeToParcel(obtain2, 0);
                Parcel obtain3 = Parcel.obtain();
                try {
                    m1Var.f56150a.transact(1, obtain2, obtain3, 0);
                    obtain3.readException();
                    return;
                } finally {
                    obtain2.recycle();
                    obtain3.recycle();
                }
        }
    }

    @Override
    public void d(long j3, int i7, e3 e3Var) {
        int i10 = ProfileStoriesView.f43923t0;
        ((bv0) this.f7872b).f(true, false);
        e3Var.run();
    }

    public void e(n nVar, androidx.biometric.v vVar) {
        Object obj = this.f7872b;
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
            zVar.f1944f = nVar;
            int i7 = nVar.f20971a;
            if (i7 == 0) {
                if (vVar != null) {
                    i7 = 15;
                } else {
                    i7 = 255;
                }
            }
            if (Build.VERSION.SDK_INT < 30 && i7 == 15 && vVar == null) {
                zVar.f1945g = o1.a();
            } else {
                zVar.f1945g = vVar;
            }
            if (qVar.Q()) {
                qVar.m0.f1948k = qVar.q(2131689577);
            } else {
                qVar.m0.f1948k = null;
            }
            if (qVar.Q() && new a0(new androidx.biometric.t(k10, 0)).d(255) != 0) {
                qVar.m0.f1951n = true;
                qVar.S();
            } else if (qVar.m0.f1953p) {
                qVar.f1933l0.postDelayed(new androidx.biometric.p(qVar), 600L);
            } else {
                qVar.X();
            }
        }
    }

    @Override
    public void f(l.k kVar, boolean z10) {
        ((s) this.f7872b).g(kVar);
    }

    @Override
    public void g(Object obj) {
        int i7;
        Bundle extras;
        switch (this.f7871a) {
            case 3:
                Map map = (Map) obj;
                androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f7872b;
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
                f0 f0Var = (f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = f0Var.f2305a;
                if (j0Var.f2319c.o(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f7872b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f1772b;
                int i11 = aVar.f1771a;
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
                int i12 = u.e("ProxyBillingActivityV2", intent).f11277a;
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

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override
    public void h(n6.a aVar) {
        g1 g1Var = (g1) this.f7872b;
        g1Var.f6283o.lock();
        try {
            g1Var.f6281m = aVar;
            g1Var.j();
        } finally {
            g1Var.f6283o.unlock();
        }
    }

    public float i(hc.c cVar, hc.c cVar2) {
        int i7 = (int) cVar.f3104b;
        int i10 = (int) cVar2.f3104b;
        float C = C((int) cVar.f3103a, i7, (int) cVar2.f3103a, i10);
        float C2 = C((int) cVar2.f3103a, i10, (int) cVar.f3103a, i7);
        if (Float.isNaN(C)) {
            return C2 / 7.0f;
        }
        if (Float.isNaN(C2)) {
            return C / 7.0f;
        }
        return (C + C2) / 14.0f;
    }

    @Override
    public void j(int i7) {
        g1 g1Var = (g1) this.f7872b;
        Lock lock = g1Var.f6283o;
        Lock lock2 = g1Var.f6283o;
        lock.lock();
        try {
            if (g1Var.f6282n) {
                g1Var.f6282n = false;
                g1Var.f6273b.j(i7);
                g1Var.f6281m = null;
                g1Var.f6280l = null;
            } else {
                g1Var.f6282n = true;
                g1Var.d.onConnectionSuspended(i7);
            }
            lock2.unlock();
        } catch (Throwable th2) {
            lock2.unlock();
            throw th2;
        }
    }

    @Override
    public Paint.FontMetricsInt j1() {
        return ((hi.n) this.f7872b).f14936f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public b3.i k(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        ((o2.d) this.f7872b).f21706a.y(iOException);
        return b3.p.f2883e;
    }

    @Override
    public boolean l(long j3, int i7, int i10, int i11, c9 c9Var) {
        ImageReceiver imageReceiver;
        b4 b4Var;
        b4 b4Var2;
        b4 b4Var3;
        b4 b4Var4;
        c9Var.f11822b = null;
        c9Var.f11823c = null;
        bv0 bv0Var = (bv0) this.f7872b;
        vv0 vv0Var = bv0Var.h;
        ArrayList arrayList = bv0Var.f43951x;
        if (bv0Var.O < 0.2f) {
            c9Var.f11822b = vv0Var.getImageReceiver();
            c9Var.f11823c = null;
            c9Var.f11821a = vv0Var;
            c9Var.h = 0.0f;
            c9Var.f11827i = g0.f24226q.y;
            c9Var.f11826g = (View) bv0Var.getParent();
            c9Var.d = bv0Var.E;
            c9Var.f11832n = true;
            return true;
        }
        int i12 = 0;
        while (true) {
            if (i12 < arrayList.size()) {
                b4 b4Var5 = (b4) arrayList.get(i12);
                if (b4Var5.f11763e >= 1.0f && b4Var5.f11760a == i10) {
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
                    imageReceiver = b4Var5.f11761b;
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
        c9Var.f11823c = imageReceiver;
        c9Var.f11822b = null;
        c9Var.f11821a = bv0Var;
        c9Var.h = 0.0f;
        c9Var.f11827i = g0.f24226q.y;
        c9Var.f11826g = (View) bv0Var.getParent();
        if (b4Var != null && b4Var2 != null) {
            c9Var.f11825f = new l6(this, new RectF(b4Var.f11770m), b4Var, new RectF(b4Var2.f11770m), b4Var2);
            return true;
        }
        c9Var.f11825f = null;
        return true;
    }

    @Override
    public void n() {
        d3.l lVar = (d3.l) this.f7872b;
        if (lVar.f7714s1 != null) {
            lVar.R0(0, 1);
        }
    }

    @Override
    public void o(Bundle bundle) {
        g1 g1Var = (g1) this.f7872b;
        g1Var.f6283o.lock();
        try {
            g1Var.f6281m = n6.a.f21513f;
            g1Var.j();
        } finally {
            g1Var.f6283o.unlock();
        }
    }

    @Override
    public void onComplete(Task task) {
        g6.c.h((g6.c) ((g6.j) this.f7872b).f13221c, "joinApplication", task);
    }

    @Override
    public void onFirstFrameRendered() {
        d3.l lVar = (d3.l) this.f7872b;
        Surface surface = lVar.f7714s1;
        if (surface != null) {
            lVar.f7700c1.P(surface);
            lVar.f7717v1 = true;
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
        g6.a aVar = (g6.a) this.f7872b;
        Bundle bundle = (Bundle) obj;
        if (m0.f6572j) {
            Context context = aVar.f13180a;
            j6.t tVar = aVar.f13184f;
            m0 m0Var = new m0(context, tVar, aVar.f13182c, aVar.f13187j, aVar.f13185g);
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
            o5.t.b(context);
            m0Var.f6578g = o5.t.a().c(m5.a.f20920e).a("CAST_SENDER_SDK", new l5.c("proto"), x.f6720a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                m0Var.f6576e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(v, 0);
            if (i7 != 0) {
                com.google.android.gms.common.api.internal.t b11 = com.google.android.gms.common.api.internal.u.b();
                b11.f6348c = new u0(tVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, 6);
                b11.d = new n6.c[]{y.f11472c};
                b11.f6347b = false;
                b11.f6346a = 8426;
                Task e10 = tVar.e(0, b11.a());
                ?? obj2 = new Object();
                obj2.f20972b = m0Var;
                obj2.f20973c = packageName;
                obj2.f20971a = i7;
                obj2.d = sharedPreferences;
                e10.addOnSuccessListener(obj2);
            }
            if (z10) {
                m.h(sharedPreferences);
                j6.b bVar = a2.f6456i;
                synchronized (a2.class) {
                    try {
                        if (a2.f6458k == null) {
                            a2.f6458k = new a2(sharedPreferences, m0Var, packageName);
                        }
                        a2Var = a2.f6458k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = a2Var.f6461c;
                SharedPreferences sharedPreferences2 = a2Var.f6460b;
                HashSet hashSet = a2Var.f6463f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = a2Var.f6464g;
                hashSet2.clear();
                a2Var.h = 0L;
                String str2 = a2.f6457j;
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
                    m.h(a2Var.f6462e);
                    m.h(a2Var.d);
                    a2Var.f6462e.post(a2Var.d);
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

    public cc.e s(ab.q r23) {
        throw new UnsupportedOperationException("Method not decompiled: d6.i.s(ab.q):cc.e");
    }

    @Override
    public Task then(Object obj) {
        ia.b bVar = (ia.b) obj;
        q4.q qVar = (q4.q) this.f7872b;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        aa.p pVar = (aa.p) qVar.f55950c;
        aa.p.b((aa.p) qVar.f55950c);
        pVar.f840m.h(null, pVar.f833e.f3058a);
        pVar.f844q.trySetResult(null);
        return Tasks.forResult(null);
    }

    @Override
    public boolean u(l.k kVar) {
        Window.Callback callback = ((s) this.f7872b).f13020f.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    @Override
    public void v() {
        l2.j0 j0Var = ((d3.l) this.f7872b).Z;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    public hc.a w(float f10, float f11, int i7, int i10) {
        int i11;
        hc.a b10;
        hc.a b11;
        int i12 = (int) (f11 * f10);
        int max = Math.max(0, i7 - i12);
        cc.b bVar = (cc.b) this.f7872b;
        int min = Math.min(bVar.f5150a - 1, i7 + i12) - max;
        float f12 = 3.0f * f10;
        if (min >= f12) {
            int max2 = Math.max(0, i10 - i12);
            int min2 = Math.min(bVar.f5151b - 1, i10 + i12) - max2;
            if (min2 >= f12) {
                cc.b bVar2 = (cc.b) this.f7872b;
                hc.b bVar3 = new hc.b(bVar2, max, max2, min, min2, f10);
                int i13 = bVar3.f14125e;
                int i14 = bVar3.f14124c;
                int i15 = i13 + i14;
                int i16 = bVar3.f14126f;
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
                ArrayList arrayList = bVar3.f14123b;
                if (!arrayList.isEmpty()) {
                    return (hc.a) arrayList.get(0);
                }
                throw bc.e.a();
            }
            throw bc.e.a();
        }
        throw bc.e.a();
    }

    @Override
    public void x(b3.m mVar, long j3, long j10) {
        boolean z10;
        o2.d dVar = (o2.d) this.f7872b;
        synchronized (c3.b.f4361b) {
            z10 = c3.b.f4362c;
        }
        if (!z10) {
            dVar.f21706a.y(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.b();
    }

    @Override
    public void x2(int i7, int i10, CharSequence charSequence, boolean z10) {
        hi.h hVar = ((hi.n) this.f7872b).f14936f;
        if (hVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hVar.getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z10) {
                j6.l(spannableStringBuilder, hVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            hVar.setText(spannableStringBuilder);
            hVar.setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        nh0 C;
        boolean[] zArr = (boolean[]) this.f7872b;
        if (z10 && (C = imageReceiver.C()) != null && !zArr[0]) {
            C.N(0, false, false);
            g0.g3(new org.telegram.ui.Cells.p0(C, 0));
            zArr[0] = true;
        }
    }

    public f3.j z() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (f3.j jVar : ((LinkedHashMap) this.f7872b).values()) {
            arrayList.add(jVar.f11164b);
            arrayList2.add(jVar.f11165c);
            arrayList3.add(jVar.d);
            arrayList4.add(jVar.f11166e);
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
        ma.d(j3, "the total number of elements (%s) in the arrays must fit in an int", z10);
        int[] iArr3 = new int[i7];
        int i10 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i10, iArr4.length);
            i10 += iArr4.length;
        }
        return new f3.j(iArr3, c8.m1.a((long[][]) arrayList2.toArray(new long[arrayList2.size()])), c8.m1.a((long[][]) arrayList3.toArray(new long[arrayList3.size()])), c8.m1.a((long[][]) arrayList4.toArray(new long[arrayList4.size()])));
    }

    public i(e0 e0Var) {
        this.f7871a = 10;
        this.f7872b = new WeakReference(e0Var);
    }

    public i(e7.a aVar, v vVar) {
        this.f7871a = 17;
        this.f7872b = vVar;
    }

    public i(Object obj, int i7) {
        this.f7871a = i7;
        this.f7872b = obj;
    }

    public i(int i7) {
        this.f7871a = i7;
        switch (i7) {
            case 9:
                this.f7872b = Collections.newSetFromMap(new WeakHashMap());
                return;
            case 18:
                this.f7872b = new LinkedHashMap();
                return;
            case 21:
                this.f7872b = new i(26);
                return;
            case 26:
                this.f7872b = new ob.c(ec.a.h, 18);
                return;
            default:
                this.f7872b = new HashMap();
                return;
        }
    }

    public i(Context context) {
        String e10;
        this.f7871a = 0;
        b a10 = b.a(context);
        this.f7872b = a10;
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

    public i(LaunchActivity launchActivity, Executor executor, n1 n1Var) {
        this.f7871a = 2;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s5 = launchActivity.s();
            z zVar = (z) new a0(launchActivity).j(z.class);
            this.f7872b = s5;
            zVar.d = executor;
            zVar.f1943e = n1Var;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void E2(String str) {
    }

    @Override
    public void b(x1 x1Var) {
    }

    @Override
    public void c(boolean z10) {
    }

    @Override
    public void r(ImageReceiver imageReceiver) {
    }

    @Override
    public void J(int i7, Drawable drawable) {
    }

    @Override
    public void G1(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void a0(TLRPC.BotInlineResult botInlineResult, boolean z10, int i7) {
    }

    @Override
    public void m(b3.m mVar, long j3, long j10, boolean z10) {
    }

    @Override
    public void t(b3.m mVar, long j3, long j10, int i7) {
    }
}
