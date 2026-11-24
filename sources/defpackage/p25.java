package defpackage;

import java.util.ArrayList;
import org.telegram.ui.Wallet.c;
public final class p25 implements Runnable, jm7 {
    public boolean a;
    public final nm7 b;
    public final k16 c;
    public final c d;

    public p25(nm7 nm7Var, k16 k16Var, c cVar) {
        this.b = nm7Var;
        this.c = k16Var;
        this.d = cVar;
    }

    public final void a() {
        if (!this.a) {
            c cVar = this.d;
            if (cVar.e != null) {
                ArrayList arrayList = cVar.J;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((x25) obj).d) {
                        return;
                    }
                }
                run();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.e4) {
            a();
        }
    }

    @Override
    public final void run() {
        if (this.a) {
            return;
        }
        this.a = true;
        gm.r(this);
        this.b.n(this, nm7.e4);
        this.c.run();
    }
}
