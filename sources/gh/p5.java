package gh;

import hh.x9;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.t70;

public final class p5 implements Utilities.Callback2 {

    public final int f7497a;

    public final long f7498b;

    public final org.telegram.ui.ActionBar.e3 f7499c;
    public final Object d;

    public p5(qa qaVar, Object obj, long j10, int i10) {
        this.f7497a = i10;
        this.f7499c = qaVar;
        this.d = obj;
        this.f7498b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f7497a) {
            case 0:
                x5.V((x5) this.f7499c, (TL_stars.TL_starGiftUnique) this.d, this.f7498b, (hh.k4) obj, (we.d) obj2);
                break;
            case 1:
                x9.Q((x9) this.f7499c, (n41) this.d, this.f7498b, (Boolean) obj, (String) obj2);
                break;
            default:
                t70.m((t70) this.f7499c, this.f7498b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public p5(t70 t70Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f7497a = 2;
        this.f7499c = t70Var;
        this.f7498b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
