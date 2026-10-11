package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class v0 implements Runnable {
    public final int f19381a;
    public final ChatObject.Call f19382b;

    public v0(ChatObject.Call call, int i10) {
        this.f19381a = i10;
        this.f19382b = call;
    }

    @Override
    public final void run() {
        switch (this.f19381a) {
            case 0:
                ChatObject.Call.j(this.f19382b);
                return;
            case 1:
                ChatObject.Call.a(this.f19382b);
                return;
            default:
                ChatObject.Call.c(this.f19382b);
                return;
        }
    }
}
