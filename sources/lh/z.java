package lh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class z {
    public final int f13416a;
    public final long f13417b;
    public int f13418c;
    public boolean d;
    public long f13419f;
    public boolean h;
    public boolean f13421i;
    public String f13422j;
    public final ArrayList e = new ArrayList();
    public int f13420g = 1;

    public z(int i10, long j10) {
        this.h = false;
        this.f13421i = false;
        this.f13422j = null;
        this.f13416a = i10;
        this.f13417b = j10;
        if (System.currentTimeMillis() - this.f13419f > 900000) {
            this.f13418c = 0;
            this.d = false;
            this.f13421i = false;
            this.f13419f = 0L;
            this.f13422j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z4;
        if (!this.h && !this.f13421i && !this.d) {
            this.f13419f = System.currentTimeMillis();
            boolean z10 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f13416a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f13417b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f13420g;
            if (i11 == 3) {
                z4 = true;
            } else {
                z4 = false;
            }
            getsuggestedstarrefbots.order_by_date = z4;
            if (i11 != 2) {
                z10 = false;
            }
            getsuggestedstarrefbots.order_by_revenue = z10;
            if (!TextUtils.isEmpty(this.f13422j)) {
                getsuggestedstarrefbots.offset = this.f13422j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new gf.a(this, 7));
        }
    }
}
