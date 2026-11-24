package defpackage;

import java.util.concurrent.Executor;
public final class wn3 implements Executor {
    public static final wn3 b = new wn3((byte) 0);
    public static final wn3 c = new wn3((byte) 1);
    public static final wn3 d = new wn3((byte) 2);
    public static final wn3 e = new wn3((byte) 3);
    public final byte a;

    public wn3(byte b2) {
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
