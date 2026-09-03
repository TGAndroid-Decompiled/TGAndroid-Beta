package lh;

import mh.t9;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.sa;
public final class i5 implements Utilities.Callback2 {
    public final int f12812a;
    public final long f12813b;
    public final org.telegram.ui.ActionBar.h3 f12814c;
    public final Object d;

    public i5(sa saVar, Object obj, long j10, int i10) {
        this.f12812a = i10;
        this.f12814c = saVar;
        this.d = obj;
        this.f12813b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f12812a) {
            case 0:
                q5.V((q5) this.f12814c, (TL_stars.TL_starGiftUnique) this.d, this.f12813b, (mh.i4) obj, (af.f) obj2);
                return;
            case 1:
                t9.Q((t9) this.f12814c, (h51) this.d, this.f12813b, (Boolean) obj, (String) obj2);
                return;
            default:
                j80.m((j80) this.f12814c, this.f12813b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public i5(j80 j80Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f12812a = 2;
        this.f12814c = j80Var;
        this.f12813b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
