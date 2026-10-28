package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.u61;
public final class lc implements Utilities.Callback2 {
    public final int f5052a;
    public final long f5053b;
    public final org.telegram.ui.ActionBar.k3 f5054c;
    public final Object d;

    public lc(org.telegram.ui.Components.bb bbVar, Object obj, long j10, int i10) {
        this.f5052a = i10;
        this.f5054c = bbVar;
        this.d = obj;
        this.f5053b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f5052a) {
            case 0:
                nc.Q((nc) this.f5054c, (u61) this.d, this.f5053b, (Boolean) obj, (String) obj2);
                return;
            case 1:
                d90.m((d90) this.f5054c, this.f5053b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                zh.g4.V((zh.g4) this.f5054c, (TL_stars.TL_starGiftUnique) this.d, this.f5053b, (d6) obj, (qf.c) obj2);
                return;
        }
    }

    public lc(d90 d90Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f5052a = 1;
        this.f5054c = d90Var;
        this.f5053b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
