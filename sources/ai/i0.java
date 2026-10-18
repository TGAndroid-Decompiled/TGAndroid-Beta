package ai;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class i0 {
    public final int f1454a;
    public final long f1455b;
    public int f1456c;
    public boolean d;
    public long f1457f;
    public boolean h;
    public boolean f1459i;
    public String f1460j;
    public final ArrayList e = new ArrayList();
    public int f1458g = 1;

    public i0(int i10, long j10) {
        this.h = false;
        this.f1459i = false;
        this.f1460j = null;
        this.f1454a = i10;
        this.f1455b = j10;
        if (System.currentTimeMillis() - this.f1457f > 900000) {
            this.f1456c = 0;
            this.d = false;
            this.f1459i = false;
            this.f1457f = 0L;
            this.f1460j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f1459i && !this.d) {
            this.f1457f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f1454a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f1455b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f1458g;
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
            if (!TextUtils.isEmpty(this.f1460j)) {
                getsuggestedstarrefbots.offset = this.f1460j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new h(this, 2));
        }
    }
}
