package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class b1 implements Runnable {
    public final int f17907a;
    public final ChatObject.Call f17908b;
    public final TLObject f17909c;

    public b1(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f17907a = i10;
        this.f17908b = call;
        this.f17909c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17907a) {
            case 0:
                this.f17908b.lambda$reloadGroupCall$8(this.f17909c);
                return;
            default:
                this.f17908b.lambda$loadGroupCall$10(this.f17909c);
                return;
        }
    }
}
