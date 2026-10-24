package org.telegram.messenger;

import java.util.ArrayList;
public final class fi implements Runnable {
    public final int f18431a;
    public final SecretChatHelper f18432b;
    public final ArrayList f18433c;

    public fi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f18431a = i10;
        this.f18432b = secretChatHelper;
        this.f18433c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18431a) {
            case 0:
                this.f18432b.lambda$resendMessages$14(this.f18433c);
                return;
            default:
                this.f18432b.lambda$processPendingEncMessages$0(this.f18433c);
                return;
        }
    }
}
