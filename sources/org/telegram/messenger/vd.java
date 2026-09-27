package org.telegram.messenger;

import android.util.SparseArray;
public final class vd implements Runnable {
    public final int f17757a;
    public final MessagesController f17758b;
    public final SparseArray f17759c;

    public vd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f17757a = i10;
        this.f17758b = messagesController;
        this.f17759c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f17757a) {
            case 0:
                this.f17758b.lambda$getDifference$352(this.f17759c);
                return;
            default:
                this.f17758b.lambda$getChannelDifference$339(this.f17759c);
                return;
        }
    }
}
