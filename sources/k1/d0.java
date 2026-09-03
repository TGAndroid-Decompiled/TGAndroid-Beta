package k1;

import androidx.lifecycle.k0;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import k7.p7;
import ld.f1;
public final class d0 implements g {
    public static final LinkedHashSet f10270r = new LinkedHashSet();
    public static final Object f10271s = new Object();
    public final k0 f10272a;
    public final cb.b f10273b;
    public final androidx.biometric.f0 f10274c = new androidx.biometric.f0(new p(this, null, 1), 23);
    public final String d = ".tmp";
    public final sc.g f10275e = p7.a(new k0(this, 1));
    public final od.m f10276f = new od.m(f0.f10284a);
    public List h;
    public final com.google.firebase.messaging.s f10277n;

    public d0(k0 k0Var, List list, cb.b bVar, ld.c0 c0Var) {
        this.f10272a = k0Var;
        this.f10273b = bVar;
        this.h = tc.g.m(list);
        o oVar = new o(this, 0);
        p pVar = new p(this, null, 0);
        ?? obj = new Object();
        obj.f4080a = c0Var;
        obj.f4081b = pVar;
        nd.a[] aVarArr = nd.a.f15930a;
        obj.f4082c = new nd.b(Integer.MAX_VALUE);
        obj.d = new AtomicInteger(0);
        f1 f1Var = (f1) c0Var.c().get(ld.b0.f12283b);
        if (f1Var != null) {
            f1Var.invokeOnCompletion(new j(0, oVar, obj));
        }
        this.f10277n = obj;
    }

    public static final java.lang.Object a(k1.d0 r8, k1.l r9, wc.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: k1.d0.a(k1.d0, k1.l, wc.c):java.lang.Object");
    }

    public final File b() {
        return (File) this.f10275e.a();
    }

    public final java.lang.Object c(wc.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: k1.d0.c(wc.c):java.lang.Object");
    }

    @Override
    public final Object d(dd.p pVar, wc.c cVar) {
        ld.t a2 = ld.e0.a();
        this.f10277n.k(new l(pVar, a2, (e0) this.f10276f.b(), cVar.getContext()));
        Object h = a2.h(cVar);
        vc.a aVar = vc.a.f48998a;
        return h;
    }

    public final java.lang.Object e(wc.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: k1.d0.e(wc.c):java.lang.Object");
    }

    public final java.lang.Object f(wc.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: k1.d0.f(wc.c):java.lang.Object");
    }

    public final java.lang.Object g(wc.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: k1.d0.g(wc.c):java.lang.Object");
    }

    @Override
    public final od.b getData() {
        return this.f10274c;
    }

    public final java.lang.Object h(wc.c r6) {
        throw new UnsupportedOperationException("Method not decompiled: k1.d0.h(wc.c):java.lang.Object");
    }

    public final java.lang.Object i(dd.p r10, uc.h r11, wc.c r12) {
        throw new UnsupportedOperationException("Method not decompiled: k1.d0.i(dd.p, uc.h, wc.c):java.lang.Object");
    }

    public final java.lang.Object j(java.lang.Object r9, wc.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: k1.d0.j(java.lang.Object, wc.c):java.lang.Object");
    }
}
