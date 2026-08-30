package d9;

import android.os.Process;
import j7.i0;
public final class j implements Runnable {
    public final int f4291a;
    public final Runnable f4292b;

    public j(int i10, Runnable runnable) {
        this.f4291a = i10;
        this.f4292b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f4291a) {
            case 0:
                this.f4292b.run();
                return;
            case 1:
                Process.setThreadPriority(0);
                this.f4292b.run();
                return;
            default:
                try {
                    this.f4292b.run();
                    return;
                } catch (Exception e) {
                    i0.b("Executor", "Background execution failure.", e);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f4291a) {
            case 0:
                return this.f4292b.toString();
            default:
                return super.toString();
        }
    }
}
