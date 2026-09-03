package kh;

import lh.t9;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.sa;
public final class h5 implements Utilities.Callback2 {
    public final int f10768a;
    public final long f10769b;
    public final org.telegram.ui.ActionBar.g3 f10770c;
    public final Object d;

    public h5(sa saVar, Object obj, long j10, int i10) {
        this.f10768a = i10;
        this.f10770c = saVar;
        this.d = obj;
        this.f10769b = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f10768a) {
            case 0:
                p5.V((p5) this.f10770c, (TL_stars.TL_starGiftUnique) this.d, this.f10769b, (lh.i4) obj, (ze.c) obj2);
                return;
            case 1:
                t9.Q((t9) this.f10770c, (i51) this.d, this.f10769b, (Boolean) obj, (String) obj2);
                return;
            default:
                i80.m((i80) this.f10770c, this.f10769b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }

    public h5(i80 i80Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f10768a = 2;
        this.f10770c = i80Var;
        this.f10769b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
