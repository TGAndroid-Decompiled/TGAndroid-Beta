package l5;

import android.os.Process;
import w7.i6;
public final class p implements Runnable {
    public final int f15934a;
    public final Runnable f15935b;

    public p(int i10, Runnable runnable) {
        this.f15934a = i10;
        this.f15935b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15934a) {
            case 0:
                try {
                    this.f15935b.run();
                    return;
                } catch (Exception e) {
                    i6.b("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                this.f15935b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f15935b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f15934a) {
            case 1:
                return this.f15935b.toString();
            default:
                return super.toString();
        }
    }
}
