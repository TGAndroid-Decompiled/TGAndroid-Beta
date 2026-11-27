package defpackage;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m81 implements RequestDelegate {
    public final byte a;
    public final i91 b;
    public final id c;
    public final HashSet d;
    public final TLRPC.TL_inputGroupCallInviteMessage e;
    public final boolean f;

    public m81(i91 i91Var, id idVar, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, byte b) {
        this.a = b;
        this.b = i91Var;
        this.c = idVar;
        this.d = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.f = z;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final i91 i91Var = this.b;
                i91Var.getClass();
                final id idVar = this.c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.e;
                final boolean z = this.f;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                i91Var.h0(idVar, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error);
                                return;
                            default:
                                i91Var.g0(idVar, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final i91 i91Var2 = this.b;
                final id idVar2 = this.c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.e;
                final boolean z2 = this.f;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r8) {
                            case 0:
                                i91Var2.h0(idVar2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z2, tL_error);
                                return;
                            default:
                                i91Var2.g0(idVar2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z2, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
