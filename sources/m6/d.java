package m6;

import java.util.concurrent.Executor;
public final class d implements Executor {
    public static final d f19896b = new d(0);
    public static final d f19897c = new d(1);
    public final int f19898a;

    public d(int i7) {
        this.f19898a = i7;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f19898a) {
            case 0:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
