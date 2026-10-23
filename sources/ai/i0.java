package ai;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class i0 {
    public final int f1449a;
    public final long f1450b;
    public int f1451c;
    public boolean d;
    public long f1452f;
    public boolean h;
    public boolean f1454i;
    public String f1455j;
    public final ArrayList e = new ArrayList();
    public int f1453g = 1;

    public i0(int i10, long j10) {
        this.h = false;
        this.f1454i = false;
        this.f1455j = null;
        this.f1449a = i10;
        this.f1450b = j10;
        if (System.currentTimeMillis() - this.f1452f > 900000) {
            this.f1451c = 0;
            this.d = false;
            this.f1454i = false;
            this.f1452f = 0L;
            this.f1455j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f1454i && !this.d) {
            this.f1452f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f1449a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f1450b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f1453g;
            if (i11 == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            getsuggestedstarrefbots.order_by_date = z10;
            if (i11 != 2) {
                z11 = false;
            }
            getsuggestedstarrefbots.order_by_revenue = z11;
            if (!TextUtils.isEmpty(this.f1455j)) {
                getsuggestedstarrefbots.offset = this.f1455j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new h(this, 2));
        }
    }
}
