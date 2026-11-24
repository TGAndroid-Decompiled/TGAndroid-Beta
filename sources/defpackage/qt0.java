package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class qt0 implements jac {
    public final byte a;
    public final au0 b;

    public qt0(au0 au0Var, byte b) {
        this.a = b;
        this.b = au0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.b.p0(false, 0L, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj2);
                return;
            default:
                l7c l7cVar = (l7c) obj2;
                this.b.o0((ArrayList) obj);
                return;
        }
    }
}
