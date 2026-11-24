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
public final class p0c implements p8c {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;

    public p0c(Object obj, long j, TLObject tLObject, byte b) {
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
        y05 y05Var = null;
        boolean z = true;
        long j = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                b1c b1cVar = (b1c) obj3;
                k27 k27Var = (k27) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = k27Var.k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                b1cVar.getMessagesStorage().U1(j, k27Var.k);
                kk7.f(b1cVar.currentAccount).k(128, k27Var, Boolean.TRUE);
                return;
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                Long l = (Long) obj;
                gl.r((i63) obj2);
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
                ((hd) obj2).q(150L);
                cj3 cj3Var = ((wh3) obj3).b;
                Boolean bool = cj3Var.H.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    cj3Var.getMessagesController().j(this.b, cj3Var.getMessagesController().V1(Long.valueOf(cj3Var.I)), 0, null, cj3Var, false, runnable, new ce(runnable, (byte) 12), null);
                    return;
                } else {
                    runnable.run();
                    return;
                }
            case 3:
                kt4 kt4Var = (kt4) obj3;
                kt4Var.d(j).c = (ArrayList) obj;
                kt4Var.f(j, (TL_payments.TL_StarGiftAuctionState) obj2);
                return;
            case 4:
                p8c p8cVar = (p8c) obj2;
                y05 y05Var2 = (y05) obj;
                if (j == ((g15) obj3).l()) {
                    y05Var = y05Var2;
                }
                p8cVar.a(y05Var);
                return;
            case 5:
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj2;
                ((pc7) obj3).run();
                if (!((Boolean) obj).booleanValue()) {
                    vp7.g(j);
                    vp7.s(2131749551, tL_messageActionStarGiftOnchainOffer.gift);
                    return;
                }
                return;
            case 6:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                String str = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    a0 = k96.a0(null, null, 2131749543, str, cq7.k(j));
                } else {
                    a0 = k96.a0(null, null, 2131749620, str);
                }
                cq7.s(tL_starGiftUnique, a0);
                return;
            case 7:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj3).u2((Context) obj2, j, (TL_payments.connectedBotStarRef) obj);
                return;
            default:
                vqa vqaVar = (vqa) obj3;
                na7 na7Var = (na7) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < na7Var.k4.X1.f()) {
                    og1 E0 = na7Var.E0();
                    long j2 = this.b;
                    E0.b(j2, tL_premium_boostsStatus, new s0c(vqaVar, tL_premium_boostsStatus, j2, na7Var, (byte) 8));
                    return;
                }
                vqaVar.f2.setLoading(false);
                vqaVar.A2(true);
                return;
        }
    }

    public p0c(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
