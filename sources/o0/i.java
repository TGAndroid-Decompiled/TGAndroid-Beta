package o0;

import android.os.Process;
public final class i extends Thread {
    public final int f21608a;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f21608a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f21608a);
        super.run();
    }
}
