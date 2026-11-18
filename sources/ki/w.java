package ki;

import org.telegram.ui.ActionBar.t4;
public final class w extends t4 {
    public final z f19002p;

    public w(z zVar) {
        this.f19002p = zVar;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f19002p.invalidate();
    }
}
