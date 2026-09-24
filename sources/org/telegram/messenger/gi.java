package org.telegram.messenger;

import java.util.ArrayList;
public final class gi implements Runnable {
    public final int f16467a;
    public final SecretChatHelper f16468b;
    public final ArrayList f16469c;

    public gi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f16467a = i10;
        this.f16468b = secretChatHelper;
        this.f16469c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16467a) {
            case 0:
                this.f16468b.lambda$resendMessages$14(this.f16469c);
                return;
            default:
                this.f16468b.lambda$processPendingEncMessages$0(this.f16469c);
                return;
        }
    }
}
