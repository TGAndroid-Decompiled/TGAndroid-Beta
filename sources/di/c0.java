package di;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class c0 {
    public final int f8605a;
    public final long f8606b;
    public int f8607c;
    public boolean d;
    public long f8609f;
    public boolean h;
    public boolean f8611i;
    public String f8612j;
    public final ArrayList f8608e = new ArrayList();
    public int f8610g = 1;

    public c0(int i7, long j3) {
        this.h = false;
        this.f8611i = false;
        this.f8612j = null;
        this.f8605a = i7;
        this.f8606b = j3;
        if (System.currentTimeMillis() - this.f8609f > 900000) {
            this.f8607c = 0;
            this.d = false;
            this.f8611i = false;
            this.f8609f = 0L;
            this.f8612j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f8611i && !this.d) {
            this.f8609f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i7 = this.f8605a;
            getsuggestedstarrefbots.peer = mp.u1(i7).l1(this.f8606b);
            getsuggestedstarrefbots.limit = 20;
            int i10 = this.f8610g;
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
            if (!TextUtils.isEmpty(this.f8612j)) {
                getsuggestedstarrefbots.offset = this.f8612j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i7).sendRequest(getsuggestedstarrefbots, new ai.g1(this, 2));
        }
    }
}
