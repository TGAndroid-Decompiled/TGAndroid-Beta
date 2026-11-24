package defpackage;

import org.telegram.ui.ActionBar.ActionBarLayout;
public final class k6 extends x14 {
    public final ActionBarLayout a;

    public k6(ActionBarLayout actionBarLayout) {
        super(null);
        this.a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.a.invalidate();
    }
}
