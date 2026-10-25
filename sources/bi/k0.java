package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class k0 {
    public final int f4926a;
    public final long f4927b;
    public int f4928c;
    public boolean d;
    public long f4929f;
    public boolean h;
    public boolean f4931i;
    public String f4932j;
    public final ArrayList e = new ArrayList();
    public int f4930g = 1;

    public k0(int i10, long j10) {
        this.h = false;
        this.f4931i = false;
        this.f4932j = null;
        this.f4926a = i10;
        this.f4927b = j10;
        if (System.currentTimeMillis() - this.f4929f > 900000) {
            this.f4928c = 0;
            this.d = false;
            this.f4931i = false;
            this.f4929f = 0L;
            this.f4932j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f4931i && !this.d) {
            this.f4929f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f4926a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f4927b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f4930g;
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
            if (!TextUtils.isEmpty(this.f4932j)) {
                getsuggestedstarrefbots.offset = this.f4932j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new i0(this, 1));
        }
    }
}
