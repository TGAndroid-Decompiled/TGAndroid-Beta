package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class v0 implements Runnable {
    public final int f16549a;
    public final ChatObject.Call f16550b;

    public v0(ChatObject.Call call, int i10) {
        this.f16549a = i10;
        this.f16550b = call;
    }

    @Override
    public final void run() {
        switch (this.f16549a) {
            case 0:
                ChatObject.Call.j(this.f16550b);
                return;
            case 1:
                ChatObject.Call.a(this.f16550b);
                return;
            default:
                ChatObject.Call.c(this.f16550b);
                return;
        }
    }
}
