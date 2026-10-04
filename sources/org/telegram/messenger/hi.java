package org.telegram.messenger;

import java.util.ArrayList;
public final class hi implements Runnable {
    public final int f18065a;
    public final SecretChatHelper f18066b;
    public final ArrayList f18067c;

    public hi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f18065a = i10;
        this.f18066b = secretChatHelper;
        this.f18067c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18065a) {
            case 0:
                this.f18066b.lambda$resendMessages$14(this.f18067c);
                return;
            default:
                this.f18066b.lambda$processPendingEncMessages$0(this.f18067c);
                return;
        }
    }
}
