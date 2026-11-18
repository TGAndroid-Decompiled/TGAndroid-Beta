package bi;

import android.content.Context;
import android.content.SharedPreferences;
import di.ga;
import fi.o9;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.jw0;
public final class k1 implements RequestDelegate {
    public final int f3773a;
    public final Object f3774b;
    public final Object f3775c;

    public k1(int i7, Object obj, Object obj2) {
        this.f3773a = i7;
        this.f3774b = obj;
        this.f3775c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3773a) {
            case 0:
                org.telegram.messenger.g0.g3(new aa.r((a2) this.f3774b, (String) this.f3775c, tLObject, 7));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new aa.r((eq0) this.f3774b, tL_error, (org.telegram.ui.ActionBar.h2) this.f3775c, 10));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new aa.r((u7) this.f3774b, tLObject, (TL_stars.getResaleStarGifts) this.f3775c, 13));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new aa.r((di.t) this.f3774b, tLObject, (Context) this.f3775c, 17));
                return;
            case 4:
                org.telegram.messenger.g0.g3(new ai.s((Object) ((di.s) this.f3774b), (Object) tLObject, (String) this.f3775c, (Object) tL_error, 7));
                return;
            case 5:
                di.f6 f6Var = (di.f6) this.f3774b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f3775c;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    mp.u1(f6Var.f30187a).f4(tL_payments_uniqueStarGift.users, false);
                    mp.u1(f6Var.f30187a).Z3(tL_payments_uniqueStarGift.chats, false);
                    if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        org.telegram.messenger.g0.g3(new di.w2(7, f6Var, tL_payments_uniqueStarGift));
                        return;
                    }
                }
                org.telegram.messenger.g0.g3(new di.w2(8, u1Var, tL_error));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new ai.s((di.f6) this.f3774b, tLObject, (aa.r) this.f3775c, tL_error, 11));
                return;
            case 7:
                di.f6 f6Var2 = (di.f6) this.f3774b;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f3775c;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    mp.u1(f6Var2.f30187a).f4(updates.users, false);
                    mp.u1(f6Var2.f30187a).Z3(updates.chats, false);
                }
                org.telegram.messenger.g0.g3(new ai.s(f6Var2, tL_error, tLObject, inputSavedStarGift, 13));
                return;
            case 8:
                org.telegram.messenger.g0.g3(new aa.r((Object) tLObject, (Object) ((di.j0) this.f3774b), (String) this.f3775c, 26));
                return;
            case 9:
                org.telegram.messenger.g0.g3(new aa.r((di.x8) this.f3774b, tLObject, tL_error, (x10) this.f3775c, 27));
                return;
            case 10:
                org.telegram.messenger.g0.g3(new aa.r((di.x8) this.f3774b, tLObject, (Runnable) this.f3775c, 28));
                return;
            case 11:
                fi.r3 r3Var = (fi.r3) this.f3774b;
                hi.q8 q8Var = (hi.q8) this.f3775c;
                if (tLObject instanceof TLRPC.Updates) {
                    mp.u1(r3Var.f12498x.f12847m2).V3((TLRPC.Updates) tLObject, false);
                }
                org.telegram.messenger.g0.g3(new fi.o3(q8Var, 0));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new ga((fi.z5) this.f3774b, tLObject, (Runnable) this.f3775c, 6));
                return;
            case 13:
                org.telegram.messenger.g0.g3(new ai.s((fi.d6) this.f3774b, tLObject, (x10) this.f3775c, tL_error, 17));
                return;
            case 14:
                org.telegram.messenger.g0.g3(new ga((o9) this.f3774b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f3775c, 8));
                return;
            case 15:
                org.telegram.messenger.g0.g3(new ga((hi.y1) this.f3774b, (String) this.f3775c, tLObject, 11));
                return;
            case 16:
                org.telegram.messenger.g0.g3(new ga((hi.d3) this.f3774b, tLObject, (mp) this.f3775c, 14));
                return;
            case 17:
                org.telegram.messenger.g0.g3(new ga((hi.l8) this.f3774b, tLObject, (mp) this.f3775c, 17));
                return;
            case 18:
                org.telegram.messenger.g0.g3(new ga((jg.h1) this.f3774b, (String) this.f3775c, tLObject, 22));
                return;
            case 19:
                jg.a2 a2Var = (jg.a2) this.f3774b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f3775c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    org.telegram.messenger.g0.g3(new ga(a2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 25));
                    return;
                }
                return;
            case 20:
                org.telegram.messenger.g0.g3(new ga((kg.y) this.f3774b, tLObject, (TL_account.TL_businessChatLink) this.f3775c, 28));
                return;
            case 21:
                org.telegram.messenger.g0.g3(new kg.h0(0, (kg.l0) this.f3774b, (jw0) this.f3775c));
                return;
            case 22:
                org.telegram.messenger.g0.g3(new kg.i0((kg.z1) this.f3774b, tLObject, (SharedPreferences) this.f3775c, 3));
                return;
            case 23:
                org.telegram.messenger.g0.g3(new ai.s((Object) tLObject, (Object) ((ArrayList) this.f3774b), (String) this.f3775c, (Object) tL_error, 24));
                return;
            case 24:
                org.telegram.messenger.g0.g3(new kg.i0((boolean[]) this.f3774b, tLObject, (r3) this.f3775c, 5));
                return;
            case 25:
                org.telegram.messenger.g0.g3(new kg.i0((ki.i3) this.f3774b, tLObject, (org.telegram.ui.ActionBar.u1) this.f3775c, 8));
                return;
            case 26:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f3774b, (Runnable) this.f3775c, tLObject, tL_error);
                return;
            case 27:
                ((VoIPService) this.f3774b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f3775c, tLObject, tL_error);
                return;
            case 28:
                ((VoIPService) this.f3774b).lambda$startOutgoingCall$10((byte[]) this.f3775c, tLObject, tL_error);
                return;
            default:
                ((VoIPService) this.f3774b).lambda$startConferenceGroupCall$32((org.telegram.messenger.c) this.f3775c, tLObject, tL_error);
                return;
        }
    }
}
