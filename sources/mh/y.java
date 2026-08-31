package mh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class y {
    public final int f15068a;
    public final long f15069b;
    public int f15070c;
    public boolean d;
    public long f15072f;
    public boolean h;
    public boolean f15074i;
    public String f15075j;
    public final ArrayList f15071e = new ArrayList();
    public int f15073g = 1;

    public y(int i10, long j10) {
        this.h = false;
        this.f15074i = false;
        this.f15075j = null;
        this.f15068a = i10;
        this.f15069b = j10;
        if (System.currentTimeMillis() - this.f15072f > 900000) {
            this.f15070c = 0;
            this.d = false;
            this.f15074i = false;
            this.f15072f = 0L;
            this.f15075j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z4;
        if (!this.h && !this.f15074i && !this.d) {
            this.f15072f = System.currentTimeMillis();
            boolean z10 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f15068a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f15069b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f15073g;
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
            if (!TextUtils.isEmpty(this.f15075j)) {
                getsuggestedstarrefbots.offset = this.f15075j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new gf.a(this, 7));
        }
    }
}
