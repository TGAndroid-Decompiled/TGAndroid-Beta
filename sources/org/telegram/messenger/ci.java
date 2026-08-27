package org.telegram.messenger;

import java.util.ArrayList;

public final class ci implements Runnable {

    public final int f19977a;

    public final SecretChatHelper f19978b;

    public final ArrayList f19979c;

    public ci(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f19977a = i10;
        this.f19978b = secretChatHelper;
        this.f19979c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19977a) {
            case 0:
                this.f19978b.lambda$resendMessages$14(this.f19979c);
                break;
            default:
                this.f19978b.lambda$processPendingEncMessages$0(this.f19979c);
                break;
        }
    }
}
