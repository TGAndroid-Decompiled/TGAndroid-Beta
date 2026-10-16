package m2;

import android.net.Uri;
import b2.i0;
import b2.j1;
import e2.m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements t2.a {
    public final long f15056a;
    public final long f15057b;
    public final long f15058c;
    public final boolean d;
    public final long e;
    public final long f15059f;
    public final long f15060g;
    public final long h;
    public final t f15061i;
    public final i0 f15062j;
    public final Uri f15063k;
    public final i f15064l;
    public final List f15065m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, i iVar, t tVar, i0 i0Var, Uri uri, ArrayList arrayList) {
        this.f15056a = j10;
        this.f15057b = j11;
        this.f15058c = j12;
        this.d = z10;
        this.e = j13;
        this.f15059f = j14;
        this.f15060g = j15;
        this.h = j16;
        this.f15064l = iVar;
        this.f15061i = tVar;
        this.f15063k = uri;
        this.f15062j = i0Var;
        this.f15065m = arrayList;
    }

    @Override
    public final Object a(List list) {
        long j10;
        long j11;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new j1(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        int i10 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i10 >= this.f15065m.size()) {
                break;
            }
            if (((j1) linkedList.peek()).f2180a != i10) {
                long c10 = c(i10);
                if (c10 != -9223372036854775807L) {
                    j12 += c10;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f15083c;
                j1 j1Var = (j1) linkedList.poll();
                int i11 = j1Var.f2180a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = j1Var.f2181b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f15051c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(j1Var.f2182c));
                        j1Var = (j1) linkedList.poll();
                        if (j1Var.f2180a != i11) {
                            break;
                        }
                    } while (j1Var.f2181b == i12);
                    j11 = j12;
                    arrayList2.add(new a(aVar.f15049a, aVar.f15050b, arrayList3, aVar.d, aVar.e, aVar.f15052f));
                    if (j1Var.f2180a != i11) {
                        break;
                    }
                    j12 = j11;
                }
                linkedList.addFirst(j1Var);
                arrayList.add(new h(b10.f15081a, b10.f15082b - j11, arrayList2, b10.d));
                j12 = j11;
            }
            i10++;
        }
        long j13 = j12;
        long j14 = this.f15057b;
        if (j14 != -9223372036854775807L) {
            j10 = j14 - j13;
        }
        return new c(this.f15056a, j10, this.f15058c, this.d, this.e, this.f15059f, this.f15060g, this.h, this.f15064l, this.f15061i, this.f15062j, this.f15063k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f15065m.get(i10);
    }

    public final long c(int i10) {
        long j10;
        long j11;
        List list = this.f15065m;
        if (i10 == list.size() - 1) {
            j10 = this.f15057b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((h) list.get(i10)).f15082b;
        } else {
            j10 = ((h) list.get(i10 + 1)).f15082b;
            j11 = ((h) list.get(i10)).f15082b;
        }
        return j10 - j11;
    }

    public final long d(int i10) {
        return m0.S(c(i10));
    }
}
