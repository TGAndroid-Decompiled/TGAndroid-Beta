package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class y0 implements Runnable {
    public final int f20666a;
    public final ChatObject.Call f20667b;
    public final TLObject f20668c;

    public y0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f20666a = i10;
        this.f20667b = call;
        this.f20668c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f20666a) {
            case 0:
                this.f20667b.lambda$reloadGroupCall$8(this.f20668c);
                return;
            default:
                this.f20667b.lambda$loadGroupCall$10(this.f20668c);
                return;
        }
    }
}
