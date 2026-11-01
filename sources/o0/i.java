package o0;

import android.os.Process;
public final class i extends Thread {
    public final int f13929a;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f13929a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f13929a);
        super.run();
    }
}
