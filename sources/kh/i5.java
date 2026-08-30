package kh;

import lh.t9;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sa;
public final class i5 implements Utilities.Callback2 {
    public final int f10670a;
    public final long f10671b;
    public final org.telegram.ui.ActionBar.g3 f10672c;
    public final Object d;

    public i5(sa saVar, Object obj, long j10, int i10) {
        this.f10670a = i10;
        this.f10672c = saVar;
        this.d = obj;
        this.f10671b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f10670a) {
            case 0:
                q5.V((q5) this.f10672c, (TL_stars.TL_starGiftUnique) this.d, this.f10671b, (lh.i4) obj, (af.f) obj2);
                return;
            case 1:
                t9.Q((t9) this.f10672c, (i51) this.d, this.f10671b, (Boolean) obj, (String) obj2);
                return;
            default:
                h80.m((h80) this.f10672c, this.f10671b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public i5(h80 h80Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f10670a = 2;
        this.f10672c = h80Var;
        this.f10671b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
