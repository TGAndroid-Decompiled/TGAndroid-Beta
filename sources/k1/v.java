package k1;

import java.io.FileInputStream;

public final class v extends tc.c {

    public z f14311a;

    public FileInputStream f14312b;

    public Object f14313c;
    public final z d;

    public int f14314e;

    public v(z zVar, tc.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14313c = obj;
        this.f14314e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
