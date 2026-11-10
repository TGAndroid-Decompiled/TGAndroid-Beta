package hi;

import org.telegram.ui.ActionBar.s4;
public final class v extends s4 {
    public final y f14983p;

    public v(y yVar) {
        this.f14983p = yVar;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f14983p.invalidate();
    }
}
