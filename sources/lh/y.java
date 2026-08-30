package lh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class y {
    public final int f13367a;
    public final long f13368b;
    public int f13369c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f13370f;
    public boolean f13371g;
    public boolean h;
    public int f13372i;

    public y(int i10, long j10) {
        this.f13371g = false;
        this.h = false;
        this.f13367a = i10;
        this.f13368b = j10;
        if (System.currentTimeMillis() - this.f13370f > 900000) {
            this.f13369c = 0;
            this.h = false;
            this.d = false;
            if (this.f13372i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f13372i, true);
                this.f13372i = 0;
            }
            this.f13371g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f13371g && !this.h && !this.d) {
            this.f13370f = System.currentTimeMillis();
            this.f13371g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f13367a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f13368b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) kh.a2.i(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f13372i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new gf.a(this, 6));
        }
    }
}
