package gh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class z {
    public final int f9235a;
    public final long f9236b;
    public int f9237c;
    public boolean d;
    public final ArrayList f9238e = new ArrayList();
    public long f9239f;
    public boolean f9240g;
    public boolean h;
    public int f9241i;

    public z(int i9, long j10) {
        this.f9240g = false;
        this.h = false;
        this.f9235a = i9;
        this.f9236b = j10;
        if (System.currentTimeMillis() - this.f9239f > 900000) {
            this.f9237c = 0;
            this.h = false;
            this.d = false;
            if (this.f9241i != 0) {
                ConnectionsManager.getInstance(i9).cancelRequest(this.f9241i, true);
                this.f9241i = 0;
            }
            this.f9240g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f9240g && !this.h && !this.d) {
            this.f9239f = System.currentTimeMillis();
            this.f9240g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i9 = this.f9235a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i9).getInputPeer(this.f9236b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f9238e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) j3.r0.j(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f9241i = ConnectionsManager.getInstance(i9).sendRequest(getconnectedstarrefbots, new bf.a(this, 6));
        }
    }
}
