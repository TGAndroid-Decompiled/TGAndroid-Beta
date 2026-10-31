package jb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f9799a;
    public final Runnable f9800b;

    public n(int i10, Runnable runnable) {
        this.f9799a = i10;
        this.f9800b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f9799a) {
            case 0:
                Deque deque = (Deque) h.f9785b.get();
                n6.l.g(deque);
                Runnable runnable = this.f9800b;
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
                h.f9785b.set(new ArrayDeque());
                this.f9800b.run();
                return;
        }
    }
}
