package org.telegram.messenger;

import java.util.ArrayList;
public final class ei implements Runnable {
    public final int f18298a;
    public final SecretChatHelper f18299b;
    public final ArrayList f18300c;

    public ei(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f18298a = i10;
        this.f18299b = secretChatHelper;
        this.f18300c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18298a) {
            case 0:
                this.f18299b.lambda$resendMessages$14(this.f18300c);
                return;
            default:
                this.f18299b.lambda$processPendingEncMessages$0(this.f18300c);
                return;
        }
    }
}
