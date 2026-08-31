package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class y0 implements Runnable {
    public final int f20664a;
    public final ChatObject.Call f20665b;
    public final TLObject f20666c;

    public y0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f20664a = i10;
        this.f20665b = call;
        this.f20666c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f20664a) {
            case 0:
                this.f20665b.lambda$reloadGroupCall$8(this.f20666c);
                return;
            default:
                this.f20665b.lambda$loadGroupCall$10(this.f20666c);
                return;
        }
    }
}
