package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.oy;
public final class x2 implements RequestDelegate {
    public final int f13332a = 0;
    public final org.telegram.ui.ActionBar.d2 f13333b;
    public final long f13334c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f13335f;
    public final Object f13336g;

    public x2(g5 g5Var, af.f fVar, org.telegram.ui.ActionBar.d2 d2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = g5Var;
        this.e = fVar;
        this.f13333b = d2Var;
        this.f13335f = tL_starGiftUnique;
        this.f13334c = j10;
        this.f13336g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13332a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3((g5) this.d, (af.f) this.e, this.f13333b, tLObject, (TL_stars.TL_starGiftUnique) this.f13335f, tL_error, this.f13334c, (CharSequence) this.f13336g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new a3((oy) this.d, this.f13333b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f13335f, this.f13334c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f13336g));
                return;
        }
    }

    public x2(oy oyVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = oyVar;
        this.f13333b = d2Var;
        this.e = user;
        this.f13335f = chat;
        this.f13334c = j10;
        this.f13336g = tL_messages_checkHistoryImportPeer;
    }
}
