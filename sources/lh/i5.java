package lh;

import mh.t9;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.sa;
public final class i5 implements Utilities.Callback2 {
    public final int f12810a;
    public final long f12811b;
    public final org.telegram.ui.ActionBar.h3 f12812c;
    public final Object d;

    public i5(sa saVar, Object obj, long j10, int i10) {
        this.f12810a = i10;
        this.f12812c = saVar;
        this.d = obj;
        this.f12811b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f12810a) {
            case 0:
                q5.V((q5) this.f12812c, (TL_stars.TL_starGiftUnique) this.d, this.f12811b, (mh.i4) obj, (af.f) obj2);
                return;
            case 1:
                t9.Q((t9) this.f12812c, (j51) this.d, this.f12811b, (Boolean) obj, (String) obj2);
                return;
            default:
                j80.m((j80) this.f12812c, this.f12811b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public i5(j80 j80Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f12810a = 2;
        this.f12812c = j80Var;
        this.f12811b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
