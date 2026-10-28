package m2;

import android.net.Uri;
import b2.i0;
import b2.j1;
import e2.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements t2.a {
    public final long f17934a;
    public final long f17935b;
    public final long f17936c;
    public final boolean d;
    public final long e;
    public final long f17937f;
    public final long f17938g;
    public final long h;
    public final t f17939i;
    public final i0 f17940j;
    public final Uri f17941k;
    public final i f17942l;
    public final List f17943m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, i iVar, t tVar, i0 i0Var, Uri uri, ArrayList arrayList) {
        this.f17934a = j10;
        this.f17935b = j11;
        this.f17936c = j12;
        this.d = z10;
        this.e = j13;
        this.f17937f = j14;
        this.f17938g = j15;
        this.h = j16;
        this.f17942l = iVar;
        this.f17939i = tVar;
        this.f17941k = uri;
        this.f17940j = i0Var;
        this.f17943m = arrayList;
    }

    @Override
    public final Object a(List list) {
        long j10;
        long j11;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new j1(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        int i10 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i10 >= this.f17943m.size()) {
                break;
            }
            if (((j1) linkedList.peek()).f3243a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j12 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f17961c;
                j1 j1Var = (j1) linkedList.poll();
                int i11 = j1Var.f3243a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = j1Var.f3244b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f17929c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(j1Var.f3245c));
                        j1Var = (j1) linkedList.poll();
                        if (j1Var.f3243a != i11) {
                            break;
                        }
                    } while (j1Var.f3244b == i12);
                    j11 = j12;
                    arrayList2.add(new a(aVar.f17927a, aVar.f17928b, arrayList3, aVar.d, aVar.e, aVar.f17930f));
                    if (j1Var.f3243a != i11) {
                        break;
                    }
                    j12 = j11;
                }
                linkedList.addFirst(j1Var);
                arrayList.add(new h(b10.f17959a, b10.f17960b - j11, arrayList2, b10.d));
                j12 = j11;
            }
            i10++;
        }
        long j13 = j12;
        long j14 = this.f17935b;
        if (j14 != -9223372036854775807L) {
            j10 = j14 - j13;
        }
        return new c(this.f17934a, j10, this.f17936c, this.d, this.e, this.f17937f, this.f17938g, this.h, this.f17942l, this.f17939i, this.f17940j, this.f17941k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f17943m.get(i10);
    }

    public final long c(int i10) {
        long j10;
        long j11;
        List list = this.f17943m;
        if (i10 == list.size() - 1) {
            j10 = this.f17935b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((h) list.get(i10)).f17960b;
        } else {
            j10 = ((h) list.get(i10 + 1)).f17960b;
            j11 = ((h) list.get(i10)).f17960b;
        }
        return j10 - j11;
    }

    public final long d(int i10) {
        return n0.S(c(i10));
    }
}
