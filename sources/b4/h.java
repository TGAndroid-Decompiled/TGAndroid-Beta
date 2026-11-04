package b4;

import b8.zb;
import d2.u;
import d2.u0;
import d2.v;
import e3.i0;
import e3.q;
import g2.n0;
import g2.y;
import g9.g0;
import g9.s1;
import java.util.ArrayList;
import java.util.List;
public final class h implements e3.o {
    public final m f2361a;
    public final v f2362b;
    public final ArrayList f2363c;
    public i0 f2365f;
    public int f2366g;
    public int h;
    public long[] f2367i;
    public long f2368j;
    public byte[] f2364e = n0.f11874b;
    public final y d = new y();

    public h(m mVar, v vVar) {
        v vVar2;
        this.f2361a = mVar;
        if (vVar != null) {
            u a10 = vVar.a();
            a10.f8431r = u0.n("application/x-media3-cues");
            a10.f8423j = vVar.f8489s;
            a10.P = mVar.Y();
            vVar2 = new v(a10);
        } else {
            vVar2 = null;
        }
        this.f2362b = vVar2;
        this.f2363c = new ArrayList();
        this.h = 0;
        this.f2367i = n0.f11875c;
        this.f2368j = -9223372036854775807L;
    }

    @Override
    public final boolean b(e3.p pVar) {
        return true;
    }

    @Override
    public final void c(q qVar) {
        boolean z10;
        if (this.h == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        i0 i02 = qVar.i0(0, 3);
        this.f2365f = i02;
        v vVar = this.f2362b;
        if (vVar != null) {
            i02.g(vVar);
            qVar.L();
            qVar.f(new e3.y(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.h = 1;
    }

    @Override
    public final void d(long j10, long j11) {
        boolean z10;
        int i3 = this.h;
        if (i3 != 0 && i3 != 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        this.f2368j = j11;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override
    public final List e() {
        g0 g0Var = g9.i0.f12083b;
        return s1.f12146e;
    }

    @Override
    public final int f(e3.p r21, e3.s r22) {
        throw new UnsupportedOperationException("Method not decompiled: b4.h.f(e3.p, e3.s):int");
    }

    public final void g(g gVar) {
        this.f2365f.getClass();
        byte[] bArr = gVar.f2360b;
        int length = bArr.length;
        y yVar = this.d;
        yVar.getClass();
        yVar.L(bArr.length, bArr);
        this.f2365f.e(length, yVar);
        this.f2365f.d(gVar.f2359a, 1, length, 0, null);
    }

    @Override
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.f2361a.reset();
        this.h = 5;
    }

    @Override
    public final e3.o a() {
        return this;
    }
}
