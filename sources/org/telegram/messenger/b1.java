package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class b1 implements Runnable {
    public final int f17912a;
    public final ChatObject.Call f17913b;
    public final TLObject f17914c;

    public b1(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f17912a = i10;
        this.f17913b = call;
        this.f17914c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17912a) {
            case 0:
                this.f17913b.lambda$reloadGroupCall$8(this.f17914c);
                return;
            default:
                this.f17913b.lambda$loadGroupCall$10(this.f17914c);
                return;
        }
    }
}
