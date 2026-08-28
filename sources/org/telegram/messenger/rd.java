package org.telegram.messenger;

import android.util.SparseArray;
public final class rd implements Runnable {
    public final int f21402a;
    public final MessagesController f21403b;
    public final SparseArray f21404c;

    public rd(MessagesController messagesController, SparseArray sparseArray, int i9) {
        this.f21402a = i9;
        this.f21403b = messagesController;
        this.f21404c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f21402a) {
            case 0:
                this.f21403b.lambda$getDifference$352(this.f21404c);
                return;
            default:
                this.f21403b.lambda$getChannelDifference$339(this.f21404c);
                return;
        }
    }
}
