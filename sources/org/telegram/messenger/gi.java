package org.telegram.messenger;

import java.util.ArrayList;
public final class gi implements Runnable {
    public final int f17837a;
    public final SecretChatHelper f17838b;
    public final ArrayList f17839c;

    public gi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f17837a = i10;
        this.f17838b = secretChatHelper;
        this.f17839c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17837a) {
            case 0:
                this.f17838b.lambda$resendMessages$14(this.f17839c);
                return;
            default:
                this.f17838b.lambda$processPendingEncMessages$0(this.f17839c);
                return;
        }
    }
}
