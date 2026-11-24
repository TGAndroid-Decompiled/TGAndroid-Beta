package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class fl3 {
    public final int a;
    public final bl3 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public String g;
    public final ArrayList h = new ArrayList();
    public boolean i = false;

    public fl3(int i, bl3 bl3Var) {
        this.a = i;
        this.b = bl3Var;
    }

    public final void a() {
        if (!this.c && !this.e) {
            this.c = true;
            boolean z = this.d;
            int i = this.a;
            if (!z) {
                el3 el3Var = new el3(this, (byte) 0);
                cf7 Y = cf7.Y(i);
                Y.a.c(new pz2(this, Y, el3Var, (byte) 5));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i).sendRequest(getpopularappbots, new tg(this, (byte) 18));
        }
    }
}
