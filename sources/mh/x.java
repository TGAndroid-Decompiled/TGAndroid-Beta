package mh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class x {
    public final int f15018a;
    public final long f15019b;
    public int f15020c;
    public boolean d;
    public final ArrayList f15021e = new ArrayList();
    public long f15022f;
    public boolean f15023g;
    public boolean h;
    public int f15024i;

    public x(int i10, long j10) {
        this.f15023g = false;
        this.h = false;
        this.f15018a = i10;
        this.f15019b = j10;
        if (System.currentTimeMillis() - this.f15022f > 900000) {
            this.f15020c = 0;
            this.h = false;
            this.d = false;
            if (this.f15024i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f15024i, true);
                this.f15024i = 0;
            }
            this.f15023g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f15023g && !this.h && !this.d) {
            this.f15022f = System.currentTimeMillis();
            this.f15023g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f15018a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f15019b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f15021e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) l.d.i(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f15024i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new gf.a(this, 6));
        }
    }
}
