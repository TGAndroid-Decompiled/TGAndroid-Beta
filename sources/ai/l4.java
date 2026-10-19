package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.cy;
public final class l4 implements RequestDelegate {
    public final int f1752a = 0;
    public final org.telegram.ui.ActionBar.b2 f1753b;
    public final long f1754c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f1755f;
    public final Object f1756g;

    public l4(k7 k7Var, pf.c cVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = k7Var;
        this.e = cVar;
        this.f1753b = b2Var;
        this.f1755f = tL_starGiftUnique;
        this.f1754c = j10;
        this.f1756g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1752a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p4((k7) this.d, (pf.c) this.e, this.f1753b, tLObject, (TL_stars.TL_starGiftUnique) this.f1755f, tL_error, this.f1754c, (CharSequence) this.f1756g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new p4((cy) this.d, this.f1753b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f1755f, this.f1754c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f1756g));
                return;
        }
    }

    public l4(cy cyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = cyVar;
        this.f1753b = b2Var;
        this.e = user;
        this.f1755f = chat;
        this.f1754c = j10;
        this.f1756g = tL_messages_checkHistoryImportPeer;
    }
}
