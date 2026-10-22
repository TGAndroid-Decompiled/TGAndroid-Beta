package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class c1 implements Runnable {
    public final int f17992a;
    public final ChatObject.Call f17993b;
    public final TLObject f17994c;

    public c1(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f17992a = i10;
        this.f17993b = call;
        this.f17994c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17992a) {
            case 0:
                this.f17993b.lambda$reloadGroupCall$8(this.f17994c);
                return;
            default:
                this.f17993b.lambda$loadGroupCall$10(this.f17994c);
                return;
        }
    }
}
