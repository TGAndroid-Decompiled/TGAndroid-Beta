package org.telegram.messenger;

import java.util.ArrayList;
public final class hi implements Runnable {
    public final int f18072a;
    public final SecretChatHelper f18073b;
    public final ArrayList f18074c;

    public hi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f18072a = i10;
        this.f18073b = secretChatHelper;
        this.f18074c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18072a) {
            case 0:
                this.f18073b.lambda$resendMessages$14(this.f18074c);
                return;
            default:
                this.f18073b.lambda$processPendingEncMessages$0(this.f18074c);
                return;
        }
    }
}
