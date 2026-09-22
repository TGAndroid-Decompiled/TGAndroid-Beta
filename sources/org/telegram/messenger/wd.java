package org.telegram.messenger;

import android.util.SparseArray;
public final class wd implements Runnable {
    public final int f18016a;
    public final MessagesController f18017b;
    public final SparseArray f18018c;

    public wd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f18016a = i10;
        this.f18017b = messagesController;
        this.f18018c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f18016a) {
            case 0:
                this.f18017b.lambda$getDifference$352(this.f18018c);
                return;
            default:
                this.f18017b.lambda$getChannelDifference$339(this.f18018c);
                return;
        }
    }
}
