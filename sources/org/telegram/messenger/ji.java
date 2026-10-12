package org.telegram.messenger;

import java.util.ArrayList;
public final class ji implements Runnable {
    public final int f17609a;
    public final SecretChatHelper f17610b;
    public final ArrayList f17611c;

    public ji(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f17609a = i10;
        this.f17610b = secretChatHelper;
        this.f17611c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17609a) {
            case 0:
                this.f17610b.lambda$resendMessages$14(this.f17611c);
                return;
            default:
                this.f17610b.lambda$processPendingEncMessages$0(this.f17611c);
                return;
        }
    }
}
