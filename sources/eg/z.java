package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.y5;

public final class z extends FrameLayout {

    public final RadioButton f5458a;

    public final Drawable f5459b;

    public final Drawable f5460c;
    public final j6 d;

    public final j6 f5461e;

    public final TextView f5462f;
    public final SpannableString h;

    public final SpannableString f5463n;

    public TL_stars.TL_starsGiveawayOption f5464r;

    public int f5465s;
    public final y5 v;

    public z(Context context, c6 c6Var) {
        super(context);
        this.v = new y5(this, 0L, 500L, er.h);
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
        this.f5459b = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.f23124h5, c6Var), PorterDuff.Mode.SRC_IN));
        this.f5460c = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        setWillNotDraw(false);
        j6 j6Var = new j6(context, false, false, false);
        this.d = j6Var;
        j6Var.setTextColor(g6.v0(g6.G6, c6Var));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setTextSize(AndroidUtilities.dp(16.0f));
        addView(j6Var, z5.d(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new u80(AndroidUtilities.dp(90.0f), j6Var), 0, 1, 33);
        j6 j6Var2 = new j6(context, false, true, true);
        this.f5461e = j6Var2;
        int i10 = g6.f23441z6;
        j6Var2.setTextColor(g6.v0(i10, c6Var));
        j6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        addView(j6Var2, z5.d(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.f5463n = spannableString2;
        spannableString2.setSpan(new u80(AndroidUtilities.dp(70.0f), j6Var2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f5462f = textView;
        rl.l(i10, c6Var, textView, 1, 16.0f);
        textView.setGravity(5);
        addView(textView, z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f5458a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(g6.v0(g6.f23163j7, c6Var), g6.v0(g6.E5, c6Var));
        addView(radioButton, z5.d(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.f5464r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fD = this.v.d(this.f5465s, false);
        float fDp = AndroidUtilities.dp(24.0f);
        float fDp2 = AndroidUtilities.dp(24.0f);
        float fDp3 = AndroidUtilities.dp(2.5f);
        float fDp4 = AndroidUtilities.dp(64.0f);
        float fDp5 = AndroidUtilities.dp(8.0f);
        for (int iCeil = ((int) Math.ceil(fD)) - 1; iCeil >= 0; iCeil--) {
            float fClamp = Utilities.clamp(fD - iCeil, 1.0f, 0.0f);
            float f10 = (((iCeil - 1) - (1.0f - fClamp)) * fDp3 * 1.0f) + fDp4;
            int i10 = (int) f10;
            int i11 = (int) fDp5;
            int i12 = (int) (f10 + fDp);
            int i13 = (int) (fDp5 + fDp2);
            Drawable drawable = this.f5459b;
            drawable.setBounds(i10, i11, i12, i13);
            int i14 = (int) (fClamp * 255.0f);
            drawable.setAlpha(i14);
            drawable.draw(canvas);
            Drawable drawable2 = this.f5460c;
            drawable2.setBounds(i10, i11, i12, i13);
            drawable2.setAlpha(i14);
            drawable2.draw(canvas);
        }
        this.d.setTranslationX((fDp3 * fD) + AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
