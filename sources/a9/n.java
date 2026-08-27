package a9;

import android.os.Process;

public final class n implements Runnable {

    public final int f185a;

    public final Runnable f186b;

    public n(int i10, Runnable runnable) {
        this.f185a = i10;
        this.f186b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f185a) {
            case 0:
                this.f186b.run();
                break;
            case 1:
                Process.setThreadPriority(0);
                this.f186b.run();
                break;
            default:
                try {
                    this.f186b.run();
                } catch (Exception e9) {
                    a.a.b("Executor", "Background execution failure.", e9);
                    return;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f185a) {
            case 0:
                return this.f186b.toString();
            default:
                return super.toString();
        }
    }
}
