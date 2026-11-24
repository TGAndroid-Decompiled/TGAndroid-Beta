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
public final class p2c implements qac {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;

    public p2c(Object obj, long j, TLObject tLObject, byte b) {
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
        y25 y25Var = null;
        boolean z = true;
        long j = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                b3c b3cVar = (b3c) obj3;
                k47 k47Var = (k47) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = k47Var.k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                b3cVar.getMessagesStorage().U1(j, k47Var.k);
                nm7.f(b3cVar.currentAccount).k(129, k47Var, Boolean.TRUE);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                Long l = (Long) obj;
                gm.r((u73) obj2);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - j <= 120) {
                    z = false;
                }
                dataSettingsActivity.W = z;
                dataSettingsActivity.Y = l.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.a != null && (r0 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.s0(r0 == true ? 1 : 0);
                    return;
                }
                return;
            case 2:
                Runnable runnable = (Runnable) obj;
                ((he) obj2).q(150L);
                nk3 nk3Var = ((ij3) obj3).b;
                Boolean bool = nk3Var.H.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    nk3Var.getMessagesController().k(this.b, nk3Var.getMessagesController().W1(Long.valueOf(nk3Var.I)), null, nk3Var, false, runnable, new cf(runnable, (byte) 12));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            case 3:
                lv4 lv4Var = (lv4) obj3;
                lv4Var.d(j).c = (ArrayList) obj;
                lv4Var.f(j, (TL_payments.TL_StarGiftAuctionState) obj2);
                return;
            case 4:
                qac qacVar = (qac) obj2;
                y25 y25Var2 = (y25) obj;
                if (j == ((g35) obj3).l()) {
                    y25Var = y25Var2;
                }
                qacVar.a(y25Var);
                return;
            case 5:
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj2;
                ((ud7) obj3).run();
                if (!((Boolean) obj).booleanValue()) {
                    yr7.g(j);
                    yr7.s(2131749500, tL_messageActionStarGiftOnchainOffer.gift);
                    return;
                }
                return;
            case 6:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                String str = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    a0 = jb6.a0(null, null, 2131749492, str, fs7.k(j));
                } else {
                    a0 = jb6.a0(null, null, 2131749569, str);
                }
                fs7.s(tL_starGiftUnique, a0);
                return;
            case 7:
                RectF rectF = ProfileActivity.e7;
                ((ProfileActivity) obj3).x2((Context) obj2, j, (TL_payments.connectedBotStarRef) obj);
                return;
            default:
                wsa wsaVar = (wsa) obj3;
                oc7 oc7Var = (oc7) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < oc7Var.l4.X1.f()) {
                    wh1 F0 = oc7Var.F0();
                    long j2 = this.b;
                    F0.b(j2, tL_premium_boostsStatus, new s2c(wsaVar, tL_premium_boostsStatus, j2, oc7Var, (byte) 8));
                    return;
                }
                wsaVar.f2.setLoading(false);
                wsaVar.A2(true);
                return;
        }
    }

    public p2c(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
