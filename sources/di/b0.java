package di;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class b0 {
    public final int f8513a;
    public final long f8514b;
    public int f8515c;
    public boolean d;
    public final ArrayList f8516e = new ArrayList();
    public long f8517f;
    public boolean f8518g;
    public boolean h;
    public int f8519i;

    public b0(int i7, long j3) {
        this.f8518g = false;
        this.h = false;
        this.f8513a = i7;
        this.f8514b = j3;
        if (System.currentTimeMillis() - this.f8517f > 900000) {
            this.f8515c = 0;
            this.h = false;
            this.d = false;
            if (this.f8519i != 0) {
                ConnectionsManager.getInstance(i7).cancelRequest(this.f8519i, true);
                this.f8519i = 0;
            }
            this.f8518g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f8518g && !this.h && !this.d) {
            this.f8517f = System.currentTimeMillis();
            this.f8518g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i7 = this.f8513a;
            getconnectedstarrefbots.peer = mp.u1(i7).l1(this.f8514b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f8516e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i5.c.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f8519i = ConnectionsManager.getInstance(i7).sendRequest(getconnectedstarrefbots, new ai.e1(this, 1));
        }
    }
}
