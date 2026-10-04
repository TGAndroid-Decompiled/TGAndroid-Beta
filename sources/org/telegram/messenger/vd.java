package org.telegram.messenger;

import android.util.SparseArray;
public final class vd implements Runnable {
    public final int f19416a;
    public final MessagesController f19417b;
    public final SparseArray f19418c;

    public vd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f19416a = i10;
        this.f19417b = messagesController;
        this.f19418c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f19416a) {
            case 0:
                this.f19417b.lambda$getDifference$352(this.f19418c);
                return;
            default:
                this.f19417b.lambda$getChannelDifference$339(this.f19418c);
                return;
        }
    }
}
