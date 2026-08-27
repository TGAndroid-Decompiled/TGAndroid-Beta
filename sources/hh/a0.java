package hh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;

public final class a0 {

    public final int f8934a;

    public final long f8935b;

    public int f8936c;
    public boolean d;

    public long f8938f;
    public boolean h;

    public boolean f8940i;

    public String f8941j;

    public final ArrayList f8937e = new ArrayList();

    public int f8939g = 1;

    public a0(int i10, long j10) {
        this.h = false;
        this.f8940i = false;
        this.f8941j = null;
        this.f8934a = i10;
        this.f8935b = j10;
        if (System.currentTimeMillis() - this.f8938f > 900000) {
            this.f8936c = 0;
            this.d = false;
            this.f8940i = false;
            this.f8938f = 0L;
            this.f8941j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        if (this.h || this.f8940i || this.d) {
            return;
        }
        this.f8938f = System.currentTimeMillis();
        this.h = true;
        TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
        int i10 = this.f8934a;
        getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.f8935b);
        getsuggestedstarrefbots.limit = 20;
        int i11 = this.f8939g;
        getsuggestedstarrefbots.order_by_date = i11 == 3;
        getsuggestedstarrefbots.order_by_revenue = i11 == 2;
        if (TextUtils.isEmpty(this.f8941j)) {
            getsuggestedstarrefbots.offset = "";
        } else {
            getsuggestedstarrefbots.offset = this.f8941j;
        }
        ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new cf.a(this, 7));
    }
}
