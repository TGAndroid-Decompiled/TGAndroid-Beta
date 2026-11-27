package defpackage;
public final class cq7 extends sy9 {
    public final hq7 d;

    public cq7(hq7 hq7Var) {
        this.d = hq7Var;
    }

    @Override
    public final void c(boolean z) {
        this.d.a(!z);
    }

    @Override
    public final CharSequence d() {
        hq7 hq7Var = this.d;
        qcc qccVar = hq7Var.v0;
        int i = hq7Var.I;
        if (qccVar != null) {
            return (CharSequence) qccVar.a(Integer.valueOf(i));
        }
        return hq7Var.d(i);
    }
}
