package org.telegram.messenger;

import android.util.SparseArray;
public final class wd implements Runnable {
    public final int f19494a;
    public final MessagesController f19495b;
    public final SparseArray f19496c;

    public wd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f19494a = i10;
        this.f19495b = messagesController;
        this.f19496c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f19494a) {
            case 0:
                this.f19495b.lambda$getDifference$352(this.f19496c);
                return;
            default:
                this.f19495b.lambda$getChannelDifference$339(this.f19496c);
                return;
        }
    }
}
