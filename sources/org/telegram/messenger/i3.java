package org.telegram.messenger;
public final class i3 implements Runnable {
    public final int f18573a;
    public final Throwable f18574b;

    public i3(int i10, Throwable th2) {
        this.f18573a = i10;
        this.f18574b = th2;
    }

    @Override
    public final void run() {
        switch (this.f18573a) {
            case 0:
                FileLog.lambda$e$5(this.f18574b);
                return;
            default:
                FileLog.lambda$fatal$6(this.f18574b);
                return;
        }
    }
}
