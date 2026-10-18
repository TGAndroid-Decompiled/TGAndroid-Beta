package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ey;
public final class j4 implements RequestDelegate {
    public final int f1559a = 0;
    public final org.telegram.ui.ActionBar.b2 f1560b;
    public final long f1561c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f1562f;
    public final Object f1563g;

    public j4(k7 k7Var, pf.c cVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = k7Var;
        this.e = cVar;
        this.f1560b = b2Var;
        this.f1562f = tL_starGiftUnique;
        this.f1561c = j10;
        this.f1563g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1559a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o4((k7) this.d, (pf.c) this.e, this.f1560b, tLObject, (TL_stars.TL_starGiftUnique) this.f1562f, tL_error, this.f1561c, (CharSequence) this.f1563g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new o4((ey) this.d, this.f1560b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f1562f, this.f1561c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f1563g));
                return;
        }
    }

    public j4(ey eyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = eyVar;
        this.f1560b = b2Var;
        this.e = user;
        this.f1562f = chat;
        this.f1561c = j10;
        this.f1563g = tL_messages_checkHistoryImportPeer;
    }
}
