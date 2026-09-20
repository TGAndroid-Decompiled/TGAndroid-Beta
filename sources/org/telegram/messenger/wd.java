package org.telegram.messenger;

import android.util.SparseArray;
public final class wd implements Runnable {
    public final int f18001a;
    public final MessagesController f18002b;
    public final SparseArray f18003c;

    public wd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f18001a = i10;
        this.f18002b = messagesController;
        this.f18003c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f18001a) {
            case 0:
                this.f18002b.lambda$getDifference$352(this.f18003c);
                return;
            default:
                this.f18002b.lambda$getChannelDifference$339(this.f18003c);
                return;
        }
    }
}
