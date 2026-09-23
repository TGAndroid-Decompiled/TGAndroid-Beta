package org.telegram.messenger;

import java.util.ArrayList;
public final class gi implements Runnable {
    public final int f16223a;
    public final SecretChatHelper f16224b;
    public final ArrayList f16225c;

    public gi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f16223a = i10;
        this.f16224b = secretChatHelper;
        this.f16225c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16223a) {
            case 0:
                this.f16224b.lambda$resendMessages$14(this.f16225c);
                return;
            default:
                this.f16224b.lambda$processPendingEncMessages$0(this.f16225c);
                return;
        }
    }
}
