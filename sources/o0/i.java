package o0;

import android.os.Process;
public final class i extends Thread {
    public final int f17525a;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f17525a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f17525a);
        super.run();
    }
}
