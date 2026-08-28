package o0;

import android.os.Process;
public final class j extends Thread {
    public final int f18769a;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f18769a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f18769a);
        super.run();
    }
}
