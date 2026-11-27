package defpackage;

import org.telegram.ui.ActionBar.ActionBarLayout;
public final class l6 extends s24 {
    public final ActionBarLayout a;

    public l6(ActionBarLayout actionBarLayout) {
        super(null);
        this.a = actionBarLayout;
    }

    @Override
    public final void updateSheetsVisibility() {
        super.updateSheetsVisibility();
        this.a.invalidate();
    }
}
