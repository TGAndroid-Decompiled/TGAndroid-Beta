package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class y0 implements Runnable {
    public final int f20175a;
    public final ChatObject.Call f20176b;

    public y0(ChatObject.Call call, int i10) {
        this.f20175a = i10;
        this.f20176b = call;
    }

    @Override
    public final void run() {
        switch (this.f20175a) {
            case 0:
                ChatObject.Call.j(this.f20176b);
                return;
            case 1:
                ChatObject.Call.a(this.f20176b);
                return;
            default:
                ChatObject.Call.c(this.f20176b);
                return;
        }
    }
}
