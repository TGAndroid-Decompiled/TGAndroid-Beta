package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class x0 implements Runnable {
    public final int f19538a;
    public final ChatObject.Call f19539b;
    public final TLObject f19540c;

    public x0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f19538a = i10;
        this.f19539b = call;
        this.f19540c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19538a) {
            case 0:
                this.f19539b.lambda$reloadGroupCall$8(this.f19540c);
                return;
            default:
                this.f19539b.lambda$loadGroupCall$10(this.f19540c);
                return;
        }
    }
}
