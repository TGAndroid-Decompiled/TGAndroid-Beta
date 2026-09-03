package mh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g90;
public final class d0 extends LinearLayout {
    public final ImageView f13879a;
    public final g90 f13880b;
    public final g90 f13881c;

    public d0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        float f10;
        float f11;
        setOrientation(0);
        if (i10 == 1) {
            f10 = 11.0f;
        } else {
            f10 = 32.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        int dp2 = AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f);
        if (i10 == 1) {
            f11 = 8.0f;
        } else {
            f11 = 12.0f;
        }
        setPadding(dp, 0, dp2, AndroidUtilities.dp(f11));
        ImageView imageView = new ImageView(context);
        this.f13879a = imageView;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.c6.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        g90 g90Var = new g90(context, null);
        this.f13880b = g90Var;
        g90Var.setTypeface(AndroidUtilities.bold());
        g90Var.setTextSize(1, 14.0f);
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        int i12 = org.telegram.ui.ActionBar.k6.f21722gc;
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
        linearLayout.addView(g90Var, k7.c6.t(-1, -2, 7, 0, 0, 0, 3));
        g90 g90Var2 = new g90(context, null);
        this.f13881c = g90Var2;
        g90Var2.setTextSize(1, 14.0f);
        g90Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22055z6, g6Var));
        g90Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
        linearLayout.addView(g90Var2, k7.c6.q(-1, -2, 7));
        addView(linearLayout, k7.c6.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f13879a.setImageResource(i10);
        this.f13880b.setText(charSequence);
        this.f13881c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f13881c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f13880b.setText(charSequence);
    }
}
