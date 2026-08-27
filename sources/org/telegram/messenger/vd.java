package org.telegram.messenger;

import android.util.SparseArray;

public final class vd implements Runnable {

    public final int f21797a;

    public final MessagesController f21798b;

    public final SparseArray f21799c;

    public vd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f21797a = i10;
        this.f21798b = messagesController;
        this.f21799c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f21797a) {
            case 0:
                this.f21798b.lambda$getDifference$352(this.f21799c);
                break;
            default:
                this.f21798b.lambda$getChannelDifference$339(this.f21799c);
                break;
        }
    }
}
