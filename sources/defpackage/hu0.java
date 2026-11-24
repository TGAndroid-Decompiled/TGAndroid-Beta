package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class hu0 {
    public final int a;
    public final long b;
    public int c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f;
    public boolean g;
    public boolean h;
    public int i;

    public hu0(int i, long j) {
        this.g = false;
        this.h = false;
        this.a = i;
        this.b = j;
        if (System.currentTimeMillis() - this.f > 900000) {
            this.c = 0;
            this.h = false;
            this.d = false;
            if (this.i != 0) {
                ConnectionsManager.getInstance(i).cancelRequest(this.i, true);
                this.i = 0;
            }
            this.g = false;
            a();
        }
    }

    public final void a() {
        if (!this.g && !this.h && !this.d) {
            this.f = System.currentTimeMillis();
            this.g = true;
            TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
            int i = this.a;
            getconnectedstarrefbots.peer = oc7.r1(i).i1(this.b);
            getconnectedstarrefbots.limit = 20;
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) b10.f(1, arrayList);
                getconnectedstarrefbots.flags |= 4;
                getconnectedstarrefbots.offset_date = connectedbotstarref.date;
                getconnectedstarrefbots.offset_link = connectedbotstarref.url;
            }
            this.i = ConnectionsManager.getInstance(i).sendRequest(getconnectedstarrefbots, new tg(this, (byte) 6));
        }
    }
}
