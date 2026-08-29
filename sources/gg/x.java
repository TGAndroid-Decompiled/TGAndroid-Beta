package gg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.lv0;
public final class x extends FrameLayout {
    public final lv0 f7348a;

    public x(Context context, c6 c6Var) {
        super(context);
        View view = new View(context);
        addView(view, f6.n(-1, -1));
        view.setBackgroundColor(g6.v0(g6.f23133h5, c6Var));
        lv0 lv0Var = new lv0(context, c6Var);
        this.f7348a = lv0Var;
        addView(lv0Var, f6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(g6.V0(getContext(), R.drawable.greydivider_top, g6.f23028b7));
    }

    public void setCallBack(kv0 kv0Var) {
        this.f7348a.setCallback(kv0Var);
    }
}
