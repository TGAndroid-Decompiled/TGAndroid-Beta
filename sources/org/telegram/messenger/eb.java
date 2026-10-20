package org.telegram.messenger;

import android.util.SparseArray;
public final class eb implements Runnable {
    public final int f18264a;
    public final MessagesController f18265b;
    public final SparseArray f18266c;

    public eb(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f18264a = i10;
        this.f18265b = messagesController;
        this.f18266c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f18264a) {
            case 0:
                this.f18265b.lambda$getDifference$351(this.f18266c);
                return;
            default:
                this.f18265b.lambda$getChannelDifference$338(this.f18266c);
                return;
        }
    }
}
