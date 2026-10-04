package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class v0 implements Runnable {
    public final int f19370a;
    public final ChatObject.Call f19371b;

    public v0(ChatObject.Call call, int i10) {
        this.f19370a = i10;
        this.f19371b = call;
    }

    @Override
    public final void run() {
        switch (this.f19370a) {
            case 0:
                ChatObject.Call.j(this.f19371b);
                return;
            case 1:
                ChatObject.Call.a(this.f19371b);
                return;
            default:
                ChatObject.Call.c(this.f19371b);
                return;
        }
    }
}
