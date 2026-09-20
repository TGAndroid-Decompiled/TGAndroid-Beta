package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class y0 implements Runnable {
    public final int f18142a;
    public final ChatObject.Call f18143b;
    public final TLObject f18144c;

    public y0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f18142a = i10;
        this.f18143b = call;
        this.f18144c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18142a) {
            case 0:
                this.f18143b.lambda$reloadGroupCall$8(this.f18144c);
                return;
            default:
                this.f18143b.lambda$loadGroupCall$10(this.f18144c);
                return;
        }
    }
}
