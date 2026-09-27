package o0;

import android.os.Process;
public final class k extends Thread {
    public final int f15542a;

    public k(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f15542a = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.f15542a);
        super.run();
    }
}
