package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ey;
public final class l4 implements RequestDelegate {
    public final int f1756a = 0;
    public final org.telegram.ui.ActionBar.b2 f1757b;
    public final long f1758c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f1759f;
    public final Object f1760g;

    public l4(k7 k7Var, pf.c cVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = k7Var;
        this.e = cVar;
        this.f1757b = b2Var;
        this.f1759f = tL_starGiftUnique;
        this.f1758c = j10;
        this.f1760g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1756a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p4((k7) this.d, (pf.c) this.e, this.f1757b, tLObject, (TL_stars.TL_starGiftUnique) this.f1759f, tL_error, this.f1758c, (CharSequence) this.f1760g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new p4((ey) this.d, this.f1757b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f1759f, this.f1758c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f1760g));
                return;
        }
    }

    public l4(ey eyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = eyVar;
        this.f1757b = b2Var;
        this.e = user;
        this.f1759f = chat;
        this.f1758c = j10;
        this.f1760g = tL_messages_checkHistoryImportPeer;
    }
}
