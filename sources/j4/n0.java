package j4;

import com.google.android.gms.internal.cast.z4;
import h3.r2;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class n0 extends k {
    public static final h3.f1 f13518r;
    public final a[] f13519k;
    public final r2[] f13520l;
    public final ArrayList f13521m;
    public final za.a f13522n;
    public int f13523o;
    public long[][] f13524p;
    public z4 f13525q;

    static {
        h3.x0 x0Var = new h3.x0();
        o8.x xVar = o8.z.f19105b;
        o8.l0 l0Var = o8.l0.f19056e;
        List list = Collections.EMPTY_LIST;
        o8.l0 l0Var2 = o8.l0.f19056e;
        f13518r = new h3.f1("MergingMediaSource", new h3.y0(x0Var), null, new h3.b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), h3.h1.U, h3.d1.f9375c);
    }

    public n0(a... aVarArr) {
        za.a aVar = new za.a(10);
        this.f13519k = aVarArr;
        this.f13522n = aVar;
        this.f13521m = new ArrayList(Arrays.asList(aVarArr));
        this.f13523o = -1;
        this.f13520l = new r2[aVarArr.length];
        this.f13524p = new long[0];
        new HashMap();
        o8.l.a(8, "expectedKeys");
        o8.l.a(2, "expectedValuesPerKey");
        o8.p a2 = o8.p.a();
        new o8.g0();
        if (a2.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final a0 b(d0 d0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        a[] aVarArr = this.f13519k;
        int length = aVarArr.length;
        a0[] a0VarArr = new a0[length];
        r2[] r2VarArr = this.f13520l;
        int b10 = r2VarArr[0].b(d0Var.f13426a);
        for (int i9 = 0; i9 < length; i9++) {
            a0VarArr[i9] = aVarArr[i9].b(d0Var.b(r2VarArr[i9].l(b10)), rVar, j10 - this.f13524p[b10][i9]);
        }
        return new m0(this.f13522n, this.f13524p[b10], a0VarArr);
    }

    @Override
    public final h3.f1 h() {
        a[] aVarArr = this.f13519k;
        if (aVarArr.length > 0) {
            return aVarArr[0].h();
        }
        return f13518r;
    }

    @Override
    public final void j() {
        z4 z4Var = this.f13525q;
        if (z4Var == null) {
            super.j();
            return;
        }
        throw z4Var;
    }

    @Override
    public final void l(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.f13495j = y0Var;
        this.f13494i = d5.f0.k(null);
        int i9 = 0;
        while (true) {
            a[] aVarArr = this.f13519k;
            if (i9 < aVarArr.length) {
                w(Integer.valueOf(i9), aVarArr[i9]);
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void n(a0 a0Var) {
        m0 m0Var = (m0) a0Var;
        int i9 = 0;
        while (true) {
            a[] aVarArr = this.f13519k;
            if (i9 < aVarArr.length) {
                a aVar = aVarArr[i9];
                a0 a0Var2 = m0Var.f13511a[i9];
                if (a0Var2 instanceof k0) {
                    a0Var2 = ((k0) a0Var2).f13496a;
                }
                aVar.n(a0Var2);
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void p() {
        super.p();
        Arrays.fill(this.f13520l, (Object) null);
        this.f13523o = -1;
        this.f13525q = null;
        ArrayList arrayList = this.f13521m;
        arrayList.clear();
        Collections.addAll(arrayList, this.f13519k);
    }

    @Override
    public final d0 s(Object obj, d0 d0Var) {
        if (((Integer) obj).intValue() == 0) {
            return d0Var;
        }
        return null;
    }

    @Override
    public final void v(Object obj, a aVar, r2 r2Var) {
        Integer num = (Integer) obj;
        if (this.f13525q == null) {
            if (this.f13523o == -1) {
                this.f13523o = r2Var.h();
            } else if (r2Var.h() != this.f13523o) {
                this.f13525q = new IOException();
                return;
            }
            int length = this.f13524p.length;
            r2[] r2VarArr = this.f13520l;
            if (length == 0) {
                this.f13524p = (long[][]) Array.newInstance(Long.TYPE, this.f13523o, r2VarArr.length);
            }
            ArrayList arrayList = this.f13521m;
            arrayList.remove(aVar);
            r2VarArr[num.intValue()] = r2Var;
            if (arrayList.isEmpty()) {
                m(r2VarArr[0]);
            }
        }
    }
}
