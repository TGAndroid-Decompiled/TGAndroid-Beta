package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class x0 implements Runnable {
    public final int f22134a;
    public final ChatObject.Call f22135b;
    public final TLObject f22136c;

    public x0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f22134a = i10;
        this.f22135b = call;
        this.f22136c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f22134a) {
            case 0:
                this.f22135b.lambda$reloadGroupCall$8(this.f22136c);
                return;
            default:
                this.f22135b.lambda$loadGroupCall$10(this.f22136c);
                return;
        }
    }
}
