package di;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class c0 {
    public final int f8282a;
    public final long f8283b;
    public int f8284c;
    public boolean d;
    public long f8286f;
    public boolean h;
    public boolean f8288i;
    public String f8289j;
    public final ArrayList f8285e = new ArrayList();
    public int f8287g = 1;

    public c0(int i7, long j3) {
        this.h = false;
        this.f8288i = false;
        this.f8289j = null;
        this.f8282a = i7;
        this.f8283b = j3;
        if (System.currentTimeMillis() - this.f8286f > 900000) {
            this.f8284c = 0;
            this.d = false;
            this.f8288i = false;
            this.f8286f = 0L;
            this.f8289j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f8288i && !this.d) {
            this.f8286f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i7 = this.f8282a;
            getsuggestedstarrefbots.peer = np.s1(i7).j1(this.f8283b);
            getsuggestedstarrefbots.limit = 20;
            int i10 = this.f8287g;
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
            if (!TextUtils.isEmpty(this.f8289j)) {
                getsuggestedstarrefbots.offset = this.f8289j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i7).sendRequest(getsuggestedstarrefbots, new ai.e1(this, 2));
        }
    }
}
