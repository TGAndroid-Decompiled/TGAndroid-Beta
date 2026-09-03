package ig;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.uv0;
public final class x extends FrameLayout {
    public final uv0 f7535a;

    public x(Context context, f6 f6Var) {
        super(context);
        View view = new View(context);
        addView(view, b6.n(-1, -1));
        view.setBackgroundColor(j6.v0(j6.f19952h5, f6Var));
        uv0 uv0Var = new uv0(context, f6Var);
        this.f7535a = uv0Var;
        addView(uv0Var, b6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(j6.V0(getContext(), R.drawable.greydivider_top, j6.f19846b7));
    }

    public void setCallBack(tv0 tv0Var) {
        this.f7535a.setCallback(tv0Var);
    }
}
