package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
public final class v0 implements Runnable {
    public final int f17723a;
    public final ChatObject.Call f17724b;

    public v0(ChatObject.Call call, int i10) {
        this.f17723a = i10;
        this.f17724b = call;
    }

    @Override
    public final void run() {
        switch (this.f17723a) {
            case 0:
                ChatObject.Call.j(this.f17724b);
                return;
            case 1:
                ChatObject.Call.a(this.f17724b);
                return;
            default:
                ChatObject.Call.c(this.f17724b);
                return;
        }
    }
}
