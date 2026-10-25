package org.telegram.messenger;

import android.util.SparseArray;
public final class ta implements Runnable {
    public final int f21322a;
    public final MessagesController f21323b;
    public final SparseArray f21324c;

    public ta(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f21322a = i10;
        this.f21323b = messagesController;
        this.f21324c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f21322a) {
            case 0:
                this.f21323b.lambda$getChannelDifference$340(this.f21324c);
                return;
            default:
                this.f21323b.lambda$getDifference$353(this.f21324c);
                return;
        }
    }
}
