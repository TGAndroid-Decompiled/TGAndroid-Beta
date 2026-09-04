package org.telegram.messenger;
public final class di implements Runnable {
    public final int f17490a;
    public final SecretChatHelper f17491b;
    public final long f17492c;

    public di(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f17490a = i10;
        this.f17491b = secretChatHelper;
        this.f17492c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17490a) {
            case 0:
                SecretChatHelper.x(this.f17491b, this.f17492c);
                return;
            case 1:
                SecretChatHelper.t(this.f17491b, this.f17492c);
                return;
            case 2:
                SecretChatHelper.j(this.f17491b, this.f17492c);
                return;
            default:
                SecretChatHelper.w(this.f17491b, this.f17492c);
                return;
        }
    }
}
