package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
public final class c1 implements Runnable {
    public final int f18056a;
    public final ChatObject.Call f18057b;
    public final TLObject f18058c;

    public c1(ChatObject.Call call, TLObject tLObject, int i10) {
        this.f18056a = i10;
        this.f18057b = call;
        this.f18058c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18056a) {
            case 0:
                this.f18057b.lambda$reloadGroupCall$8(this.f18058c);
                return;
            default:
                this.f18057b.lambda$loadGroupCall$10(this.f18058c);
                return;
        }
    }
}
