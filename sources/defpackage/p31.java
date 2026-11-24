package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class p31 {
    public static volatile p31[] g = new p31[4];
    public static final Object[] h = new Object[4];
    public final int a;
    public long b;
    public TL_account.connectedBots c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;

    static {
        for (int i = 0; i < 4; i++) {
            h[i] = new Object();
        }
    }

    public p31(int i) {
        this.a = i;
    }

    public static p31 a(int i) {
        p31 p31Var;
        p31 p31Var2 = g[i];
        if (p31Var2 == null) {
            synchronized (h[i]) {
                p31Var = g[i];
                if (p31Var == null) {
                    p31[] p31VarArr = g;
                    p31 p31Var3 = new p31(i);
                    p31VarArr[i] = p31Var3;
                    p31Var = p31Var3;
                }
            }
            return p31Var;
        }
        return p31Var2;
    }

    public final void b() {
        this.f = false;
        c(null);
    }

    public final void c(p8c p8cVar) {
        boolean z;
        if (p8cVar != null) {
            this.d.add(p8cVar);
        }
        if (!this.e) {
            if (System.currentTimeMillis() - this.b <= 60000 && (z = this.f)) {
                if (z) {
                    d();
                    return;
                }
                return;
            }
            this.e = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getConnectedBots(), new tf(this, (byte) 8));
        }
    }

    public final void d() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i < arrayList.size()) {
                if (arrayList.get(i) != null) {
                    ((p8c) arrayList.get(i)).a(this.c);
                }
                i++;
            } else {
                arrayList.clear();
                kk7.f(this.a).k(kk7.b4, new Object[0]);
                return;
            }
        }
    }
}
