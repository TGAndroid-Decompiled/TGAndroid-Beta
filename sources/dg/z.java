package dg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.bv0;
public final class z extends FrameLayout {
    public final bv0 f4566a;

    public z(Context context, b6 b6Var) {
        super(context);
        View view = new View(context);
        addView(view, e6.n(-1, -1));
        view.setBackgroundColor(f6.v0(f6.f23072h5, b6Var));
        bv0 bv0Var = new bv0(context, b6Var);
        this.f4566a = bv0Var;
        addView(bv0Var, e6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(f6.V0(getContext(), R.drawable.greydivider_top, f6.f22966b7));
    }

    public void setCallBack(av0 av0Var) {
        this.f4566a.setCallback(av0Var);
    }
}
