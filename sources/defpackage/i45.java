package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;
public final class i45 implements RequestDelegate {
    public final byte a = 0;
    public final long b;
    public final boolean c;
    public final gk7 d;
    public final Object e;
    public final Object f;
    public final TLObject g;

    public i45(h75 h75Var, long j, hd[] hdVarArr, TLRPC.User user, boolean z, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.d = h75Var;
        this.b = j;
        this.e = hdVarArr;
        this.f = user;
        this.c = z;
        this.g = invitetogroupcall;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        TLObject tLObject2 = this.g;
        Object obj = this.f;
        Object obj2 = this.e;
        gk7 gk7Var = this.d;
        switch (b) {
            case 0:
                h75 h75Var = (h75) gk7Var;
                hd[] hdVarArr = (hd[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                TL_phone.inviteToGroupCall invitetogroupcall = (TL_phone.inviteToGroupCall) tLObject2;
                long j = this.b;
                if (tLObject != null) {
                    na7.q1(h75Var.n1.a).R3((TLRPC.Updates) tLObject, false);
                    gl.c3(new m77(h75Var, j, hdVarArr, user, (byte) 11));
                    return;
                }
                gl.c3(new ms0(h75Var, hdVarArr, this.c, tL_error, j, invitetogroupcall));
                return;
            default:
                na7 na7Var = (na7) gk7Var;
                q21 q21Var = (q21) obj2;
                d dVar = (d) obj;
                TLRPC.TL_channels_editBanned tL_channels_editBanned = (TLRPC.TL_channels_editBanned) tLObject2;
                if (tL_error == null) {
                    na7Var.R3((TLRPC.Updates) tLObject, false);
                    gl.d3(new r57(na7Var, this.b, (byte) 15), 1000L);
                    if (q21Var != null) {
                        gl.c3(q21Var);
                        return;
                    }
                    return;
                }
                gl.c3(new z77(na7Var, tL_error, dVar, tL_channels_editBanned, this.c, (byte) 0));
                return;
        }
    }

    public i45(na7 na7Var, long j, q21 q21Var, d dVar, TLRPC.TL_channels_editBanned tL_channels_editBanned, boolean z) {
        this.d = na7Var;
        this.b = j;
        this.e = q21Var;
        this.f = dVar;
        this.g = tL_channels_editBanned;
        this.c = z;
    }
}
