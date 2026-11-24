package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class is0 implements i8c {
    public final byte a;
    public final ss0 b;

    public is0(ss0 ss0Var, byte b) {
        this.a = b;
        this.b = ss0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.b.o0(false, 0L, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj2);
                return;
            default:
                l5c l5cVar = (l5c) obj2;
                this.b.n0((ArrayList) obj);
                return;
        }
    }
}
