package i9;

import android.os.Process;
public abstract class d implements Runnable {
    public abstract void a();

    @Override
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
