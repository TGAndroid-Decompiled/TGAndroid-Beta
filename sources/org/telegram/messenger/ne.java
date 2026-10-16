package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class ne implements Runnable {
    public final int f17653a;
    public final int f17654b;
    public final Utilities.Callback2 f17655c;

    public ne(int i10, int i11, Utilities.Callback2 callback2) {
        this.f17653a = i11;
        this.f17654b = i10;
        this.f17655c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f17653a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f17654b, this.f17655c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f17654b, this.f17655c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f17654b, this.f17655c);
                return;
        }
    }
}
