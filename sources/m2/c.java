package m2;

import android.net.Uri;
import b2.i0;
import b2.i1;
import e2.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements t2.a {
    public final long f12631a;
    public final long f12632b;
    public final long f12633c;
    public final boolean d;
    public final long e;
    public final long f12634f;
    public final long f12635g;
    public final long h;
    public final c5.a f12636i;
    public final i0 f12637j;
    public final Uri f12638k;
    public final i f12639l;
    public final List f12640m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, i iVar, c5.a aVar, i0 i0Var, Uri uri, ArrayList arrayList) {
        this.f12631a = j10;
        this.f12632b = j11;
        this.f12633c = j12;
        this.d = z10;
        this.e = j13;
        this.f12634f = j14;
        this.f12635g = j15;
        this.h = j16;
        this.f12639l = iVar;
        this.f12636i = aVar;
        this.f12638k = uri;
        this.f12637j = i0Var;
        this.f12640m = arrayList;
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
            if (i10 >= this.f12640m.size()) {
                break;
            }
            if (((i1) linkedList.peek()).f2068a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j12 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f12658c;
                i1 i1Var = (i1) linkedList.poll();
                int i11 = i1Var.f2068a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = i1Var.f2069b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f12626c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(i1Var.f2070c));
                        i1Var = (i1) linkedList.poll();
                        if (i1Var.f2068a != i11) {
                            break;
                        }
                    } while (i1Var.f2069b == i12);
                    j11 = j12;
                    arrayList2.add(new a(aVar.f12624a, aVar.f12625b, arrayList3, aVar.d, aVar.e, aVar.f12627f));
                    if (i1Var.f2068a != i11) {
                        break;
                    }
                    j12 = j11;
                }
                linkedList.addFirst(i1Var);
                arrayList.add(new h(b10.f12656a, b10.f12657b - j11, arrayList2, b10.d));
                j12 = j11;
            }
            i10++;
        }
        long j13 = j12;
        long j14 = this.f12632b;
        if (j14 != -9223372036854775807L) {
            j10 = j14 - j13;
        }
        return new c(this.f12631a, j10, this.f12633c, this.d, this.e, this.f12634f, this.f12635g, this.h, this.f12639l, this.f12636i, this.f12637j, this.f12638k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f12640m.get(i10);
    }

    public final long c(int i10) {
        long j10;
        long j11;
        List list = this.f12640m;
        if (i10 == list.size() - 1) {
            j10 = this.f12632b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((h) list.get(i10)).f12657b;
        } else {
            j10 = ((h) list.get(i10 + 1)).f12657b;
            j11 = ((h) list.get(i10)).f12657b;
        }
        return j10 - j11;
    }

    public final long d(int i10) {
        return l0.S(c(i10));
    }
}
