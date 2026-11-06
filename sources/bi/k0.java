package bi;

import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class k0 {
    public final int f4128a;
    public final long f4129b;
    public int f4130c;
    public boolean d;
    public final ArrayList f4131e = new ArrayList();
    public long f4132f;
    public boolean f4133g;
    public boolean h;
    public int f4134i;

    public k0(int i7, long j3) {
        this.f4133g = false;
        this.h = false;
        this.f4128a = i7;
        this.f4129b = j3;
        if (System.currentTimeMillis() - this.f4132f > 900000) {
            this.f4130c = 0;
            this.h = false;
            this.d = false;
            if (this.f4134i != 0) {
                ConnectionsManager.getInstance(i7).cancelRequest(this.f4134i, true);
                this.f4134i = 0;
            }
            this.f4133g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f4133g && !this.h && !this.d) {
            this.f4132f = System.currentTimeMillis();
            this.f4133g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i7 = this.f4128a;
            getconnectedstarrefbots.peer = qp.s1(i7).j1(this.f4129b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f4131e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) jg.g.i(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f4134i = ConnectionsManager.getInstance(i7).sendRequest(getconnectedstarrefbots, new j0(this, 0));
        }
    }
}
