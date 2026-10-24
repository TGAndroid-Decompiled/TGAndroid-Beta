package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.z80;
public final class uc implements Utilities.Callback2 {
    public final int f2277a;
    public final long f2278b;
    public final org.telegram.ui.ActionBar.h3 f2279c;
    public final Object d;

    public uc(org.telegram.ui.Components.za zaVar, Object obj, long j10, int i10) {
        this.f2277a = i10;
        this.f2279c = zaVar;
        this.d = obj;
        this.f2278b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f2277a) {
            case 0:
                wc.Q((wc) this.f2279c, (l61) this.d, this.f2278b, (Boolean) obj, (String) obj2);
                return;
            case 1:
                z80.m((z80) this.f2279c, this.f2278b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                yh.f4.V((yh.f4) this.f2279c, (TL_stars.TL_starGiftUnique) this.d, this.f2278b, (i6) obj, (pf.c) obj2);
                return;
        }
    }

    public uc(z80 z80Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f2277a = 1;
        this.f2279c = z80Var;
        this.f2278b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
