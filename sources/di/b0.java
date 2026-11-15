package di;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class b0 {
    public final int f8232a;
    public final long f8233b;
    public int f8234c;
    public boolean d;
    public final ArrayList f8235e = new ArrayList();
    public long f8236f;
    public boolean f8237g;
    public boolean h;
    public int f8238i;

    public b0(int i7, long j3) {
        this.f8237g = false;
        this.h = false;
        this.f8232a = i7;
        this.f8233b = j3;
        if (System.currentTimeMillis() - this.f8236f > 900000) {
            this.f8234c = 0;
            this.h = false;
            this.d = false;
            if (this.f8238i != 0) {
                ConnectionsManager.getInstance(i7).cancelRequest(this.f8238i, true);
                this.f8238i = 0;
            }
            this.f8237g = false;
            a();
        }
    }

    public final void a() {
        if (!this.f8237g && !this.h && !this.d) {
            this.f8236f = System.currentTimeMillis();
            this.f8237g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i7 = this.f8232a;
            getconnectedstarrefbots.peer = np.s1(i7).j1(this.f8233b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.f8235e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i5.c.h(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.f8238i = ConnectionsManager.getInstance(i7).sendRequest(getconnectedstarrefbots, new ai.d1(this, 1));
        }
    }
}
