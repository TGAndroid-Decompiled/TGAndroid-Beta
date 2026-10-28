package org.telegram.messenger;

import java.util.ArrayList;
public final class ii implements Runnable {
    public final int f20362a;
    public final SecretChatHelper f20363b;
    public final ArrayList f20364c;

    public ii(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f20362a = i10;
        this.f20363b = secretChatHelper;
        this.f20364c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20362a) {
            case 0:
                this.f20363b.lambda$resendMessages$14(this.f20364c);
                return;
            default:
                this.f20363b.lambda$processPendingEncMessages$0(this.f20364c);
                return;
        }
    }
}
