package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.cy;
public final class l4 implements RequestDelegate {
    public final int f1690a = 0;
    public final org.telegram.ui.ActionBar.b2 f1691b;
    public final long f1692c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f1693f;
    public final Object f1694g;

    public l4(l7 l7Var, pf.c cVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = l7Var;
        this.e = cVar;
        this.f1691b = b2Var;
        this.f1693f = tL_starGiftUnique;
        this.f1692c = j10;
        this.f1694g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1690a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q4((l7) this.d, (pf.c) this.e, this.f1691b, tLObject, (TL_stars.TL_starGiftUnique) this.f1693f, tL_error, this.f1692c, (CharSequence) this.f1694g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q4((cy) this.d, this.f1691b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f1693f, this.f1692c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f1694g));
                return;
        }
    }

    public l4(cy cyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = cyVar;
        this.f1691b = b2Var;
        this.e = user;
        this.f1693f = chat;
        this.f1692c = j10;
        this.f1694g = tL_messages_checkHistoryImportPeer;
    }
}
