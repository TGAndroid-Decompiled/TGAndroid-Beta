package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class y0 implements Runnable {
    public final int f18157a;
    public final ChatObject.Call f18158b;
    public final TLObject f18159c;

    public y0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f18157a = i10;
        this.f18158b = call;
        this.f18159c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18157a) {
            case 0:
                this.f18158b.lambda$reloadGroupCall$8(this.f18159c);
                return;
            default:
                this.f18158b.lambda$loadGroupCall$10(this.f18159c);
                return;
        }
    }
}
