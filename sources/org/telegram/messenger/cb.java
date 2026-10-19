package org.telegram.messenger;

import android.util.SparseArray;
public final class cb implements Runnable {
    public final int f18087a;
    public final MessagesController f18088b;
    public final SparseArray f18089c;

    public cb(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f18087a = i10;
        this.f18088b = messagesController;
        this.f18089c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f18087a) {
            case 0:
                this.f18088b.lambda$getDifference$351(this.f18089c);
                return;
            default:
                this.f18088b.lambda$getChannelDifference$338(this.f18089c);
                return;
        }
    }
}
