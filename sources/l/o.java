package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
public final class o extends FrameLayout implements k.b {
    public final CollapsibleActionView f15863a;

    public o(View view) {
        super(view.getContext());
        this.f15863a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override
    public final void onActionViewCollapsed() {
        this.f15863a.onActionViewCollapsed();
    }

    @Override
    public final void onActionViewExpanded() {
        this.f15863a.onActionViewExpanded();
    }
}
