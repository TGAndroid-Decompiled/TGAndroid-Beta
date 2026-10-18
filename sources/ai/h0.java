package ai;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class h0 {
    public final int f1388a;
    public final long f1389b;
    public int f1390c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f1391f;
    public boolean f1392g;
    public boolean h;
    public int f1393i;

    public h0(int i10, long j10) {
        this.f1392g = false;
        this.h = false;
        this.f1388a = i10;
        this.f1389b = j10;
        if (System.currentTimeMillis() - this.f1391f > 900000) {
            this.f1390c = 0;
            this.h = false;
            this.d = false;
            if (this.f1393i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f1393i, true);
                this.f1393i = 0;
            }
            this.f1392g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f1392g && !this.h && !this.d) {
            this.f1391f = System.currentTimeMillis();
            this.f1392g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f1388a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f1389b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i2.d.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f1393i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new h(this, 1));
        }
    }
}
