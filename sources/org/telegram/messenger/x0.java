package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class x0 implements Runnable {
    public final int f17817a;
    public final ChatObject.Call f17818b;
    public final TLObject f17819c;

    public x0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f17817a = i10;
        this.f17818b = call;
        this.f17819c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17817a) {
            case 0:
                this.f17818b.lambda$reloadGroupCall$8(this.f17819c);
                return;
            default:
                this.f17818b.lambda$loadGroupCall$10(this.f17819c);
                return;
        }
    }
}
