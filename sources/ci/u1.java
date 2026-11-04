package ci;

import android.content.Context;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.se;
import org.telegram.ui.us;
import org.telegram.ui.uv;
import org.telegram.ui.uw;
public final class u1 implements u10 {
    public final int f6077a;
    public final long f6078b;
    public final Object f6079c;
    public final Object d;

    public u1(Object obj, Object obj2, long j10, int i3) {
        this.f6077a = i3;
        this.f6079c = obj;
        this.d = obj2;
        this.f6078b = j10;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        int i3;
        switch (this.f6077a) {
            case 0:
                l6 l6Var = (l6) this.f6079c;
                hp hpVar = (hp) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < hpVar.f23119s5) {
                    org.telegram.messenger.f3 G0 = hpVar.G0();
                    long j10 = this.f6078b;
                    G0.b(j10, tL_premium_boostsStatus, new ai.m1(l6Var, tL_premium_boostsStatus, j10, hpVar, 1));
                    return;
                }
                l6Var.f5451d2.setLoading(false);
                l6Var.t2(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f6079c;
                Long l10 = (Long) obj;
                org.telegram.messenger.g0.r((us) this.d);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - this.f6078b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l10.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f41243a != null && (i3 = dataSettingsActivity.f41250s) >= 0) {
                    dataSettingsActivity.s0(i3);
                    return;
                }
                return;
            case 2:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.s1) this.d).r(150L);
                uw uwVar = ((uv) this.f6079c).f50195b;
                Boolean bool = uwVar.H.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    uwVar.getMessagesController().m(this.f6078b, uwVar.getMessagesController().a2(Long.valueOf(uwVar.I)), 0, null, uwVar, false, runnable, new se(6, runnable), null);
                    return;
                }
                runnable.run();
                return;
            default:
                ProfileActivity.i0((ProfileActivity) this.f6079c, (Context) this.d, this.f6078b, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }
}
