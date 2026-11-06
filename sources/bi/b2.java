package bi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ve;
import org.telegram.ui.ws;
import org.telegram.ui.ww;
import org.telegram.ui.xv;
public final class b2 implements c20 {
    public final int f3501a;
    public final long f3502b;
    public final Object f3503c;
    public final Object d;

    public b2(Object obj, Object obj2, long j3, int i7) {
        this.f3501a = i7;
        this.f3503c = obj;
        this.d = obj2;
        this.f3502b = j3;
    }

    @Override
    public final void a(Object obj) {
        boolean z9;
        int i7;
        switch (this.f3501a) {
            case 0:
                k7 k7Var = (k7) this.f3503c;
                qp qpVar = (qp) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < qpVar.s5) {
                    org.telegram.messenger.f3 G0 = qpVar.G0();
                    long j3 = this.f3502b;
                    G0.b(j3, tL_premium_boostsStatus, new r2(k7Var, tL_premium_boostsStatus, j3, qpVar, 0));
                    return;
                }
                k7Var.f4168c2.setLoading(false);
                k7Var.t2(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f3503c;
                Long l10 = (Long) obj;
                org.telegram.messenger.g0.r((ws) this.d);
                if (!dataSettingsActivity.V && System.currentTimeMillis() - this.f3502b <= 120) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                dataSettingsActivity.V = z9;
                dataSettingsActivity.X = l10.longValue();
                dataSettingsActivity.W = false;
                if (dataSettingsActivity.f41210a != null && (i7 = dataSettingsActivity.f41217s) >= 0) {
                    dataSettingsActivity.s0(i7);
                    return;
                }
                return;
            case 2:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.u1) this.d).r(150L);
                ww wwVar = ((xv) this.f3503c).f51990b;
                Boolean bool = wwVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    wwVar.getMessagesController().m(this.f3502b, wwVar.getMessagesController().a2(Long.valueOf(wwVar.H)), 0, null, wwVar, false, runnable, new ve(6, runnable), null);
                    return;
                }
                runnable.run();
                return;
            default:
                ProfileActivity.i0((ProfileActivity) this.f3503c, (Context) this.d, this.f3502b, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }
}
