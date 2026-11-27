package defpackage;

import android.os.Process;
public final class vb9 extends Thread {
    public final byte a;

    public vb9(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.a = (byte) 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
