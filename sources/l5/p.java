package l5;

import android.os.Process;
import w7.h6;
public final class p implements Runnable {
    public final int f15360a;
    public final Runnable f15361b;

    public p(int i10, Runnable runnable) {
        this.f15360a = i10;
        this.f15361b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15360a) {
            case 0:
                try {
                    this.f15361b.run();
                    return;
                } catch (Exception e7) {
                    h6.b("Executor", "Background execution failure.", e7);
                    return;
                }
            case 1:
                this.f15361b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f15361b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f15360a) {
            case 1:
                return this.f15361b.toString();
            default:
                return super.toString();
        }
    }
}
