package org.telegram.messenger;

import java.util.ArrayList;

public final class MessagesStorage$$ExternalSyntheticLambda256 implements Runnable {
    public final int $r8$classId;
    public final Utilities.Callback f$0;
    public final ArrayList f$1;

    public MessagesStorage$$ExternalSyntheticLambda256(Utilities.Callback callback, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$1 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run(this.f$1);
                break;
            case 1:
                this.f$0.run(this.f$1);
                break;
            case 2:
                this.f$0.run(this.f$1);
                break;
            default:
                MediaDataController.lambda$loadStickers$92(this.f$0, this.f$1);
                break;
        }
    }
}
