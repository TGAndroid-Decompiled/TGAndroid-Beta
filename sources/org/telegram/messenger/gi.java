package org.telegram.messenger;

import java.util.ArrayList;
public final class gi implements Runnable {
    public final int f17979a;
    public final SecretChatHelper f17980b;
    public final ArrayList f17981c;

    public gi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f17979a = i10;
        this.f17980b = secretChatHelper;
        this.f17981c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17979a) {
            case 0:
                this.f17980b.lambda$resendMessages$14(this.f17981c);
                return;
            default:
                this.f17980b.lambda$processPendingEncMessages$0(this.f17981c);
                return;
        }
    }
}
