package bi;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class p8 implements Runnable {
    public final int f3954a;
    public final TLRPC.User f3955b;

    public p8(int i7, TLRPC.User user) {
        this.f3954a = i7;
        this.f3955b = user;
    }

    @Override
    public final void run() {
        int i7 = this.f3954a;
        TLRPC.User user = this.f3955b;
        switch (i7) {
            case 0:
                wg.j0.m1(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                wg.j0.m1(new ArrayList(Arrays.asList(user)));
                return;
            default:
                wg.j0.m1(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
