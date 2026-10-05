package m2;

import android.net.Uri;
import b2.d0;
import b2.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements t2.a {
    public final long f15981a;
    public final long f15982b;
    public final long f15983c;
    public final boolean d;
    public final long f15984e;
    public final long f15985f;
    public final long f15986g;
    public final long h;
    public final lf.g f15987i;
    public final d0 f15988j;
    public final Uri f15989k;
    public final i f15990l;
    public final List f15991m;

    public c(long j3, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, lf.g gVar, d0 d0Var, Uri uri, ArrayList arrayList) {
        this.f15981a = j3;
        this.f15982b = j10;
        this.f15983c = j11;
        this.d = z10;
        this.f15984e = j12;
        this.f15985f = j13;
        this.f15986g = j14;
        this.h = j15;
        this.f15990l = iVar;
        this.f15987i = gVar;
        this.f15989k = uri;
        this.f15988j = d0Var;
        this.f15991m = arrayList;
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
            if (i10 >= this.f15991m.size()) {
                break;
            }
            if (((e1) linkedList.peek()).f3215a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f16011c;
                e1 e1Var = (e1) linkedList.poll();
                int i11 = e1Var.f3215a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = e1Var.f3216b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f15975c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(e1Var.f3217c));
                        e1Var = (e1) linkedList.poll();
                        if (e1Var.f3215a != i11) {
                            break;
                        }
                    } while (e1Var.f3216b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f15973a, aVar.f15974b, arrayList3, aVar.d, aVar.f15976e, aVar.f15977f));
                    if (e1Var.f3215a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(e1Var);
                arrayList.add(new h(b10.f16009a, b10.f16010b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.f15982b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f15981a, j3, this.f15983c, this.d, this.f15984e, this.f15985f, this.f15986g, this.h, this.f15990l, this.f15987i, this.f15988j, this.f15989k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f15991m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f15991m;
        if (i10 == list.size() - 1) {
            long j3 = this.f15982b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j3 - ((h) list.get(i10)).f16010b;
        }
        return ((h) list.get(i10 + 1)).f16010b - ((h) list.get(i10)).f16010b;
    }

    public final long d(int i10) {
        return e2.d0.Q(c(i10));
    }
}
