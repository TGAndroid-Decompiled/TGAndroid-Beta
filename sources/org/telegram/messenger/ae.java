package org.telegram.messenger;

import android.util.SparseArray;
public final class ae implements Runnable {
    public final int f16738a;
    public final MessagesController f16739b;
    public final SparseArray f16740c;

    public ae(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f16738a = i10;
        this.f16739b = messagesController;
        this.f16740c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f16738a) {
            case 0:
                MessagesController.V4(this.f16739b, this.f16740c);
                return;
            default:
                MessagesController.u3(this.f16739b, this.f16740c);
                return;
        }
    }
}
