package of;

import a3.h0;
import a3.j0;
import a3.l0;
import ai.f6;
import ai.ic;
import ai.jc;
import ai.r5;
import ai.w5;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
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
import b2.q;
import b2.x1;
import c5.f0;
import c5.o;
import c6.e0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.f1;
import com.google.android.gms.internal.cast.f2;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.h;
import d6.j;
import e2.d0;
import e2.v;
import e9.g0;
import e9.i0;
import ed.i;
import g6.n;
import g6.w;
import ii.d6;
import ii.i1;
import ii.j3;
import ii.j4;
import ii.r;
import ii.t3;
import ii.u3;
import j$.util.Objects;
import j4.a0;
import j4.b0;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import m.e3;
import m.q3;
import m4.u0;
import n2.p;
import n4.y;
import n6.l;
import n7.a1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vi;
import org.telegram.ui.PhotoViewer;
import p4.x;
import p4.z;
import u2.t;
import z3.m;
public class b implements h, f0, s, OnCompleteListener, com.google.android.gms.internal.clearcut.h, cf.b, f6.a, g2.g, n, m, u3, a0, Continuation {
    public static volatile b d;
    public final int f15510a;
    public Object f15511b;
    public Object f15512c;

    public b(int i10, Object obj, Object obj2) {
        this.f15510a = i10;
        this.f15512c = obj;
        this.f15511b = obj2;
    }

    public static String E(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
        }
        return null;
    }

    public static b M() {
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
    public int A() {
        return 1;
    }

    @Override
    public void B(byte[] r19, int r20, int r21, z3.l r22, e2.h r23) {
        throw new UnsupportedOperationException("Method not decompiled: of.b.B(byte[], int, int, z3.l, e2.h):void");
    }

    public c5.e C() {
        if (((o) this.f15511b) != null) {
            return new c5.e(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    @Override
    public n70 D(View view) {
        r rVar = (r) this.f15512c;
        n70 n70Var = new n70(rVar, (e6) this.f15511b, view, false, false, true);
        rVar.H = n70Var;
        return n70Var;
    }

    @Override
    public void F() {
        r rVar = (r) this.f15512c;
        rVar.X();
        rVar.Y();
    }

    @Override
    public cf.a F1(a1 a1Var) {
        int i10;
        List list = (List) this.f15512c;
        List list2 = (List) a1Var.f15108b;
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
        return new i(a1Var, (List) this.f15511b, list);
    }

    public boolean G(int i10) {
        return ((q) this.f15511b).f3197a.get(i10);
    }

    @Override
    public void H(t3 t3Var, View view) {
        r rVar = (r) this.f15512c;
        n70 n70Var = new n70(rVar, (e6) this.f15511b, view, false, false, true);
        n70Var.Q = true;
        rVar.H = j4.c(n70Var, rVar.f26462b.f28750f0, rVar.getContext(), (e6) this.f15511b, t3Var, true);
    }

    public void I(i2.g gVar) {
        synchronized (gVar) {
        }
        Handler handler = (Handler) this.f15511b;
        if (handler != null) {
            handler.post(new j0(this, gVar, 1));
        }
    }

    public com.google.android.datatransport.cct.CctBackendFactory J(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: of.b.J(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public fb.n K(kb.a r9) {
        throw new UnsupportedOperationException("Method not decompiled: of.b.K(kb.a):fb.n");
    }

    public dc.b L() {
        if (((dc.b) this.f15512c) == null) {
            dc.f fVar = (dc.f) this.f15511b;
            int[] iArr = fVar.f7629c;
            cc.d dVar = fVar.f7627a;
            int i10 = dVar.f4198a;
            int i11 = dVar.f4199b;
            dc.b bVar = new dc.b(i10, i11);
            if (fVar.f7628b.length < i10) {
                fVar.f7628b = new byte[i10];
            }
            for (int i12 = 0; i12 < 32; i12++) {
                iArr[i12] = 0;
            }
            for (int i13 = 1; i13 < 5; i13++) {
                byte[] b10 = dVar.b((i11 * i13) / 5, fVar.f7628b);
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
                            int i37 = (i36 / 32) + (bVar.f7615c * i34);
                            int[] iArr2 = bVar.d;
                            iArr2[i37] = iArr2[i37] | (1 << (i36 & 31));
                        }
                    }
                }
                this.f15512c = bVar;
            } else {
                throw cc.e.a();
            }
        }
        return (dc.b) this.f15512c;
    }

    public String N(String str) {
        Resources resources = (Resources) this.f15511b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f15512c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public boolean O() {
        if (((a) ((e3) this.f15511b).d) != null) {
            return true;
        }
        return false;
    }

    public void P(Exception exc, boolean z10) {
        int i10;
        this.f15512c = null;
        HashSet hashSet = (HashSet) this.f15511b;
        i0 v = i0.v(hashSet);
        hashSet.clear();
        g0 listIterator = v.listIterator(0);
        while (listIterator.hasNext()) {
            n2.b bVar = (n2.b) listIterator.next();
            bVar.getClass();
            if (z10) {
                i10 = 1;
            } else {
                i10 = 3;
            }
            bVar.l(i10, exc);
        }
    }

    public void Q(boolean z10, boolean z11, float f7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f15511b;
        w5 w5Var = (w5) this.f15512c;
        jc jcVar = w5Var.e;
        jc.B1 = f7;
        ic icVar = jcVar.f1118z0;
        if (icVar != null) {
            icVar.setSpeed(f7);
        }
        f6.a0(w5Var.f1653l, z10);
        if (z11 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    public void R(n2.b bVar) {
        ((HashSet) this.f15511b).add(bVar);
        if (((n2.b) this.f15512c) != null) {
            return;
        }
        this.f15512c = bVar;
        p m10 = bVar.f14867b.m();
        bVar.f14885x = m10;
        android.support.v4.media.session.f fVar = bVar.f14880r;
        String str = d0.f7883a;
        m10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new n2.a(t.f43484b.getAndIncrement(), true, SystemClock.elapsedRealtime(), m10)).sendToTarget();
    }

    public void S(Object obj) {
        Handler handler = (Handler) this.f15511b;
        if (handler != null) {
            handler.post(new h0(this, obj, SystemClock.elapsedRealtime(), 0));
        }
    }

    public void T(g gVar) {
        d dVar;
        g gVar2;
        Log.d("CAST_CONTROLLER", "set current media");
        e3 e3Var = (e3) this.f15511b;
        g gVar3 = (g) e3Var.f14166c;
        if (b5.d.u()) {
            if (gVar3 != null || gVar != null) {
                if (gVar3 != null) {
                    ArrayList arrayList = gVar3.f15532a;
                    if (gVar != null && arrayList.size() == gVar.f15532a.size()) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            f a2 = gVar3.a(i10);
                            f a10 = gVar.a(i10);
                            if ((a2 == null && a10 == null) || (a2 != null && a10 != null && Objects.equals(a2.f15528a, a10.f15528a) && Objects.equals(a2.f15529b, a10.f15529b) && Objects.equals(a2.f15530c, a10.f15530c) && Objects.equals(a2.d, a10.d) && a2.e == a10.e && a2.f15531f == a10.f15531f)) {
                            }
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        if (((a) e3Var.d) != null && gVar != null) {
            e3Var.r(gVar);
        }
        if (((a) e3Var.d) != null && (gVar2 = (g) e3Var.f14166c) != null) {
            e3Var.S(gVar2);
        }
        if (gVar != null && gVar.f15532a.size() > 0 && !gVar.a(0).f15528a.startsWith("audio/") && (dVar = (d) e3Var.f14165b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) e3Var.d;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.f15509g = 0;
            aVar.h = 0;
            aVar.p();
        }
        e3Var.f14166c = gVar;
    }

    public void U(o oVar) {
        this.f15511b = oVar;
        if (oVar.a() != null) {
            oVar.a().getClass();
            String str = oVar.a().d;
            if (str != null) {
                this.f15512c = str;
            }
        }
    }

    public void V(d6.c cVar) {
        String str;
        String string;
        e3 e3Var = (e3) this.f15511b;
        if (cVar != null) {
            l.e("Must be called from the main thread.");
            e6.h hVar = cVar.f7532j;
            String a2 = cVar.a();
            if (!TextUtils.isEmpty(a2) && hVar != null) {
                a aVar = (a) e3Var.d;
                if (aVar == null || !TextUtils.equals(aVar.f15507c.a(), a2)) {
                    e3Var.V(new a(cVar, (d6.g) this.f15512c, hVar));
                    l.e("Must be called from the main thread.");
                    CastDevice castDevice = cVar.f7533k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer t12 = PhotoViewer.t1();
                    d.i();
                    if (t12.E != null && t12.f30936e0 != null && t12.Q1()) {
                        vc vcVar = new vc(t12.f30936e0, new ai.d());
                        int i10 = R.raw.forward;
                        if (!TextUtils.isEmpty(str)) {
                            string = LocaleController.formatString(R.string.ChromecastStartedTo, str);
                        } else {
                            string = LocaleController.getString(R.string.ChromecastStarted);
                        }
                        vcVar.Q(i10, 36, string).j();
                    }
                }
            }
        }
    }

    public void W(x1 x1Var) {
        Handler handler = (Handler) this.f15511b;
        if (handler != null) {
            handler.post(new a1.e(2, this, x1Var));
        }
    }

    public void X(g3 g3Var) {
        try {
            e0(g3Var, (p3) this.f15511b);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Y(g3 g3Var, int i10, long j3) {
        try {
            o3 o3Var = (o3) ((p3) this.f15511b).g();
            o3Var.c();
            p3.p((p3) o3Var.f6892b, i10);
            p3 p3Var = (p3) o3Var.a();
            this.f15511b = p3Var;
            if (j3 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.f6892b, j3);
                p3Var = (p3) o3Var2.a();
            }
            e0(g3Var, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Z(g3 g3Var, long j3, boolean z10) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            com.google.android.gms.internal.play_billing.t3 t3Var = (com.google.android.gms.internal.play_billing.t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f6892b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f6892b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f15511b;
            } else {
                o3 o3Var = (o3) ((p3) this.f15511b).g();
                o3Var.c();
                p3.r((p3) o3Var.f6892b, j3);
                p3Var = (p3) o3Var.a();
            }
            e0(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void a(v vVar) {
        j4.d0 d0Var = (j4.d0) this.f15512c;
        SparseArray sparseArray = d0Var.h;
        a4.h hVar = (a4.h) this.f15511b;
        if (vVar.x() == 0 && (vVar.x() & 128) != 0) {
            vVar.K(6);
            int a2 = vVar.a() / 4;
            for (int i10 = 0; i10 < a2; i10++) {
                vVar.h(0, 4, hVar.f254b);
                hVar.q(0);
                int i11 = hVar.i(16);
                hVar.t(3);
                if (i11 == 0) {
                    hVar.t(13);
                } else {
                    int i12 = hVar.i(13);
                    if (sparseArray.get(i12) == null) {
                        sparseArray.put(i12, new b0(new e0.i0(d0Var, i12)));
                        d0Var.f12648n++;
                    }
                }
            }
            if (d0Var.f12638a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public void a0(g3 g3Var, int i10, long j3, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.f15511b).g();
            o3Var.c();
            p3.p((p3) o3Var.f6892b, i10);
            this.f15511b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            com.google.android.gms.internal.play_billing.t3 t3Var = (com.google.android.gms.internal.play_billing.t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f6892b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f6892b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f15511b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.f15511b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.f6892b, j3);
                p3Var = (p3) o3Var2.a();
            }
            e0(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        e0 e0Var = (e0) this.f15511b;
        String str = (String) this.f15512c;
        w wVar = (w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.F == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        l.j("Not connected to device", z10);
        g6.f fVar = (g6.f) wVar.u();
        Parcel O0 = fVar.O0();
        O0.writeString(str);
        fVar.T0(O0, 5);
        synchronized (e0Var.f3983s) {
            try {
                if (e0Var.f3980p != null) {
                    taskCompletionSource.setException(l.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.f3980p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b0(l3 l3Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f15511b);
            t10.c();
            x3.p((x3) t10.f6892b, l3Var);
            ((b2.p) this.f15512c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void c(d6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((d6.c) fVar).a() + " " + str);
    }

    public void c0(a4 a4Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f15511b);
            t10.c();
            x3.r((x3) t10.f6892b, a4Var);
            ((b2.p) this.f15512c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public g2.h createDataSource() {
        return new g2.n((Context) this.f15511b, ((g2.o) this.f15512c).createDataSource());
    }

    @Override
    public void d(ii.v3 v3Var, View view) {
        r rVar = (r) this.f15512c;
        n70 n70Var = new n70(rVar, (e6) this.f15511b, view, false, false, true);
        n70Var.Q = true;
        n2 n2Var = rVar.f26462b.f28750f0;
        rVar.getContext();
        rVar.H = j4.b(n70Var, n2Var, v3Var, true);
    }

    public void d0(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f15511b);
            t10.c();
            x3.s((x3) t10.f6892b, b4Var);
            ((b2.p) this.f15512c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean e(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: of.b.e(float):boolean");
    }

    public void e0(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.n((x3) t10.f6892b, g3Var);
            ((b2.p) this.f15512c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void f(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    public void f0(i3 i3Var, p3 p3Var) {
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.o((x3) t10.f6892b, i3Var);
            ((b2.p) this.f15512c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void g(d6 d6Var, String str) {
        r rVar = (r) this.f15512c;
        if (rVar.v == null) {
            e6 e6Var = (e6) this.f15511b;
            rVar.v = new q3(new ah.b(16, this, e6Var), e6Var);
        }
        rVar.v.f(d6Var, str);
    }

    @Override
    public void h(int i10) {
        r.O((r) this.f15512c, 74, i10);
    }

    @Override
    public void i(d6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((d6.c) fVar).a() + " " + z10);
    }

    @Override
    public void j(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((d6.c) fVar).a() + " " + i10);
        ((e3) this.f15511b).V(null);
    }

    @Override
    public void k(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        V(cVar);
    }

    @Override
    public void l() {
        int i10;
        r rVar = (r) this.f15512c;
        ii.w3 w3Var = rVar.f11588r;
        ii.b4 b4Var = rVar.f11589s;
        if (b4Var != null) {
            j3 j3Var = w3Var.f11721n3;
            if (j3Var != null && j3Var.y() && w3Var.C4()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (b4Var.f11256a0 == 2) {
                b4Var.f11258b0 = i10;
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
    public void m(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override
    public void n(Bitmap bitmap) {
        y yVar = (y) this.f15511b;
        yVar.f14995c = bitmap;
        f6.g gVar = (f6.g) this.f15512c;
        gVar.f8978l = yVar;
        gVar.b();
    }

    @Override
    public void o() {
        ii.b4 b4Var = ((r) this.f15512c).f11589s;
        if (b4Var != null) {
            int i10 = b4Var.f11256a0;
            if (i10 == 2) {
                i10 = 0;
            }
            b4Var.f11258b0 = i10;
            b4Var.e(false, false);
            b4Var.f(2, true);
        }
    }

    @Override
    public void onComplete(Task task) {
        boolean z10;
        boolean z11;
        d6.b bVar;
        boolean z12;
        String str;
        com.google.android.gms.internal.cast.r rVar = (com.google.android.gms.internal.cast.r) this.f15511b;
        d6.b bVar2 = (d6.b) this.f15512c;
        x xVar = rVar.f6469c;
        g6.b bVar3 = com.google.android.gms.internal.cast.r.f6468j;
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
                Log.i(bVar3.f9425a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f7524x)));
                if (!z10 && bVar2.f7524x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (xVar == null && (bVar = rVar.d) != null) {
                    boolean z13 = bVar.v;
                    boolean z14 = bVar.f7522s;
                    p4.y yVar = new p4.y();
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        yVar.f40686b = z11;
                    }
                    if (i10 >= 30) {
                        yVar.d = z13;
                    }
                    if (i10 >= 30) {
                        yVar.f40687c = z14;
                    }
                    x.i(new z(yVar));
                    Log.i(bVar3.f9425a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(rVar.f6471i), Boolean.valueOf(z11), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                    if (z13) {
                        com.google.android.gms.internal.cast.u uVar = rVar.f6470f;
                        l.h(uVar);
                        com.google.android.gms.internal.cast.q qVar = new com.google.android.gms.internal.cast.q(uVar);
                        x.b();
                        x.c().f40555f = qVar;
                        f2.a(f1.CAST_TRANSFER_TO_LOCAL_ENABLED);
                        return;
                    }
                    return;
                }
            }
        }
        z10 = true;
        Log.i(bVar3.f9425a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f7524x)));
        if (!z10) {
        }
        z11 = false;
        if (xVar == null) {
        }
    }

    @Override
    public void onContentChanged() {
        r rVar = (r) this.f15512c;
        ii.b4 b4Var = rVar.f11589s;
        if (b4Var != null) {
            b4Var.setSendLoading(rVar.f11588r.m3());
        }
        rVar.V(true);
        rVar.Y();
        ii.d dVar = rVar.P;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override
    public void p(String str, long j3, long j10, long j11) {
        n nVar = (n) this.f15511b;
        if (nVar != null) {
            nVar.p(str, j3, j10, j11);
        }
    }

    @Override
    public void q(ii.a aVar) {
        r rVar = (r) this.f15512c;
        vi viVar = rVar.f26462b;
        n2 n2Var = viVar.f28750f0;
        if (n2Var != null && aVar != null && (aVar.f11201b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(n2Var)) {
            vi viVar2 = new vi(rVar.getContext(), viVar.f28750f0, false, false, false, null);
            viVar2.Z1 = new ob.a(11);
            viVar2.P = true;
            viVar2.f28808x1.setVisibility(8);
            viVar2.f28795t2 = new r5(rVar, aVar, viVar2, 10);
            viVar2.r1();
            viVar2.show();
        }
    }

    @Override
    public z3.d r(int i10, int i11, byte[] bArr) {
        return w.f.a(this, bArr, i11);
    }

    @Override
    public void s() {
        r rVar = (r) this.f15512c;
        if (rVar.getCurrentItemTop() != rVar.I) {
            rVar.f26462b.X1(rVar, 0);
        }
        rVar.a0();
        r.K(rVar);
    }

    @Override
    public void t(i1 i1Var, boolean z10) {
        ((r) this.f15512c).f26462b.t1(i1Var, z10);
    }

    @Override
    public Object then(Task task) {
        j6.a aVar = (j6.a) this.f15511b;
        Bundle bundle = (Bundle) this.f15512c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return aVar.a(bundle).onSuccessTask(j6.m.f12910a, j6.b.f12891b);
        }
        return task;
    }

    public String toString() {
        switch (this.f15510a) {
            case 10:
                try {
                    return L().toString();
                } catch (cc.e unused) {
                    return "";
                }
            case 17:
                return ((HashMap) this.f15511b).toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void u(int i10) {
        r rVar = (r) this.f15512c;
        rVar.f26462b.X1(rVar, i10);
        rVar.a0();
        r.K(rVar);
    }

    @Override
    public void v(d6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((d6.c) fVar).a());
    }

    @Override
    public void w(d6.f fVar, String str) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        V(cVar);
    }

    @Override
    public void x(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override
    public void y(String str, long j3, int i10, Object obj, long j10, long j11) {
        ((g6.m) this.f15512c).f9435g = null;
        n nVar = (n) this.f15511b;
        if (nVar != null) {
            nVar.y(str, j3, i10, obj, j10, j11);
        }
    }

    @Override
    public void z() {
        ii.b4 b4Var = ((r) this.f15512c).f11589s;
        if (b4Var != null) {
            int i10 = 0;
            b4Var.e(false, true);
            int i11 = b4Var.f11258b0;
            if (i11 != 2) {
                i10 = i11;
            }
            b4Var.f(i10, true);
        }
    }

    @Override
    public Object zzp() {
        boolean z10;
        Map map;
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f15511b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f15512c;
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
        return (String) map.get(dVar.f6583b);
    }

    public b(int i10, boolean z10) {
        this.f15510a = i10;
    }

    public b(Object obj, int i10) {
        this.f15510a = i10;
        this.f15511b = obj;
        this.f15512c = null;
    }

    public b(Object obj, Object obj2, boolean z10, int i10) {
        this.f15510a = i10;
        this.f15511b = obj;
        this.f15512c = obj2;
    }

    public b(Context context, p3 p3Var) {
        this.f15510a = 8;
        b2.p pVar = new b2.p(1);
        try {
            l5.t.b(context);
            pVar.f3172c = l5.t.a().c(j5.a.e).a("PLAY_BILLING_LIBRARY", new i5.c("proto"), new rb.a(5));
        } catch (Throwable unused) {
            pVar.f3171b = true;
        }
        this.f15512c = pVar;
        this.f15511b = p3Var;
    }

    public b(dc.f fVar) {
        this.f15510a = 10;
        this.f15511b = fVar;
    }

    public b(int i10) {
        this.f15510a = i10;
        switch (i10) {
            case 21:
                this.f15511b = new v();
                this.f15512c = new i4.a();
                return;
            case 28:
                this.f15511b = new HashSet();
                return;
            default:
                d6.a c10 = d6.a.c(ApplicationLoader.applicationContext);
                u0 u0Var = new u0(11);
                c10.getClass();
                l.e("Must be called from the main thread.");
                d6.g gVar = c10.f7509c;
                gVar.getClass();
                try {
                    d6.y yVar = gVar.f7541a;
                    j jVar = new j(u0Var);
                    Parcel O0 = yVar.O0();
                    com.google.android.gms.internal.cast.v.d(O0, jVar);
                    yVar.S0(O0, 4);
                } catch (RemoteException e) {
                    d6.g.f7540c.a(e, "Unable to call %s on %s.", "addCastStateListener", d6.y.class.getSimpleName());
                }
                this.f15511b = new e3(10, false);
                d6.g b10 = c10.b();
                this.f15512c = b10;
                b10.a(this);
                V(b10.c());
                return;
        }
    }

    @Override
    public void reset() {
    }

    public b(Context context, int i10) {
        this.f15510a = i10;
        switch (i10) {
            case 26:
                this.f15511b = context == null ? null : context.getApplicationContext();
                return;
            case 29:
                l.h(context);
                Resources resources = context.getResources();
                this.f15511b = resources;
                this.f15512c = resources.getResourcePackageName(2131689566);
                return;
            default:
                g2.o oVar = new g2.o();
                this.f15511b = context.getApplicationContext();
                this.f15512c = oVar;
                return;
        }
    }

    public b(q qVar, SparseArray sparseArray) {
        this.f15510a = 23;
        this.f15511b = qVar;
        SparseBooleanArray sparseBooleanArray = qVar.f3197a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a2 = qVar.a(i10);
            j2.a aVar = (j2.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.f15512c = sparseArray2;
    }

    public b(Handler handler, l0 l0Var) {
        this.f15510a = 1;
        if (l0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f15511b = handler;
        this.f15512c = l0Var;
    }

    public b(Animator animator) {
        this.f15510a = 4;
        this.f15511b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f15512c = animatorSet;
        animatorSet.play(animator);
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f15510a = 20;
        int size = arrayList.size();
        this.f15511b = new int[size];
        this.f15512c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f15511b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f15512c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public b(int i10, int i11) {
        this.f15510a = 20;
        this.f15511b = new int[]{i10, i11};
        this.f15512c = new float[]{0.0f, 1.0f};
    }

    @Override
    public void b(e2.b0 b0Var, c3.q qVar, j4.f0 f0Var) {
    }

    public b(int i10, int i11, int i12) {
        this.f15510a = 20;
        this.f15511b = new int[]{i10, i11, i12};
        this.f15512c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b(e9.a1 a1Var, int[] iArr) {
        this.f15510a = 15;
        this.f15511b = i0.v(a1Var);
        this.f15512c = iArr;
    }

    public b(j4.d0 d0Var) {
        this.f15510a = 24;
        this.f15512c = d0Var;
        this.f15511b = new a4.h(new byte[4], 4);
    }
}
