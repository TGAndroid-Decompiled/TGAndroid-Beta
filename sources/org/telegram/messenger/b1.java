package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class b1 implements Runnable {
    public final int f17910a;
    public final ChatObject.Call f17911b;
    public final TLObject f17912c;

    public b1(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f17910a = i10;
        this.f17911b = call;
        this.f17912c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17910a) {
            case 0:
                this.f17911b.lambda$reloadGroupCall$8(this.f17912c);
                return;
            default:
                this.f17911b.lambda$loadGroupCall$10(this.f17912c);
                return;
        }
    }
}
