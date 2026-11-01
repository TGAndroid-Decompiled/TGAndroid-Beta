package l5;

import android.os.Process;
import w7.n6;
public final class o implements Runnable {
    public final int f11676a;
    public final Runnable f11677b;

    public o(int i10, Runnable runnable) {
        this.f11676a = i10;
        this.f11677b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f11676a) {
            case 0:
                try {
                    this.f11677b.run();
                    return;
                } catch (Exception e) {
                    n6.b("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                this.f11677b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f11677b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f11676a) {
            case 1:
                return this.f11677b.toString();
            default:
                return super.toString();
        }
    }
}
