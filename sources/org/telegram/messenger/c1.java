package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class c1 implements Runnable {
    public final int f18066a;
    public final ChatObject.Call f18067b;
    public final TLObject f18068c;

    public c1(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f18066a = i10;
        this.f18067b = call;
        this.f18068c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18066a) {
            case 0:
                this.f18067b.lambda$reloadGroupCall$8(this.f18068c);
                return;
            default:
                this.f18067b.lambda$loadGroupCall$10(this.f18068c);
                return;
        }
    }
}
