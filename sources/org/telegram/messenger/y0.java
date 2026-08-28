package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class y0 implements Runnable {
    public final int f22186a;
    public final ChatObject.Call f22187b;
    public final TLObject f22188c;

    public y0(ChatObject.Call call, TLObject tLObject, int i9) {
        this.f22186a = i9;
        this.f22187b = call;
        this.f22188c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f22186a) {
            case 0:
                this.f22187b.lambda$reloadGroupCall$8(this.f22188c);
                return;
            default:
                this.f22187b.lambda$loadGroupCall$10(this.f22188c);
                return;
        }
    }
}
