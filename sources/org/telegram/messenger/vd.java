package org.telegram.messenger;

import android.util.SparseArray;
public final class vd implements Runnable {
    public final int f19415a;
    public final MessagesController f19416b;
    public final SparseArray f19417c;

    public vd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f19415a = i10;
        this.f19416b = messagesController;
        this.f19417c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f19415a) {
            case 0:
                this.f19416b.lambda$getDifference$352(this.f19417c);
                return;
            default:
                this.f19416b.lambda$getChannelDifference$339(this.f19417c);
                return;
        }
    }
}
