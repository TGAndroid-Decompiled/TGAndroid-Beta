package gh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

public final class d6 implements Runnable {

    public final int f7208a;

    public final TLRPC.User f7209b;

    public d6(int i10, TLRPC.User user) {
        this.f7208a = i10;
        this.f7209b = user;
    }

    @Override
    public final void run() {
        int i10 = this.f7208a;
        TLRPC.User user = this.f7209b;
        switch (i10) {
            case 0:
                cg.o1.c0(new ArrayList(Arrays.asList(user)));
                break;
            case 1:
                cg.o1.c0(new ArrayList(Arrays.asList(user)));
                break;
            default:
                cg.o1.c0(new ArrayList(Arrays.asList(user)));
                break;
        }
    }
}
