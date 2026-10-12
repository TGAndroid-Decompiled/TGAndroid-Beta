package org.telegram.messenger;

import android.util.SparseArray;
public final class gb implements Runnable {
    public final int f17678a;
    public final MessagesController f17679b;
    public final SparseArray f17680c;

    public gb(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f17678a = i10;
        this.f17679b = messagesController;
        this.f17680c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f17678a) {
            case 0:
                this.f17679b.lambda$getDifference$351(this.f17680c);
                return;
            default:
                this.f17679b.lambda$getChannelDifference$338(this.f17680c);
                return;
        }
    }
}
