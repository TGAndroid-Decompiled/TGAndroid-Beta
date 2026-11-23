package m6;

import java.util.concurrent.Executor;
public final class d implements Executor {
    public static final d f20851b = new d(0);
    public static final d f20852c = new d(1);
    public final int f20853a;

    public d(int i7) {
        this.f20853a = i7;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f20853a) {
            case 0:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
