package org.telegram.messenger;

import java.util.ArrayList;

public final class SecretChatHelper$$ExternalSyntheticLambda19 implements Runnable {
    public final int $r8$classId;
    public final SecretChatHelper f$0;
    public final ArrayList f$1;

    public SecretChatHelper$$ExternalSyntheticLambda19(SecretChatHelper secretChatHelper, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = secretChatHelper;
        this.f$1 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$resendMessages$14(this.f$1);
                break;
            default:
                this.f$0.lambda$processPendingEncMessages$0(this.f$1);
                break;
        }
    }
}
