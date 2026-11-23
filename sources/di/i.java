package di;

import java.util.ArrayList;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c51;
import org.telegram.ui.TwoStepVerificationActivity;
public final class i implements r10 {
    public final int f8986a;
    public final t f8987b;

    public i(t tVar, int i7) {
        this.f8986a = i7;
        this.f8987b = tVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f8986a) {
            case 0:
                this.f8987b.v0(false, 0L, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj2);
                return;
            default:
                c51 c51Var = (c51) obj2;
                t.d0(this.f8987b, (ArrayList) obj);
                return;
        }
    }
}
