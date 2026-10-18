package org.telegram.messenger;

import android.util.SparseArray;
public final class cb implements Runnable {
    public final int f18090a;
    public final MessagesController f18091b;
    public final SparseArray f18092c;

    public cb(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f18090a = i10;
        this.f18091b = messagesController;
        this.f18092c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f18090a) {
            case 0:
                this.f18091b.lambda$getDifference$351(this.f18092c);
                return;
            default:
                this.f18091b.lambda$getChannelDifference$338(this.f18092c);
                return;
        }
    }
}
