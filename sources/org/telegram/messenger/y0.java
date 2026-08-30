package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class y0 implements Runnable {
    public final int f19010a;
    public final ChatObject.Call f19011b;
    public final TLObject f19012c;

    public y0(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f19010a = i10;
        this.f19011b = call;
        this.f19012c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19010a) {
            case 0:
                this.f19011b.lambda$reloadGroupCall$8(this.f19012c);
                return;
            default:
                this.f19011b.lambda$loadGroupCall$10(this.f19012c);
                return;
        }
    }
}
