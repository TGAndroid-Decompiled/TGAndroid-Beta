package o0;

import android.os.Process;
public final class j extends Thread {
    public final int f16961a;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f16961a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f16961a);
        super.run();
    }
}
