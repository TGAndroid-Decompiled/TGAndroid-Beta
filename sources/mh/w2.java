package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.py;
public final class w2 implements RequestDelegate {
    public final int f14966a = 0;
    public final org.telegram.ui.ActionBar.d2 f14967b;
    public final long f14968c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f14969e;
    public final TLObject f14970f;
    public final Object f14971g;

    public w2(g5 g5Var, af.f fVar, org.telegram.ui.ActionBar.d2 d2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = g5Var;
        this.f14969e = fVar;
        this.f14967b = d2Var;
        this.f14970f = tL_starGiftUnique;
        this.f14968c = j10;
        this.f14971g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14966a) {
            case 0:
                AndroidUtilities.runOnUIThread(new z2((g5) this.d, (af.f) this.f14969e, this.f14967b, tLObject, (TL_stars.TL_starGiftUnique) this.f14970f, tL_error, this.f14968c, (CharSequence) this.f14971g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new z2((py) this.d, this.f14967b, tLObject, (TLRPC.User) this.f14969e, (TLRPC.Chat) this.f14970f, this.f14968c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f14971g));
                return;
        }
    }

    public w2(py pyVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = pyVar;
        this.f14967b = d2Var;
        this.f14969e = user;
        this.f14970f = chat;
        this.f14968c = j10;
        this.f14971g = tL_messages_checkHistoryImportPeer;
    }
}
