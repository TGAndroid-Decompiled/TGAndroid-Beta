package kh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class u5 implements Runnable {
    public final int f10977a;
    public final TLRPC.User f10978b;

    public u5(int i10, TLRPC.User user) {
        this.f10977a = i10;
        this.f10978b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f10977a;
        TLRPC.User user = this.f10978b;
        switch (i10) {
            case 0:
                gg.m1.c0(new ArrayList(Arrays.asList(user)));
                return;
            case 1:
                gg.m1.c0(new ArrayList(Arrays.asList(user)));
                return;
            default:
                gg.m1.c0(new ArrayList(Arrays.asList(user)));
                return;
        }
    }
}
