package l1;

import java.io.FileOutputStream;
public final class j0 extends hd.c {
    public FileOutputStream f17567a;
    public FileOutputStream f17568b;
    public Object f17569c;
    public final k0 d;
    public int f17570e;

    public j0(k0 k0Var, hd.c cVar) {
        super(cVar);
        this.d = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17569c = obj;
        this.f17570e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
