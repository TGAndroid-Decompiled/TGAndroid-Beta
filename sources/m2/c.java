package m2;

import android.net.Uri;
import b2.d0;
import b2.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements t2.a {
    public final long f15661a;
    public final long f15662b;
    public final long f15663c;
    public final boolean d;
    public final long f15664e;
    public final long f15665f;
    public final long f15666g;
    public final long h;
    public final pf.b f15667i;
    public final d0 f15668j;
    public final Uri f15669k;
    public final i f15670l;
    public final List f15671m;

    public c(long j3, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, pf.b bVar, d0 d0Var, Uri uri, ArrayList arrayList) {
        this.f15661a = j3;
        this.f15662b = j10;
        this.f15663c = j11;
        this.d = z10;
        this.f15664e = j12;
        this.f15665f = j13;
        this.f15666g = j14;
        this.h = j15;
        this.f15670l = iVar;
        this.f15667i = bVar;
        this.f15669k = uri;
        this.f15668j = d0Var;
        this.f15671m = arrayList;
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
            if (i10 >= this.f15671m.size()) {
                break;
            }
            if (((e1) linkedList.peek()).f3292a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f15691c;
                e1 e1Var = (e1) linkedList.poll();
                int i11 = e1Var.f3292a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = e1Var.f3293b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f15655c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(e1Var.f3294c));
                        e1Var = (e1) linkedList.poll();
                        if (e1Var.f3292a != i11) {
                            break;
                        }
                    } while (e1Var.f3293b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f15653a, aVar.f15654b, arrayList3, aVar.d, aVar.f15656e, aVar.f15657f));
                    if (e1Var.f3292a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(e1Var);
                arrayList.add(new h(b10.f15689a, b10.f15690b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.f15662b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f15661a, j3, this.f15663c, this.d, this.f15664e, this.f15665f, this.f15666g, this.h, this.f15670l, this.f15667i, this.f15668j, this.f15669k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f15671m.get(i10);
    }

    public final long c(int i10) {
        long j3;
        long j10;
        List list = this.f15671m;
        if (i10 == list.size() - 1) {
            j3 = this.f15662b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j10 = ((h) list.get(i10)).f15690b;
        } else {
            j3 = ((h) list.get(i10 + 1)).f15690b;
            j10 = ((h) list.get(i10)).f15690b;
        }
        return j3 - j10;
    }

    public final long d(int i10) {
        return e2.d0.P(c(i10));
    }
}
