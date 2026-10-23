package org.telegram.messenger;
public final class qh implements Runnable {
    public final int f19337a;
    public final String f19338b;
    public final String f19339c;
    public final long d;

    public qh(int i10, long j10, String str, String str2) {
        this.f19337a = i10;
        this.f19338b = str;
        this.f19339c = str2;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19337a) {
            case 0:
                PushListenerController.c(this.d, this.f19338b, this.f19339c);
                return;
            default:
                PushListenerController.h(this.d, this.f19338b, this.f19339c);
                return;
        }
    }
}
