package ai;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class h0 {
    public final int f1377a;
    public final long f1378b;
    public int f1379c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f1380f;
    public boolean f1381g;
    public boolean h;
    public int f1382i;

    public h0(int i10, long j10) {
        this.f1381g = false;
        this.h = false;
        this.f1377a = i10;
        this.f1378b = j10;
        if (System.currentTimeMillis() - this.f1380f > 900000) {
            this.f1379c = 0;
            this.h = false;
            this.d = false;
            if (this.f1382i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f1382i, true);
                this.f1382i = 0;
            }
            this.f1381g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f1381g && !this.h && !this.d) {
            this.f1380f = System.currentTimeMillis();
            this.f1381g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f1377a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f1378b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i2.o1.i(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f1382i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new h(this, 1));
        }
    }
}
