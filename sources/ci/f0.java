package ci;

import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class f0 {
    public final int f5060a;
    public final long f5061b;
    public int f5062c;
    public boolean d;
    public final ArrayList f5063e = new ArrayList();
    public long f5064f;
    public boolean f5065g;
    public boolean h;
    public int f5066i;

    public f0(int i3, long j10) {
        this.f5065g = false;
        this.h = false;
        this.f5060a = i3;
        this.f5061b = j10;
        if (System.currentTimeMillis() - this.f5064f > 900000) {
            this.f5062c = 0;
            this.h = false;
            this.d = false;
            if (this.f5066i != 0) {
                ConnectionsManager.getInstance(i3).cancelRequest(this.f5066i, true);
                this.f5066i = 0;
            }
            this.f5065g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f5065g && !this.h && !this.d) {
            this.f5064f = System.currentTimeMillis();
            this.f5065g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i3 = this.f5060a;
            getconnectedstarrefbots.peer = hp.s1(i3).j1(this.f5061b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f5063e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) k2.p1.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f5066i = ConnectionsManager.getInstance(i3).sendRequest(getconnectedstarrefbots, new d0(this, 0));
        }
    }
}
