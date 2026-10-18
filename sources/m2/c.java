package m2;

import android.net.Uri;
import b2.h0;
import b2.i1;
import e2.m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements t2.a {
    public final long f16414a;
    public final long f16415b;
    public final long f16416c;
    public final boolean d;
    public final long e;
    public final long f16417f;
    public final long f16418g;
    public final long h;
    public final t f16419i;
    public final h0 f16420j;
    public final Uri f16421k;
    public final i f16422l;
    public final List f16423m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, i iVar, t tVar, h0 h0Var, Uri uri, ArrayList arrayList) {
        this.f16414a = j10;
        this.f16415b = j11;
        this.f16416c = j12;
        this.d = z10;
        this.e = j13;
        this.f16417f = j14;
        this.f16418g = j15;
        this.h = j16;
        this.f16422l = iVar;
        this.f16419i = tVar;
        this.f16421k = uri;
        this.f16420j = h0Var;
        this.f16423m = arrayList;
    }

    @Override
    public final Object a(List list) {
        long j10;
        long j11;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new i1(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        int i10 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i10 >= this.f16423m.size()) {
                break;
            }
            if (((i1) linkedList.peek()).f3789a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j12 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f16441c;
                i1 i1Var = (i1) linkedList.poll();
                int i11 = i1Var.f3789a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = i1Var.f3790b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f16409c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(i1Var.f3791c));
                        i1Var = (i1) linkedList.poll();
                        if (i1Var.f3789a != i11) {
                            break;
                        }
                    } while (i1Var.f3790b == i12);
                    j11 = j12;
                    arrayList2.add(new a(aVar.f16407a, aVar.f16408b, arrayList3, aVar.d, aVar.e, aVar.f16410f));
                    if (i1Var.f3789a != i11) {
                        break;
                    }
                    j12 = j11;
                }
                linkedList.addFirst(i1Var);
                arrayList.add(new h(b10.f16439a, b10.f16440b - j11, arrayList2, b10.d));
                j12 = j11;
            }
            i10++;
        }
        long j13 = j12;
        long j14 = this.f16415b;
        if (j14 != -9223372036854775807L) {
            j10 = j14 - j13;
        }
        return new c(this.f16414a, j10, this.f16416c, this.d, this.e, this.f16417f, this.f16418g, this.h, this.f16422l, this.f16419i, this.f16420j, this.f16421k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f16423m.get(i10);
    }

    public final long c(int i10) {
        long j10;
        long j11;
        List list = this.f16423m;
        if (i10 == list.size() - 1) {
            j10 = this.f16415b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((h) list.get(i10)).f16440b;
        } else {
            j10 = ((h) list.get(i10 + 1)).f16440b;
            j11 = ((h) list.get(i10)).f16440b;
        }
        return j10 - j11;
    }

    public final long d(int i10) {
        return m0.S(c(i10));
    }
}
