package d9;

import android.os.Process;
import j7.i0;
public final class j implements Runnable {
    public final int f4272a;
    public final Runnable f4273b;

    public j(int i10, Runnable runnable) {
        this.f4272a = i10;
        this.f4273b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f4272a) {
            case 0:
                this.f4273b.run();
                return;
            case 1:
                Process.setThreadPriority(0);
                this.f4273b.run();
                return;
            default:
                try {
                    this.f4273b.run();
                    return;
                } catch (Exception e) {
                    i0.b("Executor", "Background execution failure.", e);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f4272a) {
            case 0:
                return this.f4273b.toString();
            default:
                return super.toString();
        }
    }
}
