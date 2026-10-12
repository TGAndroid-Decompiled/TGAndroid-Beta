package m2;

import android.net.Uri;
import b2.d0;
import b2.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements t2.a {
    public final long f15660a;
    public final long f15661b;
    public final long f15662c;
    public final boolean d;
    public final long f15663e;
    public final long f15664f;
    public final long f15665g;
    public final long h;
    public final pf.b f15666i;
    public final d0 f15667j;
    public final Uri f15668k;
    public final i f15669l;
    public final List f15670m;

    public c(long j3, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, pf.b bVar, d0 d0Var, Uri uri, ArrayList arrayList) {
        this.f15660a = j3;
        this.f15661b = j10;
        this.f15662c = j11;
        this.d = z10;
        this.f15663e = j12;
        this.f15664f = j13;
        this.f15665g = j14;
        this.h = j15;
        this.f15669l = iVar;
        this.f15666i = bVar;
        this.f15668k = uri;
        this.f15667j = d0Var;
        this.f15670m = arrayList;
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
            if (i10 >= this.f15670m.size()) {
                break;
            }
            if (((e1) linkedList.peek()).f3292a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f15690c;
                e1 e1Var = (e1) linkedList.poll();
                int i11 = e1Var.f3292a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = e1Var.f3293b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f15654c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(e1Var.f3294c));
                        e1Var = (e1) linkedList.poll();
                        if (e1Var.f3292a != i11) {
                            break;
                        }
                    } while (e1Var.f3293b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f15652a, aVar.f15653b, arrayList3, aVar.d, aVar.f15655e, aVar.f15656f));
                    if (e1Var.f3292a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(e1Var);
                arrayList.add(new h(b10.f15688a, b10.f15689b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.f15661b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f15660a, j3, this.f15662c, this.d, this.f15663e, this.f15664f, this.f15665g, this.h, this.f15669l, this.f15666i, this.f15667j, this.f15668k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f15670m.get(i10);
    }

    public final long c(int i10) {
        long j3;
        long j10;
        List list = this.f15670m;
        if (i10 == list.size() - 1) {
            j3 = this.f15661b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j10 = ((h) list.get(i10)).f15689b;
        } else {
            j3 = ((h) list.get(i10 + 1)).f15689b;
            j10 = ((h) list.get(i10)).f15689b;
        }
        return j3 - j10;
    }

    public final long d(int i10) {
        return e2.d0.P(c(i10));
    }
}
