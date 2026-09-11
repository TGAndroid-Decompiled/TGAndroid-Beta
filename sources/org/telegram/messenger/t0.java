package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class t0 implements Runnable {
    public final int f19024a;
    public final ChatObject.Call f19025b;

    public t0(ChatObject.Call call, int i10) {
        this.f19024a = i10;
        this.f19025b = call;
    }

    @Override
    public final void run() {
        switch (this.f19024a) {
            case 0:
                ChatObject.Call.j(this.f19025b);
                return;
            case 1:
                ChatObject.Call.a(this.f19025b);
                return;
            default:
                ChatObject.Call.c(this.f19025b);
                return;
        }
    }
}
