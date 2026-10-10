package l5;

import android.os.Process;
import w7.i6;
public final class o implements Runnable {
    public final int f15427a;
    public final Runnable f15428b;

    public o(int i10, Runnable runnable) {
        this.f15427a = i10;
        this.f15428b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15427a) {
            case 0:
                try {
                    this.f15428b.run();
                    return;
                } catch (Exception e7) {
                    i6.b("Executor", "Background execution failure.", e7);
                    return;
                }
            case 1:
                this.f15428b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f15428b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f15427a) {
            case 1:
                return this.f15428b.toString();
            default:
                return super.toString();
        }
    }
}
