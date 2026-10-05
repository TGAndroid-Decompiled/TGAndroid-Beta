package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class v0 implements Runnable {
    public final int f19376a;
    public final ChatObject.Call f19377b;

    public v0(ChatObject.Call call, int i10) {
        this.f19376a = i10;
        this.f19377b = call;
    }

    @Override
    public final void run() {
        switch (this.f19376a) {
            case 0:
                ChatObject.Call.j(this.f19377b);
                return;
            case 1:
                ChatObject.Call.a(this.f19377b);
                return;
            default:
                ChatObject.Call.c(this.f19377b);
                return;
        }
    }
}
