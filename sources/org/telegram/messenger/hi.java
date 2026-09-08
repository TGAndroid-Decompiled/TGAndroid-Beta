package org.telegram.messenger;

import java.util.ArrayList;
public final class hi implements Runnable {
    public final int f17921a;
    public final SecretChatHelper f17922b;
    public final ArrayList f17923c;

    public hi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f17921a = i10;
        this.f17922b = secretChatHelper;
        this.f17923c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17921a) {
            case 0:
                this.f17922b.lambda$resendMessages$14(this.f17923c);
                return;
            default:
                this.f17922b.lambda$processPendingEncMessages$0(this.f17923c);
                return;
        }
    }
}
