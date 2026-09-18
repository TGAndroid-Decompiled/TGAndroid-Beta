package org.telegram.messenger;

import android.util.SparseArray;
public final class wd implements Runnable {
    public final int f17785a;
    public final MessagesController f17786b;
    public final SparseArray f17787c;

    public wd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f17785a = i10;
        this.f17786b = messagesController;
        this.f17787c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f17785a) {
            case 0:
                this.f17786b.lambda$getDifference$352(this.f17787c);
                return;
            default:
                this.f17786b.lambda$getChannelDifference$339(this.f17787c);
                return;
        }
    }
}
