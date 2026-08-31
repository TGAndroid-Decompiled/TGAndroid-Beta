package org.telegram.messenger;

import java.util.ArrayList;
public final class ki implements Runnable {
    public final int f19193a;
    public final SecretChatHelper f19194b;
    public final ArrayList f19195c;

    public ki(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f19193a = i10;
        this.f19194b = secretChatHelper;
        this.f19195c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19193a) {
            case 0:
                this.f19194b.lambda$resendMessages$14(this.f19195c);
                return;
            default:
                this.f19194b.lambda$processPendingEncMessages$0(this.f19195c);
                return;
        }
    }
}
