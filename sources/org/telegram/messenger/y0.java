package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class y0 implements Runnable {
    public final int f17906a;
    public final ChatObject.Call f17907b;
    public final TLObject f17908c;

    public y0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f17906a = i10;
        this.f17907b = call;
        this.f17908c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17906a) {
            case 0:
                this.f17907b.lambda$reloadGroupCall$8(this.f17908c);
                return;
            default:
                this.f17907b.lambda$loadGroupCall$10(this.f17908c);
                return;
        }
    }
}
