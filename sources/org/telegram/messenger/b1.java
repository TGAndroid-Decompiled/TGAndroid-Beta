package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class b1 implements Runnable {
    public final int f16823a;
    public final ChatObject.Call f16824b;
    public final TLObject f16825c;

    public b1(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f16823a = i10;
        this.f16824b = call;
        this.f16825c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16823a) {
            case 0:
                this.f16824b.lambda$reloadGroupCall$8(this.f16825c);
                return;
            default:
                this.f16824b.lambda$loadGroupCall$10(this.f16825c);
                return;
        }
    }
}
