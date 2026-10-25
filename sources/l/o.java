package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
public final class o extends FrameLayout implements k.b {
    public final CollapsibleActionView f16766a;

    public o(View view) {
        super(view.getContext());
        this.f16766a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override
    public final void onActionViewCollapsed() {
        this.f16766a.onActionViewCollapsed();
    }

    @Override
    public final void onActionViewExpanded() {
        this.f16766a.onActionViewExpanded();
    }
}
