package org.telegram.messenger;

import android.util.SparseArray;
public final class ae implements Runnable {
    public final int f18153a;
    public final MessagesController f18154b;
    public final SparseArray f18155c;

    public ae(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f18153a = i10;
        this.f18154b = messagesController;
        this.f18155c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f18153a) {
            case 0:
                MessagesController.V4(this.f18154b, this.f18155c);
                return;
            default:
                MessagesController.u3(this.f18154b, this.f18155c);
                return;
        }
    }
}
