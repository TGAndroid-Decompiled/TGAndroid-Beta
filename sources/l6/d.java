package l6;

import java.util.concurrent.Executor;
public final class d implements Executor {
    public static final d f18065b = new d(0);
    public static final d f18066c = new d(1);
    public final int f18067a;

    public d(int i3) {
        this.f18067a = i3;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f18067a) {
            case 0:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
