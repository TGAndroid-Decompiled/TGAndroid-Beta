package org.telegram.messenger;

import java.util.ArrayList;
public final class fi implements Runnable {
    public final int f20252a;
    public final SecretChatHelper f20253b;
    public final ArrayList f20254c;

    public fi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f20252a = i10;
        this.f20253b = secretChatHelper;
        this.f20254c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20252a) {
            case 0:
                this.f20253b.lambda$resendMessages$14(this.f20254c);
                return;
            default:
                this.f20253b.lambda$processPendingEncMessages$0(this.f20254c);
                return;
        }
    }
}
