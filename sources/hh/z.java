package hh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;

public final class z {

    public final int f10395a;

    public final long f10396b;

    public int f10397c;
    public boolean d;

    public final ArrayList f10398e = new ArrayList();

    public long f10399f;

    public boolean f10400g;
    public boolean h;

    public int f10401i;

    public z(int i10, long j10) {
        this.f10400g = false;
        this.h = false;
        this.f10395a = i10;
        this.f10396b = j10;
        if (System.currentTimeMillis() - this.f10399f > 900000) {
            this.f10397c = 0;
            this.h = false;
            this.d = false;
            if (this.f10401i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f10401i, true);
                this.f10401i = 0;
            }
            this.f10400g = false;
            a();
        }
    }

    public final void a() {
        if (this.f10400g || this.h || this.d) {
            return;
        }
        this.f10399f = System.currentTimeMillis();
        this.f10400g = true;
        TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
        int i10 = this.f10395a;
        getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f10396b);
        getconnectedstarrefbots.limit = 20;
        ArrayList arrayList = this.f10398e;
        if (!arrayList.isEmpty()) {
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i0.a.i(1, arrayList);
            getconnectedstarrefbots.flags |= 4;
            getconnectedstarrefbots.offset_date = connectedbotstarref.date;
            getconnectedstarrefbots.offset_link = connectedbotstarref.url;
        }
        this.f10401i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new cf.a(this, 6));
    }
}
