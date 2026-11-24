package defpackage;

import java.util.concurrent.ThreadFactory;
public final class sq2 implements ThreadFactory {
    public final byte a;
    public final String b;

    public sq2(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, str);
        }
    }
}
