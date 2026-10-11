package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class v0 implements Runnable {
    public final int f19417a;
    public final ChatObject.Call f19418b;

    public v0(ChatObject.Call call, int i10) {
        this.f19417a = i10;
        this.f19418b = call;
    }

    @Override
    public final void run() {
        switch (this.f19417a) {
            case 0:
                ChatObject.Call.j(this.f19418b);
                return;
            case 1:
                ChatObject.Call.a(this.f19418b);
                return;
            default:
                ChatObject.Call.c(this.f19418b);
                return;
        }
    }
}
