package m4;

import android.view.View;
public final class o0 implements e2.h {
    public final int f14628a;
    public final boolean f14629b;

    public o0(int i10, boolean z10) {
        this.f14628a = i10;
        this.f14629b = z10;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f14628a) {
            case 0:
                ((k1) obj).X(this.f14629b);
                return;
            case 1:
                ((k1) obj).o0(this.f14629b);
                return;
            case 2:
                ((k1) obj).x(this.f14629b);
                return;
            default:
                View view = (View) obj;
                if (view instanceof xg.l) {
                    ((xg.l) view).g(this.f14629b, true);
                    return;
                }
                return;
        }
    }
}
