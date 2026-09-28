package org.telegram.messenger;

import java.util.ArrayList;
public final class gi implements Runnable {
    public final int f16489a;
    public final SecretChatHelper f16490b;
    public final ArrayList f16491c;

    public gi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f16489a = i10;
        this.f16490b = secretChatHelper;
        this.f16491c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16489a) {
            case 0:
                this.f16490b.lambda$resendMessages$14(this.f16491c);
                return;
            default:
                this.f16490b.lambda$processPendingEncMessages$0(this.f16491c);
                return;
        }
    }
}
