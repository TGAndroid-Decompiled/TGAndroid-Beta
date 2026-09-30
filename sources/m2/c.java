package m2;

import android.net.Uri;
import b2.d0;
import b2.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements t2.a {
    public final long f14650a;
    public final long f14651b;
    public final long f14652c;
    public final boolean d;
    public final long e;
    public final long f14653f;
    public final long f14654g;
    public final long h;
    public final lf.g f14655i;
    public final d0 f14656j;
    public final Uri f14657k;
    public final i f14658l;
    public final List f14659m;

    public c(long j3, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, lf.g gVar, d0 d0Var, Uri uri, ArrayList arrayList) {
        this.f14650a = j3;
        this.f14651b = j10;
        this.f14652c = j11;
        this.d = z10;
        this.e = j12;
        this.f14653f = j13;
        this.f14654g = j14;
        this.h = j15;
        this.f14658l = iVar;
        this.f14655i = gVar;
        this.f14657k = uri;
        this.f14656j = d0Var;
        this.f14659m = arrayList;
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
            if (i10 >= this.f14659m.size()) {
                break;
            }
            if (((e1) linkedList.peek()).f2981a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f14677c;
                e1 e1Var = (e1) linkedList.poll();
                int i11 = e1Var.f2981a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = e1Var.f2982b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f14645c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(e1Var.f2983c));
                        e1Var = (e1) linkedList.poll();
                        if (e1Var.f2981a != i11) {
                            break;
                        }
                    } while (e1Var.f2982b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f14643a, aVar.f14644b, arrayList3, aVar.d, aVar.e, aVar.f14646f));
                    if (e1Var.f2981a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(e1Var);
                arrayList.add(new h(b10.f14675a, b10.f14676b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.f14651b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f14650a, j3, this.f14652c, this.d, this.e, this.f14653f, this.f14654g, this.h, this.f14658l, this.f14655i, this.f14656j, this.f14657k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f14659m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f14659m;
        if (i10 == list.size() - 1) {
            long j3 = this.f14651b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j3 - ((h) list.get(i10)).f14676b;
        }
        return ((h) list.get(i10 + 1)).f14676b - ((h) list.get(i10)).f14676b;
    }

    public final long d(int i10) {
        return e2.d0.Q(c(i10));
    }
}
