package org.telegram.messenger;

import android.util.SparseArray;
public final class gb implements Runnable {
    public final int f17677a;
    public final MessagesController f17678b;
    public final SparseArray f17679c;

    public gb(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f17677a = i10;
        this.f17678b = messagesController;
        this.f17679c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f17677a) {
            case 0:
                this.f17678b.lambda$getDifference$351(this.f17679c);
                return;
            default:
                this.f17678b.lambda$getChannelDifference$338(this.f17679c);
                return;
        }
    }
}
