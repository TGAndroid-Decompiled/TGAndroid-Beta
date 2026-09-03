package lh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class y {
    public final int f13351a;
    public final long f13352b;
    public int f13353c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f13354f;
    public boolean f13355g;
    public boolean h;
    public int f13356i;

    public y(int i10, long j10) {
        this.f13355g = false;
        this.h = false;
        this.f13351a = i10;
        this.f13352b = j10;
        if (System.currentTimeMillis() - this.f13354f > 900000) {
            this.f13353c = 0;
            this.h = false;
            this.d = false;
            if (this.f13356i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f13356i, true);
                this.f13356i = 0;
            }
            this.f13355g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f13355g && !this.h && !this.d) {
            this.f13354f = System.currentTimeMillis();
            this.f13355g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f13351a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f13352b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) kf.k0.i(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f13356i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ff.a(this, 6));
        }
    }
}
