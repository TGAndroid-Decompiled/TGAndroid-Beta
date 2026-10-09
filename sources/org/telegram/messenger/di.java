package org.telegram.messenger;
public final class di implements Runnable {
    public final int f17666a;
    public final SecretChatHelper f17667b;
    public final long f17668c;

    public di(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f17666a = i10;
        this.f17667b = secretChatHelper;
        this.f17668c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17666a) {
            case 0:
                SecretChatHelper.y(this.f17667b, this.f17668c);
                return;
            case 1:
                SecretChatHelper.u(this.f17667b, this.f17668c);
                return;
            case 2:
                SecretChatHelper.j(this.f17667b, this.f17668c);
                return;
            default:
                SecretChatHelper.x(this.f17667b, this.f17668c);
                return;
        }
    }
}
