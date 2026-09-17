package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class x0 implements Runnable {
    public final int f19602a;
    public final ChatObject.Call f19603b;
    public final TLObject f19604c;

    public x0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f19602a = i10;
        this.f19603b = call;
        this.f19604c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19602a) {
            case 0:
                this.f19603b.lambda$reloadGroupCall$8(this.f19604c);
                return;
            default:
                this.f19603b.lambda$loadGroupCall$10(this.f19604c);
                return;
        }
    }
}
