package di;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.sk;
import org.telegram.ui.Components.yj0;
public final class i4 extends FrameLayout {
    public static final int d = 0;
    public final org.telegram.ui.Components.z9 f7037a;
    public final d f7038b;
    public boolean f7039c;

    public i4(Context context) {
        super(context);
        LinearLayout e = sk.e(context, 1);
        addView(e, w7.z5.e(-2, -2, 17));
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.f7037a = z9Var;
        e.addView(z9Var, w7.z5.q(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.LiveStoryDisconnected));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        e.addView(textView, w7.z5.t(-2, -2, 1, 0, 8, 0, 0));
        d dVar = new d(context, null, true);
        this.f7038b = dVar;
        dVar.g(LocaleController.getString(R.string.LiveStoryDisconnectedContinue), false, true);
        e.addView(dVar, w7.z5.t((int) ((dVar.d.e() + AndroidUtilities.dp(24.0f)) / AndroidUtilities.density), 38, 1, 0, 18, 0, 0));
        dVar.setOnClickListener(new ah.f(2));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && !this.f7039c) {
            this.f7037a.setImageDrawable(new yj0(R.raw.utyan_empty2, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
            this.f7039c = true;
        }
    }
}
