package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class y extends md.c {
    public z f14620a;
    public File f14621b;
    public FileOutputStream f14622c;
    public FileOutputStream d;
    public Object e;
    public final z f14623f;
    public int h;

    public y(z zVar, md.c cVar) {
        super(cVar);
        this.f14623f = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f14623f.j(null, this);
    }
}
