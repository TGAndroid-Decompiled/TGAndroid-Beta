package org.telegram.messenger;

import android.util.SparseArray;
public final class db implements Runnable {
    public final int f18168a;
    public final MessagesController f18169b;
    public final SparseArray f18170c;

    public db(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f18168a = i10;
        this.f18169b = messagesController;
        this.f18170c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f18168a) {
            case 0:
                this.f18169b.lambda$getDifference$351(this.f18170c);
                return;
            default:
                this.f18169b.lambda$getChannelDifference$338(this.f18170c);
                return;
        }
    }
}
