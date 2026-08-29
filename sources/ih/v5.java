package ih;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class v5 implements Runnable {
    public final int f9461a;
    public final TLRPC.User f9462b;

    public v5(int i10, TLRPC.User user) {
        this.f9461a = i10;
        this.f9462b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f9461a;
        TLRPC.User user = this.f9462b;
        switch (i10) {
            case 0:
                eg.n1.c0(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                eg.n1.c0(new ArrayList(Arrays.asList(user)));
                return;
            default:
                eg.n1.c0(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
