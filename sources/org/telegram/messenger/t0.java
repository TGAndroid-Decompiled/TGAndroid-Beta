package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class t0 implements Runnable {
    public final int f21597a;
    public final ChatObject.Call f21598b;

    public t0(ChatObject.Call call, int i10) {
        this.f21597a = i10;
        this.f21598b = call;
    }

    @Override
    public final void run() {
        switch (this.f21597a) {
            case 0:
                ChatObject.Call.j(this.f21598b);
                return;
            case 1:
                ChatObject.Call.a(this.f21598b);
                return;
            default:
                ChatObject.Call.c(this.f21598b);
                return;
        }
    }
}
