package org.telegram.messenger;
public final class of implements Runnable {
    public final int f18005a;
    public final MessagesStorage f18006b;
    public final boolean f18007c;

    public of(MessagesStorage messagesStorage, boolean z4, int i10) {
        this.f18005a = i10;
        this.f18006b = messagesStorage;
        this.f18007c = z4;
    }

    @Override
    public final void run() {
        switch (this.f18005a) {
            case 0:
                this.f18006b.lambda$getCachedPhoneBook$150(this.f18007c);
                return;
            default:
                this.f18006b.lambda$cleanup$6(this.f18007c);
                return;
        }
    }
}
