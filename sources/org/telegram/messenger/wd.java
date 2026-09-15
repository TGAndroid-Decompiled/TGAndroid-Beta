package org.telegram.messenger;

import android.util.SparseArray;
public final class wd implements Runnable {
    public final int f17776a;
    public final MessagesController f17777b;
    public final SparseArray f17778c;

    public wd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f17776a = i10;
        this.f17777b = messagesController;
        this.f17778c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f17776a) {
            case 0:
                this.f17777b.lambda$getDifference$352(this.f17778c);
                return;
            default:
                this.f17777b.lambda$getChannelDifference$339(this.f17778c);
                return;
        }
    }
}
