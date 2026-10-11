package org.telegram.messenger;
public final class ci implements Runnable {
    public final int f17617a;
    public final SecretChatHelper f17618b;
    public final long f17619c;

    public ci(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f17617a = i10;
        this.f17618b = secretChatHelper;
        this.f17619c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17617a) {
            case 0:
                SecretChatHelper.y(this.f17618b, this.f17619c);
                return;
            case 1:
                SecretChatHelper.u(this.f17618b, this.f17619c);
                return;
            case 2:
                SecretChatHelper.j(this.f17618b, this.f17619c);
                return;
            default:
                SecretChatHelper.x(this.f17618b, this.f17619c);
                return;
        }
    }
}
