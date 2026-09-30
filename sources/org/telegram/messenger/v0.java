package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class v0 implements Runnable {
    public final int f17734a;
    public final ChatObject.Call f17735b;

    public v0(ChatObject.Call call, int i10) {
        this.f17734a = i10;
        this.f17735b = call;
    }

    @Override
    public final void run() {
        switch (this.f17734a) {
            case 0:
                ChatObject.Call.j(this.f17735b);
                return;
            case 1:
                ChatObject.Call.a(this.f17735b);
                return;
            default:
                ChatObject.Call.c(this.f17735b);
                return;
        }
    }
}
