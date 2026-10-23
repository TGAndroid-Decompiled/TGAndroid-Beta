package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ey;
public final class l4 implements RequestDelegate {
    public final int f1682a = 0;
    public final org.telegram.ui.ActionBar.c2 f1683b;
    public final long f1684c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f1685f;
    public final Object f1686g;

    public l4(l7 l7Var, pf.c cVar, org.telegram.ui.ActionBar.c2 c2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = l7Var;
        this.e = cVar;
        this.f1683b = c2Var;
        this.f1685f = tL_starGiftUnique;
        this.f1684c = j10;
        this.f1686g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1682a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q4((l7) this.d, (pf.c) this.e, this.f1683b, tLObject, (TL_stars.TL_starGiftUnique) this.f1685f, tL_error, this.f1684c, (CharSequence) this.f1686g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new q4((ey) this.d, this.f1683b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f1685f, this.f1684c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f1686g));
                return;
        }
    }

    public l4(ey eyVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = eyVar;
        this.f1683b = c2Var;
        this.e = user;
        this.f1685f = chat;
        this.f1684c = j10;
        this.f1686g = tL_messages_checkHistoryImportPeer;
    }
}
