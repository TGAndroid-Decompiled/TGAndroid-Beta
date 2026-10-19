package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class je implements Runnable {
    public final int f18705a;
    public final int f18706b;
    public final Utilities.Callback2 f18707c;

    public je(int i10, int i11, Utilities.Callback2 callback2) {
        this.f18705a = i11;
        this.f18706b = i10;
        this.f18707c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f18705a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f18706b, this.f18707c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f18706b, this.f18707c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f18706b, this.f18707c);
                return;
        }
    }
}
