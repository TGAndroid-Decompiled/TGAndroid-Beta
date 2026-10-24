package org.telegram.messenger;

import android.util.SparseArray;
public final class hb implements Runnable {
    public final int f18577a;
    public final MessagesController f18578b;
    public final SparseArray f18579c;

    public hb(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f18577a = i10;
        this.f18578b = messagesController;
        this.f18579c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f18577a) {
            case 0:
                this.f18578b.lambda$getDifference$351(this.f18579c);
                return;
            default:
                this.f18578b.lambda$getChannelDifference$338(this.f18579c);
                return;
        }
    }
}
