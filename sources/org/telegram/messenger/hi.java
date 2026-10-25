package org.telegram.messenger;

import java.util.ArrayList;
public final class hi implements Runnable {
    public final int f20267a;
    public final SecretChatHelper f20268b;
    public final ArrayList f20269c;

    public hi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f20267a = i10;
        this.f20268b = secretChatHelper;
        this.f20269c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20267a) {
            case 0:
                this.f20268b.lambda$resendMessages$14(this.f20269c);
                return;
            default:
                this.f20268b.lambda$processPendingEncMessages$0(this.f20269c);
                return;
        }
    }
}
