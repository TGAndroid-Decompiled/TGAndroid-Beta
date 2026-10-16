package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class y extends md.c {
    public z f13825a;
    public File f13826b;
    public FileOutputStream f13827c;
    public FileOutputStream d;
    public Object e;
    public final z f13828f;
    public int h;

    public y(z zVar, md.c cVar) {
        super(cVar);
        this.f13828f = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f13828f.j(null, this);
    }
}
