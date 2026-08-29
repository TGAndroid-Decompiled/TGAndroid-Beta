package o4;

import com.google.android.exoplayer2.upstream.r0;
import com.google.firebase.messaging.s;
import d5.r;
import j3.t0;
import java.util.ArrayList;
import java.util.List;
public final class l {
    public final r0 f19182a;
    public final s f19183b;
    public final int[] f19184c;
    public final int d;
    public final com.google.android.exoplayer2.upstream.m f19185e;
    public final long f19186f;
    public final o f19187g;
    public final j[] h;
    public r f19188i;
    public p4.c f19189j;
    public int f19190k;
    public l4.b f19191l;
    public boolean f19192m;

    public l(r0 r0Var, p4.c cVar, s sVar, int i10, int[] iArr, r rVar, int i11, com.google.android.exoplayer2.upstream.m mVar, long j10, boolean z10, ArrayList arrayList, o oVar) {
        int i12;
        o3.k iVar;
        int i13;
        n4.d dVar;
        ?? obj = new Object();
        obj.f19182a = r0Var;
        obj.f19189j = cVar;
        obj.f19183b = sVar;
        obj.f19184c = iArr;
        obj.f19188i = rVar;
        obj.d = i11;
        obj.f19185e = mVar;
        obj.f19190k = i10;
        obj.f19186f = j10;
        obj.f19187g = oVar;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.h = new j[rVar.length()];
        int i14 = 0;
        int i15 = 0;
        l lVar = obj;
        while (i15 < lVar.h.length) {
            p4.m mVar2 = (p4.m) a2.get(rVar.i(i15));
            p4.b L = sVar.L(mVar2.f45580b);
            j[] jVarArr = lVar.h;
            int i16 = i15;
            L = L == null ? (p4.b) mVar2.f45580b.get(i14) : L;
            t0 t0Var = mVar2.f45579a;
            String str = t0Var.A;
            if (f5.o.i(str)) {
                i13 = i16;
                dVar = null;
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    i13 = i16;
                    iVar = new u3.e(1);
                } else {
                    if (z10) {
                        i12 = 4;
                    } else {
                        i12 = 0;
                    }
                    i13 = i16;
                    iVar = new w3.i(i12, null, arrayList, oVar);
                }
                dVar = new n4.d(iVar, i11, t0Var);
            }
            n4.d dVar2 = dVar;
            int i17 = i13;
            jVarArr[i17] = new j(d, mVar2, L, dVar2, 0L, mVar2.c());
            i15 = i17 + 1;
            lVar = this;
            i14 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f19189j.b(this.f19190k).f45568c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f19184c) {
            arrayList.addAll(((p4.a) list.get(i10)).f45533c);
        }
        return arrayList;
    }

    public final j b(int i10) {
        j[] jVarArr = this.h;
        j jVar = jVarArr[i10];
        p4.b L = this.f19183b.L(jVar.f19178b.f45580b);
        if (L != null && !L.equals(jVar.f19179c)) {
            j jVar2 = new j(jVar.f19180e, jVar.f19178b, L, jVar.f19177a, jVar.f19181f, jVar.d);
            jVarArr[i10] = jVar2;
            return jVar2;
        }
        return jVar;
    }
}
