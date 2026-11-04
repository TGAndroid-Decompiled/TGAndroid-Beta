package l1;

import java.io.FileInputStream;
public final class c0 extends hd.c {
    public Object f17506a;
    public FileInputStream f17507b;
    public Object f17508c;
    public final d0 d;
    public int f17509e;

    public c0(d0 d0Var, hd.c cVar) {
        super(cVar);
        this.d = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17508c = obj;
        this.f17509e |= Integer.MIN_VALUE;
        return d0.a(this.d, this);
    }
}
