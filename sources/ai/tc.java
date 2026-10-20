package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.h61;
public final class tc implements Utilities.Callback2 {
    public final int f2229a;
    public final long f2230b;
    public final org.telegram.ui.ActionBar.f3 f2231c;
    public final Object d;

    public tc(org.telegram.ui.Components.bb bbVar, Object obj, long j10, int i10) {
        this.f2229a = i10;
        this.f2231c = bbVar;
        this.d = obj;
        this.f2230b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f2229a) {
            case 0:
                vc.R((vc) this.f2231c, (h61) this.d, this.f2230b, (Boolean) obj, (String) obj2);
                return;
            case 1:
                a90.n((a90) this.f2231c, this.f2230b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                yh.f4.W((yh.f4) this.f2231c, (TL_stars.TL_starGiftUnique) this.d, this.f2230b, (i6) obj, (pf.c) obj2);
                return;
        }
    }

    public tc(a90 a90Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f2229a = 1;
        this.f2231c = a90Var;
        this.f2230b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
