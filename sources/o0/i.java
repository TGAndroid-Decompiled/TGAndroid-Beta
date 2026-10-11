package o0;

import android.os.Process;
public final class i extends Thread {
    public final int f16992a;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f16992a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f16992a);
        super.run();
    }
}
