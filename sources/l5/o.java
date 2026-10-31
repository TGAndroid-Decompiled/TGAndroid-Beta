package l5;

import android.os.Process;
import w7.n6;
public final class o implements Runnable {
    public final int f11675a;
    public final Runnable f11676b;

    public o(int i10, Runnable runnable) {
        this.f11675a = i10;
        this.f11676b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f11675a) {
            case 0:
                try {
                    this.f11676b.run();
                    return;
                } catch (Exception e) {
                    n6.b("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                this.f11676b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f11676b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f11675a) {
            case 1:
                return this.f11676b.toString();
            default:
                return super.toString();
        }
    }
}
