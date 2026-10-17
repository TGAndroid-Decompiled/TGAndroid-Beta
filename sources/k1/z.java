package k1;

import androidx.lifecycle.k0;
import be.c0;
import be.f0;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import v7.h8;
public final class z implements f {
    public static final LinkedHashSet f14624r = new LinkedHashSet();
    public static final Object f14625s = new Object();
    public final k0 f14626a;
    public final rb.b f14627b;
    public final a6.m f14628c = new a6.m(new n(this, null, 1), 20);
    public final String d = ".tmp";
    public final id.g e = h8.a(new k0(this, 1));
    public final ee.m f14629f = new ee.m(b0.f14562a);
    public List h;
    public final com.google.firebase.messaging.r f14630n;

    public z(k0 k0Var, List list, rb.b bVar, c0 c0Var) {
        this.f14626a = k0Var;
        this.f14627b = bVar;
        this.h = jd.g.m(list);
        this.f14630n = new com.google.firebase.messaging.r(c0Var, new m(this, 0), new n(this, null, 0));
    }

    public static final java.lang.Object b(k1.z r8, k1.j r9, md.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: k1.z.b(k1.z, k1.j, md.c):java.lang.Object");
    }

    @Override
    public final Object a(td.p pVar, md.c cVar) {
        be.t a2 = f0.a();
        this.f14630n.o(new j(pVar, a2, (a0) this.f14629f.c(), cVar.getContext()));
        Object h = a2.h(cVar);
        ld.a aVar = ld.a.f15993a;
        return h;
    }

    public final File c() {
        return (File) this.e.a();
    }

    public final java.lang.Object d(md.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: k1.z.d(md.c):java.lang.Object");
    }

    public final java.lang.Object e(md.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: k1.z.e(md.c):java.lang.Object");
    }

    public final java.lang.Object f(md.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: k1.z.f(md.c):java.lang.Object");
    }

    public final java.lang.Object g(md.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: k1.z.g(md.c):java.lang.Object");
    }

    @Override
    public final ee.b getData() {
        return this.f14628c;
    }

    public final java.lang.Object h(md.c r6) {
        throw new UnsupportedOperationException("Method not decompiled: k1.z.h(md.c):java.lang.Object");
    }

    public final java.lang.Object i(td.p r11, kd.h r12, md.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: k1.z.i(td.p, kd.h, md.c):java.lang.Object");
    }

    public final java.lang.Object j(java.lang.Object r9, md.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: k1.z.j(java.lang.Object, md.c):java.lang.Object");
    }
}
