package org.telegram.messenger;

import android.util.SparseArray;
public final class hb implements Runnable {
    public final int f18512a;
    public final MessagesController f18513b;
    public final SparseArray f18514c;

    public hb(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f18512a = i10;
        this.f18513b = messagesController;
        this.f18514c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f18512a) {
            case 0:
                this.f18513b.lambda$getDifference$351(this.f18514c);
                return;
            default:
                this.f18513b.lambda$getChannelDifference$338(this.f18514c);
                return;
        }
    }
}
