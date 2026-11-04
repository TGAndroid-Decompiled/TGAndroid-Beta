package n5;

import android.os.Process;
public final class o implements Runnable {
    public final int f20257a;
    public final Runnable f20258b;

    public o(int i3, Runnable runnable) {
        this.f20257a = i3;
        this.f20258b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20257a) {
            case 0:
                try {
                    this.f20258b.run();
                    return;
                } catch (Exception e10) {
                    x7.m.b("Executor", "Background execution failure.", e10);
                    return;
                }
            case 1:
                this.f20258b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f20258b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f20257a) {
            case 1:
                return this.f20258b.toString();
            default:
                return super.toString();
        }
    }
}
