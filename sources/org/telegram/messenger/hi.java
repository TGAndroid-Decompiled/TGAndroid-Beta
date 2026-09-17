package org.telegram.messenger;

import java.util.ArrayList;
public final class hi implements Runnable {
    public final int f16350a;
    public final SecretChatHelper f16351b;
    public final ArrayList f16352c;

    public hi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f16350a = i10;
        this.f16351b = secretChatHelper;
        this.f16352c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16350a) {
            case 0:
                this.f16351b.lambda$resendMessages$14(this.f16352c);
                return;
            default:
                this.f16351b.lambda$processPendingEncMessages$0(this.f16352c);
                return;
        }
    }
}
