package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class y0 implements Runnable {
    public final int f18994a;
    public final ChatObject.Call f18995b;
    public final TLObject f18996c;

    public y0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f18994a = i10;
        this.f18995b = call;
        this.f18996c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18994a) {
            case 0:
                this.f18995b.lambda$reloadGroupCall$8(this.f18996c);
                return;
            default:
                this.f18995b.lambda$loadGroupCall$10(this.f18996c);
                return;
        }
    }
}
