package org.telegram.messenger;

import java.util.List;
public final class bk implements Runnable {
    public final int f14811a;
    public final SendMessagesHelper f14812b;
    public final String f14813c;
    public final List d;

    public bk(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.f14811a = i10;
        this.f14812b = sendMessagesHelper;
        this.f14813c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f14811a) {
            case 0:
                SendMessagesHelper.M0(this.f14812b, this.f14813c, this.d);
                return;
            default:
                SendMessagesHelper.D1(this.f14812b, this.f14813c, this.d);
                return;
        }
    }
}
