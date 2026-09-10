package m2;

import android.net.Uri;
import b2.d0;
import b2.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements t2.a {
    public final long f13231a;
    public final long f13232b;
    public final long f13233c;
    public final boolean d;
    public final long e;
    public final long f13234f;
    public final long f13235g;
    public final long h;
    public final lf.g f13236i;
    public final d0 f13237j;
    public final Uri f13238k;
    public final i f13239l;
    public final List f13240m;

    public c(long j3, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, lf.g gVar, d0 d0Var, Uri uri, ArrayList arrayList) {
        this.f13231a = j3;
        this.f13232b = j10;
        this.f13233c = j11;
        this.d = z10;
        this.e = j12;
        this.f13234f = j13;
        this.f13235g = j14;
        this.h = j15;
        this.f13239l = iVar;
        this.f13236i = gVar;
        this.f13238k = uri;
        this.f13237j = d0Var;
        this.f13240m = arrayList;
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
            if (i10 >= this.f13240m.size()) {
                break;
            }
            if (((e1) linkedList.peek()).f1675a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f13258c;
                e1 e1Var = (e1) linkedList.poll();
                int i11 = e1Var.f1675a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = e1Var.f1676b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f13226c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(e1Var.f1677c));
                        e1Var = (e1) linkedList.poll();
                        if (e1Var.f1675a != i11) {
                            break;
                        }
                    } while (e1Var.f1676b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f13224a, aVar.f13225b, arrayList3, aVar.d, aVar.e, aVar.f13227f));
                    if (e1Var.f1675a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(e1Var);
                arrayList.add(new h(b10.f13256a, b10.f13257b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.f13232b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f13231a, j3, this.f13233c, this.d, this.e, this.f13234f, this.f13235g, this.h, this.f13239l, this.f13236i, this.f13237j, this.f13238k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f13240m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f13240m;
        if (i10 == list.size() - 1) {
            long j3 = this.f13232b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j3 - ((h) list.get(i10)).f13257b;
        }
        return ((h) list.get(i10 + 1)).f13257b - ((h) list.get(i10)).f13257b;
    }

    public final long d(int i10) {
        return e2.d0.Q(c(i10));
    }
}
