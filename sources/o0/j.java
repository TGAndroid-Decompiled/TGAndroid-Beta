package o0;

import android.os.Process;
public final class j extends Thread {
    public final int f16169a;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f16169a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f16169a);
        super.run();
    }
}
