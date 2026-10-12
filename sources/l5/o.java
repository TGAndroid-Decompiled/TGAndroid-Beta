package l5;

import android.os.Process;
import w7.l6;
public final class o implements Runnable {
    public final int f14591a;
    public final Runnable f14592b;

    public o(int i10, Runnable runnable) {
        this.f14591a = i10;
        this.f14592b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f14591a) {
            case 0:
                try {
                    this.f14592b.run();
                    return;
                } catch (Exception e) {
                    l6.b("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                this.f14592b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f14592b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f14591a) {
            case 1:
                return this.f14592b.toString();
            default:
                return super.toString();
        }
    }
}
