package k1;

import java.io.FileInputStream;
public final class v extends sc.c {
    public z f14490a;
    public FileInputStream f14491b;
    public Object f14492c;
    public final z d;
    public int f14493e;

    public v(z zVar, sc.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14492c = obj;
        this.f14493e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
