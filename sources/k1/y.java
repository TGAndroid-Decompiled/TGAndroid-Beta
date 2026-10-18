package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class y extends md.c {
    public z f14625a;
    public File f14626b;
    public FileOutputStream f14627c;
    public FileOutputStream d;
    public Object e;
    public final z f14628f;
    public int h;

    public y(z zVar, md.c cVar) {
        super(cVar);
        this.f14628f = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f14628f.j(null, this);
    }
}
