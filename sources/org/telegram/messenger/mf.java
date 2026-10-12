package org.telegram.messenger;
public final class mf implements Runnable {
    public final int f17873a;
    public final MessagesStorage f17874b;
    public final boolean f17875c;

    public mf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f17873a = i10;
        this.f17874b = messagesStorage;
        this.f17875c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17873a) {
            case 0:
                this.f17874b.lambda$getCachedPhoneBook$150(this.f17875c);
                return;
            default:
                this.f17874b.lambda$cleanup$6(this.f17875c);
                return;
        }
    }
}
