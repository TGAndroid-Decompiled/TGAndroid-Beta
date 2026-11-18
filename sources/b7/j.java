package b7;

import java.util.Random;
public final class j extends ThreadLocal {
    public final int f2958a;

    @Override
    public final Object initialValue() {
        switch (this.f2958a) {
            case 0:
                return 0L;
            case 1:
                return Boolean.FALSE;
            case 2:
                return Long.valueOf(System.currentTimeMillis() - 1000);
            case 3:
                return new Random();
            default:
                ?? obj = new Object();
                obj.f57695a = new byte[4096];
                return obj;
        }
    }
}
