package o0;

import android.os.Process;
public final class i extends Thread {
    public final int f18940a;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f18940a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f18940a);
        super.run();
    }
}
