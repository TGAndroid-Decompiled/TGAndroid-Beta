package org.telegram.messenger;

import android.util.SparseArray;
public final class gb implements Runnable {
    public final int f18435a;
    public final MessagesController f18436b;
    public final SparseArray f18437c;

    public gb(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f18435a = i10;
        this.f18436b = messagesController;
        this.f18437c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f18435a) {
            case 0:
                this.f18436b.lambda$getDifference$351(this.f18437c);
                return;
            default:
                this.f18436b.lambda$getChannelDifference$338(this.f18437c);
                return;
        }
    }
}
