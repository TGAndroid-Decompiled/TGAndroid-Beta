package org.telegram.messenger;
public final class af implements Runnable {
    public final int f17192a = 2;
    public final MessagesStorage f17193b;
    public final boolean f17194c;
    public final int d;
    public final long f17195e;

    public af(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f17193b = messagesStorage;
        this.d = i10;
        this.f17194c = z10;
        this.f17195e = j3;
    }

    @Override
    public final void run() {
        switch (this.f17192a) {
            case 0:
                MessagesStorage.Z2(this.f17193b, this.d, this.f17194c, this.f17195e);
                return;
            case 1:
                MessagesStorage.f4(this.f17193b, this.d, this.f17194c, this.f17195e);
                return;
            default:
                MessagesStorage.V2(this.f17193b, this.d, this.f17194c, this.f17195e);
                return;
        }
    }

    public af(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.f17193b = messagesStorage;
        this.f17195e = j3;
        this.d = i10;
        this.f17194c = z10;
    }

    public af(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.f17193b = messagesStorage;
        this.f17194c = z10;
        this.d = i10;
        this.f17195e = j3;
    }
}
