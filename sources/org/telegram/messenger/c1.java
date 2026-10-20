package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class c1 implements Runnable {
    public final int f18005a;
    public final ChatObject.Call f18006b;
    public final TLObject f18007c;

    public c1(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f18005a = i10;
        this.f18006b = call;
        this.f18007c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18005a) {
            case 0:
                this.f18006b.lambda$reloadGroupCall$8(this.f18007c);
                return;
            default:
                this.f18006b.lambda$loadGroupCall$10(this.f18007c);
                return;
        }
    }
}
