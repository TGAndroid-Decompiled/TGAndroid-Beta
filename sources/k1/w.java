package k1;

import java.io.FileInputStream;
public final class w extends kd.c {
    public a0 f13210a;
    public FileInputStream f13211b;
    public Object f13212c;
    public final a0 d;
    public int e;

    public w(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13212c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
