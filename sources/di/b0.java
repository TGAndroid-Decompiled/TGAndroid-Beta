package di;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class b0 {
    public final int f8534a;
    public final long f8535b;
    public int f8536c;
    public boolean d;
    public final ArrayList f8537e = new ArrayList();
    public long f8538f;
    public boolean f8539g;
    public boolean h;
    public int f8540i;

    public b0(int i7, long j3) {
        this.f8539g = false;
        this.h = false;
        this.f8534a = i7;
        this.f8535b = j3;
        if (System.currentTimeMillis() - this.f8538f > 900000) {
            this.f8536c = 0;
            this.h = false;
            this.d = false;
            if (this.f8540i != 0) {
                ConnectionsManager.getInstance(i7).cancelRequest(this.f8540i, true);
                this.f8540i = 0;
            }
            this.f8539g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f8539g && !this.h && !this.d) {
            this.f8538f = System.currentTimeMillis();
            this.f8539g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i7 = this.f8534a;
            getconnectedstarrefbots.peer = mp.u1(i7).l1(this.f8535b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f8537e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i5.c.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f8540i = ConnectionsManager.getInstance(i7).sendRequest(getconnectedstarrefbots, new ai.g1(this, 1));
        }
    }
}
