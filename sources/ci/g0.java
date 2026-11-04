package ci;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class g0 {
    public final int f5148a;
    public final long f5149b;
    public int f5150c;
    public boolean d;
    public long f5152f;
    public boolean h;
    public boolean f5154i;
    public String f5155j;
    public final ArrayList f5151e = new ArrayList();
    public int f5153g = 1;

    public g0(int i3, long j10) {
        this.h = false;
        this.f5154i = false;
        this.f5155j = null;
        this.f5148a = i3;
        this.f5149b = j10;
        if (System.currentTimeMillis() - this.f5152f > 900000) {
            this.f5150c = 0;
            this.d = false;
            this.f5154i = false;
            this.f5152f = 0L;
            this.f5155j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f5154i && !this.d) {
            this.f5152f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i3 = this.f5148a;
            getsuggestedstarrefbots.peer = hp.s1(i3).j1(this.f5149b);
            getsuggestedstarrefbots.limit = 20;
            int i10 = this.f5153g;
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
            if (!TextUtils.isEmpty(this.f5155j)) {
                getsuggestedstarrefbots.offset = this.f5155j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i3).sendRequest(getsuggestedstarrefbots, new d0(this, 1));
        }
    }
}
