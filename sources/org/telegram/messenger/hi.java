package org.telegram.messenger;

import java.util.ArrayList;
public final class hi implements Runnable {
    public final int f16566a;
    public final SecretChatHelper f16567b;
    public final ArrayList f16568c;

    public hi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f16566a = i10;
        this.f16567b = secretChatHelper;
        this.f16568c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16566a) {
            case 0:
                this.f16567b.lambda$resendMessages$14(this.f16568c);
                return;
            default:
                this.f16567b.lambda$processPendingEncMessages$0(this.f16568c);
                return;
        }
    }
}
