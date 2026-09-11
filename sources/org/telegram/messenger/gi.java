package org.telegram.messenger;

import java.util.ArrayList;
public final class gi implements Runnable {
    public final int f17810a;
    public final SecretChatHelper f17811b;
    public final ArrayList f17812c;

    public gi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f17810a = i10;
        this.f17811b = secretChatHelper;
        this.f17812c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17810a) {
            case 0:
                this.f17811b.lambda$resendMessages$14(this.f17812c);
                return;
            default:
                this.f17811b.lambda$processPendingEncMessages$0(this.f17812c);
                return;
        }
    }
}
