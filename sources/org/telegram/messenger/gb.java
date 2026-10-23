package org.telegram.messenger;

import android.util.SparseArray;
public final class gb implements Runnable {
    public final int f18501a;
    public final MessagesController f18502b;
    public final SparseArray f18503c;

    public gb(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f18501a = i10;
        this.f18502b = messagesController;
        this.f18503c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f18501a) {
            case 0:
                this.f18502b.lambda$getDifference$351(this.f18503c);
                return;
            default:
                this.f18502b.lambda$getChannelDifference$338(this.f18503c);
                return;
        }
    }
}
