package n4;

import android.net.Uri;
import d5.g0;
import h3.a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class c implements i4.a {

    public final long f18217a;

    public final long f18218b;

    public final long f18219c;
    public final boolean d;

    public final long f18220e;

    public final long f18221f;

    public final long f18222g;
    public final long h;

    public final c9.b f18223i;

    public final a1 f18224j;

    public final Uri f18225k;

    public final i f18226l;

    public final List f18227m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, i iVar, c9.b bVar, a1 a1Var, Uri uri, ArrayList arrayList) {
        this.f18217a = j10;
        this.f18218b = j11;
        this.f18219c = j12;
        this.d = z10;
        this.f18220e = j13;
        this.f18221f = j14;
        this.f18222g = j15;
        this.h = j16;
        this.f18226l = iVar;
        this.f18223i = bVar;
        this.f18225k = uri;
        this.f18224j = a1Var;
        this.f18227m = arrayList;
    }

    @Override
    public final Object a(List list) {
        long j10;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new i4.b());
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f18227m.size()) {
                break;
            }
            if (((i4.b) linkedList.peek()).f10563a != i10) {
                long jC = c(i10);
                if (jC != -9223372036854775807L) {
                    j11 += jC;
                }
            } else {
                h hVarB = b(i10);
                List list2 = hVarB.f18246c;
                i4.b bVar = (i4.b) linkedList.poll();
                int i11 = bVar.f10563a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = bVar.f10564b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f18211c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(bVar.f10565c));
                        bVar = (i4.b) linkedList.poll();
                        if (bVar.f10563a != i11) {
                            break;
                        }
                    } while (bVar.f10564b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f18209a, aVar.f18210b, arrayList3, aVar.d, aVar.f18212e, aVar.f18213f));
                    if (bVar.f10563a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(bVar);
                arrayList.add(new h(hVarB.f18244a, hVarB.f18245b - j10, arrayList2, hVarB.d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.f18218b;
        return new c(this.f18217a, j13 != -9223372036854775807L ? j13 - j12 : -9223372036854775807L, this.f18219c, this.d, this.f18220e, this.f18221f, this.f18222g, this.h, this.f18226l, this.f18223i, this.f18224j, this.f18225k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f18227m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f18227m;
        if (i10 != list.size() - 1) {
            return ((h) list.get(i10 + 1)).f18245b - ((h) list.get(i10)).f18245b;
        }
        long j10 = this.f18218b;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - ((h) list.get(i10)).f18245b;
    }

    public final long d(int i10) {
        return g0.H(c(i10));
    }
}
