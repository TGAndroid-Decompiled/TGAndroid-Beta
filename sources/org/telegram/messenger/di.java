package org.telegram.messenger;
public final class di implements Runnable {
    public final int f17690a;
    public final SecretChatHelper f17691b;
    public final long f17692c;

    public di(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f17690a = i10;
        this.f17691b = secretChatHelper;
        this.f17692c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17690a) {
            case 0:
                SecretChatHelper.y(this.f17691b, this.f17692c);
                return;
            case 1:
                SecretChatHelper.u(this.f17691b, this.f17692c);
                return;
            case 2:
                SecretChatHelper.j(this.f17691b, this.f17692c);
                return;
            default:
                SecretChatHelper.x(this.f17691b, this.f17692c);
                return;
        }
    }
}
