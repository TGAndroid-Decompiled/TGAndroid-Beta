package org.telegram.messenger;
public final class di implements Runnable {
    public final int f17670a;
    public final SecretChatHelper f17671b;
    public final long f17672c;

    public di(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f17670a = i10;
        this.f17671b = secretChatHelper;
        this.f17672c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17670a) {
            case 0:
                SecretChatHelper.y(this.f17671b, this.f17672c);
                return;
            case 1:
                SecretChatHelper.u(this.f17671b, this.f17672c);
                return;
            case 2:
                SecretChatHelper.j(this.f17671b, this.f17672c);
                return;
            default:
                SecretChatHelper.x(this.f17671b, this.f17672c);
                return;
        }
    }
}
