package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.g61;
public final class tc implements Utilities.Callback2 {
    public final int f2225a;
    public final long f2226b;
    public final org.telegram.ui.ActionBar.f3 f2227c;
    public final Object d;

    public tc(org.telegram.ui.Components.bb bbVar, Object obj, long j10, int i10) {
        this.f2225a = i10;
        this.f2227c = bbVar;
        this.d = obj;
        this.f2226b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f2225a) {
            case 0:
                vc.R((vc) this.f2227c, (g61) this.d, this.f2226b, (Boolean) obj, (String) obj2);
                return;
            case 1:
                a90.n((a90) this.f2227c, this.f2226b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                yh.f4.W((yh.f4) this.f2227c, (TL_stars.TL_starGiftUnique) this.d, this.f2226b, (h6) obj, (pf.c) obj2);
                return;
        }
    }

    public tc(a90 a90Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f2225a = 1;
        this.f2227c = a90Var;
        this.f2226b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
