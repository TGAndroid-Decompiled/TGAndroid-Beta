package org.telegram.messenger;

import java.util.ArrayList;
public final class gi implements Runnable {
    public final int f17968a;
    public final SecretChatHelper f17969b;
    public final ArrayList f17970c;

    public gi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f17968a = i10;
        this.f17969b = secretChatHelper;
        this.f17970c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17968a) {
            case 0:
                this.f17969b.lambda$resendMessages$14(this.f17970c);
                return;
            default:
                this.f17969b.lambda$processPendingEncMessages$0(this.f17970c);
                return;
        }
    }
}
