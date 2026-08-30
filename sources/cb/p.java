package cb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class p implements Runnable {
    public final int f2239a;
    public final Runnable f2240b;

    public p(int i10, Runnable runnable) {
        this.f2239a = i10;
        this.f2240b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f2239a) {
            case 0:
                Deque deque = (Deque) i.f2222b.get();
                b6.m.h(deque);
                Runnable runnable = this.f2240b;
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
                i.f2222b.set(new ArrayDeque());
                this.f2240b.run();
                return;
        }
    }
}
