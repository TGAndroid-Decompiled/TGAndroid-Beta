package defpackage;

import java.util.concurrent.Executor;
public final class rf2 implements Executor {
    public final byte a;
    public final Object b;

    public rf2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((mp3) obj).c(runnable);
                return;
            case 1:
                ((dfb) obj).e(runnable);
                return;
            case 2:
                ((tz4) obj).post(runnable);
                return;
            case 3:
                hac.X(((tx6) obj).l, runnable);
                return;
            case 4:
                ((ly6) obj).m0(runnable);
                return;
            case 5:
                ((oz6) obj).R(runnable);
                return;
            case 6:
                ((bq9) obj).b.post(runnable);
                return;
            default:
                ((np3) obj).postRunnable(runnable);
                return;
        }
    }
}
