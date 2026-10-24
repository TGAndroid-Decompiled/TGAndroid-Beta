package org.telegram.messenger;

import zf.r;
public final class eb implements Runnable {
    public final int f18323a;
    public final MessagesController f18324b;
    public final r f18325c;

    public eb(MessagesController messagesController, r rVar, int i10) {
        this.f18323a = i10;
        this.f18324b = messagesController;
        this.f18325c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f18323a) {
            case 0:
                this.f18324b.lambda$processUpdateArray$402(this.f18325c);
                return;
            case 1:
                this.f18324b.lambda$processUpdateArray$405(this.f18325c);
                return;
            default:
                this.f18324b.lambda$processUpdateArray$407(this.f18325c);
                return;
        }
    }
}
