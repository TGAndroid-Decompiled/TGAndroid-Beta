package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class l0 {
    public final int f4244a;
    public final long f4245b;
    public int f4246c;
    public boolean d;
    public long f4248f;
    public boolean h;
    public boolean f4250i;
    public String f4251j;
    public final ArrayList f4247e = new ArrayList();
    public int f4249g = 1;

    public l0(int i7, long j3) {
        this.h = false;
        this.f4250i = false;
        this.f4251j = null;
        this.f4244a = i7;
        this.f4245b = j3;
        if (System.currentTimeMillis() - this.f4248f > 900000) {
            this.f4246c = 0;
            this.d = false;
            this.f4250i = false;
            this.f4248f = 0L;
            this.f4251j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z9;
        if (!this.h && !this.f4250i && !this.d) {
            this.f4248f = System.currentTimeMillis();
            boolean z10 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i7 = this.f4244a;
            getsuggestedstarrefbots.peer = qp.s1(i7).j1(this.f4245b);
            getsuggestedstarrefbots.limit = 20;
            int i10 = this.f4249g;
            if (i10 == 3) {
                z9 = true;
            } else {
                z9 = false;
            }
            getsuggestedstarrefbots.order_by_date = z9;
            if (i10 != 2) {
                z10 = false;
            }
            getsuggestedstarrefbots.order_by_revenue = z10;
            if (!TextUtils.isEmpty(this.f4251j)) {
                getsuggestedstarrefbots.offset = this.f4251j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i7).sendRequest(getsuggestedstarrefbots, new j0(this, 1));
        }
    }
}
