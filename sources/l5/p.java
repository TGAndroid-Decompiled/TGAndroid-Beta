package l5;

import android.os.Process;
import w7.i6;
public final class p implements Runnable {
    public final int f15932a;
    public final Runnable f15933b;

    public p(int i10, Runnable runnable) {
        this.f15932a = i10;
        this.f15933b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15932a) {
            case 0:
                try {
                    this.f15933b.run();
                    return;
                } catch (Exception e) {
                    i6.b("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                this.f15933b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f15933b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f15932a) {
            case 1:
                return this.f15933b.toString();
            default:
                return super.toString();
        }
    }
}
