package bi;

import android.view.View;
public final class j implements e2.h {
    public final int f3143a;
    public final int f3144b;

    public j(int i10, int i11) {
        this.f3143a = i11;
        this.f3144b = i10;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f3143a) {
            case 0:
                u uVar = (u) ((View) obj);
                uVar.invalidate();
                uVar.f3806y.setTextColor(this.f3144b);
                return;
            case 1:
                ((m4.j1) obj).f0(this.f3144b);
                return;
            case 2:
                ((m4.j1) obj).N(this.f3144b);
                return;
            case 3:
                ((m4.j1) obj).j(this.f3144b);
                return;
            default:
                ((m4.j1) obj).D0(this.f3144b);
                return;
        }
    }
}
