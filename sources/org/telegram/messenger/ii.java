package org.telegram.messenger;

import java.util.ArrayList;
public final class ii implements Runnable {
    public final int f17199a;
    public final SecretChatHelper f17200b;
    public final ArrayList f17201c;

    public ii(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f17199a = i10;
        this.f17200b = secretChatHelper;
        this.f17201c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17199a) {
            case 0:
                this.f17200b.lambda$resendMessages$14(this.f17201c);
                return;
            default:
                this.f17200b.lambda$processPendingEncMessages$0(this.f17201c);
                return;
        }
    }
}
