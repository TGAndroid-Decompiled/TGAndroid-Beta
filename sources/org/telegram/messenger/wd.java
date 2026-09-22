package org.telegram.messenger;

import android.util.SparseArray;
public final class wd implements Runnable {
    public final int f17773a;
    public final MessagesController f17774b;
    public final SparseArray f17775c;

    public wd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f17773a = i10;
        this.f17774b = messagesController;
        this.f17775c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f17773a) {
            case 0:
                this.f17774b.lambda$getDifference$352(this.f17775c);
                return;
            default:
                this.f17774b.lambda$getChannelDifference$339(this.f17775c);
                return;
        }
    }
}
