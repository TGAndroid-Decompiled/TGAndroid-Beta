package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class v0 implements Runnable {
    public final int f19371a;
    public final ChatObject.Call f19372b;

    public v0(ChatObject.Call call, int i10) {
        this.f19371a = i10;
        this.f19372b = call;
    }

    @Override
    public final void run() {
        switch (this.f19371a) {
            case 0:
                ChatObject.Call.j(this.f19372b);
                return;
            case 1:
                ChatObject.Call.a(this.f19372b);
                return;
            default:
                ChatObject.Call.c(this.f19372b);
                return;
        }
    }
}
