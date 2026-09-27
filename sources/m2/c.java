package m2;

import android.net.Uri;
import b2.d0;
import b2.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements t2.a {
    public final long f14661a;
    public final long f14662b;
    public final long f14663c;
    public final boolean d;
    public final long e;
    public final long f14664f;
    public final long f14665g;
    public final long h;
    public final lf.g f14666i;
    public final d0 f14667j;
    public final Uri f14668k;
    public final i f14669l;
    public final List f14670m;

    public c(long j3, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, lf.g gVar, d0 d0Var, Uri uri, ArrayList arrayList) {
        this.f14661a = j3;
        this.f14662b = j10;
        this.f14663c = j11;
        this.d = z10;
        this.e = j12;
        this.f14664f = j13;
        this.f14665g = j14;
        this.h = j15;
        this.f14669l = iVar;
        this.f14666i = gVar;
        this.f14668k = uri;
        this.f14667j = d0Var;
        this.f14670m = arrayList;
    }

    @Override
    public final Object a(List list) {
        long j3;
        long j10;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new e1(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i10 = 0;
        while (true) {
            j3 = -9223372036854775807L;
            if (i10 >= this.f14670m.size()) {
                break;
            }
            if (((e1) linkedList.peek()).f2976a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f14688c;
                e1 e1Var = (e1) linkedList.poll();
                int i11 = e1Var.f2976a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = e1Var.f2977b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f14656c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(e1Var.f2978c));
                        e1Var = (e1) linkedList.poll();
                        if (e1Var.f2976a != i11) {
                            break;
                        }
                    } while (e1Var.f2977b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f14654a, aVar.f14655b, arrayList3, aVar.d, aVar.e, aVar.f14657f));
                    if (e1Var.f2976a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(e1Var);
                arrayList.add(new h(b10.f14686a, b10.f14687b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.f14662b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f14661a, j3, this.f14663c, this.d, this.e, this.f14664f, this.f14665g, this.h, this.f14669l, this.f14666i, this.f14667j, this.f14668k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f14670m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f14670m;
        if (i10 == list.size() - 1) {
            long j3 = this.f14662b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j3 - ((h) list.get(i10)).f14687b;
        }
        return ((h) list.get(i10 + 1)).f14687b - ((h) list.get(i10)).f14687b;
    }

    public final long d(int i10) {
        return e2.d0.Q(c(i10));
    }
}
