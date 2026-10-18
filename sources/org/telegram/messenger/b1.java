package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class b1 implements Runnable {
    public final int f17915a;
    public final ChatObject.Call f17916b;
    public final TLObject f17917c;

    public b1(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f17915a = i10;
        this.f17916b = call;
        this.f17917c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17915a) {
            case 0:
                this.f17916b.lambda$reloadGroupCall$8(this.f17917c);
                return;
            default:
                this.f17916b.lambda$loadGroupCall$10(this.f17917c);
                return;
        }
    }
}
