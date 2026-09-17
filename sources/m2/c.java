package m2;

import android.net.Uri;
import b2.d0;
import b2.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements t2.a {
    public final long f15783a;
    public final long f15784b;
    public final long f15785c;
    public final boolean d;
    public final long f15786e;
    public final long f15787f;
    public final long f15788g;
    public final long h;
    public final u f15789i;
    public final d0 f15790j;
    public final Uri f15791k;
    public final i f15792l;
    public final List f15793m;

    public c(long j3, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, u uVar, d0 d0Var, Uri uri, ArrayList arrayList) {
        this.f15783a = j3;
        this.f15784b = j10;
        this.f15785c = j11;
        this.d = z10;
        this.f15786e = j12;
        this.f15787f = j13;
        this.f15788g = j14;
        this.h = j15;
        this.f15792l = iVar;
        this.f15789i = uVar;
        this.f15791k = uri;
        this.f15790j = d0Var;
        this.f15793m = arrayList;
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
            if (i10 >= this.f15793m.size()) {
                break;
            }
            if (((e1) linkedList.peek()).f2048a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f15813c;
                e1 e1Var = (e1) linkedList.poll();
                int i11 = e1Var.f2048a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = e1Var.f2049b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f15777c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(e1Var.f2050c));
                        e1Var = (e1) linkedList.poll();
                        if (e1Var.f2048a != i11) {
                            break;
                        }
                    } while (e1Var.f2049b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f15775a, aVar.f15776b, arrayList3, aVar.d, aVar.f15778e, aVar.f15779f));
                    if (e1Var.f2048a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(e1Var);
                arrayList.add(new h(b10.f15811a, b10.f15812b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.f15784b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f15783a, j3, this.f15785c, this.d, this.f15786e, this.f15787f, this.f15788g, this.h, this.f15792l, this.f15789i, this.f15790j, this.f15791k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f15793m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f15793m;
        if (i10 == list.size() - 1) {
            long j3 = this.f15784b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j3 - ((h) list.get(i10)).f15812b;
        }
        return ((h) list.get(i10 + 1)).f15812b - ((h) list.get(i10)).f15812b;
    }

    public final long d(int i10) {
        return e2.d0.Q(c(i10));
    }
}
