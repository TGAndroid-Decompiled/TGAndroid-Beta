package bi;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Runnable {
    public final int f3650a;
    public final TLRPC.User f3651b;

    public k6(int i7, TLRPC.User user) {
        this.f3650a = i7;
        this.f3651b = user;
    }

    @Override
    public final void run() {
        int i7 = this.f3650a;
        TLRPC.User user = this.f3651b;
        switch (i7) {
            case 0:
                wg.h0.l1(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                wg.h0.l1(new ArrayList(Arrays.asList(user)));
                return;
            default:
                wg.h0.l1(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
