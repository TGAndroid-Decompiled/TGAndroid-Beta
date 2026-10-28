package k1;

import java.io.FileInputStream;
public final class v extends nd.c {
    public z f16092a;
    public FileInputStream f16093b;
    public Object f16094c;
    public final z d;
    public int e;

    public v(z zVar, nd.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16094c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(this);
    }
}
