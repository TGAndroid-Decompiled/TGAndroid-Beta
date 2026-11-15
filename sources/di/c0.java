package di;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class c0 {
    public final int f8281a;
    public final long f8282b;
    public int f8283c;
    public boolean d;
    public long f8285f;
    public boolean h;
    public boolean f8287i;
    public String f8288j;
    public final ArrayList f8284e = new ArrayList();
    public int f8286g = 1;

    public c0(int i7, long j3) {
        this.h = false;
        this.f8287i = false;
        this.f8288j = null;
        this.f8281a = i7;
        this.f8282b = j3;
        if (System.currentTimeMillis() - this.f8285f > 900000) {
            this.f8283c = 0;
            this.d = false;
            this.f8287i = false;
            this.f8285f = 0L;
            this.f8288j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f8287i && !this.d) {
            this.f8285f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i7 = this.f8281a;
            getsuggestedstarrefbots.peer = np.s1(i7).j1(this.f8282b);
            getsuggestedstarrefbots.limit = 20;
            int i10 = this.f8286g;
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
            if (!TextUtils.isEmpty(this.f8288j)) {
                getsuggestedstarrefbots.offset = this.f8288j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i7).sendRequest(getsuggestedstarrefbots, new ai.d1(this, 2));
        }
    }
}
