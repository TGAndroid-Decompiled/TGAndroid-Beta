package org.telegram.messenger;
public final class li implements Runnable {
    public final int f15722a;
    public final SecretChatHelper f15723b;
    public final long f15724c;

    public li(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f15722a = i10;
        this.f15723b = secretChatHelper;
        this.f15724c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15722a) {
            case 0:
                SecretChatHelper.x(this.f15723b, this.f15724c);
                return;
            case 1:
                SecretChatHelper.t(this.f15723b, this.f15724c);
                return;
            case 2:
                SecretChatHelper.j(this.f15723b, this.f15724c);
                return;
            default:
                SecretChatHelper.w(this.f15723b, this.f15724c);
                return;
        }
    }
}
