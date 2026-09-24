package org.telegram.messenger;

import android.util.SparseArray;
public final class vd implements Runnable {
    public final int f17748a;
    public final MessagesController f17749b;
    public final SparseArray f17750c;

    public vd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f17748a = i10;
        this.f17749b = messagesController;
        this.f17750c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f17748a) {
            case 0:
                this.f17749b.lambda$getDifference$352(this.f17750c);
                return;
            default:
                this.f17749b.lambda$getChannelDifference$339(this.f17750c);
                return;
        }
    }
}
