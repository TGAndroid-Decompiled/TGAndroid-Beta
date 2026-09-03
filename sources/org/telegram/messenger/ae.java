package org.telegram.messenger;

import android.util.SparseArray;
public final class ae implements Runnable {
    public final int f18155a;
    public final MessagesController f18156b;
    public final SparseArray f18157c;

    public ae(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f18155a = i10;
        this.f18156b = messagesController;
        this.f18157c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f18155a) {
            case 0:
                MessagesController.V4(this.f18156b, this.f18157c);
                return;
            default:
                MessagesController.u3(this.f18156b, this.f18157c);
                return;
        }
    }
}
