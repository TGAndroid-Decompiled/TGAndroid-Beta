package org.telegram.messenger;

import java.util.ArrayList;
public final class li implements Runnable {
    public final int f18202a;
    public final SecretChatHelper f18203b;
    public final ArrayList f18204c;

    public li(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f18202a = i10;
        this.f18203b = secretChatHelper;
        this.f18204c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18202a) {
            case 0:
                this.f18203b.lambda$resendMessages$14(this.f18204c);
                return;
            default:
                this.f18203b.lambda$processPendingEncMessages$0(this.f18204c);
                return;
        }
    }
}
