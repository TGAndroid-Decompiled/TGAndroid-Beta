package eg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.dv0;

public final class y extends FrameLayout {

    public final dv0 f5457a;

    public y(Context context, c6 c6Var) {
        super(context);
        View view = new View(context);
        addView(view, z5.n(-1, -1));
        view.setBackgroundColor(g6.v0(g6.f23124h5, c6Var));
        dv0 dv0Var = new dv0(context, c6Var);
        this.f5457a = dv0Var;
        addView(dv0Var, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(g6.V0(getContext(), R.drawable.greydivider_top, g6.f23018b7));
    }

    public void setCallBack(cv0 cv0Var) {
        this.f5457a.setCallback(cv0Var);
    }
}
