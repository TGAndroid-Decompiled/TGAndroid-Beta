package defpackage;

import java.util.concurrent.Executor;
public final class pe2 implements Executor {
    public final byte a;
    public final Object b;

    public pe2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((to3) obj).c(runnable);
                return;
            case 1:
                ((xgb) obj).e(runnable);
                return;
            case 2:
                ((xz4) obj).post(runnable);
                return;
            case 3:
                gcc.X(((yx6) obj).l, runnable);
                return;
            case 4:
                ((qy6) obj).m0(runnable);
                return;
            case 5:
                ((sz6) obj).R(runnable);
                return;
            case 6:
                ((rr9) obj).b.post(runnable);
                return;
            default:
                ((uo3) obj).postRunnable(runnable);
                return;
        }
    }
}
