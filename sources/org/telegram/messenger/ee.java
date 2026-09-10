package org.telegram.messenger;

import android.util.SparseArray;
public final class ee implements Runnable {
    public final int f15086a;
    public final MessagesController f15087b;
    public final SparseArray f15088c;

    public ee(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f15086a = i10;
        this.f15087b = messagesController;
        this.f15088c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f15086a) {
            case 0:
                this.f15087b.lambda$getDifference$352(this.f15088c);
                return;
            default:
                this.f15087b.lambda$getChannelDifference$339(this.f15088c);
                return;
        }
    }
}
