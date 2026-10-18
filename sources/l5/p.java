package l5;

import android.os.Process;
import w7.j6;
public final class p implements Runnable {
    public final int f15931a;
    public final Runnable f15932b;

    public p(int i10, Runnable runnable) {
        this.f15931a = i10;
        this.f15932b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15931a) {
            case 0:
                try {
                    this.f15932b.run();
                    return;
                } catch (Exception e) {
                    j6.b("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                this.f15932b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f15932b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f15931a) {
            case 1:
                return this.f15932b.toString();
            default:
                return super.toString();
        }
    }
}
