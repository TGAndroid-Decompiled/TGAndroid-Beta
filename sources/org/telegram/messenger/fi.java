package org.telegram.messenger;
public final class fi implements Runnable {
    public final int f17257a;
    public final SecretChatHelper f17258b;
    public final long f17259c;

    public fi(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f17257a = i10;
        this.f17258b = secretChatHelper;
        this.f17259c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17257a) {
            case 0:
                SecretChatHelper.y(this.f17258b, this.f17259c);
                return;
            case 1:
                SecretChatHelper.u(this.f17258b, this.f17259c);
                return;
            case 2:
                SecretChatHelper.j(this.f17258b, this.f17259c);
                return;
            default:
                SecretChatHelper.x(this.f17258b, this.f17259c);
                return;
        }
    }
}
