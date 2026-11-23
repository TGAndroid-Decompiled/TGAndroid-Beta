package ki;

import org.telegram.ui.ActionBar.s4;
public final class v extends s4 {
    public final y f18981p;

    public v(y yVar) {
        this.f18981p = yVar;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f18981p.invalidate();
    }
}
