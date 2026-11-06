package hi;

import org.telegram.ui.ActionBar.r4;
public final class v extends r4 {
    public final y f14978p;

    public v(y yVar) {
        this.f14978p = yVar;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f14978p.invalidate();
    }
}
