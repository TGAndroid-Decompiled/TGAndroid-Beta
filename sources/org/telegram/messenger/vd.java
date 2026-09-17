package org.telegram.messenger;

import android.util.SparseArray;
public final class vd implements Runnable {
    public final int f19235a;
    public final MessagesController f19236b;
    public final SparseArray f19237c;

    public vd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f19235a = i10;
        this.f19236b = messagesController;
        this.f19237c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f19235a) {
            case 0:
                this.f19236b.lambda$getDifference$352(this.f19237c);
                return;
            default:
                this.f19236b.lambda$getChannelDifference$339(this.f19237c);
                return;
        }
    }
}
