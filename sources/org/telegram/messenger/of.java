package org.telegram.messenger;
public final class of implements Runnable {
    public final int f18028a;
    public final MessagesStorage f18029b;
    public final boolean f18030c;

    public of(MessagesStorage messagesStorage, boolean z4, int i10) {
        this.f18028a = i10;
        this.f18029b = messagesStorage;
        this.f18030c = z4;
    }

    @Override
    public final void run() {
        switch (this.f18028a) {
            case 0:
                this.f18029b.lambda$getCachedPhoneBook$150(this.f18030c);
                return;
            default:
                this.f18029b.lambda$cleanup$6(this.f18030c);
                return;
        }
    }
}
