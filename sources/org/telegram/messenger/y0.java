package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class y0 implements Runnable {
    public final int f20114a;
    public final ChatObject.Call f20115b;

    public y0(ChatObject.Call call, int i10) {
        this.f20114a = i10;
        this.f20115b = call;
    }

    @Override
    public final void run() {
        switch (this.f20114a) {
            case 0:
                ChatObject.Call.j(this.f20115b);
                return;
            case 1:
                ChatObject.Call.a(this.f20115b);
                return;
            default:
                ChatObject.Call.c(this.f20115b);
                return;
        }
    }
}
