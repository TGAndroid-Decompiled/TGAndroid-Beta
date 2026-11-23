package di;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class b0 {
    public final int f8499a;
    public final long f8500b;
    public int f8501c;
    public boolean d;
    public final ArrayList f8502e = new ArrayList();
    public long f8503f;
    public boolean f8504g;
    public boolean h;
    public int f8505i;

    public b0(int i7, long j3) {
        this.f8504g = false;
        this.h = false;
        this.f8499a = i7;
        this.f8500b = j3;
        if (System.currentTimeMillis() - this.f8503f > 900000) {
            this.f8501c = 0;
            this.h = false;
            this.d = false;
            if (this.f8505i != 0) {
                ConnectionsManager.getInstance(i7).cancelRequest(this.f8505i, true);
                this.f8505i = 0;
            }
            this.f8504g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f8504g && !this.h && !this.d) {
            this.f8503f = System.currentTimeMillis();
            this.f8504g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i7 = this.f8499a;
            getconnectedstarrefbots.peer = mp.u1(i7).l1(this.f8500b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f8502e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i5.c.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f8505i = ConnectionsManager.getInstance(i7).sendRequest(getconnectedstarrefbots, new ai.b1(this, 1));
        }
    }
}
