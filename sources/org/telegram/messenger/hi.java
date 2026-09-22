package org.telegram.messenger;

import java.util.ArrayList;
public final class hi implements Runnable {
    public final int f16335a;
    public final SecretChatHelper f16336b;
    public final ArrayList f16337c;

    public hi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f16335a = i10;
        this.f16336b = secretChatHelper;
        this.f16337c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16335a) {
            case 0:
                this.f16336b.lambda$resendMessages$14(this.f16337c);
                return;
            default:
                this.f16336b.lambda$processPendingEncMessages$0(this.f16337c);
                return;
        }
    }
}
