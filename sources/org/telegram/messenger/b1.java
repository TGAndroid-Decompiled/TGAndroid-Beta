package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class b1 implements Runnable {
    public final int f17899a;
    public final ChatObject.Call f17900b;
    public final TLObject f17901c;

    public b1(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f17899a = i10;
        this.f17900b = call;
        this.f17901c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17899a) {
            case 0:
                this.f17900b.lambda$reloadGroupCall$8(this.f17901c);
                return;
            default:
                this.f17900b.lambda$loadGroupCall$10(this.f17901c);
                return;
        }
    }
}
