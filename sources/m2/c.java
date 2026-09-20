package m2;

import android.net.Uri;
import b2.d0;
import b2.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements t2.a {
    public final long f14614a;
    public final long f14615b;
    public final long f14616c;
    public final boolean d;
    public final long e;
    public final long f14617f;
    public final long f14618g;
    public final long h;
    public final c5.a f14619i;
    public final d0 f14620j;
    public final Uri f14621k;
    public final i f14622l;
    public final List f14623m;

    public c(long j3, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, c5.a aVar, d0 d0Var, Uri uri, ArrayList arrayList) {
        this.f14614a = j3;
        this.f14615b = j10;
        this.f14616c = j11;
        this.d = z10;
        this.e = j12;
        this.f14617f = j13;
        this.f14618g = j14;
        this.h = j15;
        this.f14622l = iVar;
        this.f14619i = aVar;
        this.f14621k = uri;
        this.f14620j = d0Var;
        this.f14623m = arrayList;
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
            if (i10 >= this.f14623m.size()) {
                break;
            }
            if (((e1) linkedList.peek()).f2982a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f14641c;
                e1 e1Var = (e1) linkedList.poll();
                int i11 = e1Var.f2982a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = e1Var.f2983b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f14609c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(e1Var.f2984c));
                        e1Var = (e1) linkedList.poll();
                        if (e1Var.f2982a != i11) {
                            break;
                        }
                    } while (e1Var.f2983b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f14607a, aVar.f14608b, arrayList3, aVar.d, aVar.e, aVar.f14610f));
                    if (e1Var.f2982a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(e1Var);
                arrayList.add(new h(b10.f14639a, b10.f14640b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.f14615b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f14614a, j3, this.f14616c, this.d, this.e, this.f14617f, this.f14618g, this.h, this.f14622l, this.f14619i, this.f14620j, this.f14621k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f14623m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f14623m;
        if (i10 == list.size() - 1) {
            long j3 = this.f14615b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j3 - ((h) list.get(i10)).f14640b;
        }
        return ((h) list.get(i10 + 1)).f14640b - ((h) list.get(i10)).f14640b;
    }

    public final long d(int i10) {
        return e2.d0.Q(c(i10));
    }
}
