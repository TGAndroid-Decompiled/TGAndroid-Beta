package hi;

import org.telegram.ui.ActionBar.r4;
public final class v extends r4 {
    public final y f14981p;

    public v(y yVar) {
        this.f14981p = yVar;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f14981p.invalidate();
    }
}
