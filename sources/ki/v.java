package ki;

import org.telegram.ui.ActionBar.s4;
public final class v extends s4 {
    public final y f19078p;

    public v(y yVar) {
        this.f19078p = yVar;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f19078p.invalidate();
    }
}
