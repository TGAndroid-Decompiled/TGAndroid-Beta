package org.telegram.messenger;

import android.util.SparseArray;
public final class vd implements Runnable {
    public final int f17790a;
    public final MessagesController f17791b;
    public final SparseArray f17792c;

    public vd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f17790a = i10;
        this.f17791b = messagesController;
        this.f17792c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f17790a) {
            case 0:
                this.f17791b.lambda$getDifference$352(this.f17792c);
                return;
            default:
                this.f17791b.lambda$getChannelDifference$339(this.f17792c);
                return;
        }
    }
}
