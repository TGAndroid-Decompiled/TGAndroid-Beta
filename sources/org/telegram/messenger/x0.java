package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

public final class x0 implements Runnable {

    public final int f22090a;

    public final ChatObject.Call f22091b;

    public final TLObject f22092c;

    public x0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f22090a = i10;
        this.f22091b = call;
        this.f22092c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f22090a) {
            case 0:
                this.f22091b.lambda$reloadGroupCall$8(this.f22092c);
                break;
            default:
                this.f22091b.lambda$loadGroupCall$10(this.f22092c);
                break;
        }
    }
}
