package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class y extends md.c {
    public z f14626a;
    public File f14627b;
    public FileOutputStream f14628c;
    public FileOutputStream d;
    public Object e;
    public final z f14629f;
    public int h;

    public y(z zVar, md.c cVar) {
        super(cVar);
        this.f14629f = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f14629f.j(null, this);
    }
}
