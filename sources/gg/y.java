package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.o6;
public final class y extends FrameLayout {
    public final RadioButton f7349a;
    public final Drawable f7350b;
    public final Drawable f7351c;
    public final o6 d;
    public final o6 f7352e;
    public final TextView f7353f;
    public final SpannableString h;
    public final SpannableString f7354n;
    public TL_stars.TL_starsGiveawayOption f7355r;
    public int f7356s;
    public final d6 v;

    public y(Context context, c6 c6Var) {
        super(context);
        this.v = new d6(this, 0L, 500L, jr.h);
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
        this.f7350b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.f23133h5, c6Var), PorterDuff.Mode.SRC_IN));
        this.f7351c = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        setWillNotDraw(false);
        o6 o6Var = new o6(context, false, false, false);
        this.d = o6Var;
        o6Var.setTextColor(g6.v0(g6.G6, c6Var));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setTextSize(AndroidUtilities.dp(16.0f));
        addView(o6Var, f6.d(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new d90(AndroidUtilities.dp(90.0f), o6Var), 0, 1, 33);
        o6 o6Var2 = new o6(context, false, true, true);
        this.f7352e = o6Var2;
        int i10 = g6.f23450z6;
        o6Var2.setTextColor(g6.v0(i10, c6Var));
        o6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        addView(o6Var2, f6.d(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.f7354n = spannableString2;
        spannableString2.setSpan(new d90(AndroidUtilities.dp(70.0f), o6Var2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f7353f = textView;
        org.telegram.ui.b.m(i10, c6Var, textView, 1, 16.0f);
        textView.setGravity(5);
        addView(textView, f6.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f7349a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(g6.v0(g6.f23171j7, c6Var), g6.v0(g6.E5, c6Var));
        addView(radioButton, f6.d(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.f7355r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float d = this.v.d(this.f7356s, false);
        float dp = AndroidUtilities.dp(24.0f);
        float dp2 = AndroidUtilities.dp(24.0f);
        float dp3 = AndroidUtilities.dp(2.5f);
        float dp4 = AndroidUtilities.dp(64.0f);
        float dp5 = AndroidUtilities.dp(8.0f);
        for (int ceil = ((int) Math.ceil(d)) - 1; ceil >= 0; ceil--) {
            float clamp = Utilities.clamp(d - ceil, 1.0f, 0.0f);
            float f9 = (((ceil - 1) - (1.0f - clamp)) * dp3 * 1.0f) + dp4;
            int i10 = (int) f9;
            int i11 = (int) dp5;
            int i12 = (int) (f9 + dp);
            int i13 = (int) (dp5 + dp2);
            Drawable drawable = this.f7350b;
            drawable.setBounds(i10, i11, i12, i13);
            int i14 = (int) (clamp * 255.0f);
            drawable.setAlpha(i14);
            drawable.draw(canvas);
            Drawable drawable2 = this.f7351c;
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
