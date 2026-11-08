package o5;

import android.os.Process;
import c8.cc;
public final class o implements Runnable {
    public final int f20838a;
    public final Runnable f20839b;

    public o(int i7, Runnable runnable) {
        this.f20838a = i7;
        this.f20839b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20838a) {
            case 0:
                try {
                    this.f20839b.run();
                    return;
                } catch (Exception e10) {
                    cc.b("Executor", "Background execution failure.", e10);
                    return;
                }
            case 1:
                this.f20839b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f20839b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f20838a) {
            case 1:
                return this.f20839b.toString();
            default:
                return super.toString();
        }
    }
}
