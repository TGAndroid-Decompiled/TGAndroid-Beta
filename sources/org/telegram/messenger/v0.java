package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class v0 implements Runnable {
    public final int f17717a;
    public final ChatObject.Call f17718b;

    public v0(ChatObject.Call call, int i10) {
        this.f17717a = i10;
        this.f17718b = call;
    }

    @Override
    public final void run() {
        switch (this.f17717a) {
            case 0:
                ChatObject.Call.j(this.f17718b);
                return;
            case 1:
                ChatObject.Call.a(this.f17718b);
                return;
            default:
                ChatObject.Call.c(this.f17718b);
                return;
        }
    }
}
