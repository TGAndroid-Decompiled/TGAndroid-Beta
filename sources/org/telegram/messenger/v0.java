package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class v0 implements Runnable {
    public final int f19369a;
    public final ChatObject.Call f19370b;

    public v0(ChatObject.Call call, int i10) {
        this.f19369a = i10;
        this.f19370b = call;
    }

    @Override
    public final void run() {
        switch (this.f19369a) {
            case 0:
                ChatObject.Call.j(this.f19370b);
                return;
            case 1:
                ChatObject.Call.a(this.f19370b);
                return;
            default:
                ChatObject.Call.c(this.f19370b);
                return;
        }
    }
}
