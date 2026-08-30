package org.telegram.messenger;

import java.util.ArrayList;
public final class ji implements Runnable {
    public final int f17591a;
    public final SecretChatHelper f17592b;
    public final ArrayList f17593c;

    public ji(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f17591a = i10;
        this.f17592b = secretChatHelper;
        this.f17593c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17591a) {
            case 0:
                this.f17592b.lambda$resendMessages$14(this.f17593c);
                return;
            default:
                this.f17592b.lambda$processPendingEncMessages$0(this.f17593c);
                return;
        }
    }
}
