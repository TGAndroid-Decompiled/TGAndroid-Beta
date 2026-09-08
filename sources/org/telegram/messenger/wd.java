package org.telegram.messenger;

import android.util.SparseArray;
public final class wd implements Runnable {
    public final int f19521a;
    public final MessagesController f19522b;
    public final SparseArray f19523c;

    public wd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f19521a = i10;
        this.f19522b = messagesController;
        this.f19523c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f19521a) {
            case 0:
                this.f19522b.lambda$getDifference$352(this.f19523c);
                return;
            default:
                this.f19522b.lambda$getChannelDifference$339(this.f19523c);
                return;
        }
    }
}
