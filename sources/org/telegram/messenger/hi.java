package org.telegram.messenger;

import java.util.ArrayList;
public final class hi implements Runnable {
    public final int f18070a;
    public final SecretChatHelper f18071b;
    public final ArrayList f18072c;

    public hi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f18070a = i10;
        this.f18071b = secretChatHelper;
        this.f18072c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18070a) {
            case 0:
                this.f18071b.lambda$resendMessages$14(this.f18072c);
                return;
            default:
                this.f18071b.lambda$processPendingEncMessages$0(this.f18072c);
                return;
        }
    }
}
