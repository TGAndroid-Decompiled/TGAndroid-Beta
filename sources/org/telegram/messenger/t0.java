package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class t0 implements Runnable {
    public final int f19051a;
    public final ChatObject.Call f19052b;

    public t0(ChatObject.Call call, int i10) {
        this.f19051a = i10;
        this.f19052b = call;
    }

    @Override
    public final void run() {
        switch (this.f19051a) {
            case 0:
                ChatObject.Call.j(this.f19052b);
                return;
            case 1:
                ChatObject.Call.a(this.f19052b);
                return;
            default:
                ChatObject.Call.c(this.f19052b);
                return;
        }
    }
}
