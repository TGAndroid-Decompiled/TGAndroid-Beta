package di;

import android.content.Context;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.te;
import org.telegram.ui.yw;
import org.telegram.ui.zs;
import org.telegram.ui.zv;
public final class o1 implements z10 {
    public final int f9137a;
    public final long f9138b;
    public final Object f9139c;
    public final Object d;

    public o1(Object obj, Object obj2, long j3, int i7) {
        this.f9137a = i7;
        this.f9139c = obj;
        this.d = obj2;
        this.f9138b = j3;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        int i7;
        switch (this.f9137a) {
            case 0:
                c6 c6Var = (c6) this.f9139c;
                np npVar = (np) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < npVar.f25399t5) {
                    org.telegram.messenger.f3 G0 = npVar.G0();
                    long j3 = this.f9138b;
                    G0.b(j3, tL_premium_boostsStatus, new bi.i1(c6Var, tL_premium_boostsStatus, j3, npVar, 1));
                    return;
                }
                c6Var.f8318g2.setLoading(false);
                c6Var.u2(true);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f9139c;
                Long l10 = (Long) obj;
                org.telegram.messenger.g0.r((zs) this.d);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - this.f9138b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l10.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f42568a != null && (i7 = dataSettingsActivity.f42575s) >= 0) {
                    dataSettingsActivity.s0(i7);
                    return;
                }
                return;
            case 2:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.t1) this.d).r(150L);
                yw ywVar = ((zv) this.f9139c).f54031b;
                Boolean bool = ywVar.H.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    ywVar.getMessagesController().m(this.f9138b, ywVar.getMessagesController().a2(Long.valueOf(ywVar.I)), 0, null, ywVar, false, runnable, new te(6, runnable), null);
                    return;
                }
                runnable.run();
                return;
            default:
                ProfileActivity.g0((ProfileActivity) this.f9139c, (Context) this.d, this.f9138b, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }
}
