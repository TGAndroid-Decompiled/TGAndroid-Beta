package kh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class v5 implements Runnable {
    public final int f10898a;
    public final TLRPC.User f10899b;

    public v5(int i10, TLRPC.User user) {
        this.f10898a = i10;
        this.f10899b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f10898a;
        TLRPC.User user = this.f10899b;
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
