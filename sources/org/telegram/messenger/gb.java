package org.telegram.messenger;

import android.util.SparseArray;
public final class gb implements Runnable {
    public final int f17009a;
    public final MessagesController f17010b;
    public final SparseArray f17011c;

    public gb(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f17009a = i10;
        this.f17010b = messagesController;
        this.f17011c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f17009a) {
            case 0:
                this.f17010b.lambda$getDifference$351(this.f17011c);
                return;
            default:
                this.f17010b.lambda$getChannelDifference$338(this.f17011c);
                return;
        }
    }
}
