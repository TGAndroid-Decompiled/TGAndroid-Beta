package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class x0 implements Runnable {
    public final int f19575a;
    public final ChatObject.Call f19576b;
    public final TLObject f19577c;

    public x0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f19575a = i10;
        this.f19576b = call;
        this.f19577c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19575a) {
            case 0:
                this.f19576b.lambda$reloadGroupCall$8(this.f19577c);
                return;
            default:
                this.f19576b.lambda$loadGroupCall$10(this.f19577c);
                return;
        }
    }
}
