package org.telegram.messenger;

import android.util.SparseArray;
public final class cb implements Runnable {
    public final int f18075a;
    public final MessagesController f18076b;
    public final SparseArray f18077c;

    public cb(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f18075a = i10;
        this.f18076b = messagesController;
        this.f18077c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f18075a) {
            case 0:
                this.f18076b.lambda$getDifference$351(this.f18077c);
                return;
            default:
                this.f18076b.lambda$getChannelDifference$338(this.f18077c);
                return;
        }
    }
}
