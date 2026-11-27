package defpackage;

import android.content.Context;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.ProfileActivity;
public final class p4c implements pcc {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;

    public p4c(Object obj, long j, TLObject tLObject, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = tLObject;
    }

    @Override
    public final void a(Object obj) {
        ?? r0;
        String a0;
        byte b = this.a;
        c35 c35Var = null;
        boolean z = true;
        long j = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                a5c a5cVar = (a5c) obj3;
                r47 r47Var = (r47) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = r47Var.k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                a5cVar.getMessagesStorage().U1(j, r47Var.k);
                jn7.f(a5cVar.currentAccount).k(129, r47Var, Boolean.TRUE);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                Long l = (Long) obj;
                hl.r((b73) obj2);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - j <= 120) {
                    z = false;
                }
                dataSettingsActivity.W = z;
                dataSettingsActivity.Y = l.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.a != null && (r0 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.r0(r0 == true ? 1 : 0);
                    return;
                }
                return;
            case 2:
                Runnable runnable = (Runnable) obj;
                ((id) obj2).q(150L);
                uj3 uj3Var = ((qi3) obj3).b;
                Boolean bool = uj3Var.H.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    uj3Var.getMessagesController().k(this.b, uj3Var.getMessagesController().X1(Long.valueOf(uj3Var.I)), null, uj3Var, false, runnable, new td(runnable, (byte) 12));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            case 3:
                ov4 ov4Var = (ov4) obj3;
                ov4Var.d(j).c = (ArrayList) obj;
                ov4Var.f(j, (TL_payments.TL_StarGiftAuctionState) obj2);
                return;
            case 4:
                pcc pccVar = (pcc) obj2;
                c35 c35Var2 = (c35) obj;
                if (j == ((k35) obj3).l()) {
                    c35Var = c35Var2;
                }
                pccVar.a(c35Var);
                return;
            case 5:
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj2;
                ((fd7) obj3).run();
                if (!((Boolean) obj).booleanValue()) {
                    vs7.g(j);
                    vs7.s(2131749512, tL_messageActionStarGiftOnchainOffer.gift);
                    return;
                }
                return;
            case 6:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                String str = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    a0 = ob6.a0(null, null, 2131749504, str, it7.l(j));
                } else {
                    a0 = ob6.a0(null, null, 2131749581, str);
                }
                it7.v(tL_starGiftUnique, a0);
                return;
            case 7:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj3).v2((Context) obj2, j, (TL_payments.connectedBotStarRef) obj);
                return;
            default:
                wua wuaVar = (wua) obj3;
                uc7 uc7Var = (uc7) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < uc7Var.k4.f2.f()) {
                    xg1 G0 = uc7Var.G0();
                    long j2 = this.b;
                    G0.b(j2, tL_premium_boostsStatus, new r4c(wuaVar, tL_premium_boostsStatus, j2, uc7Var, (byte) 8));
                    return;
                }
                wuaVar.f2.setLoading(false);
                wuaVar.B2(true);
                return;
        }
    }

    public p4c(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
