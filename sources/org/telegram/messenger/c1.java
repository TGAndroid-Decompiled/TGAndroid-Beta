package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class c1 implements Runnable {
    public final int f17223a;
    public final ChatObject.Call f17224b;
    public final TLObject f17225c;

    public c1(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f17223a = i10;
        this.f17224b = call;
        this.f17225c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17223a) {
            case 0:
                this.f17224b.lambda$reloadGroupCall$8(this.f17225c);
                return;
            default:
                this.f17224b.lambda$loadGroupCall$10(this.f17225c);
                return;
        }
    }
}
