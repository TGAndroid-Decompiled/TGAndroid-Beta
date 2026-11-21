package di;

import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.rm;
import org.telegram.messenger.tl;
import org.telegram.messenger.xo;
import org.telegram.messenger.zm;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.cx;
public final class k3 implements RequestDelegate {
    public final int f9166a = 0;
    public final long f9167b;
    public final fs f9168c;
    public final Object d;
    public final Object f9169e;
    public final TLObject f9170f;
    public final Object f9171g;

    public k3(f6 f6Var, vf.b bVar, org.telegram.ui.ActionBar.t1 t1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.f9168c = f6Var;
        this.d = bVar;
        this.f9169e = t1Var;
        this.f9170f = tL_starGiftUnique;
        this.f9167b = j3;
        this.f9171g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9166a) {
            case 0:
                org.telegram.messenger.g0.g3(new m3((f6) this.f9168c, (vf.b) this.d, (org.telegram.ui.ActionBar.t1) this.f9169e, tLObject, (TL_stars.TL_starGiftUnique) this.f9170f, tL_error, this.f9167b, (CharSequence) this.f9171g));
                return;
            case 1:
                mp mpVar = (mp) this.f9168c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f9169e;
                TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = (TLRPC.TL_messages_editChatAdmin) this.f9170f;
                xo xoVar = (xo) this.f9171g;
                if (tL_error == null) {
                    org.telegram.messenger.g0.h3(new rm(mpVar, this.f9167b, runnable, 1), 1000L);
                    return;
                }
                org.telegram.messenger.g0.g3(new tl(mpVar, tL_error, g2Var, tL_messages_editChatAdmin, 3));
                if (xoVar != null) {
                    org.telegram.messenger.g0.g3(new zm(xoVar, tL_error, 0));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new m3((cx) this.f9168c, (org.telegram.ui.ActionBar.t1) this.f9169e, tLObject, (TLRPC.User) this.d, (TLRPC.Chat) this.f9170f, this.f9167b, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f9171g));
                return;
        }
    }

    public k3(mp mpVar, long j3, Runnable runnable, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, xo xoVar) {
        this.f9168c = mpVar;
        this.f9167b = j3;
        this.d = runnable;
        this.f9169e = g2Var;
        this.f9170f = tL_messages_editChatAdmin;
        this.f9171g = xoVar;
    }

    public k3(cx cxVar, org.telegram.ui.ActionBar.t1 t1Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f9168c = cxVar;
        this.f9169e = t1Var;
        this.d = user;
        this.f9170f = chat;
        this.f9167b = j3;
        this.f9171g = tL_messages_checkHistoryImportPeer;
    }
}
