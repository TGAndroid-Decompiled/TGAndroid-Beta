package o0;

import android.os.Process;
public final class i extends Thread {
    public final int f16906a;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f16906a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f16906a);
        super.run();
    }
}
