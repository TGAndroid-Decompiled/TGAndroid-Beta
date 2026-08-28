package fh;

import gh.y9;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.sa;
public final class w5 implements Utilities.Callback2 {
    public final int f6836a;
    public final long f6837b;
    public final org.telegram.ui.ActionBar.f3 f6838c;
    public final Object d;

    public w5(sa saVar, Object obj, long j10, int i9) {
        this.f6836a = i9;
        this.f6838c = saVar;
        this.d = obj;
        this.f6837b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f6836a) {
            case 0:
                f6.U((f6) this.f6838c, (TL_stars.TL_starGiftUnique) this.d, this.f6837b, (gh.m4) obj, (ve.d) obj2);
                return;
            case 1:
                y9.P((y9) this.f6838c, (l41) this.d, this.f6837b, (Boolean) obj, (String) obj2);
                return;
            default:
                p70.m((p70) this.f6838c, this.f6837b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public w5(p70 p70Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f6836a = 2;
        this.f6838c = p70Var;
        this.f6837b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
