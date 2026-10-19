package o0;

import android.os.Process;
public final class i extends Thread {
    public final int f17531a;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f17531a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f17531a);
        super.run();
    }
}
