package bd;

import java.util.Random;

public final class b extends ThreadLocal {

    public final int f2073a;

    @Override
    public final Object initialValue() {
        switch (this.f2073a) {
            case 0:
                return new Random();
            case 1:
                return Boolean.FALSE;
            case 2:
                return 0L;
            default:
                ue.d dVar = new ue.d();
                dVar.f48534a = new byte[4096];
                return dVar;
        }
    }
}
