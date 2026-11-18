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
    public final int f9143a = 0;
    public final long f9144b;
    public final fs f9145c;
    public final Object d;
    public final Object f9146e;
    public final TLObject f9147f;
    public final Object f9148g;

    public k3(f6 f6Var, vf.b bVar, org.telegram.ui.ActionBar.u1 u1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.f9145c = f6Var;
        this.d = bVar;
        this.f9146e = u1Var;
        this.f9147f = tL_starGiftUnique;
        this.f9144b = j3;
        this.f9148g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9143a) {
            case 0:
                org.telegram.messenger.g0.g3(new m3((f6) this.f9145c, (vf.b) this.d, (org.telegram.ui.ActionBar.u1) this.f9146e, tLObject, (TL_stars.TL_starGiftUnique) this.f9147f, tL_error, this.f9144b, (CharSequence) this.f9148g));
                return;
            case 1:
                mp mpVar = (mp) this.f9145c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f9146e;
                TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = (TLRPC.TL_messages_editChatAdmin) this.f9147f;
                xo xoVar = (xo) this.f9148g;
                if (tL_error == null) {
                    org.telegram.messenger.g0.h3(new rm(mpVar, this.f9144b, runnable, 1), 1000L);
                    return;
                }
                org.telegram.messenger.g0.g3(new tl(mpVar, tL_error, h2Var, tL_messages_editChatAdmin, 3));
                if (xoVar != null) {
                    org.telegram.messenger.g0.g3(new zm(xoVar, tL_error, 0));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new m3((cx) this.f9145c, (org.telegram.ui.ActionBar.u1) this.f9146e, tLObject, (TLRPC.User) this.d, (TLRPC.Chat) this.f9147f, this.f9144b, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f9148g));
                return;
        }
    }

    public k3(mp mpVar, long j3, Runnable runnable, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, xo xoVar) {
        this.f9145c = mpVar;
        this.f9144b = j3;
        this.d = runnable;
        this.f9146e = h2Var;
        this.f9147f = tL_messages_editChatAdmin;
        this.f9148g = xoVar;
    }

    public k3(cx cxVar, org.telegram.ui.ActionBar.u1 u1Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f9145c = cxVar;
        this.f9146e = u1Var;
        this.d = user;
        this.f9147f = chat;
        this.f9144b = j3;
        this.f9148g = tL_messages_checkHistoryImportPeer;
    }
}
