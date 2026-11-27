package defpackage;

import android.os.Process;
import java.util.ArrayDeque;
import java.util.Deque;
public final class ps9 implements Runnable {
    public final byte a;
    public final Runnable b;

    public ps9(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                try {
                    runnable.run();
                    return;
                } catch (Exception e) {
                    pse.b("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                runnable.run();
                return;
            case 2:
                Process.setThreadPriority(0);
                runnable.run();
                return;
            case 3:
                Deque deque = (Deque) mg7.b.get();
                xve.h(deque);
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                    return;
                }
                return;
            default:
                mg7.b.set(new ArrayDeque());
                runnable.run();
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
