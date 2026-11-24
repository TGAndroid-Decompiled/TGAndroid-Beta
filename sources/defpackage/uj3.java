package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class uj3 {
    public final int a;
    public final qj3 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public String g;
    public final ArrayList h = new ArrayList();
    public boolean i = false;

    public uj3(int i, qj3 qj3Var) {
        this.a = i;
        this.b = qj3Var;
    }

    public final void a() {
        if (!this.c && !this.e) {
            this.c = true;
            boolean z = this.d;
            int i = this.a;
            if (!z) {
                tj3 tj3Var = new tj3(this, (byte) 0);
                ad7 Y = ad7.Y(i);
                Y.a.c(new mg3(this, Y, tj3Var, (byte) 3));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i).sendRequest(getpopularappbots, new tf(this, (byte) 18));
        }
    }
}
