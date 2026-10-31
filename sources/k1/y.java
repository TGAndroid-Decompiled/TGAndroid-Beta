package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class y extends ed.c {
    public z f10581a;
    public File f10582b;
    public FileOutputStream f10583c;
    public FileOutputStream d;
    public Object e;
    public final z f10584f;
    public int h;

    public y(z zVar, ed.c cVar) {
        super(cVar);
        this.f10584f = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f10584f.j(this, null);
    }
}
