package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class t0 implements Runnable {
    public final int f17344a;
    public final ChatObject.Call f17345b;

    public t0(ChatObject.Call call, int i10) {
        this.f17344a = i10;
        this.f17345b = call;
    }

    @Override
    public final void run() {
        switch (this.f17344a) {
            case 0:
                ChatObject.Call.j(this.f17345b);
                return;
            case 1:
                ChatObject.Call.a(this.f17345b);
                return;
            default:
                ChatObject.Call.c(this.f17345b);
                return;
        }
    }
}
