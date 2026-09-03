package jg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.uv0;
public final class x extends FrameLayout {
    public final uv0 f10078a;

    public x(Context context, g6 g6Var) {
        super(context);
        View view = new View(context);
        addView(view, c6.n(-1, -1));
        view.setBackgroundColor(k6.v0(k6.f21733h5, g6Var));
        uv0 uv0Var = new uv0(context, g6Var);
        this.f10078a = uv0Var;
        addView(uv0Var, c6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(k6.V0(getContext(), R.drawable.greydivider_top, k6.f21626b7));
    }

    public void setCallBack(tv0 tv0Var) {
        this.f10078a.setCallback(tv0Var);
    }
}
