package ai;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class h0 {
    public final int f1399a;
    public final long f1400b;
    public int f1401c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f1402f;
    public boolean f1403g;
    public boolean h;
    public int f1404i;

    public h0(int i10, long j10) {
        this.f1403g = false;
        this.h = false;
        this.f1399a = i10;
        this.f1400b = j10;
        if (System.currentTimeMillis() - this.f1402f > 900000) {
            this.f1401c = 0;
            this.h = false;
            this.d = false;
            if (this.f1404i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f1404i, true);
                this.f1404i = 0;
            }
            this.f1403g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f1403g && !this.h && !this.d) {
            this.f1402f = System.currentTimeMillis();
            this.f1403g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f1399a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f1400b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i0.a.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f1404i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new h(this, 1));
        }
    }
}
