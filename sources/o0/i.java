package o0;

import android.os.Process;
public final class i extends Thread {
    public final int f17532a;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f17532a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f17532a);
        super.run();
    }
}
