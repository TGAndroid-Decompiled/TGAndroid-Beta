package mh;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class x {
    public final int f15020a;
    public final long f15021b;
    public int f15022c;
    public boolean d;
    public final ArrayList f15023e = new ArrayList();
    public long f15024f;
    public boolean f15025g;
    public boolean h;
    public int f15026i;

    public x(int i10, long j10) {
        this.f15025g = false;
        this.h = false;
        this.f15020a = i10;
        this.f15021b = j10;
        if (System.currentTimeMillis() - this.f15024f > 900000) {
            this.f15022c = 0;
            this.h = false;
            this.d = false;
            if (this.f15026i != 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.f15026i, true);
                this.f15026i = 0;
            }
            this.f15025g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f15025g && !this.h && !this.d) {
            this.f15024f = System.currentTimeMillis();
            this.f15025g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i10 = this.f15020a;
            getconnectedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f15021b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f15023e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) l.d.i(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f15026i = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbots, new gf.a(this, 6));
        }
    }
}
