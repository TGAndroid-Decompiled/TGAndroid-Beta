package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
public final class pc extends FrameLayout {
    public final org.telegram.ui.ActionBar.u6 f5246a;
    public final Drawable f5247b;
    public final Drawable f5248c;
    public final TextView d;
    public final org.telegram.ui.Components.s6 e;
    public SpannableString f5249f;
    public boolean h;
    public int f5250n;
    public final org.telegram.ui.Components.h6 f5251r;

    public pc(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i10;
        this.f5251r = new org.telegram.ui.Components.h6(this, 0L, 500L, ds.h);
        this.f5246a = u6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
        this.f5247b = mutate;
        org.telegram.ui.ActionBar.f7.y(this, mutate, org.telegram.ui.ActionBar.y6.f23428h5, u6Var, PorterDuff.Mode.SRC_IN);
        this.f5248c = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        wh.j(15.0f, 1, textView);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
        addView(textView, kb1.m(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.e = s6Var;
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.f7.Z(s6Var, org.telegram.ui.ActionBar.y6.f23768z6, u6Var);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        s6Var.setGravity(i10);
        addView(s6Var, kb1.m(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float dp;
        float f10;
        Paint paint;
        int i10;
        super.onDraw(canvas);
        float d = this.f5251r.d(this.f5250n, false);
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
            Drawable drawable = this.f5247b;
            drawable.setBounds(i11, i12, i13, i14);
            int i15 = (int) (clamp * 255.0f);
            drawable.setAlpha(i15);
            drawable.draw(canvas);
            Drawable drawable2 = this.f5248c;
            drawable2.setBounds(i11, i12, i13, i14);
            drawable2.setAlpha(i15);
            drawable2.draw(canvas);
            ceil--;
        }
        if (this.h) {
            org.telegram.ui.ActionBar.u6 u6Var = this.f5246a;
            if (u6Var != null) {
                paint = u6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.y6.f23479k0;
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
