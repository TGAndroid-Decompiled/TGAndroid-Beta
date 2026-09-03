package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class u0 implements Runnable {
    public final int f20148a;
    public final ChatObject.Call f20149b;

    public u0(ChatObject.Call call, int i10) {
        this.f20148a = i10;
        this.f20149b = call;
    }

    @Override
    public final void run() {
        switch (this.f20148a) {
            case 0:
                ChatObject.Call.j(this.f20149b);
                return;
            case 1:
                ChatObject.Call.a(this.f20149b);
                return;
            default:
                ChatObject.Call.c(this.f20149b);
                return;
        }
    }
}
