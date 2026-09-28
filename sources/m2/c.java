package m2;

import android.net.Uri;
import b2.d0;
import b2.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements t2.a {
    public final long f14635a;
    public final long f14636b;
    public final long f14637c;
    public final boolean d;
    public final long e;
    public final long f14638f;
    public final long f14639g;
    public final long h;
    public final lf.g f14640i;
    public final d0 f14641j;
    public final Uri f14642k;
    public final i f14643l;
    public final List f14644m;

    public c(long j3, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, lf.g gVar, d0 d0Var, Uri uri, ArrayList arrayList) {
        this.f14635a = j3;
        this.f14636b = j10;
        this.f14637c = j11;
        this.d = z10;
        this.e = j12;
        this.f14638f = j13;
        this.f14639g = j14;
        this.h = j15;
        this.f14643l = iVar;
        this.f14640i = gVar;
        this.f14642k = uri;
        this.f14641j = d0Var;
        this.f14644m = arrayList;
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
            if (i10 >= this.f14644m.size()) {
                break;
            }
            if (((e1) linkedList.peek()).f2974a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f14662c;
                e1 e1Var = (e1) linkedList.poll();
                int i11 = e1Var.f2974a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = e1Var.f2975b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f14630c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(e1Var.f2976c));
                        e1Var = (e1) linkedList.poll();
                        if (e1Var.f2974a != i11) {
                            break;
                        }
                    } while (e1Var.f2975b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f14628a, aVar.f14629b, arrayList3, aVar.d, aVar.e, aVar.f14631f));
                    if (e1Var.f2974a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(e1Var);
                arrayList.add(new h(b10.f14660a, b10.f14661b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.f14636b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f14635a, j3, this.f14637c, this.d, this.e, this.f14638f, this.f14639g, this.h, this.f14643l, this.f14640i, this.f14641j, this.f14642k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f14644m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f14644m;
        if (i10 == list.size() - 1) {
            long j3 = this.f14636b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j3 - ((h) list.get(i10)).f14661b;
        }
        return ((h) list.get(i10 + 1)).f14661b - ((h) list.get(i10)).f14661b;
    }

    public final long d(int i10) {
        return e2.d0.Q(c(i10));
    }
}
