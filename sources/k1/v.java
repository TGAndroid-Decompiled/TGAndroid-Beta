package k1;

import java.io.FileInputStream;
public final class v extends ed.c {
    public z f10571a;
    public FileInputStream f10572b;
    public Object f10573c;
    public final z d;
    public int e;

    public v(z zVar, ed.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10573c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
