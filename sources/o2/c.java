package o2;

import android.net.Uri;
import d2.g0;
import d2.h1;
import g2.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements v2.a {
    public final long f20512a;
    public final long f20513b;
    public final long f20514c;
    public final boolean d;
    public final long f20515e;
    public final long f20516f;
    public final long f20517g;
    public final long h;
    public final e5.a f20518i;
    public final g0 f20519j;
    public final Uri f20520k;
    public final i f20521l;
    public final List f20522m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, i iVar, e5.a aVar, g0 g0Var, Uri uri, ArrayList arrayList) {
        this.f20512a = j10;
        this.f20513b = j11;
        this.f20514c = j12;
        this.d = z10;
        this.f20515e = j13;
        this.f20516f = j14;
        this.f20517g = j15;
        this.h = j16;
        this.f20521l = iVar;
        this.f20518i = aVar;
        this.f20520k = uri;
        this.f20519j = g0Var;
        this.f20522m = arrayList;
    }

    @Override
    public final Object a(List list) {
        long j10;
        long j11;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new h1(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        int i3 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i3 >= this.f20522m.size()) {
                break;
            }
            if (((h1) linkedList.peek()).f8127a != i3) {
                long c2 = c(i3);
                if (c2 != -9223372036854775807L) {
                    j12 += c2;
                }
            } else {
                h b10 = b(i3);
                List list2 = b10.f20542c;
                h1 h1Var = (h1) linkedList.poll();
                int i10 = h1Var.f8127a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i11 = h1Var.f8128b;
                    a aVar = (a) list2.get(i11);
                    List list3 = aVar.f20506c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(h1Var.f8129c));
                        h1Var = (h1) linkedList.poll();
                        if (h1Var.f8127a != i10) {
                            break;
                        }
                    } while (h1Var.f8128b == i11);
                    j11 = j12;
                    arrayList2.add(new a(aVar.f20504a, aVar.f20505b, arrayList3, aVar.d, aVar.f20507e, aVar.f20508f));
                    if (h1Var.f8127a != i10) {
                        break;
                    }
                    j12 = j11;
                }
                linkedList.addFirst(h1Var);
                arrayList.add(new h(b10.f20540a, b10.f20541b - j11, arrayList2, b10.d));
                j12 = j11;
            }
            i3++;
        }
        long j13 = j12;
        long j14 = this.f20513b;
        if (j14 != -9223372036854775807L) {
            j10 = j14 - j13;
        }
        return new c(this.f20512a, j10, this.f20514c, this.d, this.f20515e, this.f20516f, this.f20517g, this.h, this.f20521l, this.f20518i, this.f20519j, this.f20520k, arrayList);
    }

    public final h b(int i3) {
        return (h) this.f20522m.get(i3);
    }

    public final long c(int i3) {
        long j10;
        long j11;
        List list = this.f20522m;
        if (i3 == list.size() - 1) {
            j10 = this.f20513b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((h) list.get(i3)).f20541b;
        } else {
            j10 = ((h) list.get(i3 + 1)).f20541b;
            j11 = ((h) list.get(i3)).f20541b;
        }
        return j10 - j11;
    }

    public final long d(int i3) {
        return n0.S(c(i3));
    }
}
