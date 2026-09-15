package org.telegram.messenger;

import java.util.ArrayList;
public final class hi implements Runnable {
    public final int f16341a;
    public final SecretChatHelper f16342b;
    public final ArrayList f16343c;

    public hi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.f16341a = i10;
        this.f16342b = secretChatHelper;
        this.f16343c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16341a) {
            case 0:
                this.f16342b.lambda$resendMessages$14(this.f16343c);
                return;
            default:
                this.f16342b.lambda$processPendingEncMessages$0(this.f16343c);
                return;
        }
    }
}
