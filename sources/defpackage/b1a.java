package defpackage;

import android.content.Context;
public final class b1a extends t2b {
    public final e0a H3;

    public b1a(e0a e0aVar, Context context, int i, vnb vnbVar) {
        super(i, vnbVar, context);
        this.H3 = e0aVar;
    }

    @Override
    public final boolean C1() {
        if (!i86.e(16388) && this.H3.G.a0 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void I1(int i) {
        super.I1(i);
        this.H3.d(false);
    }
}
