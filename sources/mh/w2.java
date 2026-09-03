package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.py;
public final class w2 implements RequestDelegate {
    public final int f14968a = 0;
    public final org.telegram.ui.ActionBar.d2 f14969b;
    public final long f14970c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f14971e;
    public final TLObject f14972f;
    public final Object f14973g;

    public w2(g5 g5Var, af.f fVar, org.telegram.ui.ActionBar.d2 d2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = g5Var;
        this.f14971e = fVar;
        this.f14969b = d2Var;
        this.f14972f = tL_starGiftUnique;
        this.f14970c = j10;
        this.f14973g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14968a) {
            case 0:
                AndroidUtilities.runOnUIThread(new z2((g5) this.d, (af.f) this.f14971e, this.f14969b, tLObject, (TL_stars.TL_starGiftUnique) this.f14972f, tL_error, this.f14970c, (CharSequence) this.f14973g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new z2((py) this.d, this.f14969b, tLObject, (TLRPC.User) this.f14971e, (TLRPC.Chat) this.f14972f, this.f14970c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f14973g));
                return;
        }
    }

    public w2(py pyVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = pyVar;
        this.f14969b = d2Var;
        this.f14971e = user;
        this.f14972f = chat;
        this.f14970c = j10;
        this.f14973g = tL_messages_checkHistoryImportPeer;
    }
}
