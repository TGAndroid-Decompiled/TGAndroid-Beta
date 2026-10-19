package ai;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class h0 {
    public final int f1382a;
    public final long f1383b;
    public int f1384c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f1385f;
    public boolean f1386g;
    public boolean h;
    public int f1387i;

    public h0(int i10, long j10) {
        this.f1386g = false;
        this.h = false;
        this.f1382a = i10;
        this.f1383b = j10;
        if (System.currentTimeMillis() - this.f1385f > 900000) {
            this.f1384c = 0;
            this.h = false;
            this.d = false;
            if (this.f1387i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f1387i, true);
                this.f1387i = 0;
            }
            this.f1386g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f1386g && !this.h && !this.d) {
            this.f1385f = System.currentTimeMillis();
            this.f1386g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f1382a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f1383b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i2.e.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f1387i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new h(this, 1));
        }
    }
}
