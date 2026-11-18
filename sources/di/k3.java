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
    public final int f9146a = 0;
    public final long f9147b;
    public final fs f9148c;
    public final Object d;
    public final Object f9149e;
    public final TLObject f9150f;
    public final Object f9151g;

    public k3(f6 f6Var, vf.b bVar, org.telegram.ui.ActionBar.u1 u1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.f9148c = f6Var;
        this.d = bVar;
        this.f9149e = u1Var;
        this.f9150f = tL_starGiftUnique;
        this.f9147b = j3;
        this.f9151g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9146a) {
            case 0:
                org.telegram.messenger.g0.g3(new m3((f6) this.f9148c, (vf.b) this.d, (org.telegram.ui.ActionBar.u1) this.f9149e, tLObject, (TL_stars.TL_starGiftUnique) this.f9150f, tL_error, this.f9147b, (CharSequence) this.f9151g));
                return;
            case 1:
                mp mpVar = (mp) this.f9148c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f9149e;
                TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = (TLRPC.TL_messages_editChatAdmin) this.f9150f;
                xo xoVar = (xo) this.f9151g;
                if (tL_error == null) {
                    org.telegram.messenger.g0.h3(new rm(mpVar, this.f9147b, runnable, 1), 1000L);
                    return;
                }
                org.telegram.messenger.g0.g3(new tl(mpVar, tL_error, h2Var, tL_messages_editChatAdmin, 3));
                if (xoVar != null) {
                    org.telegram.messenger.g0.g3(new zm(xoVar, tL_error, 0));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new m3((cx) this.f9148c, (org.telegram.ui.ActionBar.u1) this.f9149e, tLObject, (TLRPC.User) this.d, (TLRPC.Chat) this.f9150f, this.f9147b, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f9151g));
                return;
        }
    }

    public k3(mp mpVar, long j3, Runnable runnable, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, xo xoVar) {
        this.f9148c = mpVar;
        this.f9147b = j3;
        this.d = runnable;
        this.f9149e = h2Var;
        this.f9150f = tL_messages_editChatAdmin;
        this.f9151g = xoVar;
    }

    public k3(cx cxVar, org.telegram.ui.ActionBar.u1 u1Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f9148c = cxVar;
        this.f9149e = u1Var;
        this.d = user;
        this.f9150f = chat;
        this.f9147b = j3;
        this.f9151g = tL_messages_checkHistoryImportPeer;
    }
}
