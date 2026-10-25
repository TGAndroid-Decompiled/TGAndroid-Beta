package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class a1 implements Runnable {
    public final int f19581a;
    public final ChatObject.Call f19582b;

    public a1(ChatObject.Call call, int i10) {
        this.f19581a = i10;
        this.f19582b = call;
    }

    @Override
    public final void run() {
        switch (this.f19581a) {
            case 0:
                ChatObject.Call.j(this.f19582b);
                return;
            case 1:
                ChatObject.Call.a(this.f19582b);
                return;
            default:
                ChatObject.Call.c(this.f19582b);
                return;
        }
    }
}
