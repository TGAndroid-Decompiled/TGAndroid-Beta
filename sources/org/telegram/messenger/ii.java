package org.telegram.messenger;

import java.util.ArrayList;
public final class ii implements Runnable {
    public final int f16600a;
    public final SecretChatHelper f16601b;
    public final ArrayList f16602c;

    public ii(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f16600a = i10;
        this.f16601b = secretChatHelper;
        this.f16602c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16600a) {
            case 0:
                this.f16601b.lambda$resendMessages$14(this.f16602c);
                return;
            default:
                this.f16601b.lambda$processPendingEncMessages$0(this.f16602c);
                return;
        }
    }
}
