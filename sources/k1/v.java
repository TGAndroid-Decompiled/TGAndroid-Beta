package k1;

import java.io.FileInputStream;
public final class v extends md.c {
    public z f14660a;
    public FileInputStream f14661b;
    public Object f14662c;
    public final z d;
    public int e;

    public v(z zVar, md.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14662c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
