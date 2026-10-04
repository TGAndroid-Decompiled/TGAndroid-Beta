package org.telegram.messenger;

import android.util.SparseArray;
public final class vd implements Runnable {
    public final int f19417a;
    public final MessagesController f19418b;
    public final SparseArray f19419c;

    public vd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f19417a = i10;
        this.f19418b = messagesController;
        this.f19419c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f19417a) {
            case 0:
                this.f19418b.lambda$getDifference$352(this.f19419c);
                return;
            default:
                this.f19418b.lambda$getChannelDifference$339(this.f19419c);
                return;
        }
    }
}
