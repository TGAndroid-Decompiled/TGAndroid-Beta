package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class t0 implements Runnable {
    public final int f19043a;
    public final ChatObject.Call f19044b;

    public t0(ChatObject.Call call, int i10) {
        this.f19043a = i10;
        this.f19044b = call;
    }

    @Override
    public final void run() {
        switch (this.f19043a) {
            case 0:
                ChatObject.Call.j(this.f19044b);
                return;
            case 1:
                ChatObject.Call.a(this.f19044b);
                return;
            default:
                ChatObject.Call.c(this.f19044b);
                return;
        }
    }
}
