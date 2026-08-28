package m4;

import com.google.android.exoplayer2.upstream.r0;
import com.google.firebase.messaging.t;
import d5.q;
import h3.t0;
import java.util.ArrayList;
import java.util.List;
public final class k {
    public final r0 f17321a;
    public final t f17322b;
    public final int[] f17323c;
    public final int d;
    public final com.google.android.exoplayer2.upstream.m f17324e;
    public final long f17325f;
    public final n f17326g;
    public final i[] h;
    public b5.t f17327i;
    public n4.c f17328j;
    public int f17329k;
    public j4.b f17330l;
    public boolean f17331m;

    public k(r0 r0Var, n4.c cVar, t tVar, int i9, int[] iArr, b5.t tVar2, int i10, com.google.android.exoplayer2.upstream.m mVar, long j10, boolean z10, ArrayList arrayList, n nVar) {
        int i11;
        m3.k iVar;
        int i12;
        l4.d dVar;
        ?? obj = new Object();
        obj.f17321a = r0Var;
        obj.f17328j = cVar;
        obj.f17322b = tVar;
        obj.f17323c = iArr;
        obj.f17327i = tVar2;
        obj.d = i10;
        obj.f17324e = mVar;
        obj.f17329k = i9;
        obj.f17325f = j10;
        obj.f17326g = nVar;
        long d = cVar.d(i9);
        ArrayList a2 = obj.a();
        obj.h = new i[tVar2.length()];
        int i13 = 0;
        int i14 = 0;
        k kVar = obj;
        while (i14 < kVar.h.length) {
            n4.m mVar2 = (n4.m) a2.get(tVar2.j(i14));
            n4.b L = tVar.L(mVar2.f18431b);
            i[] iVarArr = kVar.h;
            int i15 = i14;
            L = L == null ? (n4.b) mVar2.f18431b.get(i13) : L;
            t0 t0Var = mVar2.f18430a;
            String str = t0Var.A;
            if (q.i(str)) {
                i12 = i15;
                dVar = null;
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    i12 = i15;
                    iVar = new s3.d(1);
                } else {
                    if (z10) {
                        i11 = 4;
                    } else {
                        i11 = 0;
                    }
                    i12 = i15;
                    iVar = new u3.i(i11, null, arrayList, nVar);
                }
                dVar = new l4.d(iVar, i10, t0Var);
            }
            l4.d dVar2 = dVar;
            int i16 = i12;
            iVarArr[i16] = new i(d, mVar2, L, dVar2, 0L, mVar2.c());
            i14 = i16 + 1;
            kVar = this;
            i13 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f17328j.b(this.f17329k).f18419c;
        ArrayList arrayList = new ArrayList();
        for (int i9 : this.f17323c) {
            arrayList.addAll(((n4.a) list.get(i9)).f18384c);
        }
        return arrayList;
    }

    public final i b(int i9) {
        i[] iVarArr = this.h;
        i iVar = iVarArr[i9];
        n4.b L = this.f17322b.L(iVar.f17317b.f18431b);
        if (L != null && !L.equals(iVar.f17318c)) {
            i iVar2 = new i(iVar.f17319e, iVar.f17317b, L, iVar.f17316a, iVar.f17320f, iVar.d);
            iVarArr[i9] = iVar2;
            return iVar2;
        }
        return iVar;
    }
}
