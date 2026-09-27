package org.telegram.messenger;

import java.util.ArrayList;
public final class gi implements Runnable {
    public final int f16478a;
    public final SecretChatHelper f16479b;
    public final ArrayList f16480c;

    public gi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f16478a = i10;
        this.f16479b = secretChatHelper;
        this.f16480c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16478a) {
            case 0:
                this.f16479b.lambda$resendMessages$14(this.f16480c);
                return;
            default:
                this.f16479b.lambda$processPendingEncMessages$0(this.f16480c);
                return;
        }
    }
}
