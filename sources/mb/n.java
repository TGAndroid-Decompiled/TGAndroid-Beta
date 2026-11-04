package mb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f19247a;
    public final Runnable f19248b;

    public n(int i3, Runnable runnable) {
        this.f19247a = i3;
        this.f19248b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19247a) {
            case 0:
                Deque deque = (Deque) h.f19233b.get();
                p6.m.g(deque);
                Runnable runnable = this.f19248b;
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
                h.f19233b.set(new ArrayDeque());
                this.f19248b.run();
                return;
        }
    }
}
