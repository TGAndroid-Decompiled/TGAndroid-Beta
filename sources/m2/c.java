package m2;

import android.net.Uri;
import b2.d0;
import b2.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements t2.a {
    public final long f14578a;
    public final long f14579b;
    public final long f14580c;
    public final boolean d;
    public final long e;
    public final long f14581f;
    public final long f14582g;
    public final long h;
    public final lf.g f14583i;
    public final d0 f14584j;
    public final Uri f14585k;
    public final i f14586l;
    public final List f14587m;

    public c(long j3, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, lf.g gVar, d0 d0Var, Uri uri, ArrayList arrayList) {
        this.f14578a = j3;
        this.f14579b = j10;
        this.f14580c = j11;
        this.d = z10;
        this.e = j12;
        this.f14581f = j13;
        this.f14582g = j14;
        this.h = j15;
        this.f14586l = iVar;
        this.f14583i = gVar;
        this.f14585k = uri;
        this.f14584j = d0Var;
        this.f14587m = arrayList;
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
            if (i10 >= this.f14587m.size()) {
                break;
            }
            if (((e1) linkedList.peek()).f2982a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f14605c;
                e1 e1Var = (e1) linkedList.poll();
                int i11 = e1Var.f2982a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = e1Var.f2983b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f14573c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(e1Var.f2984c));
                        e1Var = (e1) linkedList.poll();
                        if (e1Var.f2982a != i11) {
                            break;
                        }
                    } while (e1Var.f2983b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f14571a, aVar.f14572b, arrayList3, aVar.d, aVar.e, aVar.f14574f));
                    if (e1Var.f2982a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(e1Var);
                arrayList.add(new h(b10.f14603a, b10.f14604b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.f14579b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f14578a, j3, this.f14580c, this.d, this.e, this.f14581f, this.f14582g, this.h, this.f14586l, this.f14583i, this.f14584j, this.f14585k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f14587m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f14587m;
        if (i10 == list.size() - 1) {
            long j3 = this.f14579b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j3 - ((h) list.get(i10)).f14604b;
        }
        return ((h) list.get(i10 + 1)).f14604b - ((h) list.get(i10)).f14604b;
    }

    public final long d(int i10) {
        return e2.d0.Q(c(i10));
    }
}
