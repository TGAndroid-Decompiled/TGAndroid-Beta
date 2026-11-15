package o0;

import android.os.Process;
public final class i extends Thread {
    public final int f21216a;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f21216a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f21216a);
        super.run();
    }
}
