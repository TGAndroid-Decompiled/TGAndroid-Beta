package k1;

import androidx.lifecycle.k0;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import v7.t7;
import zd.e0;
import zd.f1;
public final class a0 implements f {
    public static final LinkedHashSet f11993r = new LinkedHashSet();
    public static final Object f11994s = new Object();
    public final k0 f11995a;
    public final na.d f11996b;
    public final ce.m f11997c = new ce.m(new m(this, null, 1));
    public final String d = ".tmp";
    public final gd.g e = t7.a(new k0(this, 1));
    public final ce.o f11998f = new ce.o(c0.f12005a);
    public List h;
    public final ki.f f11999n;

    public a0(k0 k0Var, List list, na.d dVar, zd.c0 c0Var) {
        this.f11995a = k0Var;
        this.f11996b = dVar;
        this.h = hd.g.m(list);
        ie.g gVar = new ie.g(this, 1);
        m mVar = new m(this, null, 0);
        ?? obj = new Object();
        obj.f12538a = c0Var;
        obj.f12539b = mVar;
        be.a[] aVarArr = be.a.f2202a;
        obj.f12540c = new be.b(Integer.MAX_VALUE);
        obj.d = new AtomicInteger(0);
        f1 f1Var = (f1) c0Var.c().get(zd.b0.f47988b);
        if (f1Var != null) {
            f1Var.invokeOnCompletion(new ae.d(1, gVar, obj));
        }
        this.f11999n = obj;
    }

    public static final java.lang.Object a(k1.a0 r8, k1.j r9, kd.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: k1.a0.a(k1.a0, k1.j, kd.c):java.lang.Object");
    }

    public final File b() {
        return (File) this.e.a();
    }

    public final java.lang.Object c(kd.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: k1.a0.c(kd.c):java.lang.Object");
    }

    public final java.lang.Object d(kd.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: k1.a0.d(kd.c):java.lang.Object");
    }

    public final java.lang.Object e(kd.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: k1.a0.e(kd.c):java.lang.Object");
    }

    public final java.lang.Object f(kd.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: k1.a0.f(kd.c):java.lang.Object");
    }

    public final java.lang.Object g(kd.c r6) {
        throw new UnsupportedOperationException("Method not decompiled: k1.a0.g(kd.c):java.lang.Object");
    }

    @Override
    public final ce.b getData() {
        return this.f11997c;
    }

    @Override
    public final Object h(rd.p pVar, kd.c cVar) {
        zd.t a2 = e0.a();
        this.f11999n.F(new j(pVar, a2, (b0) this.f11998f.c(), cVar.getContext()));
        Object h = a2.h(cVar);
        jd.a aVar = jd.a.f11861a;
        return h;
    }

    public final java.lang.Object i(rd.p r11, id.h r12, kd.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: k1.a0.i(rd.p, id.h, kd.c):java.lang.Object");
    }

    public final java.lang.Object j(java.lang.Object r9, kd.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: k1.a0.j(java.lang.Object, kd.c):java.lang.Object");
    }
}
