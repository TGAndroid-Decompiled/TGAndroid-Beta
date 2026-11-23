package m6;

import java.util.concurrent.Executor;
public final class d implements Executor {
    public static final d f20885b = new d(0);
    public static final d f20886c = new d(1);
    public final int f20887a;

    public d(int i7) {
        this.f20887a = i7;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f20887a) {
            case 0:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
