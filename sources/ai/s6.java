package ai;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class s6 implements Runnable {
    public final int f971a;
    public final TLRPC.User f972b;

    public s6(int i3, TLRPC.User user) {
        this.f971a = i3;
        this.f972b = user;
    }

    @Override
    public final void run() {
        int i3 = this.f971a;
        TLRPC.User user = this.f972b;
        switch (i3) {
            case 0:
                xg.j0.l1(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                xg.j0.l1(new ArrayList(Arrays.asList(user)));
                return;
            default:
                xg.j0.l1(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
