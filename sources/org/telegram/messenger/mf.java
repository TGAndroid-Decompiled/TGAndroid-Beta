package org.telegram.messenger;
public final class mf implements Runnable {
    public final int f19035a;
    public final MessagesStorage f19036b;
    public final boolean f19037c;

    public mf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.f19035a = i10;
        this.f19036b = messagesStorage;
        this.f19037c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19035a) {
            case 0:
                this.f19036b.lambda$getCachedPhoneBook$150(this.f19037c);
                return;
            default:
                this.f19036b.lambda$cleanup$6(this.f19037c);
                return;
        }
    }
}
