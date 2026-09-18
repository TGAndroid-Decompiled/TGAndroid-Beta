package m2;

import android.net.Uri;
import b2.d0;
import b2.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements t2.a {
    public final long f14403a;
    public final long f14404b;
    public final long f14405c;
    public final boolean d;
    public final long e;
    public final long f14406f;
    public final long f14407g;
    public final long h;
    public final lf.g f14408i;
    public final d0 f14409j;
    public final Uri f14410k;
    public final i f14411l;
    public final List f14412m;

    public c(long j3, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, lf.g gVar, d0 d0Var, Uri uri, ArrayList arrayList) {
        this.f14403a = j3;
        this.f14404b = j10;
        this.f14405c = j11;
        this.d = z10;
        this.e = j12;
        this.f14406f = j13;
        this.f14407g = j14;
        this.h = j15;
        this.f14411l = iVar;
        this.f14408i = gVar;
        this.f14410k = uri;
        this.f14409j = d0Var;
        this.f14412m = arrayList;
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
            if (i10 >= this.f14412m.size()) {
                break;
            }
            if (((e1) linkedList.peek()).f2982a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f14430c;
                e1 e1Var = (e1) linkedList.poll();
                int i11 = e1Var.f2982a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = e1Var.f2983b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f14398c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(e1Var.f2984c));
                        e1Var = (e1) linkedList.poll();
                        if (e1Var.f2982a != i11) {
                            break;
                        }
                    } while (e1Var.f2983b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f14396a, aVar.f14397b, arrayList3, aVar.d, aVar.e, aVar.f14399f));
                    if (e1Var.f2982a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(e1Var);
                arrayList.add(new h(b10.f14428a, b10.f14429b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.f14404b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f14403a, j3, this.f14405c, this.d, this.e, this.f14406f, this.f14407g, this.h, this.f14411l, this.f14408i, this.f14409j, this.f14410k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f14412m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f14412m;
        if (i10 == list.size() - 1) {
            long j3 = this.f14404b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j3 - ((h) list.get(i10)).f14429b;
        }
        return ((h) list.get(i10 + 1)).f14429b - ((h) list.get(i10)).f14429b;
    }

    public final long d(int i10) {
        return e2.d0.Q(c(i10));
    }
}
