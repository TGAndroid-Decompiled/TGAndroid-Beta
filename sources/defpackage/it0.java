package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
public final class it0 {
    public final int a;
    public final long b;
    public int c;
    public boolean d;
    public long f;
    public boolean h;
    public boolean i;
    public String j;
    public final ArrayList e = new ArrayList();
    public int g = 1;

    public it0(int i, long j) {
        this.h = false;
        this.i = false;
        this.j = null;
        this.a = i;
        this.b = j;
        if (System.currentTimeMillis() - this.f > 900000) {
            this.c = 0;
            this.d = false;
            this.i = false;
            this.f = 0L;
            this.j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        boolean z;
        if (!this.h && !this.i && !this.d) {
            this.f = System.currentTimeMillis();
            boolean z2 = true;
            this.h = true;
            TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
            int i = this.a;
            getsuggestedstarrefbots.peer = uc7.s1(i).j1(this.b);
            getsuggestedstarrefbots.limit = 20;
            int i2 = this.g;
            if (i2 == 3) {
                z = true;
            } else {
                z = false;
            }
            getsuggestedstarrefbots.order_by_date = z;
            if (i2 != 2) {
                z2 = false;
            }
            getsuggestedstarrefbots.order_by_revenue = z2;
            if (!TextUtils.isEmpty(this.j)) {
                getsuggestedstarrefbots.offset = this.j;
            } else {
                getsuggestedstarrefbots.offset = "";
            }
            ConnectionsManager.getInstance(i).sendRequest(getsuggestedstarrefbots, new ye(this, (byte) 7));
        }
    }
}
