package di;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class c0 {
    public final int f8608a;
    public final long f8609b;
    public int f8610c;
    public boolean d;
    public long f8612f;
    public boolean h;
    public boolean f8614i;
    public String f8615j;
    public final ArrayList f8611e = new ArrayList();
    public int f8613g = 1;

    public c0(int i7, long j3) {
        this.h = false;
        this.f8614i = false;
        this.f8615j = null;
        this.f8608a = i7;
        this.f8609b = j3;
        if (System.currentTimeMillis() - this.f8612f > 900000) {
            this.f8610c = 0;
            this.d = false;
            this.f8614i = false;
            this.f8612f = 0L;
            this.f8615j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f8614i && !this.d) {
            this.f8612f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i7 = this.f8608a;
            getsuggestedstarrefbots.peer = np.u1(i7).l1(this.f8609b);
            getsuggestedstarrefbots.limit = 20;
            int i10 = this.f8613g;
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
            if (!TextUtils.isEmpty(this.f8615j)) {
                getsuggestedstarrefbots.offset = this.f8615j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i7).sendRequest(getsuggestedstarrefbots, new ai.g1(this, 2));
        }
    }
}
