package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class x0 implements Runnable {
    public final int f20035a;
    public final ChatObject.Call f20036b;

    public x0(ChatObject.Call call, int i10) {
        this.f20035a = i10;
        this.f20036b = call;
    }

    @Override
    public final void run() {
        switch (this.f20035a) {
            case 0:
                ChatObject.Call.j(this.f20036b);
                return;
            case 1:
                ChatObject.Call.a(this.f20036b);
                return;
            default:
                ChatObject.Call.c(this.f20036b);
                return;
        }
    }
}
