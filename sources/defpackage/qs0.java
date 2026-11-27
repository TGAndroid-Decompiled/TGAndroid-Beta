package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class qs0 implements icc {
    public final byte a;
    public final at0 b;

    public qs0(at0 at0Var, byte b) {
        this.a = b;
        this.b = at0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.b.o0(false, 0L, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj2);
                return;
            default:
                l9c l9cVar = (l9c) obj2;
                this.b.n0((ArrayList) obj);
                return;
        }
    }
}
