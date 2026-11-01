package og;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.zu0;
import w7.b6;
public final class x extends FrameLayout {
    public final zu0 f14235a;
    public final View f14236b;

    public x(Context context, p6 p6Var) {
        super(context);
        View view = new View(context);
        this.f14236b = view;
        addView(view, b6.o(-1, -1));
        a7.i(t6.f21002h5, view, p6Var);
        zu0 zu0Var = new zu0(context, p6Var);
        this.f14235a = zu0Var;
        addView(zu0Var, b6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        a7.a0(this, getContext(), 2131231232, t6.f20893b7);
    }

    public void setCallBack(yu0 yu0Var) {
        this.f14235a.setCallback(yu0Var);
    }
}
