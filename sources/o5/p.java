package o5;

import android.os.Process;
import c8.dc;
public final class p implements Runnable {
    public final int f21360a;
    public final Runnable f21361b;

    public p(int i7, Runnable runnable) {
        this.f21360a = i7;
        this.f21361b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21360a) {
            case 0:
                try {
                    this.f21361b.run();
                    return;
                } catch (Exception e10) {
                    dc.b("Executor", "Background execution failure.", e10);
                    return;
                }
            case 1:
                this.f21361b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f21361b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f21360a) {
            case 1:
                return this.f21361b.toString();
            default:
                return super.toString();
        }
    }
}
