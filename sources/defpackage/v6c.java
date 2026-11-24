package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_update;
public final class v6c {
    public final int a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean g;
    public final ArrayList b = new ArrayList();
    public final r6c f = new r6c(this, (byte) 0);

    public v6c(int i) {
        this.a = i;
        if (!this.c && !this.d) {
            this.d = true;
            cf7.Y(i).a.c(new r6c(this, (byte) 1));
        }
    }

    public final void a() {
        this.b.clear();
        d();
        nm7.f(this.a).k(nm7.f3, new Object[0]);
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
            u6c u6cVar = (u6c) arrayList.get(i);
            if (u6cVar != null && !u6cVar.a && u6cVar.b == tL_updateNewAuthorization.hash) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        if (tL_updateNewAuthorization.unconfirmed) {
            arrayList.add(new u6c(this, tL_updateNewAuthorization));
        }
        nm7.f(this.a).k(nm7.f3, new Object[0]);
        e();
        d();
    }

    public final void c(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                u6c u6cVar = (u6c) arrayList.get(i);
                if (u6cVar != null && u6cVar.a && u6cVar.c == tL_updateNewBotConnection.bot_id) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            } else {
                arrayList.add(new u6c(this, tL_updateNewBotConnection));
                nm7.f(this.a).k(nm7.f3, new Object[0]);
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
        cf7.Y(this.a).a.c(new r6c(this, (byte) 2));
    }

    public final void e() {
        r6c r6cVar = this.f;
        gm.r(r6cVar);
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            long j = Long.MAX_VALUE;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                j = Math.min(j, ((u6c) obj).a());
            }
            if (j == Long.MAX_VALUE) {
                return;
            }
            gm.d3(r6cVar, Math.max(0L, j * 1000));
        }
    }

    public final void f(boolean z, ArrayList arrayList, qac qacVar) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        boolean[] zArr = new boolean[arrayList2.size()];
        qac[] qacVarArr = new qac[arrayList2.size()];
        for (int i = 0; i < arrayList2.size(); i++) {
            qacVarArr[i] = new b42(zArr, i, z, (u6c) arrayList2.get(i));
        }
        Utilities.B(new aa7(this, zArr, arrayList2, z, qacVar, (byte) 24), qacVarArr);
        if (z) {
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                hashSet.add(Long.valueOf(((u6c) arrayList2.get(i2)).b));
            }
            int i3 = 0;
            while (true) {
                ArrayList arrayList3 = this.b;
                if (i3 >= arrayList3.size()) {
                    break;
                }
                if (hashSet.contains(Long.valueOf(((u6c) arrayList3.get(i3)).b))) {
                    arrayList3.remove(i3);
                    i3--;
                }
                i3++;
            }
            if (!hashSet.isEmpty()) {
                d();
                nm7.f(this.a).k(nm7.f3, new Object[0]);
                e();
            }
        }
    }
}
