package lh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class z {
    public final int f13400a;
    public final long f13401b;
    public int f13402c;
    public boolean d;
    public long f13403f;
    public boolean h;
    public boolean f13405i;
    public String f13406j;
    public final ArrayList e = new ArrayList();
    public int f13404g = 1;

    public z(int i10, long j10) {
        this.h = false;
        this.f13405i = false;
        this.f13406j = null;
        this.f13400a = i10;
        this.f13401b = j10;
        if (System.currentTimeMillis() - this.f13403f > 900000) {
            this.f13402c = 0;
            this.d = false;
            this.f13405i = false;
            this.f13403f = 0L;
            this.f13406j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z4;
        if (!this.h && !this.f13405i && !this.d) {
            this.f13403f = System.currentTimeMillis();
            boolean z10 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f13400a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f13401b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f13404g;
            if (i11 == 3) {
                z4 = true;
            } else {
                z4 = false;
            }
            getsuggestedstarrefbots.order_by_date = z4;
            if (i11 != 2) {
                z10 = false;
            }
            getsuggestedstarrefbots.order_by_revenue = z10;
            if (!TextUtils.isEmpty(this.f13406j)) {
                getsuggestedstarrefbots.offset = this.f13406j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new ff.a(this, 7));
        }
    }
}
