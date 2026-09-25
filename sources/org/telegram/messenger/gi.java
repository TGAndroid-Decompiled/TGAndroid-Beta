package org.telegram.messenger;

import java.util.ArrayList;
public final class gi implements Runnable {
    public final int f16482a;
    public final SecretChatHelper f16483b;
    public final ArrayList f16484c;

    public gi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f16482a = i10;
        this.f16483b = secretChatHelper;
        this.f16484c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16482a) {
            case 0:
                this.f16483b.lambda$resendMessages$14(this.f16484c);
                return;
            default:
                this.f16483b.lambda$processPendingEncMessages$0(this.f16484c);
                return;
        }
    }
}
