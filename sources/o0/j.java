package o0;

import android.os.Process;
public final class j extends Thread {
    public final int f15331a;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f15331a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f15331a);
        super.run();
    }
}
