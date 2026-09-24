package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class v0 implements Runnable {
    public final int f17708a;
    public final ChatObject.Call f17709b;

    public v0(ChatObject.Call call, int i10) {
        this.f17708a = i10;
        this.f17709b = call;
    }

    @Override
    public final void run() {
        switch (this.f17708a) {
            case 0:
                ChatObject.Call.j(this.f17709b);
                return;
            case 1:
                ChatObject.Call.a(this.f17709b);
                return;
            default:
                ChatObject.Call.c(this.f17709b);
                return;
        }
    }
}
