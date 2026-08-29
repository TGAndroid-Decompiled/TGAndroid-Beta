package jh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y80;
public final class e0 extends LinearLayout {
    public final ImageView f11988a;
    public final y80 f11989b;
    public final y80 f11990c;

    public e0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        float f9;
        float f10;
        setOrientation(0);
        if (i10 == 1) {
            f9 = 11.0f;
        } else {
            f9 = 32.0f;
        }
        int dp = AndroidUtilities.dp(f9);
        int dp2 = AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f);
        if (i10 == 1) {
            f10 = 8.0f;
        } else {
            f10 = 12.0f;
        }
        setPadding(dp, 0, dp2, AndroidUtilities.dp(f10));
        ImageView imageView = new ImageView(context);
        this.f11988a = imageView;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, i7.f6.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        y80 y80Var = new y80(context, null);
        this.f11989b = y80Var;
        y80Var.setTypeface(AndroidUtilities.bold());
        y80Var.setTextSize(1, 14.0f);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        int i12 = org.telegram.ui.ActionBar.g6.gc;
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        linearLayout.addView(y80Var, i7.f6.t(-1, -2, 7, 0, 0, 0, 3));
        y80 y80Var2 = new y80(context, null);
        this.f11990c = y80Var2;
        y80Var2.setTextSize(1, 14.0f);
        y80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, c6Var));
        y80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        linearLayout.addView(y80Var2, i7.f6.q(-1, -2, 7));
        addView(linearLayout, i7.f6.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f11988a.setImageResource(i10);
        this.f11989b.setText(charSequence);
        this.f11990c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f11990c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f11989b.setText(charSequence);
    }
}
