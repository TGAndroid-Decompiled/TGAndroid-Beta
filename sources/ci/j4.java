package ci;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.kj0;
public final class j4 extends FrameLayout {
    public static final int d = 0;
    public final org.telegram.ui.Components.w9 f5205a;
    public final d f5206b;
    public boolean f5207c;

    public j4(Context context) {
        super(context);
        LinearLayout e7 = bi.e(context, 1);
        addView(e7, w7.z5.e(-2, -2, 17));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f5205a = w9Var;
        e7.addView(w9Var, w7.z5.q(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.LiveStoryDisconnected));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        e7.addView(textView, w7.z5.t(-2, -2, 1, 0, 8, 0, 0));
        d dVar = new d(context, null, true);
        this.f5206b = dVar;
        dVar.g(LocaleController.getString(R.string.LiveStoryDisconnectedContinue), false, true);
        e7.addView(dVar, w7.z5.t((int) ((dVar.d.e() + AndroidUtilities.dp(24.0f)) / AndroidUtilities.density), 38, 1, 0, 18, 0, 0));
        dVar.setOnClickListener(new ai.e2(1));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && !this.f5207c) {
            this.f5205a.setImageDrawable(new kj0(R.raw.utyan_empty2, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
            this.f5207c = true;
        }
    }
}
