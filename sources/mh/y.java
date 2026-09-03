package mh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class y {
    public final int f15070a;
    public final long f15071b;
    public int f15072c;
    public boolean d;
    public long f15074f;
    public boolean h;
    public boolean f15076i;
    public String f15077j;
    public final ArrayList f15073e = new ArrayList();
    public int f15075g = 1;

    public y(int i10, long j10) {
        this.h = false;
        this.f15076i = false;
        this.f15077j = null;
        this.f15070a = i10;
        this.f15071b = j10;
        if (System.currentTimeMillis() - this.f15074f > 900000) {
            this.f15072c = 0;
            this.d = false;
            this.f15076i = false;
            this.f15074f = 0L;
            this.f15077j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z4;
        if (!this.h && !this.f15076i && !this.d) {
            this.f15074f = System.currentTimeMillis();
            boolean z10 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f15070a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f15071b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f15075g;
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
            if (!TextUtils.isEmpty(this.f15077j)) {
                getsuggestedstarrefbots.offset = this.f15077j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new gf.a(this, 7));
        }
    }
}
