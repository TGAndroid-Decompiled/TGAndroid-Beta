package l5;

import android.os.Process;
import w7.i6;
public final class o implements Runnable {
    public final int f12804a;
    public final Runnable f12805b;

    public o(int i10, Runnable runnable) {
        this.f12804a = i10;
        this.f12805b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f12804a) {
            case 0:
                try {
                    this.f12805b.run();
                    return;
                } catch (Exception e) {
                    i6.b("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                this.f12805b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f12805b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f12804a) {
            case 1:
                return this.f12805b.toString();
            default:
                return super.toString();
        }
    }
}
