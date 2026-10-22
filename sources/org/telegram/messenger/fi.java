package org.telegram.messenger;

import java.util.ArrayList;
public final class fi implements Runnable {
    public final int f18366a;
    public final SecretChatHelper f18367b;
    public final ArrayList f18368c;

    public fi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f18366a = i10;
        this.f18367b = secretChatHelper;
        this.f18368c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18366a) {
            case 0:
                this.f18367b.lambda$resendMessages$14(this.f18368c);
                return;
            default:
                this.f18367b.lambda$processPendingEncMessages$0(this.f18368c);
                return;
        }
    }
}
