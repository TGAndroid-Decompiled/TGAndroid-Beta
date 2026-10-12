package org.telegram.messenger;

import android.util.SparseArray;
public final class gb implements Runnable {
    public final int f17313a;
    public final MessagesController f17314b;
    public final SparseArray f17315c;

    public gb(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f17313a = i10;
        this.f17314b = messagesController;
        this.f17315c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f17313a) {
            case 0:
                this.f17314b.lambda$getDifference$351(this.f17315c);
                return;
            default:
                this.f17314b.lambda$getChannelDifference$338(this.f17315c);
                return;
        }
    }
}
