package l5;

import android.os.Process;
import w7.i6;
public final class o implements Runnable {
    public final int f15423a;
    public final Runnable f15424b;

    public o(int i10, Runnable runnable) {
        this.f15423a = i10;
        this.f15424b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15423a) {
            case 0:
                try {
                    this.f15424b.run();
                    return;
                } catch (Exception e7) {
                    i6.b("Executor", "Background execution failure.", e7);
                    return;
                }
            case 1:
                this.f15424b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f15424b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f15423a) {
            case 1:
                return this.f15424b.toString();
            default:
                return super.toString();
        }
    }
}
