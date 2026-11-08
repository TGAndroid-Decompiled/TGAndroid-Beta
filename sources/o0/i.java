package o0;

import android.os.Process;
public final class i extends Thread {
    public final int f20695a;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f20695a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f20695a);
        super.run();
    }
}
