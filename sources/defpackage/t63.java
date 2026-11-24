package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class t63 implements jg4 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final s13 i;
    public final vs6 j;
    public final lu8 k;
    public final List l;
    public final mo5 m;

    public t63(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, lu8 lu8Var, s13 s13Var, vs6 vs6Var, ArrayList arrayList, List list) {
        mo5 q;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.k = lu8Var;
        this.i = s13Var;
        this.j = vs6Var;
        this.l = arrayList;
        if (list == null) {
            ko5 ko5Var = mo5.b;
            q = y79.e;
        } else {
            q = mo5.q(list);
        }
        this.m = q;
        if (list != null && !list.isEmpty()) {
            Uri uri = ((rb6) lne.b(list)).a;
        }
    }

    @Override
    public final Object a(List list) {
        long j;
        int i;
        long j2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new vab(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        int i2 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i2 >= this.l.size()) {
                break;
            }
            vab vabVar = (vab) linkedList.peek();
            vabVar.getClass();
            if (vabVar.a != i2) {
                long c = c(i2);
                if (c != -9223372036854775807L) {
                    j3 += c;
                }
            } else {
                h58 b = b(i2);
                List list2 = b.c;
                vab vabVar2 = (vab) linkedList.poll();
                vabVar2.getClass();
                int i3 = vabVar2.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i4 = vabVar2.b;
                    ea eaVar = (ea) list2.get(i4);
                    List list3 = eaVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    while (true) {
                        arrayList3.add((ka9) list3.get(vabVar2.c));
                        vabVar2 = (vab) linkedList.poll();
                        vabVar2.getClass();
                        i = vabVar2.a;
                        j2 = j3;
                        if (i != i3 || vabVar2.b != i4) {
                            break;
                        }
                        j3 = j2;
                    }
                    arrayList2.add(new ea(eaVar.a, eaVar.b, arrayList3, eaVar.d, eaVar.e, eaVar.f));
                    if (i != i3) {
                        break;
                    }
                    j3 = j2;
                }
                linkedList.addFirst(vabVar2);
                arrayList.add(new h58(b.a, b.b - j2, arrayList2, b.d));
                j3 = j2;
            }
            i2++;
        }
        long j4 = j3;
        long j5 = this.b;
        if (j5 != -9223372036854775807L) {
            j = j5 - j4;
        }
        return new t63(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.k, this.i, this.j, arrayList, this.m);
    }

    public final h58 b(int i) {
        return (h58) this.l.get(i);
    }

    public final long c(int i) {
        long j;
        long j2;
        List list = this.l;
        if (i == list.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((h58) list.get(i)).b;
        } else {
            j = ((h58) list.get(i + 1)).b;
            j2 = ((h58) list.get(i)).b;
        }
        return j - j2;
    }

    public final long d(int i) {
        return hac.T(c(i));
    }
}
