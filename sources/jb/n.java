package jb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f9800a;
    public final Runnable f9801b;

    public n(int i10, Runnable runnable) {
        this.f9800a = i10;
        this.f9801b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f9800a) {
            case 0:
                Deque deque = (Deque) h.f9786b.get();
                n6.l.g(deque);
                Runnable runnable = this.f9801b;
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
                h.f9786b.set(new ArrayDeque());
                this.f9801b.run();
                return;
        }
    }
}
