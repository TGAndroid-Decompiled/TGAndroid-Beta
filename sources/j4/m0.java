package j4;

import com.google.android.gms.internal.cast.x4;
import h3.s2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class m0 extends j {

    public static final h3.f1 f12615r;

    public final a[] f12616k;

    public final s2[] f12617l;

    public final ArrayList f12618m;

    public final za.b f12619n;

    public int f12620o;

    public long[][] f12621p;

    public x4 f12622q;

    static {
        h3.x0 x0Var = new h3.x0();
        p8.x xVar = p8.z.f45604b;
        p8.l0 l0Var = p8.l0.f45555e;
        List list = Collections.EMPTY_LIST;
        p8.l0 l0Var2 = p8.l0.f45555e;
        f12615r = new h3.f1("MergingMediaSource", new h3.z0(x0Var), null, new h3.b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), h3.h1.U, h3.d1.f7806c);
    }

    public m0(a... aVarArr) {
        za.b bVar = new za.b(9);
        this.f12616k = aVarArr;
        this.f12619n = bVar;
        this.f12618m = new ArrayList(Arrays.asList(aVarArr));
        this.f12620o = -1;
        this.f12617l = new s2[aVarArr.length];
        this.f12621p = new long[0][];
        new HashMap();
        p8.l.a(8, "expectedKeys");
        p8.l.a(2, "expectedValuesPerKey");
        p8.p pVarA = p8.p.a();
        new p8.g0();
        if (!pVarA.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public final z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        a[] aVarArr = this.f12616k;
        int length = aVarArr.length;
        z[] zVarArr = new z[length];
        s2[] s2VarArr = this.f12617l;
        int iB = s2VarArr[0].b(c0Var.f12503a);
        for (int i10 = 0; i10 < length; i10++) {
            zVarArr[i10] = aVarArr[i10].b(c0Var.b(s2VarArr[i10].l(iB)), rVar, j10 - this.f12621p[iB][i10]);
        }
        return new l0(this.f12619n, this.f12621p[iB], zVarArr);
    }

    @Override
    public final h3.f1 h() {
        a[] aVarArr = this.f12616k;
        return aVarArr.length > 0 ? aVarArr[0].h() : f12615r;
    }

    @Override
    public final void j() throws x4 {
        x4 x4Var = this.f12622q;
        if (x4Var != null) {
            throw x4Var;
        }
        super.j();
    }

    @Override
    public final void l(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.f12588j = y0Var;
        this.f12587i = d5.g0.k(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f12616k;
            if (i10 >= aVarArr.length) {
                return;
            }
            w(Integer.valueOf(i10), aVarArr[i10]);
            i10++;
        }
    }

    @Override
    public final void n(z zVar) {
        l0 l0Var = (l0) zVar;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f12616k;
            if (i10 >= aVarArr.length) {
                return;
            }
            a aVar = aVarArr[i10];
            z zVar2 = l0Var.f12607a[i10];
            if (zVar2 instanceof j0) {
                zVar2 = ((j0) zVar2).f12589a;
            }
            aVar.n(zVar2);
            i10++;
        }
    }

    @Override
    public final void p() {
        super.p();
        Arrays.fill(this.f12617l, (Object) null);
        this.f12620o = -1;
        this.f12622q = null;
        ArrayList arrayList = this.f12618m;
        arrayList.clear();
        Collections.addAll(arrayList, this.f12616k);
    }

    @Override
    public final c0 s(Object obj, c0 c0Var) {
        if (((Integer) obj).intValue() == 0) {
            return c0Var;
        }
        return null;
    }

    @Override
    public final void v(Object obj, a aVar, s2 s2Var) {
        Integer num = (Integer) obj;
        if (this.f12622q != null) {
            return;
        }
        if (this.f12620o == -1) {
            this.f12620o = s2Var.h();
        } else if (s2Var.h() != this.f12620o) {
            this.f12622q = new x4();
            return;
        }
        int length = this.f12621p.length;
        s2[] s2VarArr = this.f12617l;
        if (length == 0) {
            this.f12621p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f12620o, s2VarArr.length);
        }
        ArrayList arrayList = this.f12618m;
        arrayList.remove(aVar);
        s2VarArr[num.intValue()] = s2Var;
        if (arrayList.isEmpty()) {
            m(s2VarArr[0]);
        }
    }
}
