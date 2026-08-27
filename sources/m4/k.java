package m4;

import b5.s;
import com.google.android.exoplayer2.upstream.r0;
import com.google.firebase.messaging.t;
import d5.q;
import h3.t0;
import java.util.ArrayList;
import java.util.List;

public final class k {

    public final r0 f17697a;

    public final t f17698b;

    public final int[] f17699c;
    public final int d;

    public final com.google.android.exoplayer2.upstream.m f17700e;

    public final long f17701f;

    public final n f17702g;
    public final i[] h;

    public s f17703i;

    public n4.c f17704j;

    public int f17705k;

    public j4.b f17706l;

    public boolean f17707m;

    public k(r0 r0Var, n4.c cVar, t tVar, int i10, int[] iArr, s sVar, int i11, com.google.android.exoplayer2.upstream.m mVar, long j10, boolean z10, ArrayList arrayList, n nVar) {
        m3.k iVar;
        l4.d dVar;
        ?? obj = new Object();
        obj.f17697a = r0Var;
        obj.f17704j = cVar;
        obj.f17698b = tVar;
        obj.f17699c = iArr;
        obj.f17703i = sVar;
        obj.d = i11;
        obj.f17700e = mVar;
        obj.f17705k = i10;
        obj.f17701f = j10;
        obj.f17702g = nVar;
        long jD = cVar.d(i10);
        ArrayList arrayListA = obj.a();
        obj.h = new i[sVar.length()];
        int i12 = 0;
        int i13 = 0;
        k kVar = obj;
        while (i13 < kVar.h.length) {
            n4.m mVar2 = (n4.m) arrayListA.get(sVar.j(i13));
            n4.b bVarL = tVar.L(mVar2.f18258b);
            i[] iVarArr = kVar.h;
            int i14 = i13;
            bVarL = bVarL == null ? (n4.b) mVar2.f18258b.get(i12) : bVarL;
            t0 t0Var = mVar2.f18257a;
            String str = t0Var.A;
            if (q.i(str)) {
                i14 = i14;
                dVar = null;
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    iVar = new s3.e(1);
                } else {
                    iVar = new u3.i(z10 ? 4 : 0, null, arrayList, nVar);
                }
                dVar = new l4.d(iVar, i11, t0Var);
            }
            l4.d dVar2 = dVar;
            int i15 = i14;
            iVarArr[i15] = new i(jD, mVar2, bVarL, dVar2, 0L, mVar2.c());
            i13 = i15 + 1;
            kVar = this;
            i12 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f17704j.b(this.f17705k).f18246c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f17699c) {
            arrayList.addAll(((n4.a) list.get(i10)).f18211c);
        }
        return arrayList;
    }

    public final i b(int i10) {
        i[] iVarArr = this.h;
        i iVar = iVarArr[i10];
        n4.b bVarL = this.f17698b.L(iVar.f17693b.f18258b);
        if (bVarL == null || bVarL.equals(iVar.f17694c)) {
            return iVar;
        }
        i iVar2 = new i(iVar.f17695e, iVar.f17693b, bVarL, iVar.f17692a, iVar.f17696f, iVar.d);
        iVarArr[i10] = iVar2;
        return iVar2;
    }
}
