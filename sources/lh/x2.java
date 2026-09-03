package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.qy;
public final class x2 implements RequestDelegate {
    public final int f13316a = 0;
    public final org.telegram.ui.ActionBar.d2 f13317b;
    public final long f13318c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final TLObject f13319f;
    public final Object f13320g;

    public x2(g5 g5Var, ze.c cVar, org.telegram.ui.ActionBar.d2 d2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = g5Var;
        this.e = cVar;
        this.f13317b = d2Var;
        this.f13319f = tL_starGiftUnique;
        this.f13318c = j10;
        this.f13320g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13316a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3((g5) this.d, (ze.c) this.e, this.f13317b, tLObject, (TL_stars.TL_starGiftUnique) this.f13319f, tL_error, this.f13318c, (CharSequence) this.f13320g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new a3((qy) this.d, this.f13317b, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f13319f, this.f13318c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f13320g));
                return;
        }
    }

    public x2(qy qyVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = qyVar;
        this.f13317b = d2Var;
        this.e = user;
        this.f13319f = chat;
        this.f13318c = j10;
        this.f13320g = tL_messages_checkHistoryImportPeer;
    }
}
