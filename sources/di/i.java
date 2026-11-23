package di;

import java.util.ArrayList;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c51;
import org.telegram.ui.TwoStepVerificationActivity;
public final class i implements r10 {
    public final int f9023a;
    public final t f9024b;

    public i(t tVar, int i7) {
        this.f9023a = i7;
        this.f9024b = tVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f9023a) {
            case 0:
                this.f9024b.v0(false, 0L, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj2);
                return;
            default:
                c51 c51Var = (c51) obj2;
                t.d0(this.f9024b, (ArrayList) obj);
                return;
        }
    }
}
