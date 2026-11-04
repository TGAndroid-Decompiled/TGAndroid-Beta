package ci;

import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.nm;
import org.telegram.messenger.qm;
import org.telegram.messenger.so;
import org.telegram.messenger.ul;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.uw;
public final class r3 implements RequestDelegate {
    public final int f5885a = 0;
    public final long f5886b;
    public final cs f5887c;
    public final Object d;
    public final Object f5888e;
    public final TLObject f5889f;
    public final Object f5890g;

    public r3(l6 l6Var, sf.b bVar, org.telegram.ui.ActionBar.s1 s1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.f5887c = l6Var;
        this.d = bVar;
        this.f5888e = s1Var;
        this.f5889f = tL_starGiftUnique;
        this.f5886b = j10;
        this.f5890g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5885a) {
            case 0:
                org.telegram.messenger.g0.h3(new w3((l6) this.f5887c, (sf.b) this.d, (org.telegram.ui.ActionBar.s1) this.f5888e, tLObject, (TL_stars.TL_starGiftUnique) this.f5889f, tL_error, this.f5886b, (CharSequence) this.f5890g));
                return;
            case 1:
                hp hpVar = (hp) this.f5887c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f5888e;
                TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = (TLRPC.TL_messages_editChatAdmin) this.f5889f;
                so soVar = (so) this.f5890g;
                if (tL_error == null) {
                    org.telegram.messenger.g0.i3(new nm(hpVar, this.f5886b, runnable, 1), 1000L);
                    return;
                }
                org.telegram.messenger.g0.h3(new ul(hpVar, tL_error, d2Var, tL_messages_editChatAdmin, 3));
                if (soVar != null) {
                    org.telegram.messenger.g0.h3(new qm(soVar, tL_error, 0));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new w3((uw) this.f5887c, (org.telegram.ui.ActionBar.s1) this.f5888e, tLObject, (TLRPC.User) this.d, (TLRPC.Chat) this.f5889f, this.f5886b, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f5890g));
                return;
        }
    }

    public r3(hp hpVar, long j10, Runnable runnable, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, so soVar) {
        this.f5887c = hpVar;
        this.f5886b = j10;
        this.d = runnable;
        this.f5888e = d2Var;
        this.f5889f = tL_messages_editChatAdmin;
        this.f5890g = soVar;
    }

    public r3(uw uwVar, org.telegram.ui.ActionBar.s1 s1Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f5887c = uwVar;
        this.f5888e = s1Var;
        this.d = user;
        this.f5889f = chat;
        this.f5886b = j10;
        this.f5890g = tL_messages_checkHistoryImportPeer;
    }
}
