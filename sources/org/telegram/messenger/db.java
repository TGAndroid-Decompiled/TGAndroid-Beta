package org.telegram.messenger;

import android.util.SparseArray;
public final class db implements Runnable {
    public final int f18171a;
    public final MessagesController f18172b;
    public final SparseArray f18173c;

    public db(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f18171a = i10;
        this.f18172b = messagesController;
        this.f18173c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f18171a) {
            case 0:
                this.f18172b.lambda$getDifference$351(this.f18173c);
                return;
            default:
                this.f18172b.lambda$getChannelDifference$338(this.f18173c);
                return;
        }
    }
}
