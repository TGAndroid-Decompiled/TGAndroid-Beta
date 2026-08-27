package lh;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oi0;

public final class b4 extends FrameLayout {
    public static final int d = 0;

    public final org.telegram.ui.Components.n9 f15677a;

    public final d f15678b;

    public boolean f15679c;

    public b4(Context context) {
        super(context);
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        addView(linearLayoutG, h7.z5.e(-2, -2, 17));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f15677a = n9Var;
        linearLayoutG.addView(n9Var, h7.z5.q(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.LiveStoryDisconnected));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayoutG.addView(textView, h7.z5.t(-2, -2, 1, 0, 8, 0, 0));
        d dVar = new d(context, null, true);
        this.f15678b = dVar;
        dVar.g(LocaleController.getString(R.string.LiveStoryDisconnectedContinue), false, true);
        linearLayoutG.addView(dVar, h7.z5.t((int) ((dVar.d.e() + AndroidUtilities.dp(24.0f)) / AndroidUtilities.density), 38, 1, 0, 18, 0, 0));
        dVar.setOnClickListener(new ag.l2(7));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0 || this.f15679c) {
            return;
        }
        this.f15677a.setImageDrawable(new oi0(R.raw.utyan_empty2, AndroidUtilities.dp(130.0f), "utyan_empty2", AndroidUtilities.dp(130.0f)));
        this.f15679c = true;
    }
}
