package gh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class a0 {
    public final int f7762a;
    public final long f7763b;
    public int f7764c;
    public boolean d;
    public long f7766f;
    public boolean h;
    public boolean f7768i;
    public String f7769j;
    public final ArrayList f7765e = new ArrayList();
    public int f7767g = 1;

    public a0(int i9, long j10) {
        this.h = false;
        this.f7768i = false;
        this.f7769j = null;
        this.f7762a = i9;
        this.f7763b = j10;
        if (System.currentTimeMillis() - this.f7766f > 900000) {
            this.f7764c = 0;
            this.d = false;
            this.f7768i = false;
            this.f7766f = 0L;
            this.f7769j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f7768i && !this.d) {
            this.f7766f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i9 = this.f7762a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i9).getInputPeer(this.f7763b);
            getsuggestedstarrefbots.limit = 20;
            int i10 = this.f7767g;
            if (i10 == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            getsuggestedstarrefbots.order_by_date = z10;
            if (i10 != 2) {
                z11 = false;
            }
            getsuggestedstarrefbots.order_by_revenue = z11;
            if (!TextUtils.isEmpty(this.f7769j)) {
                getsuggestedstarrefbots.offset = this.f7769j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i9).sendRequest(getsuggestedstarrefbots, new bf.a(this, 7));
        }
    }
}
