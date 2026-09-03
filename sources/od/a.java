package od;

import androidx.biometric.e0;
public final class a extends wc.c {
    public pd.g f16526a;
    public Object f16527b;
    public final e0 f16528c;
    public int d;

    public a(e0 e0Var, wc.c cVar) {
        super(cVar);
        this.f16528c = e0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16527b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f16528c.z(null, this);
    }
}
