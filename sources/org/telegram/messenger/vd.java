package org.telegram.messenger;

import android.util.SparseArray;
public final class vd implements Runnable {
    public final int f17774a;
    public final MessagesController f17775b;
    public final SparseArray f17776c;

    public vd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f17774a = i10;
        this.f17775b = messagesController;
        this.f17776c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f17774a) {
            case 0:
                this.f17775b.lambda$getDifference$352(this.f17776c);
                return;
            default:
                this.f17775b.lambda$getChannelDifference$339(this.f17776c);
                return;
        }
    }
}
