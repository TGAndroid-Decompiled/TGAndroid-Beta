package defpackage;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o91 implements RequestDelegate {
    public final byte a;
    public final ia1 b;
    public final he c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage e;
    public final boolean f;

    public o91(ia1 ia1Var, he heVar, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, byte b) {
        this.a = b;
        this.b = ia1Var;
        this.c = heVar;
        this.d = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.f = z;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final ia1 ia1Var = this.b;
                ia1Var.getClass();
                final he heVar = this.c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.e;
                final boolean z = this.f;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                ia1Var.i0(heVar, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error);
                                return;
                            default:
                                ia1Var.h0(heVar, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final ia1 ia1Var2 = this.b;
                final he heVar2 = this.c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.e;
                final boolean z2 = this.f;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                ia1Var2.i0(heVar2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z2, tL_error);
                                return;
                            default:
                                ia1Var2.h0(heVar2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z2, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
