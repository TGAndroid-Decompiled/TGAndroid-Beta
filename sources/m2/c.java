package m2;

import android.net.Uri;
import b2.d0;
import b2.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements t2.a {
    public final long f15756a;
    public final long f15757b;
    public final long f15758c;
    public final boolean d;
    public final long f15759e;
    public final long f15760f;
    public final long f15761g;
    public final long h;
    public final u f15762i;
    public final d0 f15763j;
    public final Uri f15764k;
    public final i f15765l;
    public final List f15766m;

    public c(long j3, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, u uVar, d0 d0Var, Uri uri, ArrayList arrayList) {
        this.f15756a = j3;
        this.f15757b = j10;
        this.f15758c = j11;
        this.d = z10;
        this.f15759e = j12;
        this.f15760f = j13;
        this.f15761g = j14;
        this.h = j15;
        this.f15765l = iVar;
        this.f15762i = uVar;
        this.f15764k = uri;
        this.f15763j = d0Var;
        this.f15766m = arrayList;
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
            if (i10 >= this.f15766m.size()) {
                break;
            }
            if (((e1) linkedList.peek()).f2021a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f15786c;
                e1 e1Var = (e1) linkedList.poll();
                int i11 = e1Var.f2021a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = e1Var.f2022b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f15750c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(e1Var.f2023c));
                        e1Var = (e1) linkedList.poll();
                        if (e1Var.f2021a != i11) {
                            break;
                        }
                    } while (e1Var.f2022b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f15748a, aVar.f15749b, arrayList3, aVar.d, aVar.f15751e, aVar.f15752f));
                    if (e1Var.f2021a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(e1Var);
                arrayList.add(new h(b10.f15784a, b10.f15785b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.f15757b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f15756a, j3, this.f15758c, this.d, this.f15759e, this.f15760f, this.f15761g, this.h, this.f15765l, this.f15762i, this.f15763j, this.f15764k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f15766m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f15766m;
        if (i10 == list.size() - 1) {
            long j3 = this.f15757b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j3 - ((h) list.get(i10)).f15785b;
        }
        return ((h) list.get(i10 + 1)).f15785b - ((h) list.get(i10)).f15785b;
    }

    public final long d(int i10) {
        return e2.d0.Q(c(i10));
    }
}
