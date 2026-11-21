package ob;

import a0.h;
import a8.la;
import a8.m8;
import aa.f0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.s;
import androidx.lifecycle.a0;
import bi.m3;
import c4.d;
import c8.c0;
import ca.r;
import ch.p0;
import ci.b0;
import ci.j0;
import ci.z0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import d8.f;
import di.f6;
import f6.o;
import fi.w8;
import fi.z3;
import g9.k;
import gb.k0;
import gb.u0;
import gf.p;
import h2.x;
import h9.e1;
import h9.h1;
import hi.l0;
import hi.u9;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import kd.j;
import og.n;
import org.json.JSONObject;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.qo0;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.dr0;
import sg.t0;
public final class c implements a0, androidx.activity.result.b, ce.c, wi0, ci.a0, g0, d, q, qo0, dr0, OnSuccessListener, ib.b, k, n, t0 {
    public final int f21804a;
    public Object f21805b;

    public c(Object obj, int i7) {
        this.f21804a = i7;
        this.f21805b = obj;
    }

    @Override
    public void A(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: ob.c.A(java.lang.Object):void");
    }

    public o C() {
        o oVar = (o) this.f21805b;
        if (oVar.f11461a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.f11464e)) {
                if (!Double.isNaN(oVar.f11465f) && oVar.f11465f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    @Override
    public void D0() {
        gc k10 = ((f6) this.f21805b).k().k(false);
        k10.f35518t = true;
        k10.j();
    }

    @Override
    public boolean E() {
        return false;
    }

    public int F(int[] iArr, int i7) {
        int[] iArr2;
        int[] iArr3;
        int i10;
        int i11;
        int i12;
        ec.a aVar = (ec.a) this.f21805b;
        if (iArr.length != 0) {
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i13 = 1;
                while (i13 < length && iArr[i13] == 0) {
                    i13++;
                }
                if (i13 == length) {
                    iArr2 = new int[]{0};
                } else {
                    int i14 = length - i13;
                    int[] iArr4 = new int[i14];
                    System.arraycopy(iArr, i13, iArr4, 0, i14);
                    iArr2 = iArr4;
                }
            } else {
                iArr2 = iArr;
            }
            int[] iArr5 = new int[i7];
            boolean z10 = true;
            for (int i15 = 0; i15 < i7; i15++) {
                int i16 = aVar.f10907a[aVar.f10912g + i15];
                if (i16 == 0) {
                    i12 = iArr2[iArr2.length - 1];
                } else {
                    if (i16 == 1) {
                        i11 = 0;
                        for (int i17 : iArr2) {
                            ec.a aVar2 = ec.a.h;
                            i11 ^= i17;
                        }
                    } else {
                        i11 = iArr2[0];
                        int length2 = iArr2.length;
                        for (int i18 = 1; i18 < length2; i18++) {
                            i11 = aVar.c(i16, i11) ^ iArr2[i18];
                        }
                    }
                    i12 = i11;
                }
                iArr5[(i7 - 1) - i15] = i12;
                if (i12 != 0) {
                    z10 = false;
                }
            }
            if (z10) {
                return 0;
            }
            ec.b bVar = new ec.b(aVar, iArr5);
            ec.b a10 = aVar.a(i7, 1);
            ec.b bVar2 = aVar.f10909c;
            if (a10.d() >= bVar.d()) {
                a10 = bVar;
                bVar = a10;
            }
            ec.b bVar3 = aVar.d;
            ec.b bVar4 = a10;
            ec.b bVar5 = bVar;
            ec.b bVar6 = bVar4;
            ec.b bVar7 = bVar2;
            while (bVar6.d() * 2 >= i7) {
                if (!bVar6.e()) {
                    int b10 = aVar.b(bVar6.c(bVar6.d()));
                    ec.b bVar8 = bVar2;
                    while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                        int d = bVar5.d() - bVar6.d();
                        int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                        bVar8 = bVar8.a(aVar.a(d, c10));
                        bVar5 = bVar5.a(bVar6.h(d, c10));
                    }
                    ec.b a11 = bVar8.g(bVar3).a(bVar7);
                    if (bVar5.d() < bVar6.d()) {
                        ec.b bVar9 = bVar5;
                        bVar5 = bVar6;
                        bVar6 = bVar9;
                        bVar7 = bVar3;
                        bVar3 = a11;
                    } else {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
                    }
                } else {
                    throw new Exception("r_{i-1} was zero");
                }
            }
            int c11 = bVar3.c(0);
            if (c11 != 0) {
                int b11 = aVar.b(c11);
                ec.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
                ec.b bVar10 = bVarArr[0];
                ec.b bVar11 = bVarArr[1];
                int d2 = bVar10.d();
                if (d2 == 1) {
                    iArr3 = new int[]{bVar10.c(1)};
                } else {
                    int[] iArr6 = new int[d2];
                    int i19 = 0;
                    for (int i20 = 1; i20 < aVar.f10910e && i19 < d2; i20++) {
                        if (bVar10.b(i20) == 0) {
                            iArr6[i19] = aVar.b(i20);
                            i19++;
                        }
                    }
                    if (i19 == d2) {
                        iArr3 = iArr6;
                    } else {
                        throw new Exception("Error locator degree does not match number of roots");
                    }
                }
                int length3 = iArr3.length;
                int[] iArr7 = new int[length3];
                for (int i21 = 0; i21 < length3; i21++) {
                    int b12 = aVar.b(iArr3[i21]);
                    int i22 = 1;
                    for (int i23 = 0; i23 < length3; i23++) {
                        if (i21 != i23) {
                            int c12 = aVar.c(iArr3[i23], b12);
                            if ((c12 & 1) == 0) {
                                i10 = c12 | 1;
                            } else {
                                i10 = c12 & (-2);
                            }
                            i22 = aVar.c(i22, i10);
                        }
                    }
                    int c13 = aVar.c(bVar11.b(b12), aVar.b(i22));
                    iArr7[i21] = c13;
                    if (aVar.f10912g != 0) {
                        iArr7[i21] = aVar.c(c13, b12);
                    }
                }
                for (int i24 = 0; i24 < iArr3.length; i24++) {
                    int length4 = iArr.length - 1;
                    int i25 = iArr3[i24];
                    if (i25 != 0) {
                        int i26 = length4 - aVar.f10908b[i25];
                        if (i26 >= 0) {
                            iArr[i26] = iArr[i26] ^ iArr7[i24];
                        } else {
                            throw new Exception("Bad error location");
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                return iArr3.length;
            }
            throw new Exception("sigmaTilde(0) was zero");
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void G0(fj fjVar) {
        ((w8) ((z3) this.f21805b).A1).f(true);
    }

    @Override
    public void H(fj fjVar) {
        ((w8) ((z3) this.f21805b).A1).f(false);
    }

    public synchronized void I() {
        ((SharedPreferences) this.f21805b).edit().clear().commit();
    }

    public SparseIntArray J(long j3) {
        return (SparseIntArray) ((h) this.f21805b).f(j3);
    }

    public StringBuilder K() {
        mf.a aVar = (mf.a) this.f21805b;
        if (aVar instanceof p) {
            StringBuilder sb2 = ((p) aVar).f13632b.f13617b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    public void L(ia.c cVar, Thread thread, Throwable th2) {
        aa.p pVar = (aa.p) this.f21805b;
        synchronized (pVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            c0.a();
            try {
                f0.a(pVar.f833e.f3100a.b(new aa.n(pVar, System.currentTimeMillis(), th2, thread, cVar)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }

    public e2.q0 M(f3.p r12, t3.g r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: ob.c.M(f3.p, t3.g, int):e2.q0");
    }

    @Override
    public void a() {
        i0 i0Var = (i0) this.f21805b;
        Lock lock = i0Var.f6323a;
        lock.lock();
        try {
            i0Var.f6332m = new com.google.android.gms.common.api.internal.c0(i0Var, i0Var.f6329j, i0Var.f6330k, i0Var.d, i0Var.f6331l, lock, i0Var.f6325c);
            i0Var.f6332m.u();
            i0Var.f6324b.signalAll();
        } finally {
            i0Var.f6323a.unlock();
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        d8.d dVar = new d8.d(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i7 = d8.a.f7910a;
        obtain.writeStrongBinder(dVar);
        obtain.writeInt(1);
        ((o8.c) this.f21805b).writeToParcel(obtain, 0);
        ((d8.c) ((f) obj).n()).h1(obtain, 1);
    }

    @Override
    public Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        h1 h1Var = (h1) this.f21805b;
        h1Var.getClass();
        entry.getClass();
        return new e1(entry, h1Var);
    }

    @Override
    public com.google.android.gms.common.api.internal.d b(com.google.android.gms.common.api.internal.d dVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    public void c(b0 b0Var) {
        j0 j0Var = (j0) this.f21805b;
        FrameLayout frameLayout = j0Var.f5708f;
        if (frameLayout != null) {
            frameLayout.removeView(b0Var);
        }
        if (j0Var.G == b0Var) {
            j0Var.G = null;
        }
        z0 z0Var = j0Var.d;
        if (z0Var != null) {
            z0Var.setScanHidden(false);
        }
    }

    @Override
    public int d(long j3) {
        if (j3 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public void e0() {
        u9 u9Var = (u9) this.f21805b;
        u9Var.f14890n0.f57312a.u();
        u9Var.N0.setViewHidden(false);
    }

    @Override
    public void f(Object obj) {
        Bundle extras;
        switch (this.f21804a) {
            case 6:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f21805b;
                androidx.fragment.app.f0 f0Var = (androidx.fragment.app.f0) j0Var.F.pollLast();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str = f0Var.f2346a;
                int i7 = f0Var.f2347b;
                s o4 = j0Var.f2360c.o(str);
                if (o4 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                    return;
                }
                o4.x(i7, aVar.f1812a, aVar.f1813b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f21805b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f1813b;
                int i10 = u.e("ProxyBillingActivityV2", intent).f11312a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i10, extras);
                }
                int i11 = aVar2.f1812a;
                if (i11 != -1 || i10 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public TextureView f0() {
        return null;
    }

    @Override
    public void g(View view, p0 p0Var, boolean z10, boolean z11) {
        ch.s sVar = (ch.s) this.f21805b;
        sVar.f5535a.Eb(null, sVar.f5538e, sVar.f5536b, view, 0.0f, 0.0f, p0Var, false, z10, z11, false);
        org.telegram.messenger.g0.g3(new r(this, 2));
    }

    @Override
    public Object mo24get() {
        return new k0((u0) ((ib.c) this.f21805b).mo24get());
    }

    @Override
    public long h(int i7) {
        boolean z10;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        return 0L;
    }

    @Override
    public void i(String str) {
        j0 j0Var = (j0) this.f21805b;
        if (j0Var.getParentActivity() != null) {
            vf.c.t(j0Var.getParentActivity(), str);
        }
    }

    @Override
    public void k() {
        m3 m3Var = ((u9) this.f21805b).f14913z0;
        if (m3Var != null) {
            m3Var.invalidate();
        }
    }

    @Override
    public List m(long j3) {
        if (j3 >= 0) {
            return (List) this.f21805b;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public void n() {
        u9 u9Var = (u9) this.f21805b;
        if (u9Var.M0) {
            u9Var.M0 = false;
            return;
        }
        u9Var.U0.b(1);
        u9Var.w((sg.h) sg.h.f57255a.get(0));
    }

    @Override
    public void n0() {
        u9 u9Var = (u9) this.f21805b;
        if (u9Var.f14901t0 != null) {
            u9Var.A0(null, true);
        }
        u9Var.N0.setViewHidden(true);
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    public void onSuccess(Object obj) {
        ((g6.a) this.f21805b).getClass();
        m8.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public int p() {
        return 1;
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public void r() {
        ((l0) this.f21805b).d.invalidate();
    }

    @Override
    public boolean t() {
        return true;
    }

    @Override
    public void u() {
        i0 i0Var = (i0) this.f21805b;
        for (com.google.android.gms.common.api.c cVar : i0Var.f6327f.values()) {
            cVar.a();
        }
        i0Var.f6334o.G = Collections.EMPTY_SET;
    }

    @Override
    public java.lang.Object v(ce.d r7, kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: ob.c.v(ce.d, kd.c):java.lang.Object");
    }

    @Override
    public boolean y() {
        boolean z10;
        u9 u9Var = (u9) this.f21805b;
        if (u9Var.f14901t0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            u9Var.A0(null, true);
        }
        return z10;
    }

    public c(MediaInfo mediaInfo) {
        this.f21804a = 21;
        o oVar = new o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f21805b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public c(Set set) {
        this.f21804a = 0;
        this.f21805b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            ((HashMap) this.f21805b).put(a.class, bVar.f21803a);
        }
    }

    public c(JSONObject jSONObject) {
        this.f21804a = 21;
        this.f21805b = new o(jSONObject);
    }

    public c(int i7) {
        this.f21804a = i7;
        switch (i7) {
            case 8:
                this.f21805b = new h();
                return;
            case 17:
                return;
            case 19:
                this.f21805b = new x(10);
                return;
            default:
                this.f21805b = new LinkedHashMap(0, 0.75f, true);
                return;
        }
    }

    public c(Context context) {
        boolean isEmpty;
        this.f21804a = 2;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f21805b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                I();
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    @Override
    public void G() {
    }

    @Override
    public void Q() {
    }

    @Override
    public void j() {
    }

    @Override
    public void z() {
    }

    @Override
    public void D(boolean z10) {
    }

    @Override
    public void e(Bundle bundle) {
    }

    @Override
    public void s(int i7) {
    }

    @Override
    public void w(boolean z10) {
    }

    public c(rd.p pVar) {
        this.f21804a = 9;
        this.f21805b = (j) pVar;
    }

    @Override
    public void l(n6.a aVar, e eVar, boolean z10) {
    }

    @Override
    public void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
