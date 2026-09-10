package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class a1 implements Runnable {
    public final int f14676a;
    public final ChatObject.Call f14677b;
    public final TLObject f14678c;

    public a1(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f14676a = i10;
        this.f14677b = call;
        this.f14678c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f14676a) {
            case 0:
                this.f14677b.lambda$reloadGroupCall$8(this.f14678c);
                return;
            default:
                this.f14677b.lambda$loadGroupCall$10(this.f14678c);
                return;
        }
    }
}
