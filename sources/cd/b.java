package cd;

import java.util.Random;
public final class b extends ThreadLocal {
    public final int f3034a;

    @Override
    public final Object initialValue() {
        switch (this.f3034a) {
            case 0:
                return new Random();
            case 1:
                return Boolean.FALSE;
            case 2:
                return 0L;
            default:
                ?? obj = new Object();
                obj.f49861a = new byte[4096];
                return obj;
        }
    }
}
