package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class x0 implements Runnable {
    public final int f19565a;
    public final ChatObject.Call f19566b;
    public final TLObject f19567c;

    public x0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f19565a = i10;
        this.f19566b = call;
        this.f19567c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19565a) {
            case 0:
                this.f19566b.lambda$reloadGroupCall$8(this.f19567c);
                return;
            default:
                this.f19566b.lambda$loadGroupCall$10(this.f19567c);
                return;
        }
    }
}
