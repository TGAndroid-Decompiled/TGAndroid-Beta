package di;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class c0 {
    public final int f8580a;
    public final long f8581b;
    public int f8582c;
    public boolean d;
    public long f8584f;
    public boolean h;
    public boolean f8586i;
    public String f8587j;
    public final ArrayList f8583e = new ArrayList();
    public int f8585g = 1;

    public c0(int i7, long j3) {
        this.h = false;
        this.f8586i = false;
        this.f8587j = null;
        this.f8580a = i7;
        this.f8581b = j3;
        if (System.currentTimeMillis() - this.f8584f > 900000) {
            this.f8582c = 0;
            this.d = false;
            this.f8586i = false;
            this.f8584f = 0L;
            this.f8587j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f8586i && !this.d) {
            this.f8584f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i7 = this.f8580a;
            getsuggestedstarrefbots.peer = mp.u1(i7).l1(this.f8581b);
            getsuggestedstarrefbots.limit = 20;
            int i10 = this.f8585g;
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
            if (!TextUtils.isEmpty(this.f8587j)) {
                getsuggestedstarrefbots.offset = this.f8587j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i7).sendRequest(getsuggestedstarrefbots, new ai.e1(this, 2));
        }
    }
}
