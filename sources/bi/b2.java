package bi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.aw;
import org.telegram.ui.we;
import org.telegram.ui.zs;
import org.telegram.ui.zw;
public final class b2 implements c20 {
    public final int f3504a;
    public final long f3505b;
    public final Object f3506c;
    public final Object d;

    public b2(Object obj, Object obj2, long j3, int i7) {
        this.f3504a = i7;
        this.f3506c = obj;
        this.d = obj2;
        this.f3505b = j3;
    }

    @Override
    public final void a(Object obj) {
        boolean z9;
        int i7;
        switch (this.f3504a) {
            case 0:
                k7 k7Var = (k7) this.f3506c;
                qp qpVar = (qp) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < qpVar.s5) {
                    org.telegram.messenger.f3 G0 = qpVar.G0();
                    long j3 = this.f3505b;
                    G0.b(j3, tL_premium_boostsStatus, new r2(k7Var, tL_premium_boostsStatus, j3, qpVar, 0));
                    return;
                }
                k7Var.f4170f2.setLoading(false);
                k7Var.t2(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f3506c;
                Long l10 = (Long) obj;
                org.telegram.messenger.g0.r((zs) this.d);
                if (!dataSettingsActivity.V && System.currentTimeMillis() - this.f3505b <= 120) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                dataSettingsActivity.V = z9;
                dataSettingsActivity.X = l10.longValue();
                dataSettingsActivity.W = false;
                if (dataSettingsActivity.f41212a != null && (i7 = dataSettingsActivity.f41219s) >= 0) {
                    dataSettingsActivity.s0(i7);
                    return;
                }
                return;
            case 2:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.u1) this.d).r(150L);
                zw zwVar = ((aw) this.f3506c).f43827b;
                Boolean bool = zwVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    zwVar.getMessagesController().m(this.f3505b, zwVar.getMessagesController().a2(Long.valueOf(zwVar.H)), 0, null, zwVar, false, runnable, new we(6, runnable), null);
                    return;
                }
                runnable.run();
                return;
            default:
                ProfileActivity.g0((ProfileActivity) this.f3506c, (Context) this.d, this.f3505b, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }
}
