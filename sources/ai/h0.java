package ai;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class h0 {
    public final int f1397a;
    public final long f1398b;
    public int f1399c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f1400f;
    public boolean f1401g;
    public boolean h;
    public int f1402i;

    public h0(int i10, long j10) {
        this.f1401g = false;
        this.h = false;
        this.f1397a = i10;
        this.f1398b = j10;
        if (System.currentTimeMillis() - this.f1400f > 900000) {
            this.f1399c = 0;
            this.h = false;
            this.d = false;
            if (this.f1402i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f1402i, true);
                this.f1402i = 0;
            }
            this.f1401g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f1401g && !this.h && !this.d) {
            this.f1400f = System.currentTimeMillis();
            this.f1401g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f1397a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f1398b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i2.e.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f1402i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new h(this, 1));
        }
    }
}
