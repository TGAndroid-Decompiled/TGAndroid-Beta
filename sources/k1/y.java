package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class y extends ed.c {
    public z f10582a;
    public File f10583b;
    public FileOutputStream f10584c;
    public FileOutputStream d;
    public Object e;
    public final z f10585f;
    public int h;

    public y(z zVar, ed.c cVar) {
        super(cVar);
        this.f10585f = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f10585f.j(this, null);
    }
}
