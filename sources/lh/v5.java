package lh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class v5 implements Runnable {
    public final int f13054a;
    public final TLRPC.User f13055b;

    public v5(int i10, TLRPC.User user) {
        this.f13054a = i10;
        this.f13055b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f13054a;
        TLRPC.User user = this.f13055b;
        switch (i10) {
            case 0:
                hg.m1.c0(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                hg.m1.c0(new ArrayList(Arrays.asList(user)));
                return;
            default:
                hg.m1.c0(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
