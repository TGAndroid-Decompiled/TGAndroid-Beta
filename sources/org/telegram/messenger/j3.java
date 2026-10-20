package org.telegram.messenger;
public final class j3 implements Runnable {
    public final int f18662a;
    public final Throwable f18663b;

    public j3(int i10, Throwable th2) {
        this.f18662a = i10;
        this.f18663b = th2;
    }

    @Override
    public final void run() {
        switch (this.f18662a) {
            case 0:
                FileLog.lambda$e$5(this.f18663b);
                return;
            default:
                FileLog.lambda$fatal$6(this.f18663b);
                return;
        }
    }
}
