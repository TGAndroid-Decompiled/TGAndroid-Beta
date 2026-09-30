package org.telegram.messenger;

import java.util.ArrayList;
public final class gi implements Runnable {
    public final int f16506a;
    public final SecretChatHelper f16507b;
    public final ArrayList f16508c;

    public gi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f16506a = i10;
        this.f16507b = secretChatHelper;
        this.f16508c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16506a) {
            case 0:
                this.f16507b.lambda$resendMessages$14(this.f16508c);
                return;
            default:
                this.f16507b.lambda$processPendingEncMessages$0(this.f16508c);
                return;
        }
    }
}
