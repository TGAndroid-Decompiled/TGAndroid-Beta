package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class x41 {
    public static volatile x41[] g = new x41[4];
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

    public x41(int i) {
        this.a = i;
    }

    public static x41 a(int i) {
        x41 x41Var;
        x41 x41Var2 = g[i];
        if (x41Var2 == null) {
            synchronized (h[i]) {
                x41Var = g[i];
                if (x41Var == null) {
                    x41[] x41VarArr = g;
                    x41 x41Var3 = new x41(i);
                    x41VarArr[i] = x41Var3;
                    x41Var = x41Var3;
                }
            }
            return x41Var;
        }
        return x41Var2;
    }

    public final void b() {
        this.f = false;
        c(null);
    }

    public final void c(qac qacVar) {
        boolean z;
        if (qacVar != null) {
            this.d.add(qacVar);
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
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getConnectedBots(), new tg(this, (byte) 8));
        }
    }

    public final void d() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i < arrayList.size()) {
                if (arrayList.get(i) != null) {
                    ((qac) arrayList.get(i)).a(this.c);
                }
                i++;
            } else {
                arrayList.clear();
                nm7.f(this.a).k(nm7.d4, new Object[0]);
                return;
            }
        }
    }
}
