package k1;

import androidx.lifecycle.k0;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import k7.o7;
import ld.f1;
public final class d0 implements g {
    public static final LinkedHashSet f9548r = new LinkedHashSet();
    public static final Object f9549s = new Object();
    public final k0 f9550a;
    public final cb.b f9551b;
    public final androidx.biometric.e0 f9552c = new androidx.biometric.e0(new p(this, null, 1), 25);
    public final String d = ".tmp";
    public final sc.g e = o7.a(new k0(this, 1));
    public final od.m f9553f = new od.m(f0.f9560a);
    public List h;
    public final com.google.firebase.messaging.r f9554n;

    public d0(k0 k0Var, List list, cb.b bVar, ld.c0 c0Var) {
        this.f9550a = k0Var;
        this.f9551b = bVar;
        this.h = tc.g.m(list);
        o oVar = new o(this, 0);
        p pVar = new p(this, null, 0);
        ?? obj = new Object();
        obj.f4004a = c0Var;
        obj.f4005b = pVar;
        nd.a[] aVarArr = nd.a.f14897a;
        obj.f4006c = new nd.b(Integer.MAX_VALUE);
        obj.d = new AtomicInteger(0);
        f1 f1Var = (f1) c0Var.c().get(ld.b0.f11971b);
        if (f1Var != null) {
            f1Var.invokeOnCompletion(new j(0, oVar, obj));
        }
        this.f9554n = obj;
    }

    public static final java.lang.Object a(k1.d0 r8, k1.l r9, wc.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: k1.d0.a(k1.d0, k1.l, wc.c):java.lang.Object");
    }

    @Override
    public final Object C(dd.p pVar, wc.c cVar) {
        ld.t a2 = ld.e0.a();
        this.f9554n.k(new l(pVar, a2, (e0) this.f9553f.b(), cVar.getContext()));
        Object h = a2.h(cVar);
        vc.a aVar = vc.a.f45727a;
        return h;
    }

    public final File b() {
        return (File) this.e.a();
    }

    public final java.lang.Object c(wc.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: k1.d0.c(wc.c):java.lang.Object");
    }

    public final java.lang.Object d(wc.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: k1.d0.d(wc.c):java.lang.Object");
    }

    public final java.lang.Object e(wc.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: k1.d0.e(wc.c):java.lang.Object");
    }

    public final java.lang.Object f(wc.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: k1.d0.f(wc.c):java.lang.Object");
    }

    public final java.lang.Object g(wc.c r6) {
        throw new UnsupportedOperationException("Method not decompiled: k1.d0.g(wc.c):java.lang.Object");
    }

    @Override
    public final od.b getData() {
        return this.f9552c;
    }

    public final java.lang.Object h(dd.p r10, uc.h r11, wc.c r12) {
        throw new UnsupportedOperationException("Method not decompiled: k1.d0.h(dd.p, uc.h, wc.c):java.lang.Object");
    }

    public final java.lang.Object i(java.lang.Object r9, wc.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: k1.d0.i(java.lang.Object, wc.c):java.lang.Object");
    }
}
