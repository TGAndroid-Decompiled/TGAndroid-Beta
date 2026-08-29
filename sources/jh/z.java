package jh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class z {
    public final int f13143a;
    public final long f13144b;
    public int f13145c;
    public boolean d;
    public long f13147f;
    public boolean h;
    public boolean f13149i;
    public String f13150j;
    public final ArrayList f13146e = new ArrayList();
    public int f13148g = 1;

    public z(int i10, long j10) {
        this.h = false;
        this.f13149i = false;
        this.f13150j = null;
        this.f13143a = i10;
        this.f13144b = j10;
        if (System.currentTimeMillis() - this.f13147f > 900000) {
            this.f13145c = 0;
            this.d = false;
            this.f13149i = false;
            this.f13147f = 0L;
            this.f13150j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z10;
        if (!this.h && !this.f13149i && !this.d) {
            this.f13147f = System.currentTimeMillis();
            boolean z11 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i10 = this.f13143a;
            getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f13144b);
            getsuggestedstarrefbots.limit = 20;
            int i11 = this.f13148g;
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
            if (!TextUtils.isEmpty(this.f13150j)) {
                getsuggestedstarrefbots.offset = this.f13150j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new ef.a(this, 7));
        }
    }
}
