package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_update;
public final class v4c {
    public final int a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean g;
    public final ArrayList b = new ArrayList();
    public final r4c f = new r4c(this, (byte) 0);

    public v4c(int i) {
        this.a = i;
        if (!this.c && !this.d) {
            this.d = true;
            ad7.Y(i).a.c(new r4c(this, (byte) 1));
        }
    }

    public final void a() {
        this.b.clear();
        d();
        kk7.f(this.a).k(kk7.e3, new Object[0]);
        e();
    }

    public final void b(TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.b;
            if (i >= arrayList.size()) {
                break;
            }
            u4c u4cVar = (u4c) arrayList.get(i);
            if (u4cVar != null && !u4cVar.a && u4cVar.b == tL_updateNewAuthorization.hash) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        if (tL_updateNewAuthorization.unconfirmed) {
            arrayList.add(new u4c(this, tL_updateNewAuthorization));
        }
        kk7.f(this.a).k(kk7.e3, new Object[0]);
        e();
        d();
    }

    public final void c(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                u4c u4cVar = (u4c) arrayList.get(i);
                if (u4cVar != null && u4cVar.a && u4cVar.c == tL_updateNewBotConnection.bot_id) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            } else {
                arrayList.add(new u4c(this, tL_updateNewBotConnection));
                kk7.f(this.a).k(kk7.e3, new Object[0]);
                e();
                d();
                return;
            }
        }
    }

    public final void d() {
        if (this.g) {
            return;
        }
        if (this.d) {
            this.e = true;
            return;
        }
        this.g = true;
        ad7.Y(this.a).a.c(new r4c(this, (byte) 2));
    }

    public final void e() {
        r4c r4cVar = this.f;
        gl.r(r4cVar);
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            long j = Long.MAX_VALUE;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                j = Math.min(j, ((u4c) obj).a());
            }
            if (j == Long.MAX_VALUE) {
                return;
            }
            gl.d3(r4cVar, Math.max(0L, j * 1000));
        }
    }

    public final void f(boolean z, ArrayList arrayList, p8c p8cVar) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        boolean[] zArr = new boolean[arrayList2.size()];
        p8c[] p8cVarArr = new p8c[arrayList2.size()];
        for (int i = 0; i < arrayList2.size(); i++) {
            p8cVarArr[i] = new p22(zArr, i, z, (u4c) arrayList2.get(i));
        }
        Utilities.B(new z77(this, zArr, arrayList2, z, p8cVar, (byte) 24), p8cVarArr);
        if (z) {
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                hashSet.add(Long.valueOf(((u4c) arrayList2.get(i2)).b));
            }
            int i3 = 0;
            while (true) {
                ArrayList arrayList3 = this.b;
                if (i3 >= arrayList3.size()) {
                    break;
                }
                if (hashSet.contains(Long.valueOf(((u4c) arrayList3.get(i3)).b))) {
                    arrayList3.remove(i3);
                    i3--;
                }
                i3++;
            }
            if (!hashSet.isEmpty()) {
                d();
                kk7.f(this.a).k(kk7.e3, new Object[0]);
                e();
            }
        }
    }
}
