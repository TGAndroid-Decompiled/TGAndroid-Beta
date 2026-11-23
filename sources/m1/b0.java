package m1;

import a8.j7;
import java.util.List;
import zd.s1;
public final class b0 implements g {
    public final f0 f20385a;
    public final j6.r f20386b;
    public final zd.z f20387c;
    public int f20389f;
    public s1 f20390g;
    public final ab.c0 f20391i;
    public final xi.e f20394l;
    public final ob.c d = new ob.c(new de.c(this, (id.c) null, 3));
    public final ie.d f20388e = new ie.d();
    public final j6.r h = new j6.r();
    public final gd.i f20392j = b7.h.b(new l(this, 1));
    public final gd.i f20393k = b7.h.b(new l(this, 0));

    public b0(f0 f0Var, List list, j6.r rVar, zd.z zVar) {
        this.f20385a = f0Var;
        this.f20386b = rVar;
        this.f20387c = zVar;
        this.f20391i = new ab.c0(this, list);
        y yVar = new y(this, 0);
        be.l lVar = new be.l(this, (id.c) null, 10);
        ?? obj = new Object();
        obj.f60749a = zVar;
        obj.f60750b = lVar;
        obj.f60751c = j7.a(Integer.MAX_VALUE, null, 6);
        obj.d = new h6.o(14);
        zd.a1 a1Var = (zd.a1) zVar.c().get(zd.y.f62034b);
        if (a1Var != null) {
            a1Var.invokeOnCompletion(new u0(1, yVar, obj));
        }
        this.f20394l = obj;
    }

    public static final java.lang.Object b(m1.b0 r4, kd.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: m1.b0.b(m1.b0, kd.c):java.lang.Object");
    }

    public static final java.lang.Object c(m1.b0 r9, m1.n0 r10, kd.c r11) {
        throw new UnsupportedOperationException("Method not decompiled: m1.b0.c(m1.b0, m1.n0, kd.c):java.lang.Object");
    }

    public static final java.lang.Object d(m1.b0 r4, kd.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: m1.b0.d(m1.b0, kd.c):java.lang.Object");
    }

    public static final java.lang.Object e(m1.b0 r8, boolean r9, id.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: m1.b0.e(m1.b0, boolean, id.c):java.lang.Object");
    }

    public static final java.lang.Object f(m1.b0 r9, boolean r10, kd.c r11) {
        throw new UnsupportedOperationException("Method not decompiled: m1.b0.f(m1.b0, boolean, kd.c):java.lang.Object");
    }

    @Override
    public final Object a(rd.p pVar, kd.c cVar) {
        i1 i1Var = (i1) cVar.getContext().get(h1.f20443a);
        if (i1Var != null) {
            i1Var.a(this);
        }
        return zd.b0.y(new i1(i1Var, this), new de.c(this, pVar, (id.c) null), cVar);
    }

    public final m0 g() {
        return (m0) this.f20393k.getValue();
    }

    @Override
    public final ce.c getData() {
        return this.d;
    }

    public final java.lang.Object h(kd.c r6) {
        throw new UnsupportedOperationException("Method not decompiled: m1.b0.h(kd.c):java.lang.Object");
    }

    public final Object i(kd.c cVar) {
        return ((i0) this.f20392j.getValue()).a(new n(3, (id.c) null), cVar);
    }

    public final java.lang.Object j(java.lang.Object r11, boolean r12, kd.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: m1.b0.j(java.lang.Object, boolean, kd.c):java.lang.Object");
    }
}
