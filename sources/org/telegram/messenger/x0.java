package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class x0 implements Runnable {
    public final int f17826a;
    public final ChatObject.Call f17827b;
    public final TLObject f17828c;

    public x0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f17826a = i10;
        this.f17827b = call;
        this.f17828c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17826a) {
            case 0:
                this.f17827b.lambda$reloadGroupCall$8(this.f17828c);
                return;
            default:
                this.f17827b.lambda$loadGroupCall$10(this.f17828c);
                return;
        }
    }
}
