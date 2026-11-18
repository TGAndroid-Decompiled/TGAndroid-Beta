package ki;

import org.telegram.ui.ActionBar.t4;
public final class w extends t4 {
    public final z f19005p;

    public w(z zVar) {
        this.f19005p = zVar;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f19005p.invalidate();
    }
}
