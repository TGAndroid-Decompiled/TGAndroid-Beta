package bi;

import android.view.View;
public final class j implements e2.h {
    public final int f3116a;
    public final int f3117b;

    public j(int i10, int i11) {
        this.f3116a = i11;
        this.f3117b = i10;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f3116a) {
            case 0:
                u uVar = (u) ((View) obj);
                uVar.invalidate();
                uVar.f3779y.setTextColor(this.f3117b);
                return;
            case 1:
                ((m4.j1) obj).f0(this.f3117b);
                return;
            case 2:
                ((m4.j1) obj).N(this.f3117b);
                return;
            case 3:
                ((m4.j1) obj).j(this.f3117b);
                return;
            default:
                ((m4.j1) obj).D0(this.f3117b);
                return;
        }
    }
}
