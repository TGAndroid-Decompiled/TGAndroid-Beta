package n4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.common.api.Status;
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
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import hi.j0;
import hi.j1;
import hi.k1;
import hi.l0;
import hi.m0;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import n7.a1;
import org.telegram.ui.Cells.s9;
import p4.t0;
public class y implements OnCompleteListener, c5.f0, com.google.android.gms.common.api.internal.s, com.google.android.gms.internal.clearcut.h, cf.b, f6.a, g2.g, g6.n, j1, z3.m, j4.b0, Continuation {
    public final int f13823a;
    public Object f13824b;
    public Object f13825c;

    public y(int i10, Object obj, Object obj2) {
        this.f13823a = i10;
        this.f13824b = obj;
        this.f13825c = obj2;
    }

    public static String e(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
        }
        return null;
    }

    public static void i(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = y.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    @Override
    public void A(byte[] r19, int r20, int r21, z3.l r22, e2.h r23) {
        throw new UnsupportedOperationException("Method not decompiled: n4.y.A(byte[], int, int, z3.l, e2.h):void");
    }

    public void B(g3 g3Var) {
        try {
            M(g3Var, (p3) this.f13824b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void C(g3 g3Var, int i10, long j3) {
        try {
            o3 o3Var = (o3) ((p3) this.f13824b).g();
            o3Var.c();
            p3.p((p3) o3Var.f5671b, i10);
            p3 p3Var = (p3) o3Var.a();
            this.f13824b = p3Var;
            if (j3 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.f5671b, j3);
                p3Var = (p3) o3Var2.a();
            }
            M(g3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void D(CharSequence charSequence) {
        ((l0) this.f13824b).J(charSequence);
    }

    public void E(g3 g3Var, long j3, boolean z10) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f5671b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f5671b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f13824b;
            } else {
                o3 o3Var = (o3) ((p3) this.f13824b).g();
                o3Var.c();
                p3.r((p3) o3Var.f5671b, j3);
                p3Var = (p3) o3Var.a();
            }
            M(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean F(k1 k1Var) {
        return false;
    }

    @Override
    public void G(Editable editable) {
        ((m0) this.f13825c).i();
        ((l0) this.f13824b).b0();
    }

    @Override
    public boolean H(boolean z10) {
        return false;
    }

    public void I(g3 g3Var, int i10, long j3, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.f13824b).g();
            o3Var.c();
            p3.p((p3) o3Var.f5671b, i10);
            this.f13824b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f5671b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f5671b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f13824b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.f13824b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.f5671b, j3);
                p3Var = (p3) o3Var2.a();
            }
            M(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void J(l3 l3Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f13824b);
            t10.c();
            x3.p((x3) t10.f5671b, l3Var);
            ((b2.p) this.f13825c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void K(a4 a4Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f13824b);
            t10.c();
            x3.r((x3) t10.f5671b, a4Var);
            ((b2.p) this.f13825c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void L(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f13824b);
            t10.c();
            x3.s((x3) t10.f5671b, b4Var);
            ((b2.p) this.f13825c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void M(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.n((x3) t10.f5671b, g3Var);
            ((b2.p) this.f13825c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void N(i3 i3Var, p3 p3Var) {
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.o((x3) t10.f5671b, i3Var);
            ((b2.p) this.f13825c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean P(k1 k1Var) {
        return false;
    }

    @Override
    public void a(e2.v vVar) {
        j4.e0 e0Var = (j4.e0) this.f13825c;
        SparseArray sparseArray = e0Var.h;
        a4.h hVar = (a4.h) this.f13824b;
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
                        sparseArray.put(i12, new j4.c0(new e0.i0(e0Var, i12)));
                        e0Var.f11567n++;
                    }
                }
            }
            if (e0Var.f11557a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        c6.e0 e0Var = (c6.e0) this.f13824b;
        String str = (String) this.f13825c;
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
        synchronized (e0Var.f4402s) {
            try {
                if (e0Var.f4399p != null) {
                    taskCompletionSource.setException(n6.l.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.f4399p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void b(k1 k1Var) {
        ((l0) this.f13824b).b(k1Var);
    }

    @Override
    public g2.h createDataSource() {
        return new g2.n((Context) this.f13824b, ((g2.o) this.f13825c).createDataSource());
    }

    public c5.e d() {
        if (((c5.o) this.f13824b) != null) {
            return new c5.e(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    @Override
    public boolean f() {
        return ((l0) this.f13824b).R();
    }

    public boolean g(int i10) {
        return ((b2.q) this.f13824b).f1895a.get(i10);
    }

    @Override
    public void h(int i10, int i11) {
        ((l0) this.f13824b).U(i10, i11);
    }

    public com.google.android.datatransport.cct.CctBackendFactory j(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: n4.y.j(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override
    public z3.d k(int i10, int i11, byte[] bArr) {
        return w.f.a(this, bArr, i11);
    }

    public fb.n l(kb.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: n4.y.l(kb.a):fb.n");
    }

    @Override
    public void m(String str, long j3, long j10, long j11) {
        g6.n nVar = (g6.n) this.f13824b;
        if (nVar != null) {
            nVar.m(str, j3, j10, j11);
        }
    }

    @Override
    public int n() {
        return 1;
    }

    public dc.b o() {
        if (((dc.b) this.f13825c) == null) {
            dc.f fVar = (dc.f) this.f13824b;
            int[] iArr = fVar.f6405c;
            cc.d dVar = fVar.f6403a;
            int i10 = dVar.f4617a;
            int i11 = dVar.f4618b;
            dc.b bVar = new dc.b(i10, i11);
            if (fVar.f6404b.length < i10) {
                fVar.f6404b = new byte[i10];
            }
            for (int i12 = 0; i12 < 32; i12++) {
                iArr[i12] = 0;
            }
            for (int i13 = 1; i13 < 5; i13++) {
                byte[] b10 = dVar.b((i11 * i13) / 5, fVar.f6404b);
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
                            int i37 = (i36 / 32) + (bVar.f6391c * i34);
                            int[] iArr2 = bVar.d;
                            iArr2[i37] = iArr2[i37] | (1 << (i36 & 31));
                        }
                    }
                }
                this.f13825c = bVar;
            } else {
                throw cc.e.a();
            }
        }
        return (dc.b) this.f13825c;
    }

    @Override
    public void onComplete(Task task) {
        boolean z10;
        boolean z11;
        d6.b bVar;
        boolean z12;
        String str;
        switch (this.f13823a) {
            case 2:
                a9.e eVar = (a9.e) this.f13824b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f13825c;
                synchronized (eVar.f322f) {
                    eVar.e.remove(taskCompletionSource);
                }
                return;
            default:
                com.google.android.gms.internal.cast.r rVar = (com.google.android.gms.internal.cast.r) this.f13824b;
                d6.b bVar2 = (d6.b) this.f13825c;
                p4.x xVar = rVar.f5248c;
                g6.b bVar3 = com.google.android.gms.internal.cast.r.f5247j;
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
                        Log.i(bVar3.f8558a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f6301x)));
                        if (!z10 && bVar2.f6301x) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (xVar == null && (bVar = rVar.d) != null) {
                            boolean z13 = bVar.v;
                            boolean z14 = bVar.f6299s;
                            p4.y yVar = new p4.y();
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 30) {
                                yVar.f39811b = z11;
                            }
                            if (i10 >= 30) {
                                yVar.d = z13;
                            }
                            if (i10 >= 30) {
                                yVar.f39812c = z14;
                            }
                            p4.x.i(new p4.z(yVar));
                            Log.i(bVar3.f8558a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(rVar.f5250i), Boolean.valueOf(z11), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                            if (z13) {
                                com.google.android.gms.internal.cast.u uVar = rVar.f5249f;
                                n6.l.h(uVar);
                                com.google.android.gms.internal.cast.q qVar = new com.google.android.gms.internal.cast.q(uVar);
                                p4.x.b();
                                p4.x.c().f39680f = qVar;
                                f2.a(f1.CAST_TRANSFER_TO_LOCAL_ENABLED);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z10 = true;
                Log.i(bVar3.f8558a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f6301x)));
                if (!z10) {
                }
                z11 = false;
                if (xVar == null) {
                    return;
                }
                return;
        }
    }

    public void p(Exception exc, boolean z10) {
        int i10;
        this.f13825c = null;
        HashSet hashSet = (HashSet) this.f13824b;
        e9.i0 v = e9.i0.v(hashSet);
        hashSet.clear();
        e9.g0 listIterator = v.listIterator(0);
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

    public void q(n2.b bVar) {
        ((HashSet) this.f13824b).add(bVar);
        if (((n2.b) this.f13825c) != null) {
            return;
        }
        this.f13825c = bVar;
        n2.q p5 = bVar.f13696b.p();
        bVar.f13714x = p5;
        android.support.v4.media.session.f fVar = bVar.f13709r;
        String str = e2.d0.f7188a;
        p5.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new n2.a(u2.u.f42455b.getAndIncrement(), true, SystemClock.elapsedRealtime(), p5)).sendToTarget();
    }

    @Override
    public void r(k1 k1Var, int i10, int i11) {
        s9 E;
        l0 l0Var = (l0) this.f13824b;
        if (!((m0) this.f13825c).d && i10 != i11 && (E = l0Var.E()) != null) {
            if (!E.y() || E.W != l0Var.M()) {
                k1Var.post(new j0(this, k1Var, i11, E, l0Var, i10));
            }
        }
    }

    @Override
    public void s(Bitmap bitmap) {
        of.b bVar = (of.b) this.f13824b;
        bVar.f14295c = bitmap;
        f6.g gVar = (f6.g) this.f13825c;
        gVar.f7865l = bVar;
        gVar.b();
    }

    @Override
    public Object then(Task task) {
        j6.a aVar = (j6.a) this.f13824b;
        Bundle bundle = (Bundle) this.f13825c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return aVar.a(bundle).onSuccessTask(j6.m.f11804a, j6.b.f11785b);
        }
        return task;
    }

    public String toString() {
        switch (this.f13823a) {
            case 10:
                try {
                    return o().toString();
                } catch (cc.e unused) {
                    return "";
                }
            case 17:
                return ((HashMap) this.f13824b).toString();
            default:
                return super.toString();
        }
    }

    @Override
    public cf.a u(a1 a1Var) {
        int i10;
        List list = (List) this.f13825c;
        List list2 = (List) a1Var.f13938b;
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
        return new ed.i(a1Var, (List) this.f13824b, list);
    }

    public void v(p pVar, Handler handler) {
        r rVar = (r) this.f13824b;
        synchronized (rVar.d) {
            rVar.f13814m = pVar;
            rVar.f13805a.setCallback(pVar.f13801b, handler);
            pVar.C(rVar, handler);
        }
    }

    public void w(h0 h0Var) {
        r rVar = (r) this.f13824b;
        rVar.f13809g = h0Var;
        synchronized (rVar.d) {
            for (int beginBroadcast = rVar.f13808f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((f) rVar.f13808f.getBroadcastItem(beginBroadcast)).t(h0Var);
                } catch (RemoteException | SecurityException e) {
                    Log.e("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            rVar.f13808f.finishBroadcast();
        }
        MediaSession mediaSession = rVar.f13805a;
        if (h0Var.f13781w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(h0Var.f13774a, h0Var.f13775b, h0Var.d, h0Var.f13778n);
            builder.setBufferedPosition(h0Var.f13776c);
            builder.setActions(h0Var.e);
            builder.setErrorMessage(h0Var.h);
            for (g0 g0Var : h0Var.f13779r) {
                g0Var.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(g0Var.f13771a, g0Var.f13772b, g0Var.f13773c);
                builder2.setExtras(g0Var.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(h0Var.f13780s);
            if (Build.VERSION.SDK_INT >= 22) {
                f0.a(builder, h0Var.v);
            }
            h0Var.f13781w = builder.build();
        }
        mediaSession.setPlaybackState(h0Var.f13781w);
    }

    @Override
    public void x(k1 k1Var) {
        ((l0) this.f13824b).g();
    }

    @Override
    public void y(String str, long j3, int i10, Object obj, long j10, long j11) {
        ((g6.m) this.f13825c).f8568g = null;
        g6.n nVar = (g6.n) this.f13824b;
        if (nVar != null) {
            nVar.y(str, j3, i10, obj, j10, j11);
        }
    }

    public void z(c5.o oVar) {
        this.f13824b = oVar;
        if (oVar.a() != null) {
            oVar.a().getClass();
            String str = oVar.a().d;
            if (str != null) {
                this.f13825c = str;
            }
        }
    }

    @Override
    public Object zzp() {
        boolean z10;
        Map map;
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f13824b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f13825c;
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
        return (String) map.get(dVar.f5362b);
    }

    public y(int i10, boolean z10) {
        this.f13823a = i10;
    }

    public y(Object obj, int i10) {
        this.f13823a = i10;
        this.f13824b = obj;
        this.f13825c = null;
    }

    public y(Object obj, Object obj2, boolean z10, int i10) {
        this.f13823a = i10;
        this.f13825c = obj;
        this.f13824b = obj2;
    }

    public y(Context context, p3 p3Var) {
        this.f13823a = 8;
        b2.p pVar = new b2.p(1);
        try {
            l5.s.b(context);
            pVar.f1870c = l5.s.a().c(j5.a.e).a("PLAY_BILLING_LIBRARY", new i5.c("proto"), new qb.b(6));
        } catch (Throwable unused) {
            pVar.f1869b = true;
        }
        this.f13825c = pVar;
        this.f13824b = p3Var;
    }

    public y(dc.f fVar) {
        this.f13823a = 10;
        this.f13824b = fVar;
    }

    public y(int i10) {
        this.f13823a = i10;
        switch (i10) {
            case 28:
                this.f13824b = new HashSet();
                return;
            default:
                this.f13824b = new e2.v();
                this.f13825c = new i4.a();
                return;
        }
    }

    public y(Context context, int i10) {
        this.f13823a = i10;
        switch (i10) {
            case 26:
                this.f13824b = context == null ? null : context.getApplicationContext();
                return;
            default:
                g2.o oVar = new g2.o();
                this.f13824b = context.getApplicationContext();
                this.f13825c = oVar;
                return;
        }
    }

    @Override
    public void reset() {
    }

    @Override
    public void t() {
    }

    public y(b2.q qVar, SparseArray sparseArray) {
        this.f13823a = 23;
        this.f13824b = qVar;
        SparseBooleanArray sparseBooleanArray = qVar.f1895a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a2 = qVar.a(i10);
            j2.a aVar = (j2.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.f13825c = sparseArray2;
    }

    public y(Animator animator) {
        this.f13823a = 4;
        this.f13824b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f13825c = animatorSet;
        animatorSet.play(animator);
    }

    public y(ArrayList arrayList, ArrayList arrayList2) {
        this.f13823a = 20;
        int size = arrayList.size();
        this.f13824b = new int[size];
        this.f13825c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f13824b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f13825c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public y(int i10, int i11) {
        this.f13823a = 20;
        this.f13824b = new int[]{i10, i11};
        this.f13825c = new float[]{0.0f, 1.0f};
    }

    public y(int i10, int i11, int i12) {
        this.f13823a = 20;
        this.f13824b = new int[]{i10, i11, i12};
        this.f13825c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public y(a3.f fVar) {
        this.f13823a = 1;
        this.f13825c = fVar;
    }

    public y(e9.a1 a1Var, int[] iArr) {
        this.f13823a = 15;
        this.f13824b = e9.i0.v(a1Var);
        this.f13825c = iArr;
    }

    public y(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f13823a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i10 = t0.f39784b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    if (queryBroadcastReceivers.size() > 1) {
                        Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                    }
                    componentName = null;
                }
                if (componentName == null) {
                    Log.i("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                this.f13824b = new r(context, str, bundle);
            } else if (i11 >= 28) {
                this.f13824b = new r(context, str, bundle);
            } else if (i11 >= 22) {
                this.f13824b = new r(context, str, bundle);
            } else {
                this.f13824b = new r(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            v(new p(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((r) this.f13824b).f13805a.setMediaButtonReceiver(pendingIntent);
            this.f13825c = new l2.h(context, this);
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    @Override
    public void c(e2.b0 b0Var, c3.q qVar, j4.g0 g0Var) {
    }

    public y(j4.e0 e0Var) {
        this.f13823a = 24;
        this.f13825c = e0Var;
        this.f13824b = new a4.h(new byte[4], 4);
    }
}
