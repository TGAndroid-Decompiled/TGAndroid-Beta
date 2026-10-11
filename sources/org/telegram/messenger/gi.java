package org.telegram.messenger;

import java.util.ArrayList;
public final class gi implements Runnable {
    public final int f18004a;
    public final SecretChatHelper f18005b;
    public final ArrayList f18006c;

    public gi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f18004a = i10;
        this.f18005b = secretChatHelper;
        this.f18006c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18004a) {
            case 0:
                this.f18005b.lambda$resendMessages$14(this.f18006c);
                return;
            default:
                this.f18005b.lambda$processPendingEncMessages$0(this.f18006c);
                return;
        }
    }
}
