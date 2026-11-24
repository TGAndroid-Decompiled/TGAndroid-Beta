package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
public final class e07 extends FrameLayout implements sk2 {
    public final CollapsibleActionView a;

    public e07(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}
