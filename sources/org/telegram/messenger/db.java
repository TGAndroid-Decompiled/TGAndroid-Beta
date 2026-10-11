package org.telegram.messenger;

import android.util.SparseArray;
public final class db implements Runnable {
    public final int f17642a;
    public final MessagesController f17643b;
    public final SparseArray f17644c;

    public db(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f17642a = i10;
        this.f17643b = messagesController;
        this.f17644c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f17642a) {
            case 0:
                MessagesController.s7(this.f17643b, this.f17644c);
                return;
            default:
                MessagesController.B7(this.f17643b, this.f17644c);
                return;
        }
    }
}
