package defpackage;

import android.content.Context;
public final class s2a extends b3a {
    public final t2a L;

    public s2a(t2a t2aVar, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.L = t2aVar;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = getMeasuredHeight();
        t2a t2aVar = this.L;
        t2aVar.k2 = hl.L(78.0f) + measuredHeight;
        t2aVar.j2.G();
    }
}
