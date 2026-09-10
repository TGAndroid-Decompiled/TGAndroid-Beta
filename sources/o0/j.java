package o0;

import android.os.Process;
public final class j extends Thread {
    public final int f14104a;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f14104a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f14104a);
        super.run();
    }
}
