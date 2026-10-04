package m2;

import android.net.Uri;
import b2.d0;
import b2.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements t2.a {
    public final long f15976a;
    public final long f15977b;
    public final long f15978c;
    public final boolean d;
    public final long f15979e;
    public final long f15980f;
    public final long f15981g;
    public final long h;
    public final lf.g f15982i;
    public final d0 f15983j;
    public final Uri f15984k;
    public final i f15985l;
    public final List f15986m;

    public c(long j3, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, lf.g gVar, d0 d0Var, Uri uri, ArrayList arrayList) {
        this.f15976a = j3;
        this.f15977b = j10;
        this.f15978c = j11;
        this.d = z10;
        this.f15979e = j12;
        this.f15980f = j13;
        this.f15981g = j14;
        this.h = j15;
        this.f15985l = iVar;
        this.f15982i = gVar;
        this.f15984k = uri;
        this.f15983j = d0Var;
        this.f15986m = arrayList;
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
            if (i10 >= this.f15986m.size()) {
                break;
            }
            if (((e1) linkedList.peek()).f3215a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f16006c;
                e1 e1Var = (e1) linkedList.poll();
                int i11 = e1Var.f3215a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = e1Var.f3216b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f15970c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(e1Var.f3217c));
                        e1Var = (e1) linkedList.poll();
                        if (e1Var.f3215a != i11) {
                            break;
                        }
                    } while (e1Var.f3216b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f15968a, aVar.f15969b, arrayList3, aVar.d, aVar.f15971e, aVar.f15972f));
                    if (e1Var.f3215a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(e1Var);
                arrayList.add(new h(b10.f16004a, b10.f16005b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.f15977b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f15976a, j3, this.f15978c, this.d, this.f15979e, this.f15980f, this.f15981g, this.h, this.f15985l, this.f15982i, this.f15983j, this.f15984k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f15986m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f15986m;
        if (i10 == list.size() - 1) {
            long j3 = this.f15977b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j3 - ((h) list.get(i10)).f16005b;
        }
        return ((h) list.get(i10 + 1)).f16005b - ((h) list.get(i10)).f16005b;
    }

    public final long d(int i10) {
        return e2.d0.Q(c(i10));
    }
}
