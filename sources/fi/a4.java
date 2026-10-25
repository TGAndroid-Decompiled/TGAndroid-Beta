package fi;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.xj0;
public final class a4 extends FrameLayout {
    public static final int d = 0;
    public final org.telegram.ui.Components.y9 f10504a;
    public final d f10505b;
    public boolean f10506c;

    public a4(Context context) {
        super(context);
        LinearLayout d10 = vh.d(context, 1);
        addView(d10, gb1.i(-2, -2, 17));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f10504a = y9Var;
        d10.addView(y9Var, gb1.u(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.LiveStoryDisconnected));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        d10.addView(textView, gb1.x(-2, -2, 1, 0, 8, 0, 0));
        d dVar = new d(context, null, true);
        this.f10505b = dVar;
        dVar.i(LocaleController.getString(R.string.LiveStoryDisconnectedContinue), false, true);
        d10.addView(dVar, gb1.x((int) ((dVar.d.e() + AndroidUtilities.dp(24.0f)) / AndroidUtilities.density), 38, 1, 0, 18, 0, 0));
        dVar.setOnClickListener(new bh.f(3));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && !this.f10506c) {
            this.f10504a.setImageDrawable(new xj0(R.raw.utyan_empty2, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
            this.f10506c = true;
        }
    }
}
