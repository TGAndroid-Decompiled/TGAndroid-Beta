package org.telegram.messenger;

import android.util.SparseArray;
public final class db implements Runnable {
    public final int f17678a;
    public final MessagesController f17679b;
    public final SparseArray f17680c;

    public db(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f17678a = i10;
        this.f17679b = messagesController;
        this.f17680c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f17678a) {
            case 0:
                MessagesController.s7(this.f17679b, this.f17680c);
                return;
            default:
                MessagesController.B7(this.f17679b, this.f17680c);
                return;
        }
    }
}
