package ad;

import java.util.Random;
public final class b extends ThreadLocal {
    public final int f145a;

    @Override
    public final Object initialValue() {
        switch (this.f145a) {
            case 0:
                return new Random();
            case 1:
                return Boolean.FALSE;
            case 2:
                return 0L;
            default:
                ?? obj = new Object();
                obj.f47812a = new byte[4096];
                return obj;
        }
    }
}
