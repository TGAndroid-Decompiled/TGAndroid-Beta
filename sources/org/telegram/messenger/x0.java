package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class x0 implements Runnable {
    public final int f17816a;
    public final ChatObject.Call f17817b;
    public final TLObject f17818c;

    public x0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f17816a = i10;
        this.f17817b = call;
        this.f17818c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17816a) {
            case 0:
                this.f17817b.lambda$reloadGroupCall$8(this.f17818c);
                return;
            default:
                this.f17817b.lambda$loadGroupCall$10(this.f17818c);
                return;
        }
    }
}
