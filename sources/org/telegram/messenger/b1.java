package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class b1 implements Runnable {
    public final int f16523a;
    public final ChatObject.Call f16524b;
    public final TLObject f16525c;

    public b1(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f16523a = i10;
        this.f16524b = call;
        this.f16525c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16523a) {
            case 0:
                this.f16524b.lambda$reloadGroupCall$8(this.f16525c);
                return;
            default:
                this.f16524b.lambda$loadGroupCall$10(this.f16525c);
                return;
        }
    }
}
