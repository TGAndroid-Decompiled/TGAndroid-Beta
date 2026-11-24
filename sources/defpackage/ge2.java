package defpackage;

import java.util.concurrent.Executor;
public final class ge2 implements Executor {
    public final byte a;
    public final Object b;

    public ge2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((co3) obj).c(runnable);
                return;
            case 1:
                ((cdb) obj).e(runnable);
                return;
            case 2:
                ((rx4) obj).post(runnable);
                return;
            case 3:
                g8c.X(((tv6) obj).l, runnable);
                return;
            case 4:
                ((lw6) obj).m0(runnable);
                return;
            case 5:
                ((ox6) obj).R(runnable);
                return;
            case 6:
                ((ao9) obj).b.post(runnable);
                return;
            default:
                ((do3) obj).postRunnable(runnable);
                return;
        }
    }
}
