package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
public final class l27 extends FrameLayout implements ml2 {
    public final CollapsibleActionView a;

    public l27(View view) {
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
