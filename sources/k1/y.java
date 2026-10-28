package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class y extends nd.c {
    public z f16102a;
    public File f16103b;
    public FileOutputStream f16104c;
    public FileOutputStream d;
    public Object e;
    public final z f16105f;
    public int h;

    public y(z zVar, nd.c cVar) {
        super(cVar);
        this.f16105f = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f16105f.i(null, this);
    }
}
