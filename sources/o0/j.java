package o0;

import android.os.Process;
public final class j extends Thread {
    public final int f20498a;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f20498a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f20498a);
        super.run();
    }
}
