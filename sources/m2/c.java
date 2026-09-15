package m2;

import android.net.Uri;
import b2.d0;
import b2.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements t2.a {
    public final long f14393a;
    public final long f14394b;
    public final long f14395c;
    public final boolean d;
    public final long e;
    public final long f14396f;
    public final long f14397g;
    public final long h;
    public final lf.g f14398i;
    public final d0 f14399j;
    public final Uri f14400k;
    public final i f14401l;
    public final List f14402m;

    public c(long j3, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, lf.g gVar, d0 d0Var, Uri uri, ArrayList arrayList) {
        this.f14393a = j3;
        this.f14394b = j10;
        this.f14395c = j11;
        this.d = z10;
        this.e = j12;
        this.f14396f = j13;
        this.f14397g = j14;
        this.h = j15;
        this.f14401l = iVar;
        this.f14398i = gVar;
        this.f14400k = uri;
        this.f14399j = d0Var;
        this.f14402m = arrayList;
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
            if (i10 >= this.f14402m.size()) {
                break;
            }
            if (((e1) linkedList.peek()).f2977a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f14420c;
                e1 e1Var = (e1) linkedList.poll();
                int i11 = e1Var.f2977a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = e1Var.f2978b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f14388c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(e1Var.f2979c));
                        e1Var = (e1) linkedList.poll();
                        if (e1Var.f2977a != i11) {
                            break;
                        }
                    } while (e1Var.f2978b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f14386a, aVar.f14387b, arrayList3, aVar.d, aVar.e, aVar.f14389f));
                    if (e1Var.f2977a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(e1Var);
                arrayList.add(new h(b10.f14418a, b10.f14419b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.f14394b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f14393a, j3, this.f14395c, this.d, this.e, this.f14396f, this.f14397g, this.h, this.f14401l, this.f14398i, this.f14399j, this.f14400k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f14402m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f14402m;
        if (i10 == list.size() - 1) {
            long j3 = this.f14394b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j3 - ((h) list.get(i10)).f14419b;
        }
        return ((h) list.get(i10 + 1)).f14419b - ((h) list.get(i10)).f14419b;
    }

    public final long d(int i10) {
        return e2.d0.Q(c(i10));
    }
}
