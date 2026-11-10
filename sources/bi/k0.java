package bi;

import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class k0 {
    public final int f4125a;
    public final long f4126b;
    public int f4127c;
    public boolean d;
    public final ArrayList f4128e = new ArrayList();
    public long f4129f;
    public boolean f4130g;
    public boolean h;
    public int f4131i;

    public k0(int i7, long j3) {
        this.f4130g = false;
        this.h = false;
        this.f4125a = i7;
        this.f4126b = j3;
        if (System.currentTimeMillis() - this.f4129f > 900000) {
            this.f4127c = 0;
            this.h = false;
            this.d = false;
            if (this.f4131i != 0) {
                ConnectionsManager.getInstance(i7).cancelRequest(this.f4131i, true);
                this.f4131i = 0;
            }
            this.f4130g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f4130g && !this.h && !this.d) {
            this.f4129f = System.currentTimeMillis();
            this.f4130g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i7 = this.f4125a;
            getconnectedstarrefbots.peer = qp.s1(i7).j1(this.f4126b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f4128e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) jg.g.i(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f4131i = ConnectionsManager.getInstance(i7).sendRequest(getconnectedstarrefbots, new j0(this, 0));
        }
    }
}
