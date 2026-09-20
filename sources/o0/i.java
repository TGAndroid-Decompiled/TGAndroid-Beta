package o0;

import android.os.Process;
public final class i extends Thread {
    public final int f15492a;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f15492a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f15492a);
        super.run();
    }
}
