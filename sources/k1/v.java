package k1;

import java.io.FileInputStream;
public final class v extends md.c {
    public z f14616a;
    public FileInputStream f14617b;
    public Object f14618c;
    public final z d;
    public int e;

    public v(z zVar, md.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14618c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(this);
    }
}
