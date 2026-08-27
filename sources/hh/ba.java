package hh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.er;

public final class ba extends FrameLayout {

    public final org.telegram.ui.ActionBar.c6 f9025a;

    public final Drawable f9026b;

    public final Drawable f9027c;
    public final TextView d;

    public final org.telegram.ui.Components.j6 f9028e;

    public SpannableString f9029f;
    public boolean h;

    public int f9030n;

    public final org.telegram.ui.Components.y5 f9031r;

    public ba(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f9031r = new org.telegram.ui.Components.y5(this, 0L, 500L, er.h);
        this.f9025a = c6Var;
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
        this.f9026b = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var), PorterDuff.Mode.SRC_IN));
        this.f9027c = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        rl.h(15.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        addView(textView, h7.z5.i(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f9028e = j6Var;
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, c6Var));
        j6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(j6Var, h7.z5.i(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fD = this.f9031r.d(this.f9030n, false);
        float f10 = LocaleController.isRTL ? -1.0f : 1.0f;
        float fDp = AndroidUtilities.dp(24.0f);
        float fDp2 = AndroidUtilities.dp(24.0f);
        float fDp3 = AndroidUtilities.dp(2.5f);
        float width = LocaleController.isRTL ? (getWidth() - AndroidUtilities.dp(19.0f)) - fDp : AndroidUtilities.dp(19.0f);
        for (int iCeil = ((int) Math.ceil(fD)) - 1; iCeil >= 0; iCeil--) {
            float fClamp = Utilities.clamp(fD - iCeil, 1.0f, 0.0f);
            float f11 = (((iCeil - 1) - (1.0f - fClamp)) * fDp3 * f10) + width;
            float measuredHeight = (getMeasuredHeight() - fDp2) / 2.0f;
            int i10 = (int) f11;
            int i11 = (int) measuredHeight;
            int i12 = (int) (f11 + fDp);
            int i13 = (int) (measuredHeight + fDp2);
            Drawable drawable = this.f9026b;
            drawable.setBounds(i10, i11, i12, i13);
            int i14 = (int) (fClamp * 255.0f);
            drawable.setAlpha(i14);
            drawable.draw(canvas);
            Drawable drawable2 = this.f9027c;
            drawable2.setBounds(i10, i11, i12, i13);
            drawable2.setAlpha(i14);
            drawable2.draw(canvas);
        }
        if (this.h) {
            org.telegram.ui.ActionBar.c6 c6Var = this.f9025a;
            Paint paintN = c6Var != null ? c6Var.N("paintDivider") : null;
            if (paintN == null) {
                paintN = org.telegram.ui.ActionBar.g6.f23175k0;
            }
            canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight(), paintN);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
