package b9;

import android.os.Process;
import h7.j5;
public final class k implements Runnable {
    public final int f2015a;
    public final Runnable f2016b;

    public k(int i10, Runnable runnable) {
        this.f2015a = i10;
        this.f2016b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f2015a) {
            case 0:
                this.f2016b.run();
                return;
            case 1:
                Process.setThreadPriority(0);
                this.f2016b.run();
                return;
            default:
                try {
                    this.f2016b.run();
                    return;
                } catch (Exception e10) {
                    j5.b("Executor", "Background execution failure.", e10);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f2015a) {
            case 0:
                return this.f2016b.toString();
            default:
                return super.toString();
        }
    }
}
