package l5;

import android.os.Process;
import w7.h6;
public final class p implements Runnable {
    public final int f15359a;
    public final Runnable f15360b;

    public p(int i10, Runnable runnable) {
        this.f15359a = i10;
        this.f15360b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15359a) {
            case 0:
                try {
                    this.f15360b.run();
                    return;
                } catch (Exception e7) {
                    h6.b("Executor", "Background execution failure.", e7);
                    return;
                }
            case 1:
                this.f15360b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f15360b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f15359a) {
            case 1:
                return this.f15360b.toString();
            default:
                return super.toString();
        }
    }
}
