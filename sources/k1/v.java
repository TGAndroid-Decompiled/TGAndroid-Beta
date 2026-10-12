package k1;

import java.io.FileInputStream;
public final class v extends md.c {
    public z f13812a;
    public FileInputStream f13813b;
    public Object f13814c;
    public final z d;
    public int e;

    public v(z zVar, md.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13814c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
