package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class v0 implements Runnable {
    public final int f19383a;
    public final ChatObject.Call f19384b;

    public v0(ChatObject.Call call, int i10) {
        this.f19383a = i10;
        this.f19384b = call;
    }

    @Override
    public final void run() {
        switch (this.f19383a) {
            case 0:
                ChatObject.Call.j(this.f19384b);
                return;
            case 1:
                ChatObject.Call.a(this.f19384b);
                return;
            default:
                ChatObject.Call.c(this.f19384b);
                return;
        }
    }
}
