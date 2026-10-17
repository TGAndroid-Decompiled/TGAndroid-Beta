package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ey;
public final class k4 implements RequestDelegate {
    public final int f1637a = 0;
    public final org.telegram.ui.ActionBar.b2 f1638b;
    public final long f1639c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f1640f;
    public final Object f1641g;

    public k4(k7 k7Var, pf.c cVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = k7Var;
        this.e = cVar;
        this.f1638b = b2Var;
        this.f1640f = tL_starGiftUnique;
        this.f1639c = j10;
        this.f1641g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1637a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p4((k7) this.d, (pf.c) this.e, this.f1638b, tLObject, (TL_stars.TL_starGiftUnique) this.f1640f, tL_error, this.f1639c, (CharSequence) this.f1641g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new p4((ey) this.d, this.f1638b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f1640f, this.f1639c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f1641g));
                return;
        }
    }

    public k4(ey eyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = eyVar;
        this.f1638b = b2Var;
        this.e = user;
        this.f1640f = chat;
        this.f1639c = j10;
        this.f1641g = tL_messages_checkHistoryImportPeer;
    }
}
