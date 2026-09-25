package org.telegram.messenger;

import android.util.SparseArray;
public final class vd implements Runnable {
    public final int f17763a;
    public final MessagesController f17764b;
    public final SparseArray f17765c;

    public vd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f17763a = i10;
        this.f17764b = messagesController;
        this.f17765c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f17763a) {
            case 0:
                this.f17764b.lambda$getDifference$352(this.f17765c);
                return;
            default:
                this.f17764b.lambda$getChannelDifference$339(this.f17765c);
                return;
        }
    }
}
