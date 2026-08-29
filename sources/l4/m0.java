package l4;

import com.google.android.gms.internal.cast.z4;
import j3.r2;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class m0 extends j {
    public static final j3.f1 f14373r;
    public final a[] f14374k;
    public final r2[] f14375l;
    public final ArrayList f14376m;
    public final bb.a f14377n;
    public int f14378o;
    public long[][] f14379p;
    public z4 f14380q;

    static {
        j3.x0 x0Var = new j3.x0();
        q8.x xVar = q8.z.f46511b;
        q8.l0 l0Var = q8.l0.f46462e;
        List list = Collections.EMPTY_LIST;
        q8.l0 l0Var2 = q8.l0.f46462e;
        f14373r = new j3.f1("MergingMediaSource", new j3.y0(x0Var), null, new j3.b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), j3.h1.U, j3.d1.f10413c);
    }

    public m0(a... aVarArr) {
        bb.a aVar = new bb.a(12);
        this.f14374k = aVarArr;
        this.f14377n = aVar;
        this.f14376m = new ArrayList(Arrays.asList(aVarArr));
        this.f14378o = -1;
        this.f14375l = new r2[aVarArr.length];
        this.f14379p = new long[0];
        new HashMap();
        q8.l.a(8, "expectedKeys");
        q8.l.a(2, "expectedValuesPerKey");
        q8.p a2 = q8.p.a();
        new q8.g0();
        if (a2.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        a[] aVarArr = this.f14374k;
        int length = aVarArr.length;
        z[] zVarArr = new z[length];
        r2[] r2VarArr = this.f14375l;
        int b10 = r2VarArr[0].b(c0Var.f14262a);
        for (int i10 = 0; i10 < length; i10++) {
            zVarArr[i10] = aVarArr[i10].b(c0Var.b(r2VarArr[i10].l(b10)), rVar, j10 - this.f14379p[b10][i10]);
        }
        return new l0(this.f14377n, this.f14379p[b10], zVarArr);
    }

    @Override
    public final j3.f1 h() {
        a[] aVarArr = this.f14374k;
        if (aVarArr.length > 0) {
            return aVarArr[0].h();
        }
        return f14373r;
    }

    @Override
    public final void j() {
        z4 z4Var = this.f14380q;
        if (z4Var == null) {
            super.j();
            return;
        }
        throw z4Var;
    }

    @Override
    public final void l(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.f14341j = y0Var;
        this.f14340i = f5.d0.k(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f14374k;
            if (i10 < aVarArr.length) {
                w(Integer.valueOf(i10), aVarArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void n(z zVar) {
        l0 l0Var = (l0) zVar;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f14374k;
            if (i10 < aVarArr.length) {
                a aVar = aVarArr[i10];
                z zVar2 = l0Var.f14366a[i10];
                if (zVar2 instanceof j0) {
                    zVar2 = ((j0) zVar2).f14342a;
                }
                aVar.n(zVar2);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void p() {
        super.p();
        Arrays.fill(this.f14375l, (Object) null);
        this.f14378o = -1;
        this.f14380q = null;
        ArrayList arrayList = this.f14376m;
        arrayList.clear();
        Collections.addAll(arrayList, this.f14374k);
    }

    @Override
    public final c0 s(Object obj, c0 c0Var) {
        if (((Integer) obj).intValue() == 0) {
            return c0Var;
        }
        return null;
    }

    @Override
    public final void v(Object obj, a aVar, r2 r2Var) {
        Integer num = (Integer) obj;
        if (this.f14380q == null) {
            if (this.f14378o == -1) {
                this.f14378o = r2Var.h();
            } else if (r2Var.h() != this.f14378o) {
                this.f14380q = new IOException();
                return;
            }
            int length = this.f14379p.length;
            r2[] r2VarArr = this.f14375l;
            if (length == 0) {
                this.f14379p = (long[][]) Array.newInstance(Long.TYPE, this.f14378o, r2VarArr.length);
            }
            ArrayList arrayList = this.f14376m;
            arrayList.remove(aVar);
            r2VarArr[num.intValue()] = r2Var;
            if (arrayList.isEmpty()) {
                m(r2VarArr[0]);
            }
        }
    }
}
