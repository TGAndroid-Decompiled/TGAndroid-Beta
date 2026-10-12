package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class y extends md.c {
    public z f13822a;
    public File f13823b;
    public FileOutputStream f13824c;
    public FileOutputStream d;
    public Object e;
    public final z f13825f;
    public int h;

    public y(z zVar, md.c cVar) {
        super(cVar);
        this.f13825f = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f13825f.j(null, this);
    }
}
