package jh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class y {
    public final int f13097a;
    public final long f13098b;
    public int f13099c;
    public boolean d;
    public final ArrayList f13100e = new ArrayList();
    public long f13101f;
    public boolean f13102g;
    public boolean h;
    public int f13103i;

    public y(int i10, long j10) {
        this.f13102g = false;
        this.h = false;
        this.f13097a = i10;
        this.f13098b = j10;
        if (System.currentTimeMillis() - this.f13101f > 900000) {
            this.f13099c = 0;
            this.h = false;
            this.d = false;
            if (this.f13103i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f13103i, true);
                this.f13103i = 0;
            }
            this.f13102g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f13102g && !this.h && !this.d) {
            this.f13101f = System.currentTimeMillis();
            this.f13102g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f13097a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f13098b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f13100e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) j7.l1.i(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f13103i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new ef.a(this, 6));
        }
    }
}
