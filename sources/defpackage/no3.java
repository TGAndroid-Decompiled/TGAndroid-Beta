package defpackage;

import java.util.concurrent.Executor;
public final class no3 implements Executor {
    public static final no3 b = new no3((byte) 0);
    public static final no3 c = new no3((byte) 1);
    public static final no3 d = new no3((byte) 2);
    public static final no3 e = new no3((byte) 3);
    public final byte a;

    public no3(byte b2) {
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
