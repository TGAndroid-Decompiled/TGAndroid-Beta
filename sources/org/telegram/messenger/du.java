package org.telegram.messenger;
public final class du implements Runnable {
    public final int f15309a;
    public final String f15310b;
    public final String f15311c;
    public final long d;

    public du(int i10, long j10, String str, String str2) {
        this.f15309a = i10;
        this.f15310b = str;
        this.f15311c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f15309a) {
            case 0:
                PushListenerController.c(this.d, this.f15310b, this.f15311c);
                return;
            default:
                PushListenerController.h(this.d, this.f15310b, this.f15311c);
                return;
        }
    }
}
