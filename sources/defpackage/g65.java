package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;
public final class g65 implements RequestDelegate {
    public final byte a = 0;
    public final long b;
    public final boolean c;
    public final jm7 d;
    public final Object e;
    public final Object f;
    public final TLObject g;

    public g65(g95 g95Var, long j, he[] heVarArr, TLRPC.User user, boolean z, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.d = g95Var;
        this.b = j;
        this.e = heVarArr;
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
        jm7 jm7Var = this.d;
        switch (b) {
            case 0:
                g95 g95Var = (g95) jm7Var;
                he[] heVarArr = (he[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                TL_phone.inviteToGroupCall invitetogroupcall = (TL_phone.inviteToGroupCall) tLObject2;
                long j = this.b;
                if (tLObject != null) {
                    oc7.r1(g95Var.n1.a).T3((TLRPC.Updates) tLObject, false);
                    gm.c3(new p97(g95Var, j, heVarArr, user, (byte) 11));
                    return;
                }
                gm.c3(new ut0(g95Var, heVarArr, this.c, tL_error, j, invitetogroupcall));
                return;
            default:
                oc7 oc7Var = (oc7) jm7Var;
                y31 y31Var = (y31) obj2;
                d dVar = (d) obj;
                TLRPC.TL_channels_editBanned tL_channels_editBanned = (TLRPC.TL_channels_editBanned) tLObject2;
                if (tL_error == null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    gm.d3(new r77(oc7Var, this.b, (byte) 16), 1000L);
                    if (y31Var != null) {
                        gm.c3(y31Var);
                        return;
                    }
                    return;
                }
                gm.c3(new aa7(oc7Var, tL_error, dVar, tL_channels_editBanned, this.c, (byte) 0));
                return;
        }
    }

    public g65(oc7 oc7Var, long j, y31 y31Var, d dVar, TLRPC.TL_channels_editBanned tL_channels_editBanned, boolean z) {
        this.d = oc7Var;
        this.b = j;
        this.e = y31Var;
        this.f = dVar;
        this.g = tL_channels_editBanned;
        this.c = z;
    }
}
