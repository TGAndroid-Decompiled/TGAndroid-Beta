package org.telegram.messenger;

import java.util.ArrayList;
public final class ei implements Runnable {
    public final int f18363a;
    public final SecretChatHelper f18364b;
    public final ArrayList f18365c;

    public ei(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f18363a = i10;
        this.f18364b = secretChatHelper;
        this.f18365c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18363a) {
            case 0:
                this.f18364b.lambda$resendMessages$14(this.f18365c);
                return;
            default:
                this.f18364b.lambda$processPendingEncMessages$0(this.f18365c);
                return;
        }
    }
}
