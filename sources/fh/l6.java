package fh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class l6 implements Runnable {
    public final int f6607a;
    public final TLRPC.User f6608b;

    public l6(int i9, TLRPC.User user) {
        this.f6607a = i9;
        this.f6608b = user;
    }

    @Override
    public final void run() {
        int i9 = this.f6607a;
        TLRPC.User user = this.f6608b;
        switch (i9) {
            case 0:
                bg.t1.b0(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                bg.t1.b0(new ArrayList(Arrays.asList(user)));
                return;
            default:
                bg.t1.b0(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
