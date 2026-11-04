package j3;

import bb.c;
import d2.s0;
import e3.i0;
import e3.l;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import e3.u;
import g2.y;
import g9.g0;
import g9.s1;
import java.util.List;
import s3.h;
public final class b implements o {
    public q f16181e;
    public i0 f16182f;
    public s0 h;
    public u f16184i;
    public int f16185j;
    public int f16186k;
    public a f16187l;
    public int f16188m;
    public long f16189n;
    public final byte[] f16178a = new byte[42];
    public final y f16179b = new y(new byte[32768], 0);
    public final boolean f16180c = false;
    public final s d = new Object();
    public int f16183g = 0;

    @Override
    public final boolean b(p pVar) {
        s0 h = new c(19).h(pVar, h.f54622b, 0);
        if (h != null) {
            int length = h.f8366a.length;
        }
        y yVar = new y(4);
        ((l) pVar).h(yVar.f11923a, 0, 4, false);
        if (yVar.C() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(q qVar) {
        this.f16181e = qVar;
        this.f16182f = qVar.i0(0, 1);
        qVar.L();
    }

    @Override
    public final void d(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f16183g = 0;
        } else {
            a aVar = this.f16187l;
            if (aVar != null) {
                aVar.d(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f16189n = j12;
        this.f16188m = 0;
        this.f16179b.K(0);
    }

    @Override
    public final List e() {
        g0 g0Var = g9.i0.f12083b;
        return s1.f12146e;
    }

    @Override
    public final int f(e3.p r32, e3.s r33) {
        throw new UnsupportedOperationException("Method not decompiled: j3.b.f(e3.p, e3.s):int");
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
