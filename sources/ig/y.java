package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.z5;
public final class y extends FrameLayout {
    public final RadioButton f7536a;
    public final Drawable f7537b;
    public final Drawable f7538c;
    public final k6 d;
    public final k6 e;
    public final TextView f7539f;
    public final SpannableString h;
    public final SpannableString f7540n;
    public TL_stars.TL_starsGiveawayOption f7541r;
    public int f7542s;
    public final z5 v;

    public y(Context context, f6 f6Var) {
        super(context);
        this.v = new z5(this, 0L, 500L, mr.h);
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
        this.f7537b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f19952h5, f6Var), PorterDuff.Mode.SRC_IN));
        this.f7538c = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        setWillNotDraw(false);
        k6 k6Var = new k6(context, false, false, false);
        this.d = k6Var;
        k6Var.setTextColor(j6.v0(j6.G6, f6Var));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setTextSize(AndroidUtilities.dp(16.0f));
        addView(k6Var, b6.d(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new k90(AndroidUtilities.dp(90.0f), k6Var), 0, 1, 33);
        k6 k6Var2 = new k6(context, false, true, true);
        this.e = k6Var2;
        int i10 = j6.f20273z6;
        k6Var2.setTextColor(j6.v0(i10, f6Var));
        k6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        addView(k6Var2, b6.d(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.f7540n = spannableString2;
        spannableString2.setSpan(new k90(AndroidUtilities.dp(70.0f), k6Var2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f7539f = textView;
        org.telegram.ui.b.l(i10, f6Var, textView, 1, 16.0f);
        textView.setGravity(5);
        addView(textView, b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f7536a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(j6.v0(j6.f19989j7, f6Var), j6.v0(j6.E5, f6Var));
        addView(radioButton, b6.d(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.f7541r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float d = this.v.d(this.f7542s, false);
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
            Drawable drawable = this.f7537b;
            drawable.setBounds(i10, i11, i12, i13);
            int i14 = (int) (clamp * 255.0f);
            drawable.setAlpha(i14);
            drawable.draw(canvas);
            Drawable drawable2 = this.f7538c;
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
