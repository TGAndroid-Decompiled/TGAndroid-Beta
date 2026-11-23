package di;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class b0 {
    public final int f8537a;
    public final long f8538b;
    public int f8539c;
    public boolean d;
    public final ArrayList f8540e = new ArrayList();
    public long f8541f;
    public boolean f8542g;
    public boolean h;
    public int f8543i;

    public b0(int i7, long j3) {
        this.f8542g = false;
        this.h = false;
        this.f8537a = i7;
        this.f8538b = j3;
        if (System.currentTimeMillis() - this.f8541f > 900000) {
            this.f8539c = 0;
            this.h = false;
            this.d = false;
            if (this.f8543i != 0) {
                ConnectionsManager.getInstance(i7).cancelRequest(this.f8543i, true);
                this.f8543i = 0;
            }
            this.f8542g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f8542g && !this.h && !this.d) {
            this.f8541f = System.currentTimeMillis();
            this.f8542g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i7 = this.f8537a;
            getconnectedstarrefbots.peer = np.u1(i7).l1(this.f8538b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f8540e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i5.c.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f8543i = ConnectionsManager.getInstance(i7).sendRequest(getconnectedstarrefbots, new ai.g1(this, 1));
        }
    }
}
