package org.telegram.messenger;

import android.util.SparseArray;
public final class ab implements Runnable {
    public final int f19614a;
    public final MessagesController f19615b;
    public final SparseArray f19616c;

    public ab(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f19614a = i10;
        this.f19615b = messagesController;
        this.f19616c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f19614a) {
            case 0:
                MessagesController.b5(this.f19615b, this.f19616c);
                return;
            default:
                MessagesController.c4(this.f19615b, this.f19616c);
                return;
        }
    }
}
