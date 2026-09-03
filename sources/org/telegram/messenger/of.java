package org.telegram.messenger;
public final class of implements Runnable {
    public final int f19573a;
    public final MessagesStorage f19574b;
    public final boolean f19575c;

    public of(MessagesStorage messagesStorage, boolean z4, int i10) {
        this.f19573a = i10;
        this.f19574b = messagesStorage;
        this.f19575c = z4;
    }

    @Override
    public final void run() {
        switch (this.f19573a) {
            case 0:
                this.f19574b.lambda$getCachedPhoneBook$150(this.f19575c);
                return;
            default:
                this.f19574b.lambda$cleanup$6(this.f19575c);
                return;
        }
    }
}
