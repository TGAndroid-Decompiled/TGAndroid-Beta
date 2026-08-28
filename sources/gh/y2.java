package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.dy;
public final class y2 implements RequestDelegate {
    public final int f9199a = 0;
    public final org.telegram.ui.ActionBar.c2 f9200b;
    public final long f9201c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f9202e;
    public final TLObject f9203f;
    public final Object f9204g;

    public y2(k5 k5Var, ve.d dVar, org.telegram.ui.ActionBar.c2 c2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = k5Var;
        this.f9202e = dVar;
        this.f9200b = c2Var;
        this.f9203f = tL_starGiftUnique;
        this.f9201c = j10;
        this.f9204g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9199a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b3((k5) this.d, (ve.d) this.f9202e, this.f9200b, tLObject, (TL_stars.TL_starGiftUnique) this.f9203f, tL_error, this.f9201c, (CharSequence) this.f9204g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new b3((dy) this.d, this.f9200b, tLObject, (TLRPC.User) this.f9202e, (TLRPC.Chat) this.f9203f, this.f9201c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f9204g));
                return;
        }
    }

    public y2(dy dyVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = dyVar;
        this.f9200b = c2Var;
        this.f9202e = user;
        this.f9203f = chat;
        this.f9201c = j10;
        this.f9204g = tL_messages_checkHistoryImportPeer;
    }
}
