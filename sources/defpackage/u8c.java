package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_update;
public final class u8c {
    public final int a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean g;
    public final ArrayList b = new ArrayList();
    public final q8c f = new q8c(this, (byte) 0);

    public u8c(int i) {
        this.a = i;
        if (!this.c && !this.d) {
            this.d = true;
            jf7.Y(i).a.c(new q8c(this, (byte) 2));
        }
    }

    public final void a() {
        this.b.clear();
        d();
        jn7.f(this.a).k(jn7.f3, new Object[0]);
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
            t8c t8cVar = (t8c) arrayList.get(i);
            if (t8cVar != null && !t8cVar.a && t8cVar.b == tL_updateNewAuthorization.hash) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        if (tL_updateNewAuthorization.unconfirmed) {
            arrayList.add(new t8c(this, tL_updateNewAuthorization));
        }
        jn7.f(this.a).k(jn7.f3, new Object[0]);
        e();
        d();
    }

    public final void c(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                t8c t8cVar = (t8c) arrayList.get(i);
                if (t8cVar != null && t8cVar.a && t8cVar.c == tL_updateNewBotConnection.bot_id) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            } else {
                arrayList.add(new t8c(this, tL_updateNewBotConnection));
                jn7.f(this.a).k(jn7.f3, new Object[0]);
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
        jf7.Y(this.a).a.c(new q8c(this, (byte) 1));
    }

    public final void e() {
        q8c q8cVar = this.f;
        hl.r(q8cVar);
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            long j = Long.MAX_VALUE;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                j = Math.min(j, ((t8c) obj).a());
            }
            if (j == Long.MAX_VALUE) {
                return;
            }
            hl.d3(q8cVar, Math.max(0L, j * 1000));
        }
    }

    public final void f(boolean z, ArrayList arrayList, pcc pccVar) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        boolean[] zArr = new boolean[arrayList2.size()];
        pcc[] pccVarArr = new pcc[arrayList2.size()];
        for (int i = 0; i < arrayList2.size(); i++) {
            pccVarArr[i] = new g32(zArr, i, z, (t8c) arrayList2.get(i));
        }
        Utilities.B(new va7(this, zArr, arrayList2, z, pccVar, (byte) 24), pccVarArr);
        if (z) {
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                hashSet.add(Long.valueOf(((t8c) arrayList2.get(i2)).b));
            }
            int i3 = 0;
            while (true) {
                ArrayList arrayList3 = this.b;
                if (i3 >= arrayList3.size()) {
                    break;
                }
                if (hashSet.contains(Long.valueOf(((t8c) arrayList3.get(i3)).b))) {
                    arrayList3.remove(i3);
                    i3--;
                }
                i3++;
            }
            if (!hashSet.isEmpty()) {
                d();
                jn7.f(this.a).k(jn7.f3, new Object[0]);
                e();
            }
        }
    }
}
