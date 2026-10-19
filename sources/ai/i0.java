package ai;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class i0 {
    public final int f1461a;
    public final long f1462b;
    public int f1463c;
    public boolean d;
    public long f1464f;
    public boolean h;
    public boolean f1466i;
    public String f1467j;
    public final ArrayList e = new ArrayList();
    public int f1465g = 1;

    public i0(int i10, long j10) {
        this.h = false;
        this.f1466i = false;
        this.f1467j = null;
        this.f1461a = i10;
        this.f1462b = j10;
        if (System.currentTimeMillis() - this.f1464f > 900000) {
            this.f1463c = 0;
            this.d = false;
            this.f1466i = false;
            this.f1464f = 0L;
            this.f1467j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f1466i && !this.d) {
            this.f1464f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f1461a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f1462b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f1465g;
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
            if (!TextUtils.isEmpty(this.f1467j)) {
                getsuggestedstarrefbots.offset = this.f1467j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new h(this, 2));
        }
    }
}
