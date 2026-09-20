package ci;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.rk;
import org.telegram.ui.Components.hj0;
public final class k4 extends FrameLayout {
    public static final int d = 0;
    public final org.telegram.ui.Components.v9 f4881a;
    public final d f4882b;
    public boolean f4883c;

    public k4(Context context) {
        super(context);
        LinearLayout f7 = rk.f(context, 1);
        addView(f7, w7.y5.e(-2, -2, 17));
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(context);
        this.f4881a = v9Var;
        f7.addView(v9Var, w7.y5.q(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.LiveStoryDisconnected));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        f7.addView(textView, w7.y5.t(-2, -2, 1, 0, 8, 0, 0));
        d dVar = new d(context, null, true);
        this.f4882b = dVar;
        dVar.g(LocaleController.getString(R.string.LiveStoryDisconnectedContinue), false, true);
        f7.addView(dVar, w7.y5.t((int) ((dVar.d.e() + AndroidUtilities.dp(24.0f)) / AndroidUtilities.density), 38, 1, 0, 18, 0, 0));
        dVar.setOnClickListener(new ai.e2(1));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && !this.f4883c) {
            this.f4881a.setImageDrawable(new hj0(R.raw.utyan_empty2, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
            this.f4883c = true;
        }
    }
}
