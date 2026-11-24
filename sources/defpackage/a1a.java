package defpackage;

import android.content.Context;
public final class a1a extends j1a {
    public final b1a L;

    public a1a(b1a b1aVar, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.L = b1aVar;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = getMeasuredHeight();
        b1a b1aVar = this.L;
        b1aVar.k2 = gm.L(78.0f) + measuredHeight;
        b1aVar.j2.G();
    }
}
