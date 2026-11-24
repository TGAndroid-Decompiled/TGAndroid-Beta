package defpackage;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f81 implements RequestDelegate {
    public final byte a;
    public final z81 b;
    public final hd c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage e;
    public final boolean f;

    public f81(z81 z81Var, hd hdVar, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, byte b) {
        this.a = b;
        this.b = z81Var;
        this.c = hdVar;
        this.d = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.f = z;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final z81 z81Var = this.b;
                z81Var.getClass();
                final hd hdVar = this.c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.e;
                final boolean z = this.f;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                z81Var.h0(hdVar, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error);
                                return;
                            default:
                                z81Var.g0(hdVar, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final z81 z81Var2 = this.b;
                final hd hdVar2 = this.c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.e;
                final boolean z2 = this.f;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                z81Var2.h0(hdVar2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z2, tL_error);
                                return;
                            default:
                                z81Var2.g0(hdVar2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z2, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
