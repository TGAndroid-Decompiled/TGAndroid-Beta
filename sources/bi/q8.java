package bi;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class q8 implements Runnable {
    public final int f4016a;
    public final TLRPC.User f4017b;

    public q8(int i7, TLRPC.User user) {
        this.f4016a = i7;
        this.f4017b = user;
    }

    @Override
    public final void run() {
        int i7 = this.f4016a;
        TLRPC.User user = this.f4017b;
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
