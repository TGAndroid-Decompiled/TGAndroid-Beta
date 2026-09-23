package org.telegram.messenger;

import android.util.SparseArray;
public final class vd implements Runnable {
    public final int f17508a;
    public final MessagesController f17509b;
    public final SparseArray f17510c;

    public vd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f17508a = i10;
        this.f17509b = messagesController;
        this.f17510c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f17508a) {
            case 0:
                this.f17509b.lambda$getDifference$352(this.f17510c);
                return;
            default:
                this.f17509b.lambda$getChannelDifference$339(this.f17510c);
                return;
        }
    }
}
