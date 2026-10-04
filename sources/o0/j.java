package o0;

import android.os.Process;
public final class j extends Thread {
    public final int f16952a;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f16952a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f16952a);
        super.run();
    }
}
