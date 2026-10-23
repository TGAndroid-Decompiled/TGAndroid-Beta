package l5;

import android.os.Process;
import w7.i6;
public final class p implements Runnable {
    public final int f15995a;
    public final Runnable f15996b;

    public p(int i10, Runnable runnable) {
        this.f15995a = i10;
        this.f15996b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15995a) {
            case 0:
                try {
                    this.f15996b.run();
                    return;
                } catch (Exception e) {
                    i6.b("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                this.f15996b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f15996b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f15995a) {
            case 1:
                return this.f15996b.toString();
            default:
                return super.toString();
        }
    }
}
