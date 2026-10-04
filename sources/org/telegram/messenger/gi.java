package org.telegram.messenger;

import java.util.ArrayList;
public final class gi implements Runnable {
    public final int f17978a;
    public final SecretChatHelper f17979b;
    public final ArrayList f17980c;

    public gi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f17978a = i10;
        this.f17979b = secretChatHelper;
        this.f17980c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17978a) {
            case 0:
                this.f17979b.lambda$resendMessages$14(this.f17980c);
                return;
            default:
                this.f17979b.lambda$processPendingEncMessages$0(this.f17980c);
                return;
        }
    }
}
