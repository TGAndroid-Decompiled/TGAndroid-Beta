package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class t0 implements Runnable {
    public final int f19016a;
    public final ChatObject.Call f19017b;

    public t0(ChatObject.Call call, int i10) {
        this.f19016a = i10;
        this.f19017b = call;
    }

    @Override
    public final void run() {
        switch (this.f19016a) {
            case 0:
                ChatObject.Call.j(this.f19017b);
                return;
            case 1:
                ChatObject.Call.a(this.f19017b);
                return;
            default:
                ChatObject.Call.c(this.f19017b);
                return;
        }
    }
}
