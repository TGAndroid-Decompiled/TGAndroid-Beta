package k1;

import java.io.FileInputStream;
public final class v extends nd.c {
    public z f16093a;
    public FileInputStream f16094b;
    public Object f16095c;
    public final z d;
    public int e;

    public v(z zVar, nd.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16095c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(this);
    }
}
