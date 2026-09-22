package org.telegram.messenger;

import java.util.ArrayList;
public final class hi implements Runnable {
    public final int f16581a;
    public final SecretChatHelper f16582b;
    public final ArrayList f16583c;

    public hi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f16581a = i10;
        this.f16582b = secretChatHelper;
        this.f16583c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16581a) {
            case 0:
                this.f16582b.lambda$resendMessages$14(this.f16583c);
                return;
            default:
                this.f16582b.lambda$processPendingEncMessages$0(this.f16583c);
                return;
        }
    }
}
