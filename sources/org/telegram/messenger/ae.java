package org.telegram.messenger;

import android.util.SparseArray;
public final class ae implements Runnable {
    public final int f16757a;
    public final MessagesController f16758b;
    public final SparseArray f16759c;

    public ae(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f16757a = i10;
        this.f16758b = messagesController;
        this.f16759c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f16757a) {
            case 0:
                MessagesController.V4(this.f16758b, this.f16759c);
                return;
            default:
                MessagesController.u3(this.f16758b, this.f16759c);
                return;
        }
    }
}
