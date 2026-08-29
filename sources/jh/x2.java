package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.fy;
public final class x2 implements RequestDelegate {
    public final int f13052a = 0;
    public final org.telegram.ui.ActionBar.c2 f13053b;
    public final long f13054c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f13055e;
    public final TLObject f13056f;
    public final Object f13057g;

    public x2(h5 h5Var, ye.c cVar, org.telegram.ui.ActionBar.c2 c2Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.d = h5Var;
        this.f13055e = cVar;
        this.f13053b = c2Var;
        this.f13056f = tL_starGiftUnique;
        this.f13054c = j10;
        this.f13057g = charSequence;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13052a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3((h5) this.d, (ye.c) this.f13055e, this.f13053b, tLObject, (TL_stars.TL_starGiftUnique) this.f13056f, tL_error, this.f13054c, (CharSequence) this.f13057g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new a3((fy) this.d, this.f13053b, tLObject, (TLRPC.User) this.f13055e, (TLRPC.Chat) this.f13056f, this.f13054c, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f13057g));
                return;
        }
    }

    public x2(fy fyVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = fyVar;
        this.f13053b = c2Var;
        this.f13055e = user;
        this.f13056f = chat;
        this.f13054c = j10;
        this.f13057g = tL_messages_checkHistoryImportPeer;
    }
}
