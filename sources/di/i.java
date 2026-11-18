package di;

import java.util.ArrayList;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z41;
import org.telegram.ui.TwoStepVerificationActivity;
public final class i implements q10 {
    public final int f8995a;
    public final t f8996b;

    public i(t tVar, int i7) {
        this.f8995a = i7;
        this.f8996b = tVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f8995a) {
            case 0:
                this.f8996b.v0(false, 0L, (TLRPC.InputCheckPasswordSRP) obj, (TwoStepVerificationActivity) obj2);
                return;
            default:
                z41 z41Var = (z41) obj2;
                t.d0(this.f8996b, (ArrayList) obj);
                return;
        }
    }
}
