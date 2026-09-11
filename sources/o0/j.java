package o0;

import android.os.Process;
public final class j extends Thread {
    public final int f16793a;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f16793a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f16793a);
        super.run();
    }
}
