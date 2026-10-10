package org.telegram.messenger;

import android.util.SparseArray;
public final class db implements Runnable {
    public final int f17646a;
    public final MessagesController f17647b;
    public final SparseArray f17648c;

    public db(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f17646a = i10;
        this.f17647b = messagesController;
        this.f17648c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f17646a) {
            case 0:
                MessagesController.s7(this.f17647b, this.f17648c);
                return;
            default:
                MessagesController.B7(this.f17647b, this.f17648c);
                return;
        }
    }
}
