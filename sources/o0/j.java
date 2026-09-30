package o0;

import android.os.Process;
public final class j extends Thread {
    public final int f15519a;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f15519a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f15519a);
        super.run();
    }
}
