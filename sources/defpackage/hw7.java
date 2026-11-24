package defpackage;
public final class hw7 implements fw2 {
    public final wm1 a;

    public hw7(wm1 wm1Var) {
        this.a = wm1Var;
    }

    @Override
    public final sw2 getContext() {
        return z14.a;
    }

    @Override
    public final void resumeWith(Object obj) {
        boolean z = obj instanceof sa9;
        wm1 wm1Var = this.a;
        if (z) {
            wm1Var.a(null, ((sa9) obj).a);
        } else {
            wm1Var.a(obj, null);
        }
    }
}
