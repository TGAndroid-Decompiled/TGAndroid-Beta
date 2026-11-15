package d6;

import a8.ja;
import a8.m1;
import a8.m8;
import a8.n1;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.biometric.p;
import androidx.biometric.t;
import androidx.biometric.v;
import androidx.fragment.app.f0;
import androidx.fragment.app.k0;
import bi.o2;
import ch.p0;
import ch.r;
import ci.z;
import ci.z0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import di.c6;
import f6.o;
import fi.b4;
import fi.z8;
import gb.u0;
import h2.x;
import h9.e1;
import h9.g1;
import hi.d0;
import hi.d7;
import hi.e0;
import hi.ga;
import hi.h5;
import hi.ia;
import hi.j0;
import hi.sa;
import hi.u9;
import hi.wa;
import hi.x5;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import og.n;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.br0;
import sg.t0;
import tg.r1;
public final class i implements SuccessContinuation, androidx.activity.result.b, ce.c, li0, z, g0, com.google.android.gms.internal.clearcut.g, c4.d, q, fo0, br0, OnSuccessListener, ib.b, g9.k, n, t0, wa, i6.a {
    public static i f7593c;
    public final int f7594a;
    public Object f7595b;

    public i(int i7) {
        this.f7594a = i7;
    }

    public static synchronized i V(Context context) {
        i a02;
        synchronized (i.class) {
            a02 = a0(context.getApplicationContext());
        }
        return a02;
    }

    public static synchronized i a0(Context context) {
        synchronized (i.class) {
            i iVar = f7593c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            f7593c = iVar2;
            return iVar2;
        }
    }

    @Override
    public void A(boolean z10) {
        x5 x5Var = (x5) this.f7595b;
        if (x5Var.j()) {
            x5Var.F.getClass();
        }
        x5Var.x(-4, z10);
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public boolean C() {
        return true;
    }

    @Override
    public void D(float f10, int i7) {
        ArrayList arrayList;
        x5 x5Var = (x5) this.f7595b;
        d7 d7Var = x5Var.d;
        if (d7Var != null && (arrayList = d7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((d7) x5Var.d.T.get(i7)).P = f10;
        }
    }

    @Override
    public void E() {
        i0 i0Var = (i0) this.f7595b;
        for (com.google.android.gms.common.api.c cVar : i0Var.f6015f.values()) {
            cVar.a();
        }
        i0Var.f6022o.G = Collections.EMPTY_SET;
    }

    @Override
    public void F() {
        ((j0) this.f7595b).d.invalidate();
    }

    @Override
    public java.lang.Object G(ce.d r7, kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: d6.i.G(ce.d, kd.c):java.lang.Object");
    }

    @Override
    public void G0(gj gjVar) {
        ((z8) ((b4) this.f7595b).A1).f(true);
    }

    @Override
    public void H(float f10) {
        x5 x5Var = (x5) this.f7595b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.P = f10;
        x5Var.c();
    }

    @Override
    public void I(gj gjVar) {
        ((z8) ((b4) this.f7595b).A1).f(false);
    }

    @Override
    public boolean L() {
        return false;
    }

    public void N(m6.n nVar, v vVar) {
        k0 k0Var = (k0) this.f7595b;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            k0 k0Var2 = (k0) this.f7595b;
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
            androidx.biometric.z zVar = qVar.m0;
            zVar.f1974f = nVar;
            int i7 = nVar.f20517a;
            if (i7 == 0) {
                if (vVar != null) {
                    i7 = 15;
                } else {
                    i7 = 255;
                }
            }
            if (Build.VERSION.SDK_INT < 30 && i7 == 15 && vVar == null) {
                zVar.f1975g = n1.a();
            } else {
                zVar.f1975g = vVar;
            }
            if (qVar.Q()) {
                qVar.m0.f1978k = qVar.q(2131689577);
            } else {
                qVar.m0.f1978k = null;
            }
            if (qVar.Q() && new a0(new t(k10)).c(255) != 0) {
                qVar.m0.f1981n = true;
                qVar.S();
            } else if (qVar.m0.f1983p) {
                qVar.f1963l0.postDelayed(new p(qVar), 600L);
            } else {
                qVar.X();
            }
        }
    }

    @Override
    public void O(long j3) {
        x5 x5Var = (x5) this.f7595b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.f14160r0 = j3;
        d7Var.f14144j = true;
        x5Var.y(true);
    }

    public o P() {
        o oVar = (o) this.f7595b;
        if (oVar.f11115a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.f11118e)) {
                if (!Double.isNaN(oVar.f11119f) && oVar.f11119f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public int R(int[] iArr, int i7) {
        int[] iArr2;
        int[] iArr3;
        int i10;
        int i11;
        int i12;
        ec.a aVar = (ec.a) this.f7595b;
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
                int i16 = aVar.f10563a[aVar.f10568g + i15];
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
            ec.b bVar2 = aVar.f10565c;
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
                    for (int i20 = 1; i20 < aVar.f10566e && i19 < d2; i20++) {
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
                    if (aVar.f10568g != 0) {
                        iArr7[i21] = aVar.c(c13, b12);
                    }
                }
                for (int i24 = 0; i24 < iArr3.length; i24++) {
                    int length4 = iArr.length - 1;
                    int i25 = iArr3[i24];
                    if (i25 != 0) {
                        int i26 = length4 - aVar.f10564b[i25];
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
    public void S(boolean z10) {
        r1 r1Var;
        sa saVar = ((ga) ((x5) this.f7595b)).D0;
        u9 u9Var = saVar.f15107w1;
        if (u9Var != null) {
            r1 r1Var2 = null;
            if (!z10 && (u9Var.getSelectedEntity() instanceof r1)) {
                saVar.f15107w1.A0(null, true);
            } else if (z10 && !(saVar.f15107w1.getSelectedEntity() instanceof r1)) {
                h5 h5Var = saVar.f15107w1.B0;
                int i7 = 0;
                int i10 = 0;
                while (true) {
                    if (i10 < h5Var.getChildCount()) {
                        View childAt = h5Var.getChildAt(i10);
                        if (childAt instanceof r1) {
                            r1Var = (r1) childAt;
                            break;
                        }
                        i10++;
                    } else {
                        r1Var = null;
                        break;
                    }
                }
                if (r1Var != null) {
                    u9 u9Var2 = saVar.f15107w1;
                    h5 h5Var2 = u9Var2.B0;
                    while (true) {
                        if (i7 >= h5Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = h5Var2.getChildAt(i7);
                        if (childAt2 instanceof r1) {
                            r1Var2 = (r1) childAt2;
                            break;
                        }
                        i7++;
                    }
                    u9Var2.A0(r1Var2, true);
                }
            }
        }
    }

    public StringBuilder T() {
        mf.a aVar = (mf.a) this.f7595b;
        if (aVar instanceof gf.p) {
            StringBuilder sb2 = ((gf.p) aVar).f13291b.f13276b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    public e2.q0 U(f3.p r12, t3.g r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: d6.i.U(f3.p, t3.g, int):e2.q0");
    }

    @Override
    public void X(float f10, int i7) {
        ArrayList arrayList;
        x5 x5Var = (x5) this.f7595b;
        d7 d7Var = x5Var.d;
        if (d7Var != null && (arrayList = d7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((d7) x5Var.d.T.get(i7)).V = f10;
        }
    }

    @Override
    public void Y(float f10) {
        x5 x5Var = (x5) this.f7595b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.F = f10;
        d7Var.f14144j = true;
        x5Var.w(true);
    }

    public synchronized void Z() {
        synchronized (this) {
            b bVar = (b) this.f7595b;
            ReentrantLock reentrantLock = bVar.f7576a;
            reentrantLock.lock();
            bVar.f7577b.edit().clear().apply();
            reentrantLock.unlock();
        }
    }

    @Override
    public void a() {
        i0 i0Var = (i0) this.f7595b;
        Lock lock = i0Var.f6011a;
        lock.lock();
        try {
            i0Var.f6020m = new c0(i0Var, i0Var.f6017j, i0Var.f6018k, i0Var.d, i0Var.f6019l, lock, i0Var.f6013c);
            i0Var.f6020m.E();
            i0Var.f6012b.signalAll();
        } finally {
            i0Var.f6011a.unlock();
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        d8.d dVar = new d8.d(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i7 = d8.a.f7598a;
        obtain.writeStrongBinder(dVar);
        obtain.writeInt(1);
        ((o8.c) this.f7595b).writeToParcel(obtain, 0);
        ((d8.c) ((d8.f) obj).n()).h1(obtain, 1);
    }

    @Override
    public Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        g1 g1Var = (g1) this.f7595b;
        g1Var.getClass();
        entry.getClass();
        return new e1(entry, g1Var);
    }

    @Override
    public com.google.android.gms.common.api.internal.d b(com.google.android.gms.common.api.internal.d dVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    public int d(long j3) {
        if (j3 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public void e(int i7) {
        e0 e0Var = ((x5) this.f7595b).F;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d0 d0Var = (d0) obj;
                if (d0Var.f14072a == i7) {
                    d0Var.f14073b.e(true, 1.0f);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public void f(Object obj) {
        int i7;
        Bundle extras;
        switch (this.f7594a) {
            case 3:
                Map map = (Map) obj;
                androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f7595b;
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
                String str = f0Var.f2339a;
                if (j0Var.f2353c.o(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f7595b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f1802b;
                int i11 = u.e("ProxyBillingActivityV2", intent).f10978a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i11, extras);
                }
                int i12 = aVar.f1801a;
                if (i12 != -1 || i11 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public void f0(float f10) {
        x5 x5Var = (x5) this.f7595b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.E = f10;
        d7Var.f14144j = true;
        x5Var.w(true);
    }

    @Override
    public void g(ci.a0 a0Var) {
        ci.i0 i0Var = (ci.i0) this.f7595b;
        FrameLayout frameLayout = i0Var.f5393f;
        if (frameLayout != null) {
            frameLayout.removeView(a0Var);
        }
        if (i0Var.G == a0Var) {
            i0Var.G = null;
        }
        z0 z0Var = i0Var.d;
        if (z0Var != null) {
            z0Var.setScanHidden(false);
        }
    }

    @Override
    public TextureView g0() {
        return null;
    }

    @Override
    public Object mo24get() {
        return new gb.k0((u0) ((ib.c) this.f7595b).mo24get());
    }

    @Override
    public void h(View view, p0 p0Var, boolean z10, boolean z11) {
        r rVar = (r) this.f7595b;
        rVar.f5214a.Eb(null, rVar.f5217e, rVar.f5215b, view, 0.0f, 0.0f, p0Var, false, z10, z11, false);
        org.telegram.messenger.g0.h3(new a3.f(this, 28));
    }

    @Override
    public void h0() {
        u9 u9Var = (u9) this.f7595b;
        u9Var.f14679n0.f56697a.C();
        u9Var.N0.setViewHidden(false);
    }

    @Override
    public long i(int i7) {
        boolean z10;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        return 0L;
    }

    @Override
    public void i0(float f10, int i7) {
        ArrayList arrayList;
        x5 x5Var = (x5) this.f7595b;
        d7 d7Var = x5Var.d;
        if (d7Var != null && (arrayList = d7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((d7) x5Var.d.T.get(i7)).W = f10;
        }
    }

    @Override
    public void j(String str) {
        ci.i0 i0Var = (ci.i0) this.f7595b;
        if (i0Var.getParentActivity() != null) {
            vf.c.t(i0Var.getParentActivity(), str);
        }
    }

    @Override
    public void j0(float f10) {
        d7 d7Var = ((x5) this.f7595b).d;
        if (d7Var == null) {
            return;
        }
        d7Var.f14124a0 = f10;
        d7Var.f14144j = true;
    }

    @Override
    public void k(float f10) {
        x5 x5Var = (x5) this.f7595b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.f14166u0 = f10;
        d7Var.f14144j = true;
        x5Var.c();
    }

    @Override
    public void k0() {
        ((x5) this.f7595b).q(null);
    }

    @Override
    public void n(float f10) {
        x5 x5Var = (x5) this.f7595b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.G = f10;
        d7Var.f14144j = true;
        x5Var.c();
    }

    @Override
    public void o() {
        o2 o2Var = ((u9) this.f7595b).f14702z0;
        if (o2Var != null) {
            o2Var.invalidate();
        }
    }

    @Override
    public void o0(float f10) {
        x5 x5Var = (x5) this.f7595b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.f14164t0 = f10;
        d7Var.f14144j = true;
        x5Var.y(true);
    }

    @Override
    public void onSuccess(Object obj) {
        ((g6.a) this.f7595b).getClass();
        m8.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public void p(long j3, boolean z10) {
        x5 x5Var = (x5) this.f7595b;
        if (!z10) {
            x5Var.m(j3);
            return;
        }
        u51 u51Var = x5Var.f15345e;
        if (u51Var != null) {
            u51Var.q0(j3, true);
        } else if (x5Var.j()) {
            x5Var.F.m(j3, true);
        } else {
            u51 u51Var2 = x5Var.E;
            if (u51Var2 != null) {
                u51Var2.q0(j3, false);
            }
        }
    }

    @Override
    public List q(long j3) {
        if (j3 >= 0) {
            return (List) this.f7595b;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public void q0() {
        u9 u9Var = (u9) this.f7595b;
        if (u9Var.f14690t0 != null) {
            u9Var.A0(null, true);
        }
        u9Var.N0.setViewHidden(true);
    }

    @Override
    public boolean r() {
        return true;
    }

    @Override
    public void s() {
        x5 x5Var = (x5) this.f7595b;
        x5Var.s(null, null, true);
        sa saVar = ((ga) x5Var).D0;
        ga gaVar = saVar.Y0;
        if (gaVar != null) {
            gaVar.s(null, null, true);
        }
        u9 u9Var = saVar.f15107w1;
        if (u9Var != null) {
            u9Var.n0();
        }
        ia iaVar = saVar.f15048d1;
        if (iaVar != null) {
            iaVar.setHasRoundVideo(false);
        }
        d7 d7Var = saVar.L1;
        if (d7Var != null) {
            File file = d7Var.f14154o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                saVar.L1.f14154o0 = null;
            }
            if (saVar.L1.f14156p0 != null) {
                try {
                    new File(saVar.L1.f14156p0).delete();
                } catch (Exception unused2) {
                }
                saVar.L1.f14156p0 = null;
            }
        }
    }

    @Override
    public void s0(int i7, long j3) {
        ArrayList arrayList;
        x5 x5Var = (x5) this.f7595b;
        d7 d7Var = x5Var.d;
        if (d7Var != null && (arrayList = d7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((d7) x5Var.d.T.get(i7)).X = j3;
        }
    }

    @Override
    public void t() {
        u9 u9Var = (u9) this.f7595b;
        if (u9Var.M0) {
            u9Var.M0 = false;
            return;
        }
        u9Var.U0.b(1);
        u9Var.w((sg.h) sg.h.f56640a.get(0));
    }

    @Override
    public void t0(long j3) {
        x5 x5Var = (x5) this.f7595b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.D = j3;
        d7Var.f14144j = true;
        x5Var.w(true);
    }

    @Override
    public Task then(Object obj) {
        ia.b bVar = (ia.b) obj;
        q4.q qVar = (q4.q) this.f7595b;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        aa.p pVar = (aa.p) qVar.f55253c;
        aa.p.b((aa.p) qVar.f55253c);
        pVar.f841m.h(null, pVar.f834e.f3090a);
        pVar.f845q.trySetResult(null);
        return Tasks.forResult(null);
    }

    @Override
    public int u() {
        return 1;
    }

    @Override
    public void v(boolean z10, float f10) {
        x5 x5Var = (x5) this.f7595b;
        d7 d7Var = x5Var.d;
        if (d7Var != null) {
            d7Var.Z = f10;
            d7Var.f14144j = true;
            u51 u51Var = x5Var.f15345e;
            if (u51Var != null && u51Var.U() != -9223372036854775807L) {
                x5Var.m(f10 * ((float) x5Var.f15345e.U()));
            }
        }
    }

    @Override
    public void w(float f10) {
        x5 x5Var = (x5) this.f7595b;
        d7 d7Var = x5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.f14162s0 = f10;
        d7Var.f14144j = true;
        x5Var.y(true);
    }

    @Override
    public void x(Bitmap bitmap) {
        ((i6.h) this.f7595b).e(3, bitmap);
    }

    @Override
    public void x0() {
        xb k10 = ((c6) this.f7595b).k().k(false);
        k10.f41653t = true;
        k10.j();
    }

    @Override
    public boolean z() {
        boolean z10;
        u9 u9Var = (u9) this.f7595b;
        if (u9Var.f14690t0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            u9Var.A0(null, true);
        }
        return z10;
    }

    @Override
    public Object zzp() {
        Object obj;
        boolean z10;
        String str = (String) this.f7595b;
        ContentResolver contentResolver = com.google.android.gms.internal.clearcut.d.f6523g.getContentResolver();
        Uri uri = d2.f6538a;
        synchronized (d2.class) {
            d2.c(contentResolver);
            obj = d2.f6546k;
        }
        HashMap hashMap = d2.f6543g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) d2.a(hashMap, str, bool);
        if (bool2 != null) {
            z10 = bool2.booleanValue();
        } else {
            String b10 = d2.b(contentResolver, str);
            boolean z11 = false;
            if (b10 != null && !b10.equals("")) {
                if (d2.f6540c.matcher(b10).matches()) {
                    bool = Boolean.TRUE;
                    z11 = true;
                } else if (!d2.d.matcher(b10).matches()) {
                    Log.w("Gservices", r.b.l("attempt to read gservices key ", str, " (value \"", b10, "\") as boolean"));
                }
                d2.e(obj, hashMap, str, bool);
                z10 = z11;
            }
            bool = bool2;
            d2.e(obj, hashMap, str, bool);
            z10 = z11;
        }
        return Boolean.valueOf(z10);
    }

    public i(Object obj, int i7) {
        this.f7594a = i7;
        this.f7595b = obj;
    }

    public i(Context context) {
        String e10;
        this.f7594a = 0;
        b a10 = b.a(context);
        this.f7595b = a10;
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

    public i(MediaInfo mediaInfo) {
        this.f7594a = 18;
        o oVar = new o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f7595b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public i(JSONObject jSONObject) {
        this.f7594a = 18;
        this.f7595b = new o(jSONObject);
    }

    public i() {
        this.f7594a = 16;
        this.f7595b = new x(10);
    }

    public i(rd.p pVar) {
        this.f7594a = 5;
        this.f7595b = (kd.j) pVar;
    }

    public i(LaunchActivity launchActivity, Executor executor, m1 m1Var) {
        this.f7594a = 2;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s5 = launchActivity.s();
            androidx.biometric.z zVar = (androidx.biometric.z) new a0(launchActivity).j(androidx.biometric.z.class);
            this.f7595b = s5;
            zVar.d = executor;
            zVar.f1973e = m1Var;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void D0() {
    }

    @Override
    public void K() {
    }

    @Override
    public void W() {
    }

    @Override
    public void m() {
    }

    @Override
    public void M(boolean z10) {
    }

    @Override
    public void c(Bundle bundle) {
    }

    @Override
    public void m0(boolean z10) {
    }

    @Override
    public void y(int i7) {
    }

    @Override
    public void l(n6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override
    public void J(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
