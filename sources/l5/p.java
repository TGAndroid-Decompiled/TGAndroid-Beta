package l5;

import android.os.Process;
import w7.l6;
public final class p implements Runnable {
    public final int f15926a;
    public final Runnable f15927b;

    public p(int i10, Runnable runnable) {
        this.f15926a = i10;
        this.f15927b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15926a) {
            case 0:
                try {
                    this.f15927b.run();
                    return;
                } catch (Exception e) {
                    l6.b("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                this.f15927b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f15927b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f15926a) {
            case 1:
                return this.f15927b.toString();
            default:
                return super.toString();
        }
    }
}
