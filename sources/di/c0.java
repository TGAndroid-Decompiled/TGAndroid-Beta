package di;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class c0 {
    public final int f8570a;
    public final long f8571b;
    public int f8572c;
    public boolean d;
    public long f8574f;
    public boolean h;
    public boolean f8576i;
    public String f8577j;
    public final ArrayList f8573e = new ArrayList();
    public int f8575g = 1;

    public c0(int i7, long j3) {
        this.h = false;
        this.f8576i = false;
        this.f8577j = null;
        this.f8570a = i7;
        this.f8571b = j3;
        if (System.currentTimeMillis() - this.f8574f > 900000) {
            this.f8572c = 0;
            this.d = false;
            this.f8576i = false;
            this.f8574f = 0L;
            this.f8577j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f8576i && !this.d) {
            this.f8574f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i7 = this.f8570a;
            getsuggestedstarrefbots.peer = mp.u1(i7).l1(this.f8571b);
            getsuggestedstarrefbots.limit = 20;
            int i10 = this.f8575g;
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
            if (!TextUtils.isEmpty(this.f8577j)) {
                getsuggestedstarrefbots.offset = this.f8577j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i7).sendRequest(getsuggestedstarrefbots, new ai.b1(this, 2));
        }
    }
}
