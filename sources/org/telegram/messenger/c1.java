package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class c1 implements Runnable {
    public final int f17224a;
    public final ChatObject.Call f17225b;
    public final TLObject f17226c;

    public c1(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f17224a = i10;
        this.f17225b = call;
        this.f17226c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17224a) {
            case 0:
                this.f17225b.lambda$reloadGroupCall$8(this.f17226c);
                return;
            default:
                this.f17225b.lambda$loadGroupCall$10(this.f17226c);
                return;
        }
    }
}
