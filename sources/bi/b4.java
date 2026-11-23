package bi;

import android.content.Context;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bt;
import org.telegram.ui.cw;
import org.telegram.ui.cx;
import org.telegram.ui.ve;
public final class b4 implements y10 {
    public final int f3438a;
    public final long f3439b;
    public final Object f3440c;
    public final Object d;

    public b4(aa.r rVar, long j3, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        this.f3438a = 0;
        this.f3440c = rVar;
        this.f3439b = j3;
        this.d = tL_messageActionStarGiftOnchainOffer;
    }

    @Override
    public final void a(Object obj) {
        String a02;
        int i7;
        int i10 = this.f3438a;
        boolean z10 = true;
        long j3 = this.f3439b;
        Object obj2 = this.d;
        Object obj3 = this.f3440c;
        switch (i10) {
            case 0:
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj2;
                ((aa.r) obj3).run();
                if (!((Boolean) obj).booleanValue()) {
                    i4.g(j3);
                    i4.t(2131749550, tL_messageActionStarGiftOnchainOffer.gift);
                    return;
                }
                return;
            case 1:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                String str = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    a02 = hd.a0(null, null, 2131749542, str, x4.k(j3));
                } else {
                    a02 = hd.a0(null, null, 2131749619, str);
                }
                x4.s(tL_starGiftUnique, a02);
                return;
            case 2:
                di.f6 f6Var = (di.f6) obj3;
                np npVar = (np) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < npVar.f25984v5) {
                    org.telegram.messenger.h3 I0 = npVar.I0();
                    long j10 = this.f3439b;
                    I0.b(j10, tL_premium_boostsStatus, new i2(f6Var, tL_premium_boostsStatus, j10, npVar, 1));
                    return;
                }
                f6Var.f8806g2.setLoading(false);
                f6Var.I2(true);
                return;
            case 3:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                Long l10 = (Long) obj;
                org.telegram.messenger.g0.r((bt) obj2);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - j3 <= 120) {
                    z10 = false;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l10.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f43056a != null && (i7 = dataSettingsActivity.f43063s) >= 0) {
                    dataSettingsActivity.s0(i7);
                    return;
                }
                return;
            case 4:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.t1) obj2).r(150L);
                cx cxVar = ((cw) obj3).f46690b;
                Boolean bool = cxVar.H.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    cxVar.getMessagesController().m(this.f3439b, cxVar.getMessagesController().c2(Long.valueOf(cxVar.I)), 0, null, cxVar, false, runnable, new ve(6, runnable), null);
                    return;
                } else {
                    runnable.run();
                    return;
                }
            default:
                ProfileActivity.g0((ProfileActivity) obj3, (Context) obj2, j3, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }

    public b4(Object obj, Object obj2, long j3, int i7) {
        this.f3438a = i7;
        this.f3440c = obj;
        this.d = obj2;
        this.f3439b = j3;
    }
}
