package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class y extends sc.c {
    public z f14503a;
    public File f14504b;
    public FileOutputStream f14505c;
    public FileOutputStream d;
    public Object f14506e;
    public final z f14507f;
    public int h;

    public y(z zVar, sc.c cVar) {
        super(cVar);
        this.f14507f = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14506e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f14507f.j(null, this);
    }
}
