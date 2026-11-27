package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class mk3 {
    public final int a;
    public final ik3 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public String g;
    public final ArrayList h = new ArrayList();
    public boolean i = false;

    public mk3(int i, ik3 ik3Var) {
        this.a = i;
        this.b = ik3Var;
    }

    public final void a() {
        if (!this.c && !this.e) {
            this.c = true;
            boolean z = this.d;
            int i = this.a;
            if (!z) {
                lk3 lk3Var = new lk3(this, (byte) 0);
                jf7 Y = jf7.Y(i);
                Y.a.c(new cv2(this, Y, lk3Var, (byte) 7));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i).sendRequest(getpopularappbots, new ye(this, (byte) 18));
        }
    }
}
