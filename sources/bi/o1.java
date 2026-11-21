package bi;

import android.content.Context;
import android.content.SharedPreferences;
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
import org.telegram.ui.Components.gq0;
import org.telegram.ui.jw0;
public final class o1 implements RequestDelegate {
    public final int f3959a;
    public final Object f3960b;
    public final Object f3961c;

    public o1(int i7, Object obj, Object obj2) {
        this.f3959a = i7;
        this.f3960b = obj;
        this.f3961c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3959a) {
            case 0:
                org.telegram.messenger.g0.g3(new aa.r((e2) this.f3960b, (String) this.f3961c, tLObject, 8));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new aa.r((gq0) this.f3960b, tL_error, (org.telegram.ui.ActionBar.g2) this.f3961c, 11));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new aa.r((y7) this.f3960b, tLObject, (TL_stars.getResaleStarGifts) this.f3961c, 14));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new aa.r((di.t) this.f3960b, tLObject, (Context) this.f3961c, 18));
                return;
            case 4:
                org.telegram.messenger.g0.g3(new ai.r((Object) ((di.s) this.f3960b), (Object) tLObject, (String) this.f3961c, (Object) tL_error, 7));
                return;
            case 5:
                di.f6 f6Var = (di.f6) this.f3960b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f3961c;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    mp.u1(f6Var.f30170a).f4(tL_payments_uniqueStarGift.users, false);
                    mp.u1(f6Var.f30170a).Z3(tL_payments_uniqueStarGift.chats, false);
                    if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        org.telegram.messenger.g0.g3(new di.f2(9, f6Var, tL_payments_uniqueStarGift));
                        return;
                    }
                }
                org.telegram.messenger.g0.g3(new di.f2(10, t1Var, tL_error));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new ai.r((di.f6) this.f3960b, tLObject, (aa.r) this.f3961c, tL_error, 11));
                return;
            case 7:
                di.f6 f6Var2 = (di.f6) this.f3960b;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f3961c;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    mp.u1(f6Var2.f30170a).f4(updates.users, false);
                    mp.u1(f6Var2.f30170a).Z3(updates.chats, false);
                }
                org.telegram.messenger.g0.g3(new ai.r(f6Var2, tL_error, tLObject, inputSavedStarGift, 13));
                return;
            case 8:
                org.telegram.messenger.g0.g3(new aa.r((Object) tLObject, (Object) ((di.j0) this.f3960b), (String) this.f3961c, 27));
                return;
            case 9:
                org.telegram.messenger.g0.g3(new aa.r((di.y8) this.f3960b, tLObject, tL_error, (x10) this.f3961c, 28));
                return;
            case 10:
                org.telegram.messenger.g0.g3(new aa.r((di.y8) this.f3960b, tLObject, (Runnable) this.f3961c, 29));
                return;
            case 11:
                fi.r3 r3Var = (fi.r3) this.f3960b;
                hi.p8 p8Var = (hi.p8) this.f3961c;
                if (tLObject instanceof TLRPC.Updates) {
                    mp.u1(r3Var.f12529x.f12888m2).V3((TLRPC.Updates) tLObject, false);
                }
                org.telegram.messenger.g0.g3(new fi.o3(p8Var, 0));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new di.a8((fi.a6) this.f3960b, tLObject, (Runnable) this.f3961c, 7));
                return;
            case 13:
                org.telegram.messenger.g0.g3(new ai.r((fi.d6) this.f3960b, tLObject, (x10) this.f3961c, tL_error, 17));
                return;
            case 14:
                org.telegram.messenger.g0.g3(new di.a8((o9) this.f3960b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f3961c, 9));
                return;
            case 15:
                org.telegram.messenger.g0.g3(new di.a8((hi.x1) this.f3960b, (String) this.f3961c, tLObject, 12));
                return;
            case 16:
                org.telegram.messenger.g0.g3(new di.a8((hi.c3) this.f3960b, tLObject, (mp) this.f3961c, 15));
                return;
            case 17:
                org.telegram.messenger.g0.g3(new di.a8((hi.k8) this.f3960b, tLObject, (mp) this.f3961c, 18));
                return;
            case 18:
                org.telegram.messenger.g0.g3(new di.a8((jg.h1) this.f3960b, (String) this.f3961c, tLObject, 23));
                return;
            case 19:
                jg.a2 a2Var = (jg.a2) this.f3960b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f3961c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    org.telegram.messenger.g0.g3(new di.a8(a2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 26));
                    return;
                }
                return;
            case 20:
                org.telegram.messenger.g0.g3(new di.a8((kg.z) this.f3960b, tLObject, (TL_account.TL_businessChatLink) this.f3961c, 29));
                return;
            case 21:
                org.telegram.messenger.g0.g3(new ji.i(2, (kg.k0) this.f3960b, (jw0) this.f3961c));
                return;
            case 22:
                org.telegram.messenger.g0.g3(new kg.y((kg.z1) this.f3960b, tLObject, (SharedPreferences) this.f3961c, 4));
                return;
            case 23:
                org.telegram.messenger.g0.g3(new ai.r((Object) tLObject, (Object) ((ArrayList) this.f3960b), (String) this.f3961c, (Object) tL_error, 24));
                return;
            case 24:
                org.telegram.messenger.g0.g3(new kg.y((boolean[]) this.f3960b, tLObject, (v3) this.f3961c, 6));
                return;
            case 25:
                org.telegram.messenger.g0.g3(new kg.y((ki.h3) this.f3960b, tLObject, (org.telegram.ui.ActionBar.t1) this.f3961c, 9));
                return;
            case 26:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.f3960b, (Runnable) this.f3961c, tLObject, tL_error);
                return;
            case 27:
                ((VoIPService) this.f3960b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.f3961c, tLObject, tL_error);
                return;
            case 28:
                ((VoIPService) this.f3960b).lambda$startOutgoingCall$10((byte[]) this.f3961c, tLObject, tL_error);
                return;
            default:
                ((VoIPService) this.f3960b).lambda$startConferenceGroupCall$32((org.telegram.messenger.c) this.f3961c, tLObject, tL_error);
                return;
        }
    }
}
