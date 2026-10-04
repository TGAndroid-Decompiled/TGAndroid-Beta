package org.telegram.messenger;
public final class di implements Runnable {
    public final int f17685a;
    public final SecretChatHelper f17686b;
    public final long f17687c;

    public di(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f17685a = i10;
        this.f17686b = secretChatHelper;
        this.f17687c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17685a) {
            case 0:
                SecretChatHelper.y(this.f17686b, this.f17687c);
                return;
            case 1:
                SecretChatHelper.u(this.f17686b, this.f17687c);
                return;
            case 2:
                SecretChatHelper.j(this.f17686b, this.f17687c);
                return;
            default:
                SecretChatHelper.x(this.f17686b, this.f17687c);
                return;
        }
    }
}
