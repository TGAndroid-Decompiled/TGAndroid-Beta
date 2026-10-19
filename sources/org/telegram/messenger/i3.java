package org.telegram.messenger;
public final class i3 implements Runnable {
    public final int f18572a;
    public final Throwable f18573b;

    public i3(int i10, Throwable th2) {
        this.f18572a = i10;
        this.f18573b = th2;
    }

    @Override
    public final void run() {
        switch (this.f18572a) {
            case 0:
                FileLog.lambda$e$5(this.f18573b);
                return;
            default:
                FileLog.lambda$fatal$6(this.f18573b);
                return;
        }
    }
}
