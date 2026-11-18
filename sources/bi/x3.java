package bi;

import android.content.Context;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
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
public final class x3 implements x10 {
    public final int f4209a;
    public final long f4210b;
    public final Object f4211c;
    public final Object d;

    public x3(aa.r rVar, long j3, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        this.f4209a = 0;
        this.f4211c = rVar;
        this.f4210b = j3;
        this.d = tL_messageActionStarGiftOnchainOffer;
    }

    @Override
    public final void a(Object obj) {
        String a02;
        int i7;
        int i10 = this.f4209a;
        boolean z10 = true;
        long j3 = this.f4210b;
        Object obj2 = this.d;
        Object obj3 = this.f4211c;
        switch (i10) {
            case 0:
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj2;
                ((aa.r) obj3).run();
                if (!((Boolean) obj).booleanValue()) {
                    f4.f(j3);
                    f4.r(2131749551, tL_messageActionStarGiftOnchainOffer.gift);
                    return;
                }
                return;
            case 1:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                String str = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    a02 = gd.a0(null, null, 2131749543, str, v4.k(j3));
                } else {
                    a02 = gd.a0(null, null, 2131749620, str);
                }
                v4.s(tL_starGiftUnique, a02);
                return;
            case 2:
                di.f6 f6Var = (di.f6) obj3;
                mp mpVar = (mp) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < mpVar.f25787v5) {
                    org.telegram.messenger.h3 I0 = mpVar.I0();
                    long j10 = this.f4210b;
                    I0.b(j10, tL_premium_boostsStatus, new e2(f6Var, tL_premium_boostsStatus, j10, mpVar, 1));
                    return;
                }
                f6Var.f8782g2.setLoading(false);
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
                if (dataSettingsActivity.f43012a != null && (i7 = dataSettingsActivity.f43019s) >= 0) {
                    dataSettingsActivity.s0(i7);
                    return;
                }
                return;
            case 4:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.u1) obj2).r(150L);
                cx cxVar = ((cw) obj3).f46651b;
                Boolean bool = cxVar.H.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    cxVar.getMessagesController().m(this.f4210b, cxVar.getMessagesController().c2(Long.valueOf(cxVar.I)), 0, null, cxVar, false, runnable, new ve(6, runnable), null);
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

    public x3(Object obj, Object obj2, long j3, int i7) {
        this.f4209a = i7;
        this.f4211c = obj;
        this.d = obj2;
        this.f4210b = j3;
    }
}
