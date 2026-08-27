package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

public final class p extends FrameLayout implements k.b {

    public final CollapsibleActionView f15359a;

    public p(View view) {
        super(view.getContext());
        this.f15359a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override
    public final void onActionViewCollapsed() {
        this.f15359a.onActionViewCollapsed();
    }

    @Override
    public final void onActionViewExpanded() {
        this.f15359a.onActionViewExpanded();
    }
}
