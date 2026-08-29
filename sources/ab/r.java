package ab;

import java.util.ArrayDeque;
import java.util.Deque;
public final class r implements Runnable {
    public final int f335a;
    public final Runnable f336b;

    public r(int i10, Runnable runnable) {
        this.f335a = i10;
        this.f336b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f335a) {
            case 0:
                Deque deque = (Deque) i.f313b.get();
                z5.l.h(deque);
                Runnable runnable = this.f336b;
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
                i.f313b.set(new ArrayDeque());
                this.f336b.run();
                return;
        }
    }
}
