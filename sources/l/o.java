package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
public final class o extends FrameLayout implements k.b {
    public final CollapsibleActionView f17466a;

    public o(View view) {
        super(view.getContext());
        this.f17466a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override
    public final void onActionViewCollapsed() {
        this.f17466a.onActionViewCollapsed();
    }

    @Override
    public final void onActionViewExpanded() {
        this.f17466a.onActionViewExpanded();
    }
}
