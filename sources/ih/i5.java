package ih;

import jh.s9;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.xa;
public final class i5 implements Utilities.Callback2 {
    public final int f9242a;
    public final long f9243b;
    public final org.telegram.ui.ActionBar.f3 f9244c;
    public final Object d;

    public i5(xa xaVar, Object obj, long j10, int i10) {
        this.f9242a = i10;
        this.f9244c = xaVar;
        this.d = obj;
        this.f9243b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f9242a) {
            case 0:
                q5.V((q5) this.f9244c, (TL_stars.TL_starGiftUnique) this.d, this.f9243b, (jh.j4) obj, (ye.c) obj2);
                return;
            case 1:
                s9.Q((s9) this.f9244c, (w41) this.d, this.f9243b, (Boolean) obj, (String) obj2);
                return;
            default:
                c80.m((c80) this.f9244c, this.f9243b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public i5(c80 c80Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f9242a = 2;
        this.f9244c = c80Var;
        this.f9243b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
