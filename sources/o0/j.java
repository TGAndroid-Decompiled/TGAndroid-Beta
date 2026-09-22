package o0;

import android.os.Process;
public final class j extends Thread {
    public final int f15507a;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f15507a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f15507a);
        super.run();
    }
}
