package n4;

import android.net.Uri;
import d5.f0;
import h3.a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements i4.a {
    public final long f18390a;
    public final long f18391b;
    public final long f18392c;
    public final boolean d;
    public final long f18393e;
    public final long f18394f;
    public final long f18395g;
    public final long h;
    public final b9.c f18396i;
    public final a1 f18397j;
    public final Uri f18398k;
    public final i f18399l;
    public final List f18400m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, i iVar, b9.c cVar, a1 a1Var, Uri uri, ArrayList arrayList) {
        this.f18390a = j10;
        this.f18391b = j11;
        this.f18392c = j12;
        this.d = z10;
        this.f18393e = j13;
        this.f18394f = j14;
        this.f18395g = j15;
        this.h = j16;
        this.f18399l = iVar;
        this.f18396i = cVar;
        this.f18398k = uri;
        this.f18397j = a1Var;
        this.f18400m = arrayList;
    }

    @Override
    public final Object a(List list) {
        long j10;
        long j11;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new i4.b());
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        int i9 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i9 >= this.f18400m.size()) {
                break;
            }
            if (((i4.b) linkedList.peek()).f10923a != i9) {
                long c10 = c(i9);
                if (c10 != -9223372036854775807L) {
                    j12 += c10;
                }
            } else {
                h b10 = b(i9);
                List list2 = b10.f18419c;
                i4.b bVar = (i4.b) linkedList.poll();
                int i10 = bVar.f10923a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i11 = bVar.f10924b;
                    a aVar = (a) list2.get(i11);
                    List list3 = aVar.f18384c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(bVar.f10925c));
                        bVar = (i4.b) linkedList.poll();
                        if (bVar.f10923a != i10) {
                            break;
                        }
                    } while (bVar.f10924b == i11);
                    j11 = j12;
                    arrayList2.add(new a(aVar.f18382a, aVar.f18383b, arrayList3, aVar.d, aVar.f18385e, aVar.f18386f));
                    if (bVar.f10923a != i10) {
                        break;
                    }
                    j12 = j11;
                }
                linkedList.addFirst(bVar);
                arrayList.add(new h(b10.f18417a, b10.f18418b - j11, arrayList2, b10.d));
                j12 = j11;
            }
            i9++;
        }
        long j13 = j12;
        long j14 = this.f18391b;
        if (j14 != -9223372036854775807L) {
            j10 = j14 - j13;
        }
        a1 a1Var = this.f18397j;
        Uri uri = this.f18398k;
        return new c(this.f18390a, j10, this.f18392c, this.d, this.f18393e, this.f18394f, this.f18395g, this.h, this.f18399l, this.f18396i, a1Var, uri, arrayList);
    }

    public final h b(int i9) {
        return (h) this.f18400m.get(i9);
    }

    public final long c(int i9) {
        List list = this.f18400m;
        if (i9 == list.size() - 1) {
            long j10 = this.f18391b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j10 - ((h) list.get(i9)).f18418b;
        }
        return ((h) list.get(i9 + 1)).f18418b - ((h) list.get(i9)).f18418b;
    }

    public final long d(int i9) {
        return f0.H(c(i9));
    }
}
