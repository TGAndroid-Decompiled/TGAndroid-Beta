package org.telegram.messenger;

import java.util.ArrayList;
public final class pi implements Runnable {
    public final int f16067a;
    public final SecretChatHelper f16068b;
    public final ArrayList f16069c;

    public pi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f16067a = i10;
        this.f16068b = secretChatHelper;
        this.f16069c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16067a) {
            case 0:
                this.f16068b.lambda$resendMessages$14(this.f16069c);
                return;
            default:
                this.f16068b.lambda$processPendingEncMessages$0(this.f16069c);
                return;
        }
    }
}
