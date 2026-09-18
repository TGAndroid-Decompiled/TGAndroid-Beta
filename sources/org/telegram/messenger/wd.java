package org.telegram.messenger;

import android.util.SparseArray;
public final class wd implements Runnable {
    public final int f17960a;
    public final MessagesController f17961b;
    public final SparseArray f17962c;

    public wd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f17960a = i10;
        this.f17961b = messagesController;
        this.f17962c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f17960a) {
            case 0:
                this.f17961b.lambda$getDifference$352(this.f17962c);
                return;
            default:
                this.f17961b.lambda$getChannelDifference$339(this.f17962c);
                return;
        }
    }
}
