package o0;

import android.os.Process;
public final class i extends Thread {
    public final int f16658a;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f16658a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f16658a);
        super.run();
    }
}
