package bi;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class j0 {
    public final int f4855a;
    public final long f4856b;
    public int f4857c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f4858f;
    public boolean f4859g;
    public boolean h;
    public int f4860i;

    public j0(int i10, long j10) {
        this.f4859g = false;
        this.h = false;
        this.f4855a = i10;
        this.f4856b = j10;
        if (System.currentTimeMillis() - this.f4858f > 900000) {
            this.f4857c = 0;
            this.h = false;
            this.d = false;
            if (this.f4860i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f4860i, true);
                this.f4860i = 0;
            }
            this.f4859g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f4859g && !this.h && !this.d) {
            this.f4858f = System.currentTimeMillis();
            this.f4859g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f4855a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f4856b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) ic.a.g(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f4860i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new i0(this, 0));
        }
    }
}
