package org.telegram.messenger;

import android.util.SparseArray;
public final class vd implements Runnable {
    public final int f19262a;
    public final MessagesController f19263b;
    public final SparseArray f19264c;

    public vd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f19262a = i10;
        this.f19263b = messagesController;
        this.f19264c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f19262a) {
            case 0:
                this.f19263b.lambda$getDifference$352(this.f19264c);
                return;
            default:
                this.f19263b.lambda$getChannelDifference$339(this.f19264c);
                return;
        }
    }
}
