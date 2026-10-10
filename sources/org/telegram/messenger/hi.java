package org.telegram.messenger;

import java.util.ArrayList;
public final class hi implements Runnable {
    public final int f18076a;
    public final SecretChatHelper f18077b;
    public final ArrayList f18078c;

    public hi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f18076a = i10;
        this.f18077b = secretChatHelper;
        this.f18078c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18076a) {
            case 0:
                this.f18077b.lambda$resendMessages$14(this.f18078c);
                return;
            default:
                this.f18077b.lambda$processPendingEncMessages$0(this.f18078c);
                return;
        }
    }
}
