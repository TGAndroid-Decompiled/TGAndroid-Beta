package di;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class b0 {
    public final int f8500a;
    public final long f8501b;
    public int f8502c;
    public boolean d;
    public final ArrayList f8503e = new ArrayList();
    public long f8504f;
    public boolean f8505g;
    public boolean h;
    public int f8506i;

    public b0(int i7, long j3) {
        this.f8505g = false;
        this.h = false;
        this.f8500a = i7;
        this.f8501b = j3;
        if (System.currentTimeMillis() - this.f8504f > 900000) {
            this.f8502c = 0;
            this.h = false;
            this.d = false;
            if (this.f8506i != 0) {
                ConnectionsManager.getInstance(i7).cancelRequest(this.f8506i, true);
                this.f8506i = 0;
            }
            this.f8505g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f8505g && !this.h && !this.d) {
            this.f8504f = System.currentTimeMillis();
            this.f8505g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i7 = this.f8500a;
            getconnectedstarrefbots.peer = np.u1(i7).l1(this.f8501b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f8503e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i5.c.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f8506i = ConnectionsManager.getInstance(i7).sendRequest(getconnectedstarrefbots, new ai.a1(this, 1));
        }
    }
}
