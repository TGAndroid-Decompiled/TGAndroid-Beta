package ki;

import org.telegram.ui.ActionBar.s4;
public final class v extends s4 {
    public final y f19012p;

    public v(y yVar) {
        this.f19012p = yVar;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.f19012p.invalidate();
    }
}
