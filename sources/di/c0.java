package di;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class c0 {
    public final int f8571a;
    public final long f8572b;
    public int f8573c;
    public boolean d;
    public long f8575f;
    public boolean h;
    public boolean f8577i;
    public String f8578j;
    public final ArrayList f8574e = new ArrayList();
    public int f8576g = 1;

    public c0(int i7, long j3) {
        this.h = false;
        this.f8577i = false;
        this.f8578j = null;
        this.f8571a = i7;
        this.f8572b = j3;
        if (System.currentTimeMillis() - this.f8575f > 900000) {
            this.f8573c = 0;
            this.d = false;
            this.f8577i = false;
            this.f8575f = 0L;
            this.f8578j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f8577i && !this.d) {
            this.f8575f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i7 = this.f8571a;
            getsuggestedstarrefbots.peer = np.u1(i7).l1(this.f8572b);
            getsuggestedstarrefbots.limit = 20;
            int i10 = this.f8576g;
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
            if (!TextUtils.isEmpty(this.f8578j)) {
                getsuggestedstarrefbots.offset = this.f8578j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i7).sendRequest(getsuggestedstarrefbots, new ai.a1(this, 2));
        }
    }
}
