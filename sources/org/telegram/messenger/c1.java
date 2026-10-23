package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class c1 implements Runnable {
    public final int f18003a;
    public final ChatObject.Call f18004b;
    public final TLObject f18005c;

    public c1(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f18003a = i10;
        this.f18004b = call;
        this.f18005c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18003a) {
            case 0:
                this.f18004b.lambda$reloadGroupCall$8(this.f18005c);
                return;
            default:
                this.f18004b.lambda$loadGroupCall$10(this.f18005c);
                return;
        }
    }
}
