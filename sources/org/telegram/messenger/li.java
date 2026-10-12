package org.telegram.messenger;

import java.util.ArrayList;
public final class li implements Runnable {
    public final int f18201a;
    public final SecretChatHelper f18202b;
    public final ArrayList f18203c;

    public li(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f18201a = i10;
        this.f18202b = secretChatHelper;
        this.f18203c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18201a) {
            case 0:
                this.f18202b.lambda$resendMessages$14(this.f18203c);
                return;
            default:
                this.f18202b.lambda$processPendingEncMessages$0(this.f18203c);
                return;
        }
    }
}
