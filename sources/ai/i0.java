package ai;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class i0 {
    public final int f1478a;
    public final long f1479b;
    public int f1480c;
    public boolean d;
    public long f1481f;
    public boolean h;
    public boolean f1483i;
    public String f1484j;
    public final ArrayList e = new ArrayList();
    public int f1482g = 1;

    public i0(int i10, long j10) {
        this.h = false;
        this.f1483i = false;
        this.f1484j = null;
        this.f1478a = i10;
        this.f1479b = j10;
        if (System.currentTimeMillis() - this.f1481f > 900000) {
            this.f1480c = 0;
            this.d = false;
            this.f1483i = false;
            this.f1481f = 0L;
            this.f1484j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f1483i && !this.d) {
            this.f1481f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f1478a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f1479b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f1482g;
            if (i11 == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            getsuggestedstarrefbots.order_by_date = z10;
            if (i11 != 2) {
                z11 = false;
            }
            getsuggestedstarrefbots.order_by_revenue = z11;
            if (!TextUtils.isEmpty(this.f1484j)) {
                getsuggestedstarrefbots.offset = this.f1484j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new h(this, 2));
        }
    }
}
