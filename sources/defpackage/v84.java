package defpackage;

import java.util.Random;
public final class v84 extends ThreadLocal {
    public final byte a;

    @Override
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return new Random();
            case 1:
                ?? obj = new Object();
                obj.a = new byte[4096];
                return obj;
            case 2:
                return Long.valueOf(System.currentTimeMillis() - 1000);
            case 3:
                return Boolean.FALSE;
            default:
                return 0L;
        }
    }
}
