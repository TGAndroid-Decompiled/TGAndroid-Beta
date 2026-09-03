package cb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class p implements Runnable {
    public final int f2262a;
    public final Runnable f2263b;

    public p(int i10, Runnable runnable) {
        this.f2262a = i10;
        this.f2263b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f2262a) {
            case 0:
                Deque deque = (Deque) i.f2245b.get();
                b6.m.h(deque);
                Runnable runnable = this.f2263b;
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
                i.f2245b.set(new ArrayDeque());
                this.f2263b.run();
                return;
        }
    }
}
