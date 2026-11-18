package di;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class b0 {
    public final int f8516a;
    public final long f8517b;
    public int f8518c;
    public boolean d;
    public final ArrayList f8519e = new ArrayList();
    public long f8520f;
    public boolean f8521g;
    public boolean h;
    public int f8522i;

    public b0(int i7, long j3) {
        this.f8521g = false;
        this.h = false;
        this.f8516a = i7;
        this.f8517b = j3;
        if (System.currentTimeMillis() - this.f8520f > 900000) {
            this.f8518c = 0;
            this.h = false;
            this.d = false;
            if (this.f8522i != 0) {
                ConnectionsManager.getInstance(i7).cancelRequest(this.f8522i, true);
                this.f8522i = 0;
            }
            this.f8521g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f8521g && !this.h && !this.d) {
            this.f8520f = System.currentTimeMillis();
            this.f8521g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i7 = this.f8516a;
            getconnectedstarrefbots.peer = mp.u1(i7).l1(this.f8517b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f8519e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i5.c.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f8522i = ConnectionsManager.getInstance(i7).sendRequest(getconnectedstarrefbots, new ai.e1(this, 1));
        }
    }
}
