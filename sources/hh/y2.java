package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.gy;

public final class y2 implements RequestDelegate {

    public final int f10361a = 0;

    public final org.telegram.ui.ActionBar.b2 f10362b;

    public final long f10363c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public final Object f10364e;

    public final TLObject f10365f;

    public final Object f10366g;

    public y2(i5 i5Var, we.d dVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = i5Var;
        this.f10364e = dVar;
        this.f10362b = b2Var;
        this.f10365f = tL_starGiftUnique;
        this.f10363c = j10;
        this.f10366g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10361a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b3((i5) this.d, (we.d) this.f10364e, this.f10362b, tLObject, (TL_stars.TL_starGiftUnique) this.f10365f, tL_error, this.f10363c, (CharSequence) this.f10366g));
                break;
            default:
                AndroidUtilities.runOnUIThread(new b3((gy) this.d, this.f10362b, tLObject, (TLRPC.User) this.f10364e, (TLRPC.Chat) this.f10365f, this.f10363c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f10366g));
                break;
        }
    }

    public y2(gy gyVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = gyVar;
        this.f10362b = b2Var;
        this.f10364e = user;
        this.f10365f = chat;
        this.f10363c = j10;
        this.f10366g = tL_messages_checkHistoryImportPeer;
    }
}
