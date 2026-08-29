package o0;

import android.os.Process;
public final class k extends Thread {
    public final int f19012a;

    public k(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f19012a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f19012a);
        super.run();
    }
}
