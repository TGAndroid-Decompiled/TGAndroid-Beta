package org.telegram.messenger;

import java.util.ArrayList;
public final class ki implements Runnable {
    public final int f17670a;
    public final SecretChatHelper f17671b;
    public final ArrayList f17672c;

    public ki(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f17670a = i10;
        this.f17671b = secretChatHelper;
        this.f17672c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17670a) {
            case 0:
                this.f17671b.lambda$resendMessages$14(this.f17672c);
                return;
            default:
                this.f17671b.lambda$processPendingEncMessages$0(this.f17672c);
                return;
        }
    }
}
