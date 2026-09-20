package l5;

import android.os.Process;
import w7.h6;
public final class o implements Runnable {
    public final int f14104a;
    public final Runnable f14105b;

    public o(int i10, Runnable runnable) {
        this.f14104a = i10;
        this.f14105b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f14104a) {
            case 0:
                try {
                    this.f14105b.run();
                    return;
                } catch (Exception e) {
                    h6.b("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                this.f14105b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f14105b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f14104a) {
            case 1:
                return this.f14105b.toString();
            default:
                return super.toString();
        }
    }
}
