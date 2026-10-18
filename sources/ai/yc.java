package ai;

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
import org.telegram.messenger.lk;
import org.telegram.ui.Components.bs;
public final class yc extends FrameLayout {
    public final org.telegram.ui.ActionBar.d6 f2509a;
    public final Drawable f2510b;
    public final Drawable f2511c;
    public final TextView d;
    public final org.telegram.ui.Components.q6 e;
    public SpannableString f2512f;
    public boolean h;
    public int f2513n;
    public final org.telegram.ui.Components.f6 f2514r;

    public yc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        this.f2514r = new org.telegram.ui.Components.f6(this, 0L, 500L, bs.h);
        this.f2509a = d6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
        this.f2510b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21057h5, d6Var), PorterDuff.Mode.SRC_IN));
        this.f2511c = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        lk.k(15.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        addView(textView, w7.z5.i(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, false, false);
        this.e = q6Var;
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21391z6, d6Var));
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        q6Var.setGravity(i10);
        addView(q6Var, w7.z5.i(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float dp;
        float f10;
        Paint paint;
        int i10;
        super.onDraw(canvas);
        float d = this.f2514r.d(this.f2513n, false);
        if (LocaleController.isRTL) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        float dp2 = AndroidUtilities.dp(24.0f);
        float dp3 = AndroidUtilities.dp(24.0f);
        float dp4 = AndroidUtilities.dp(2.5f);
        if (LocaleController.isRTL) {
            dp = (getWidth() - AndroidUtilities.dp(19.0f)) - dp2;
        } else {
            dp = AndroidUtilities.dp(19.0f);
        }
        int ceil = ((int) Math.ceil(d)) - 1;
        while (true) {
            f10 = 0.0f;
            if (ceil < 0) {
                break;
            }
            float clamp = Utilities.clamp(d - ceil, 1.0f, 0.0f);
            float f11 = (((ceil - 1) - (1.0f - clamp)) * dp4 * f7) + dp;
            float measuredHeight = (getMeasuredHeight() - dp3) / 2.0f;
            int i11 = (int) f11;
            int i12 = (int) measuredHeight;
            int i13 = (int) (f11 + dp2);
            int i14 = (int) (measuredHeight + dp3);
            Drawable drawable = this.f2510b;
            drawable.setBounds(i11, i12, i13, i14);
            int i15 = (int) (clamp * 255.0f);
            drawable.setAlpha(i15);
            drawable.draw(canvas);
            Drawable drawable2 = this.f2511c;
            drawable2.setBounds(i11, i12, i13, i14);
            drawable2.setAlpha(i15);
            drawable2.draw(canvas);
            ceil--;
        }
        if (this.h) {
            org.telegram.ui.ActionBar.d6 d6Var = this.f2509a;
            if (d6Var != null) {
                paint = d6Var.n("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.h6.f21107k0;
            }
            Paint paint2 = paint;
            if (!LocaleController.isRTL) {
                f10 = AndroidUtilities.dp(22.0f);
            }
            float f12 = f10;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(22.0f);
            } else {
                i10 = 0;
            }
            canvas.drawRect(f12, measuredHeight2, measuredWidth - i10, getMeasuredHeight(), paint2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
