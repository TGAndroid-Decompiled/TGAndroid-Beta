package k1;

import java.io.FileInputStream;
public final class w extends uc.c {
    public a0 f13310a;
    public FileInputStream f13311b;
    public Object f13312c;
    public final a0 d;
    public int f13313e;

    public w(a0 a0Var, uc.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13312c = obj;
        this.f13313e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
