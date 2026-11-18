package o0;

import android.os.Process;
public final class i extends Thread {
    public final int f21580a;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f21580a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f21580a);
        super.run();
    }
}
