package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class y0 implements Runnable {
    public final int f18094a;
    public final ChatObject.Call f18095b;
    public final TLObject f18096c;

    public y0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f18094a = i10;
        this.f18095b = call;
        this.f18096c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18094a) {
            case 0:
                this.f18095b.lambda$reloadGroupCall$8(this.f18096c);
                return;
            default:
                this.f18095b.lambda$loadGroupCall$10(this.f18096c);
                return;
        }
    }
}
