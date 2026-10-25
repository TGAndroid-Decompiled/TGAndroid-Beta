package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class e1 implements Runnable {
    public final int f19948a;
    public final ChatObject.Call f19949b;
    public final TLObject f19950c;

    public e1(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f19948a = i10;
        this.f19949b = call;
        this.f19950c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19948a) {
            case 0:
                this.f19949b.lambda$reloadGroupCall$8(this.f19950c);
                return;
            default:
                this.f19949b.lambda$loadGroupCall$10(this.f19950c);
                return;
        }
    }
}
