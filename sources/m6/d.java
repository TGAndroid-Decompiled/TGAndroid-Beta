package m6;

import java.util.concurrent.Executor;
public final class d implements Executor {
    public static final d f20857b = new d(0);
    public static final d f20858c = new d(1);
    public final int f20859a;

    public d(int i7) {
        this.f20859a = i7;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f20859a) {
            case 0:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
