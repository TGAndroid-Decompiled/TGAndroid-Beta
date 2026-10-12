package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
public final class o extends FrameLayout implements k.b {
    public final CollapsibleActionView f14460a;

    public o(View view) {
        super(view.getContext());
        this.f14460a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override
    public final void onActionViewCollapsed() {
        this.f14460a.onActionViewCollapsed();
    }

    @Override
    public final void onActionViewExpanded() {
        this.f14460a.onActionViewExpanded();
    }
}
