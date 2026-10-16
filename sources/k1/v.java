package k1;

import java.io.FileInputStream;
public final class v extends md.c {
    public z f13815a;
    public FileInputStream f13816b;
    public Object f13817c;
    public final z d;
    public int e;

    public v(z zVar, md.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13817c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
