package org.telegram.messenger;

import java.util.ArrayList;
public final class ki implements Runnable {
    public final int f19195a;
    public final SecretChatHelper f19196b;
    public final ArrayList f19197c;

    public ki(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f19195a = i10;
        this.f19196b = secretChatHelper;
        this.f19197c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19195a) {
            case 0:
                this.f19196b.lambda$resendMessages$14(this.f19197c);
                return;
            default:
                this.f19196b.lambda$processPendingEncMessages$0(this.f19197c);
                return;
        }
    }
}
