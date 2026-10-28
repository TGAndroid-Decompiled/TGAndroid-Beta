package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ey;
public final class g4 implements RequestDelegate {
    public final int f4648a = 0;
    public final org.telegram.ui.ActionBar.e2 f4649b;
    public final long f4650c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f4651f;
    public final Object f4652g;

    public g4(h7 h7Var, qf.c cVar, org.telegram.ui.ActionBar.e2 e2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = h7Var;
        this.e = cVar;
        this.f4649b = e2Var;
        this.f4651f = tL_starGiftUnique;
        this.f4650c = j10;
        this.f4652g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4648a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4((h7) this.d, (qf.c) this.e, this.f4649b, tLObject, (TL_stars.TL_starGiftUnique) this.f4651f, tL_error, this.f4650c, (CharSequence) this.f4652g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new l4((ey) this.d, this.f4649b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f4651f, this.f4650c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f4652g));
                return;
        }
    }

    public g4(ey eyVar, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = eyVar;
        this.f4649b = e2Var;
        this.e = user;
        this.f4651f = chat;
        this.f4650c = j10;
        this.f4652g = tL_messages_checkHistoryImportPeer;
    }
}
