package of;

import a3.h0;
import a3.j0;
import a3.l0;
import ai.ic;
import ai.jc;
import ai.r5;
import ai.w5;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.animation.Animation;
import b2.p;
import b2.q;
import b2.x1;
import c5.e0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.f1;
import com.google.android.gms.internal.cast.f2;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.h;
import d6.j;
import e0.i0;
import e2.v;
import e9.a1;
import g2.i;
import g2.o;
import g6.n;
import i9.w;
import i9.y;
import ii.b4;
import ii.d6;
import ii.i1;
import ii.j3;
import ii.j4;
import ii.r;
import ii.t3;
import ii.u3;
import ii.v3;
import j$.util.Objects;
import j4.a0;
import j4.b0;
import j4.d0;
import j4.f0;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l5.t;
import le.k;
import le.l;
import m4.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y70;
import org.telegram.ui.PhotoViewer;
import p4.x;
import p4.z;
import z3.m;
public class b implements h, e0, s, OnCompleteListener, com.google.android.gms.internal.clearcut.h, cf.b, f6.a, g2.g, n, m, u3, a0, Continuation, le.f {
    public static volatile b d;
    public final int f15696a;
    public Object f15697b;
    public Object f15698c;

    public b(int i10, Object obj, Object obj2) {
        this.f15696a = i10;
        this.f15698c = obj;
        this.f15697b = obj2;
    }

    public static String J(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
        }
        return null;
    }

    public static b S() {
        b bVar;
        b bVar2 = d;
        if (bVar2 == null) {
            synchronized (b.class) {
                try {
                    bVar = d;
                    if (bVar == null) {
                        bVar = new b(0);
                        d = bVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bVar;
        }
        return bVar2;
    }

    @Override
    public void A() {
        ((k) this.f15697b).c((l) this.f15698c);
    }

    @Override
    public void B(d6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((d6.c) fVar).a());
    }

    @Override
    public void C(d6.f fVar, String str) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        Y(cVar);
    }

    @Override
    public void D() {
        b4 b4Var = ((r) this.f15698c).f11593s;
        if (b4Var != null) {
            int i10 = 0;
            b4Var.e(false, true);
            int i11 = b4Var.f11262b0;
            if (i11 != 2) {
                i10 = i11;
            }
            b4Var.f(i10, true);
        }
    }

    @Override
    public void E(String str, long j3, int i10, Object obj, long j10, long j11) {
        ((g6.m) this.f15698c).f9440g = null;
        n nVar = (n) this.f15697b;
        if (nVar != null) {
            nVar.E(str, j3, i10, obj, j10, j11);
        }
    }

    @Override
    public void F(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override
    public y70 G(View view) {
        r rVar = (r) this.f15698c;
        y70 y70Var = new y70(rVar, (f6) this.f15697b, view, false, false, true);
        rVar.H = y70Var;
        return y70Var;
    }

    public c5.e H() {
        if (((c5.n) this.f15697b) != null) {
            return new c5.e(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    @Override
    public void I() {
        r rVar = (r) this.f15698c;
        rVar.X();
        rVar.Y();
    }

    @Override
    public int K() {
        return 1;
    }

    @Override
    public void L(t3 t3Var, View view) {
        r rVar = (r) this.f15698c;
        y70 y70Var = new y70(rVar, (f6) this.f15697b, view, false, false, true);
        y70Var.Q = true;
        rVar.H = j4.c(y70Var, rVar.f26786b.f29096f0, rVar.getContext(), (f6) this.f15697b, t3Var, true);
    }

    @Override
    public void M(byte[] r19, int r20, int r21, z3.l r22, e2.h r23) {
        throw new UnsupportedOperationException("Method not decompiled: of.b.M(byte[], int, int, z3.l, e2.h):void");
    }

    public boolean N(int i10) {
        return ((q) this.f15697b).f3201a.get(i10);
    }

    public w O(byte[] bArr) {
        byte[] bArr2;
        lf.h hVar = (lf.h) this.f15698c;
        if (hVar != null && (bArr2 = (byte[]) hVar.f14230b) != null && Arrays.equals(bArr2, bArr)) {
            w wVar = (w) ((lf.h) this.f15698c).d;
            e2.d.h(wVar);
            return wVar;
        }
        i iVar = (i) this.f15697b;
        w a2 = ((y) iVar.f9366a).a(new com.google.firebase.messaging.h(1, iVar, bArr));
        this.f15698c = new lf.h(bArr, a2);
        return a2;
    }

    public void P(i2.g gVar) {
        synchronized (gVar) {
        }
        Handler handler = (Handler) this.f15697b;
        if (handler != null) {
            handler.post(new j0(this, gVar, 1));
        }
    }

    public fb.o Q(kb.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: of.b.Q(kb.a):fb.o");
    }

    public dc.b R() {
        if (((dc.b) this.f15698c) == null) {
            dc.f fVar = (dc.f) this.f15697b;
            int[] iArr = fVar.f7633c;
            cc.d dVar = fVar.f7631a;
            int i10 = dVar.f4202a;
            int i11 = dVar.f4203b;
            dc.b bVar = new dc.b(i10, i11);
            if (fVar.f7632b.length < i10) {
                fVar.f7632b = new byte[i10];
            }
            for (int i12 = 0; i12 < 32; i12++) {
                iArr[i12] = 0;
            }
            for (int i13 = 1; i13 < 5; i13++) {
                byte[] b10 = dVar.b((i11 * i13) / 5, fVar.f7632b);
                int i14 = (i10 * 4) / 5;
                for (int i15 = i10 / 5; i15 < i14; i15++) {
                    int i16 = (b10[i15] & 255) >> 3;
                    iArr[i16] = iArr[i16] + 1;
                }
            }
            int length = iArr.length;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < length; i20++) {
                int i21 = iArr[i20];
                if (i21 > i17) {
                    i19 = i20;
                    i17 = i21;
                }
                if (i21 > i18) {
                    i18 = i21;
                }
            }
            int i22 = 0;
            int i23 = 0;
            for (int i24 = 0; i24 < length; i24++) {
                int i25 = i24 - i19;
                int i26 = iArr[i24] * i25 * i25;
                if (i26 > i23) {
                    i22 = i24;
                    i23 = i26;
                }
            }
            if (i19 <= i22) {
                int i27 = i19;
                i19 = i22;
                i22 = i27;
            }
            if (i19 - i22 > length / 16) {
                int i28 = i19 - 1;
                int i29 = i28;
                int i30 = -1;
                while (i28 > i22) {
                    int i31 = i28 - i22;
                    int i32 = (i18 - iArr[i28]) * (i19 - i28) * i31 * i31;
                    if (i32 > i30) {
                        i29 = i28;
                        i30 = i32;
                    }
                    i28--;
                }
                int i33 = i29 << 3;
                byte[] a2 = dVar.a();
                for (int i34 = 0; i34 < i11; i34++) {
                    int i35 = i34 * i10;
                    for (int i36 = 0; i36 < i10; i36++) {
                        if ((a2[i35 + i36] & 255) < i33) {
                            int i37 = (i36 / 32) + (bVar.f7619c * i34);
                            int[] iArr2 = bVar.d;
                            iArr2[i37] = iArr2[i37] | (1 << (i36 & 31));
                        }
                    }
                }
                this.f15698c = bVar;
            } else {
                throw cc.e.a();
            }
        }
        return (dc.b) this.f15698c;
    }

    public boolean T() {
        if (((a) ((lf.h) this.f15697b).d) != null) {
            return true;
        }
        return false;
    }

    public void U(boolean z10, boolean z11, float f7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f15697b;
        w5 w5Var = (w5) this.f15698c;
        jc jcVar = w5Var.e;
        jc.B1 = f7;
        ic icVar = jcVar.f1120z0;
        if (icVar != null) {
            icVar.setSpeed(f7);
        }
        ai.f6.a0(w5Var.f1655l, z10);
        if (z11 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    public void V(Object obj) {
        Handler handler = (Handler) this.f15697b;
        if (handler != null) {
            handler.post(new h0(this, obj, SystemClock.elapsedRealtime(), 0));
        }
    }

    public void W(g gVar) {
        d dVar;
        g gVar2;
        Log.d("CAST_CONTROLLER", "set current media");
        lf.h hVar = (lf.h) this.f15697b;
        g gVar3 = (g) hVar.f14231c;
        if (b5.d.u()) {
            if (gVar3 != null || gVar != null) {
                if (gVar3 != null) {
                    ArrayList arrayList = gVar3.f15718a;
                    if (gVar != null && arrayList.size() == gVar.f15718a.size()) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            f a2 = gVar3.a(i10);
                            f a10 = gVar.a(i10);
                            if ((a2 == null && a10 == null) || (a2 != null && a10 != null && Objects.equals(a2.f15714a, a10.f15714a) && Objects.equals(a2.f15715b, a10.f15715b) && Objects.equals(a2.f15716c, a10.f15716c) && Objects.equals(a2.d, a10.d) && a2.e == a10.e && a2.f15717f == a10.f15717f)) {
                            }
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        if (((a) hVar.d) != null && gVar != null) {
            hVar.r(gVar);
        }
        if (((a) hVar.d) != null && (gVar2 = (g) hVar.f14231c) != null) {
            hVar.T(gVar2);
        }
        if (gVar != null && gVar.f15718a.size() > 0 && !gVar.a(0).f15714a.startsWith("audio/") && (dVar = (d) hVar.f14230b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) hVar.d;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.f15695g = 0;
            aVar.h = 0;
            aVar.p();
        }
        hVar.f14231c = gVar;
    }

    public void X(c5.n nVar) {
        this.f15697b = nVar;
        if (nVar.a() != null) {
            nVar.a().getClass();
            String str = nVar.a().d;
            if (str != null) {
                this.f15698c = str;
            }
        }
    }

    public void Y(d6.c cVar) {
        String str;
        String string;
        lf.h hVar = (lf.h) this.f15697b;
        if (cVar != null) {
            n6.l.e("Must be called from the main thread.");
            e6.h hVar2 = cVar.f7535j;
            String a2 = cVar.a();
            if (!TextUtils.isEmpty(a2) && hVar2 != null) {
                a aVar = (a) hVar.d;
                if (aVar == null || !TextUtils.equals(aVar.f15693c.a(), a2)) {
                    hVar.W(new a(cVar, (d6.g) this.f15698c, hVar2));
                    n6.l.e("Must be called from the main thread.");
                    CastDevice castDevice = cVar.f7536k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer t12 = PhotoViewer.t1();
                    d.i();
                    if (t12.E != null && t12.f31242e0 != null && t12.Q1()) {
                        xc xcVar = new xc(t12.f31242e0, new ai.d());
                        int i10 = R.raw.forward;
                        if (!TextUtils.isEmpty(str)) {
                            string = LocaleController.formatString(R.string.ChromecastStartedTo, str);
                        } else {
                            string = LocaleController.getString(R.string.ChromecastStarted);
                        }
                        xcVar.Q(i10, 36, string).j();
                    }
                }
            }
        }
    }

    public void Z(x1 x1Var) {
        Handler handler = (Handler) this.f15697b;
        if (handler != null) {
            handler.post(new a1.e(2, this, x1Var));
        }
    }

    @Override
    public void a() {
        ((k) this.f15697b).a();
    }

    public void a0(g3 g3Var) {
        try {
            i0(g3Var, (p3) this.f15697b);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        c6.e0 e0Var = (c6.e0) this.f15697b;
        String str = (String) this.f15698c;
        g6.w wVar = (g6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.F == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.j("Not connected to device", z10);
        g6.f fVar = (g6.f) wVar.u();
        Parcel O0 = fVar.O0();
        O0.writeString(str);
        fVar.T0(O0, 5);
        synchronized (e0Var.f3987s) {
            try {
                if (e0Var.f3984p != null) {
                    taskCompletionSource.setException(n6.l.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.f3984p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void b(v vVar) {
        d0 d0Var = (d0) this.f15698c;
        SparseArray sparseArray = d0Var.h;
        a4.h hVar = (a4.h) this.f15697b;
        if (vVar.x() == 0 && (vVar.x() & 128) != 0) {
            vVar.K(6);
            int a2 = vVar.a() / 4;
            for (int i10 = 0; i10 < a2; i10++) {
                vVar.h(0, 4, hVar.f256b);
                hVar.q(0);
                int i11 = hVar.i(16);
                hVar.t(3);
                if (i11 == 0) {
                    hVar.t(13);
                } else {
                    int i12 = hVar.i(13);
                    if (sparseArray.get(i12) == null) {
                        sparseArray.put(i12, new b0(new i0(d0Var, i12)));
                        d0Var.f12652n++;
                    }
                }
            }
            if (d0Var.f12642a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public void b0(g3 g3Var, int i10, long j3) {
        try {
            o3 o3Var = (o3) ((p3) this.f15697b).g();
            o3Var.c();
            p3.p((p3) o3Var.f6896b, i10);
            p3 p3Var = (p3) o3Var.a();
            this.f15697b = p3Var;
            if (j3 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.f6896b, j3);
                p3Var = (p3) o3Var2.a();
            }
            i0(g3Var, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public cf.a c0(f3 f3Var) {
        int i10;
        List list = (List) this.f15698c;
        List list2 = (List) f3Var.f20284b;
        if (list2 != null) {
            i10 = list2.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new ed.i(f3Var, (List) this.f15697b, list);
    }

    @Override
    public g2.h createDataSource() {
        return new g2.n((Context) this.f15697b, ((o) this.f15698c).createDataSource());
    }

    @Override
    public void d(v3 v3Var, View view) {
        r rVar = (r) this.f15698c;
        y70 y70Var = new y70(rVar, (f6) this.f15697b, view, false, false, true);
        y70Var.Q = true;
        n2 n2Var = rVar.f26786b.f29096f0;
        rVar.getContext();
        rVar.H = j4.b(y70Var, n2Var, v3Var, true);
    }

    public void d0(g3 g3Var, long j3, boolean z10) {
        p3 p3Var;
        try {
            com.google.android.gms.internal.play_billing.f3 f3Var = (com.google.android.gms.internal.play_billing.f3) g3Var.g();
            com.google.android.gms.internal.play_billing.t3 t3Var = (com.google.android.gms.internal.play_billing.t3) g3Var.o().g();
            t3Var.c();
            com.google.android.gms.internal.play_billing.v3.n((com.google.android.gms.internal.play_billing.v3) t3Var.f6896b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f6896b, (com.google.android.gms.internal.play_billing.v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f15697b;
            } else {
                o3 o3Var = (o3) ((p3) this.f15697b).g();
                o3Var.c();
                p3.r((p3) o3Var.f6896b, j3);
                p3Var = (p3) o3Var.a();
            }
            i0(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean e(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: of.b.e(float):boolean");
    }

    public void e0(g3 g3Var, int i10, long j3, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.f15697b).g();
            o3Var.c();
            p3.p((p3) o3Var.f6896b, i10);
            this.f15697b = (p3) o3Var.a();
            com.google.android.gms.internal.play_billing.f3 f3Var = (com.google.android.gms.internal.play_billing.f3) g3Var.g();
            com.google.android.gms.internal.play_billing.t3 t3Var = (com.google.android.gms.internal.play_billing.t3) g3Var.o().g();
            t3Var.c();
            com.google.android.gms.internal.play_billing.v3.n((com.google.android.gms.internal.play_billing.v3) t3Var.f6896b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f6896b, (com.google.android.gms.internal.play_billing.v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f15697b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.f15697b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.f6896b, j3);
                p3Var = (p3) o3Var2.a();
            }
            i0(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void f(d6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((d6.c) fVar).a() + " " + str);
    }

    public void f0(l3 l3Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f15697b);
            t10.c();
            x3.p((x3) t10.f6896b, l3Var);
            ((p) this.f15698c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void g0(a4 a4Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f15697b);
            t10.c();
            x3.r((x3) t10.f6896b, a4Var);
            ((p) this.f15698c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean h() {
        return false;
    }

    public void h0(com.google.android.gms.internal.play_billing.b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f15697b);
            t10.c();
            x3.s((x3) t10.f6896b, b4Var);
            ((p) this.f15698c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean i(float f7) {
        return false;
    }

    public void i0(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.n((x3) t10.f6896b, g3Var);
            ((p) this.f15698c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void j0(i3 i3Var, p3 p3Var) {
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.o((x3) t10.f6896b, i3Var);
            ((p) this.f15698c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void k(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override
    public void l(d6 d6Var, String str) {
        r rVar = (r) this.f15698c;
        if (rVar.v == null) {
            f6 f6Var = (f6) this.f15697b;
            rVar.v = new m.p3(new ah.b(16, this, f6Var), f6Var);
        }
        rVar.v.d(d6Var, str);
    }

    @Override
    public void m(int i10) {
        r.O((r) this.f15698c, 74, i10);
    }

    @Override
    public void n() {
        int i10;
        r rVar = (r) this.f15698c;
        ii.w3 w3Var = rVar.f11592r;
        b4 b4Var = rVar.f11593s;
        if (b4Var != null) {
            j3 j3Var = w3Var.f11725n3;
            if (j3Var != null && j3Var.y() && w3Var.D4()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (b4Var.f11260a0 == 2) {
                b4Var.f11262b0 = i10;
            } else {
                b4Var.f(i10, true);
            }
            if (i10 != 0) {
                rVar.W();
            }
        }
        rVar.Z();
    }

    @Override
    public void o(d6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((d6.c) fVar).a() + " " + z10);
    }

    @Override
    public void onComplete(Task task) {
        boolean z10;
        boolean z11;
        d6.b bVar;
        boolean z12;
        String str;
        com.google.android.gms.internal.cast.r rVar = (com.google.android.gms.internal.cast.r) this.f15697b;
        d6.b bVar2 = (d6.b) this.f15698c;
        x xVar = rVar.f6473c;
        g6.b bVar3 = com.google.android.gms.internal.cast.r.f6472j;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED")) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (true != z12) {
                str = "not existed";
            } else {
                str = "existed";
            }
            bVar3.b("The module-to-client output switcher flag %s", str);
            if (z12) {
                z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(bVar3.f9430a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f7527x)));
                if (!z10 && bVar2.f7527x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (xVar == null && (bVar = rVar.d) != null) {
                    boolean z13 = bVar.v;
                    boolean z14 = bVar.f7525s;
                    p4.y yVar = new p4.y();
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        yVar.f41001b = z11;
                    }
                    if (i10 >= 30) {
                        yVar.d = z13;
                    }
                    if (i10 >= 30) {
                        yVar.f41002c = z14;
                    }
                    x.i(new z(yVar));
                    Log.i(bVar3.f9430a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(rVar.f6475i), Boolean.valueOf(z11), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                    if (z13) {
                        com.google.android.gms.internal.cast.u uVar = rVar.f6474f;
                        n6.l.h(uVar);
                        com.google.android.gms.internal.cast.q qVar = new com.google.android.gms.internal.cast.q(uVar);
                        x.b();
                        x.c().f40870f = qVar;
                        f2.a(f1.CAST_TRANSFER_TO_LOCAL_ENABLED);
                        return;
                    }
                    return;
                }
            }
        }
        z10 = true;
        Log.i(bVar3.f9430a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f7527x)));
        if (!z10) {
        }
        z11 = false;
        if (xVar == null) {
        }
    }

    @Override
    public void onContentChanged() {
        r rVar = (r) this.f15698c;
        b4 b4Var = rVar.f11593s;
        if (b4Var != null) {
            b4Var.setSendLoading(rVar.f11592r.n3());
        }
        rVar.V(true);
        rVar.Y();
        ii.d dVar = rVar.P;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override
    public void p() {
        b4 b4Var = ((r) this.f15698c).f11593s;
        if (b4Var != null) {
            int i10 = b4Var.f11260a0;
            if (i10 == 2) {
                i10 = 0;
            }
            b4Var.f11262b0 = i10;
            b4Var.e(false, false);
            b4Var.f(2, true);
        }
    }

    @Override
    public void q(ii.a aVar) {
        r rVar = (r) this.f15698c;
        vi viVar = rVar.f26786b;
        n2 n2Var = viVar.f29096f0;
        if (n2Var != null && aVar != null && (aVar.f11205b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(n2Var)) {
            vi viVar2 = new vi(rVar.getContext(), viVar.f29096f0, false, false, false, null);
            viVar2.Z1 = new ob.a(11);
            viVar2.P = true;
            viVar2.f29154x1.setVisibility(8);
            viVar2.f29141t2 = new r5(rVar, aVar, viVar2, 10);
            viVar2.r1();
            viVar2.show();
        }
    }

    @Override
    public void r(Bitmap bitmap) {
        n4.y yVar = (n4.y) this.f15697b;
        yVar.f15231b = bitmap;
        f6.g gVar = (f6.g) this.f15698c;
        gVar.f8982l = yVar;
        gVar.b();
    }

    @Override
    public void s(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((d6.c) fVar).a() + " " + i10);
        ((lf.h) this.f15697b).W(null);
    }

    @Override
    public void t(String str, long j3, long j10, long j11) {
        n nVar = (n) this.f15697b;
        if (nVar != null) {
            nVar.t(str, j3, j10, j11);
        }
    }

    @Override
    public Object then(Task task) {
        j6.a aVar = (j6.a) this.f15697b;
        Bundle bundle = (Bundle) this.f15698c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return aVar.a(bundle).onSuccessTask(j6.m.f12914a, j6.b.f12895b);
        }
        return task;
    }

    public String toString() {
        switch (this.f15696a) {
            case 10:
                try {
                    return R().toString();
                } catch (cc.e unused) {
                    return "";
                }
            case 17:
                return ((HashMap) this.f15697b).toString();
            default:
                return super.toString();
        }
    }

    @Override
    public z3.d u(int i10, int i11, byte[] bArr) {
        return v7.j0.a(this, bArr, i11);
    }

    @Override
    public void v(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        Y(cVar);
    }

    @Override
    public void w() {
        r rVar = (r) this.f15698c;
        if (rVar.getCurrentItemTop() != rVar.I) {
            rVar.f26786b.X1(rVar, 0);
        }
        rVar.a0();
        r.K(rVar);
    }

    @Override
    public void x(i1 i1Var, boolean z10) {
        ((r) this.f15698c).f26786b.t1(i1Var, z10);
    }

    @Override
    public void y(int i10) {
        r rVar = (r) this.f15698c;
        rVar.f26786b.X1(rVar, i10);
        rVar.a0();
        r.K(rVar);
    }

    @Override
    public void z(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override
    public Object zzp() {
        boolean z10;
        Map map;
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f15697b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f15698c;
        bVar.getClass();
        if (com.google.android.gms.internal.clearcut.d.e()) {
            z10 = ((Boolean) com.google.android.gms.internal.clearcut.d.c(new com.google.android.gms.internal.clearcut.e("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue();
        } else {
            z10 = false;
        }
        if (z10) {
            map = bVar.b();
        } else {
            map = bVar.e;
        }
        if (map == null) {
            synchronized (bVar.d) {
                try {
                    Map map2 = bVar.e;
                    map = map2;
                    if (map2 == null) {
                        HashMap b10 = bVar.b();
                        bVar.e = b10;
                        map = b10;
                    }
                } finally {
                }
            }
        }
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        return (String) map.get(dVar.f6587b);
    }

    public b(int i10, boolean z10) {
        this.f15696a = i10;
    }

    public b(Object obj, int i10) {
        this.f15696a = i10;
        this.f15697b = obj;
    }

    public b(Object obj, Object obj2, boolean z10, int i10) {
        this.f15696a = i10;
        this.f15697b = obj;
        this.f15698c = obj2;
    }

    public b(Context context, p3 p3Var) {
        this.f15696a = 8;
        p pVar = new p(1);
        try {
            t.b(context);
            pVar.f3176c = t.a().c(j5.a.e).a("PLAY_BILLING_LIBRARY", new i5.c("proto"), new rb.a(5));
        } catch (Throwable unused) {
            pVar.f3175b = true;
        }
        this.f15698c = pVar;
        this.f15697b = p3Var;
    }

    public b(int i10) {
        this.f15696a = i10;
        switch (i10) {
            case 21:
                this.f15697b = new v();
                this.f15698c = new i4.a();
                return;
            default:
                d6.a c10 = d6.a.c(ApplicationLoader.applicationContext);
                q0 q0Var = new q0(15);
                c10.getClass();
                n6.l.e("Must be called from the main thread.");
                d6.g gVar = c10.f7512c;
                gVar.getClass();
                try {
                    d6.y yVar = gVar.f7544a;
                    j jVar = new j(q0Var);
                    Parcel O0 = yVar.O0();
                    com.google.android.gms.internal.cast.v.d(O0, jVar);
                    yVar.S0(O0, 4);
                } catch (RemoteException e) {
                    d6.g.f7543c.a(e, "Unable to call %s on %s.", "addCastStateListener", d6.y.class.getSimpleName());
                }
                this.f15697b = new lf.h(10, false);
                d6.g b10 = c10.b();
                this.f15698c = b10;
                b10.a(this);
                Y(b10.c());
                return;
        }
    }

    @Override
    public void j() {
    }

    @Override
    public void reset() {
    }

    @Override
    public void g(boolean z10) {
    }

    public b(Context context, int i10) {
        this.f15696a = i10;
        switch (i10) {
            case 26:
                this.f15697b = context == null ? null : context.getApplicationContext();
                return;
            default:
                o oVar = new o();
                this.f15697b = context.getApplicationContext();
                this.f15698c = oVar;
                return;
        }
    }

    public b(q qVar, SparseArray sparseArray) {
        this.f15696a = 23;
        this.f15697b = qVar;
        SparseBooleanArray sparseBooleanArray = qVar.f3201a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a2 = qVar.a(i10);
            j2.a aVar = (j2.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.f15698c = sparseArray2;
    }

    public b(Handler handler, l0 l0Var) {
        this.f15696a = 1;
        if (l0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f15697b = handler;
        this.f15698c = l0Var;
    }

    public b(Animation animation) {
        this.f15696a = 4;
        this.f15697b = animation;
        this.f15698c = null;
    }

    public b(Animator animator) {
        this.f15696a = 4;
        this.f15697b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f15698c = animatorSet;
        animatorSet.play(animator);
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f15696a = 20;
        int size = arrayList.size();
        this.f15697b = new int[size];
        this.f15698c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f15697b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f15698c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public b(int i10, int i11) {
        this.f15696a = 20;
        this.f15697b = new int[]{i10, i11};
        this.f15698c = new float[]{0.0f, 1.0f};
    }

    public b(int i10, int i11, int i12) {
        this.f15696a = 20;
        this.f15697b = new int[]{i10, i11, i12};
        this.f15698c = new float[]{0.0f, 0.5f, 1.0f};
    }

    @Override
    public void c(e2.b0 b0Var, c3.q qVar, f0 f0Var) {
    }

    public b(a1 a1Var, int[] iArr) {
        this.f15696a = 15;
        this.f15697b = e9.i0.v(a1Var);
        this.f15698c = iArr;
    }

    public b(d0 d0Var) {
        this.f15696a = 24;
        this.f15698c = d0Var;
        this.f15697b = new a4.h(new byte[4], 4);
    }
}
