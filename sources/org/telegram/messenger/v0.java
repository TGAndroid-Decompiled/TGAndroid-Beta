package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class v0 implements Runnable {
    public final int f19379a;
    public final ChatObject.Call f19380b;

    public v0(ChatObject.Call call, int i10) {
        this.f19379a = i10;
        this.f19380b = call;
    }

    @Override
    public final void run() {
        switch (this.f19379a) {
            case 0:
                ChatObject.Call.j(this.f19380b);
                return;
            case 1:
                ChatObject.Call.a(this.f19380b);
                return;
            default:
                ChatObject.Call.c(this.f19380b);
                return;
        }
    }
}
