package org.telegram.messenger;

import java.util.ArrayList;
public final class hi implements Runnable {
    public final int f17894a;
    public final SecretChatHelper f17895b;
    public final ArrayList f17896c;

    public hi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f17894a = i10;
        this.f17895b = secretChatHelper;
        this.f17896c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17894a) {
            case 0:
                this.f17895b.lambda$resendMessages$14(this.f17896c);
                return;
            default:
                this.f17895b.lambda$processPendingEncMessages$0(this.f17896c);
                return;
        }
    }
}
