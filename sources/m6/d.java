package m6;

import java.util.concurrent.Executor;
public final class d implements Executor {
    public static final d f20493b = new d(0);
    public static final d f20494c = new d(1);
    public final int f20495a;

    public d(int i7) {
        this.f20495a = i7;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f20495a) {
            case 0:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
