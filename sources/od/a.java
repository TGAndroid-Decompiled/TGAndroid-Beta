package od;

import androidx.biometric.f0;
public final class a extends wc.c {
    public pd.g f16714a;
    public Object f16715b;
    public final f0 f16716c;
    public int d;

    public a(f0 f0Var, wc.c cVar) {
        super(cVar);
        this.f16716c = f0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16715b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f16716c.x(null, this);
    }
}
