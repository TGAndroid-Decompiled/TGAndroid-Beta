package di;

import org.telegram.messenger.an;
import org.telegram.messenger.gs;
import org.telegram.messenger.np;
import org.telegram.messenger.sm;
import org.telegram.messenger.ul;
import org.telegram.messenger.yo;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.cx;
public final class k3 implements RequestDelegate {
    public final int f9169a = 0;
    public final long f9170b;
    public final gs f9171c;
    public final Object d;
    public final Object f9172e;
    public final TLObject f9173f;
    public final Object f9174g;

    public k3(f6 f6Var, vf.b bVar, org.telegram.ui.ActionBar.t1 t1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.f9171c = f6Var;
        this.d = bVar;
        this.f9172e = t1Var;
        this.f9173f = tL_starGiftUnique;
        this.f9170b = j3;
        this.f9174g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9169a) {
            case 0:
                org.telegram.messenger.g0.g3(new m3((f6) this.f9171c, (vf.b) this.d, (org.telegram.ui.ActionBar.t1) this.f9172e, tLObject, (TL_stars.TL_starGiftUnique) this.f9173f, tL_error, this.f9170b, (CharSequence) this.f9174g));
                return;
            case 1:
                np npVar = (np) this.f9171c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f9172e;
                TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = (TLRPC.TL_messages_editChatAdmin) this.f9173f;
                yo yoVar = (yo) this.f9174g;
                if (tL_error == null) {
                    org.telegram.messenger.g0.h3(new sm(npVar, this.f9170b, runnable, 1), 1000L);
                    return;
                }
                org.telegram.messenger.g0.g3(new ul(npVar, tL_error, g2Var, tL_messages_editChatAdmin, 3));
                if (yoVar != null) {
                    org.telegram.messenger.g0.g3(new an(yoVar, tL_error, 0));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new m3((cx) this.f9171c, (org.telegram.ui.ActionBar.t1) this.f9172e, tLObject, (TLRPC.User) this.d, (TLRPC.Chat) this.f9173f, this.f9170b, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f9174g));
                return;
        }
    }

    public k3(np npVar, long j3, Runnable runnable, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, yo yoVar) {
        this.f9171c = npVar;
        this.f9170b = j3;
        this.d = runnable;
        this.f9172e = g2Var;
        this.f9173f = tL_messages_editChatAdmin;
        this.f9174g = yoVar;
    }

    public k3(cx cxVar, org.telegram.ui.ActionBar.t1 t1Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f9171c = cxVar;
        this.f9172e = t1Var;
        this.d = user;
        this.f9173f = chat;
        this.f9170b = j3;
        this.f9174g = tL_messages_checkHistoryImportPeer;
    }
}
