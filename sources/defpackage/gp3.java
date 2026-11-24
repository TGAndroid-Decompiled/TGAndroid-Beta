package defpackage;

import java.util.concurrent.Executor;
public final class gp3 implements Executor {
    public static final gp3 b = new gp3((byte) 0);
    public static final gp3 c = new gp3((byte) 1);
    public static final gp3 d = new gp3((byte) 2);
    public static final gp3 e = new gp3((byte) 3);
    public final byte a;

    public gp3(byte b2) {
        this.a = b2;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                return;
            case 1:
                runnable.run();
                return;
            case 2:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
