package k1;

import java.io.File;
import java.io.FileOutputStream;
public final class y extends nd.c {
    public z f16103a;
    public File f16104b;
    public FileOutputStream f16105c;
    public FileOutputStream d;
    public Object e;
    public final z f16106f;
    public int h;

    public y(z zVar, nd.c cVar) {
        super(cVar);
        this.f16106f = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f16106f.i(null, this);
    }
}
