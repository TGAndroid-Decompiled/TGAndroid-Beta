package nh;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xi0;
public final class x3 extends FrameLayout {
    public static final int d = 0;
    public final org.telegram.ui.Components.t9 f18823a;
    public final d f18824b;
    public boolean f18825c;

    public x3(Context context) {
        super(context);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        addView(g10, i7.f6.e(-2, -2, 17));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f18823a = t9Var;
        g10.addView(t9Var, i7.f6.q(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.LiveStoryDisconnected));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        g10.addView(textView, i7.f6.t(-2, -2, 1, 0, 8, 0, 0));
        d dVar = new d(context, null, true);
        this.f18824b = dVar;
        dVar.g(LocaleController.getString(R.string.LiveStoryDisconnectedContinue), false, true);
        g10.addView(dVar, i7.f6.t((int) ((dVar.d.e() + AndroidUtilities.dp(24.0f)) / AndroidUtilities.density), 38, 1, 0, 18, 0, 0));
        dVar.setOnClickListener(new bg.n(8));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && !this.f18825c) {
            this.f18823a.setImageDrawable(new xi0(R.raw.utyan_empty2, AndroidUtilities.dp(130.0f), "utyan_empty2", AndroidUtilities.dp(130.0f)));
            this.f18825c = true;
        }
    }
}
