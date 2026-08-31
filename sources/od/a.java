package od;

import androidx.biometric.f0;
public final class a extends wc.c {
    public pd.g f16712a;
    public Object f16713b;
    public final f0 f16714c;
    public int d;

    public a(f0 f0Var, wc.c cVar) {
        super(cVar);
        this.f16714c = f0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16713b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f16714c.x(null, this);
    }
}
