package org.telegram.messenger;

import android.util.SparseArray;
public final class vd implements Runnable {
    public final int f19422a;
    public final MessagesController f19423b;
    public final SparseArray f19424c;

    public vd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f19422a = i10;
        this.f19423b = messagesController;
        this.f19424c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f19422a) {
            case 0:
                this.f19423b.lambda$getDifference$352(this.f19424c);
                return;
            default:
                this.f19423b.lambda$getChannelDifference$339(this.f19424c);
                return;
        }
    }
}
