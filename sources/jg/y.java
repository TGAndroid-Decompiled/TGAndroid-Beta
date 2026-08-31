package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.z5;
public final class y extends FrameLayout {
    public final RadioButton f10079a;
    public final Drawable f10080b;
    public final Drawable f10081c;
    public final k6 d;
    public final k6 f10082e;
    public final TextView f10083f;
    public final SpannableString h;
    public final SpannableString f10084n;
    public TL_stars.TL_starsGiveawayOption f10085r;
    public int f10086s;
    public final z5 v;

    public y(Context context, g6 g6Var) {
        super(context);
        this.v = new z5(this, 0L, 500L, pr.h);
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
        this.f10080b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, g6Var), PorterDuff.Mode.SRC_IN));
        this.f10081c = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        setWillNotDraw(false);
        k6 k6Var = new k6(context, false, false, false);
        this.d = k6Var;
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setTextSize(AndroidUtilities.dp(16.0f));
        addView(k6Var, c6.d(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new l90(AndroidUtilities.dp(90.0f), k6Var), 0, 1, 33);
        k6 k6Var2 = new k6(context, false, true, true);
        this.f10082e = k6Var2;
        int i10 = org.telegram.ui.ActionBar.k6.f22053z6;
        k6Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        k6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        addView(k6Var2, c6.d(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.f10084n = spannableString2;
        spannableString2.setSpan(new l90(AndroidUtilities.dp(70.0f), k6Var2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f10083f = textView;
        org.telegram.ui.b.l(i10, g6Var, textView, 1, 16.0f);
        textView.setGravity(5);
        addView(textView, c6.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f10079a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21768j7, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E5, g6Var));
        addView(radioButton, c6.d(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.f10085r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float d = this.v.d(this.f10086s, false);
        float dp = AndroidUtilities.dp(24.0f);
        float dp2 = AndroidUtilities.dp(24.0f);
        float dp3 = AndroidUtilities.dp(2.5f);
        float dp4 = AndroidUtilities.dp(64.0f);
        float dp5 = AndroidUtilities.dp(8.0f);
        for (int ceil = ((int) Math.ceil(d)) - 1; ceil >= 0; ceil--) {
            float clamp = Utilities.clamp(d - ceil, 1.0f, 0.0f);
            float f10 = (((ceil - 1) - (1.0f - clamp)) * dp3 * 1.0f) + dp4;
            int i10 = (int) f10;
            int i11 = (int) dp5;
            int i12 = (int) (f10 + dp);
            int i13 = (int) (dp5 + dp2);
            Drawable drawable = this.f10080b;
            drawable.setBounds(i10, i11, i12, i13);
            int i14 = (int) (clamp * 255.0f);
            drawable.setAlpha(i14);
            drawable.draw(canvas);
            Drawable drawable2 = this.f10081c;
            drawable2.setBounds(i10, i11, i12, i13);
            drawable2.setAlpha(i14);
            drawable2.draw(canvas);
        }
        this.d.setTranslationX((dp3 * d) + AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
