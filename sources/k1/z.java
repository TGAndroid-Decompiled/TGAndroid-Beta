package k1;

import a8.id;
import androidx.lifecycle.k0;
import ce.c0;
import ce.f0;
import ce.g1;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
public final class z implements f {
    public static final LinkedHashSet f16107r = new LinkedHashSet();
    public static final Object f16108s = new Object();
    public final k0 f16109a;
    public final pa.d f16110b;
    public final a4.l f16111c = new a4.l(new n(this, null, 1), 18);
    public final String d = ".tmp";
    public final jd.g e = id.a(new k0(this, 1));
    public final fe.m f16112f = new fe.m(b0.f16045a);
    public List h;
    public final com.google.firebase.messaging.q f16113n;

    public z(k0 k0Var, List list, pa.d dVar, c0 c0Var) {
        this.f16109a = k0Var;
        this.f16110b = dVar;
        this.h = kd.g.m(list);
        m mVar = new m(this, 0);
        n nVar = new n(this, null, 0);
        ?? obj = new Object();
        obj.f7757a = c0Var;
        obj.f7758b = nVar;
        ee.a[] aVarArr = ee.a.f9894a;
        obj.f7759c = new ee.b(Integer.MAX_VALUE);
        obj.d = new AtomicInteger(0);
        g1 g1Var = (g1) c0Var.c().get(ce.b0.f6205b);
        if (g1Var != null) {
            g1Var.invokeOnCompletion(new de.d(1, mVar, obj));
        }
        this.f16113n = obj;
    }

    public static final java.lang.Object a(k1.z r8, k1.j r9, nd.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: k1.z.a(k1.z, k1.j, nd.c):java.lang.Object");
    }

    public final File b() {
        return (File) this.e.a();
    }

    public final java.lang.Object c(nd.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: k1.z.c(nd.c):java.lang.Object");
    }

    public final java.lang.Object d(nd.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: k1.z.d(nd.c):java.lang.Object");
    }

    public final java.lang.Object e(nd.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: k1.z.e(nd.c):java.lang.Object");
    }

    public final java.lang.Object f(nd.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: k1.z.f(nd.c):java.lang.Object");
    }

    public final java.lang.Object g(nd.c r6) {
        throw new UnsupportedOperationException("Method not decompiled: k1.z.g(nd.c):java.lang.Object");
    }

    @Override
    public final fe.b getData() {
        return this.f16111c;
    }

    public final java.lang.Object h(ud.p r11, ld.h r12, nd.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: k1.z.h(ud.p, ld.h, nd.c):java.lang.Object");
    }

    public final java.lang.Object i(java.lang.Object r9, nd.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: k1.z.i(java.lang.Object, nd.c):java.lang.Object");
    }

    @Override
    public final Object w(ud.p pVar, nd.c cVar) {
        ce.t a2 = f0.a();
        this.f16113n.y(new j(pVar, a2, (a0) this.f16112f.c(), cVar.getContext()));
        Object h = a2.h(cVar);
        md.a aVar = md.a.f18412a;
        return h;
    }
}
