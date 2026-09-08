package l5;

import android.os.Process;
import w7.f6;
public final class o implements Runnable {
    public final int f15322a;
    public final Runnable f15323b;

    public o(int i10, Runnable runnable) {
        this.f15322a = i10;
        this.f15323b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15322a) {
            case 0:
                try {
                    this.f15323b.run();
                    return;
                } catch (Exception e7) {
                    f6.b("Executor", "Background execution failure.", e7);
                    return;
                }
            case 1:
                this.f15323b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f15323b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f15322a) {
            case 1:
                return this.f15323b.toString();
            default:
                return super.toString();
        }
    }
}
