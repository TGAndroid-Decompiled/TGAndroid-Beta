package di;

import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.TwoStepVerificationActivity;
public final class i implements p10 {
    public final int f8984a;
    public final t f8985b;

    public i(t tVar, int i7) {
        this.f8984a = i7;
        this.f8985b = tVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f8984a) {
            case 0:
                this.f8985b.v0(false, 0L, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj2);
                return;
            default:
                b51 b51Var = (b51) obj2;
                t.d0(this.f8985b, (ArrayList) obj);
                return;
        }
    }
}
