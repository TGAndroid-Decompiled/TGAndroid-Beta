package gh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l80;
public final class f0 extends LinearLayout {
    public final ImageView f8048a;
    public final l80 f8049b;
    public final l80 f8050c;

    public f0(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        float f10;
        float f11;
        setOrientation(0);
        if (i9 == 1) {
            f10 = 11.0f;
        } else {
            f10 = 32.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        int dp2 = AndroidUtilities.dp(i9 == 1 ? 11.0f : 32.0f);
        if (i9 == 1) {
            f11 = 8.0f;
        } else {
            f11 = 12.0f;
        }
        setPadding(dp, 0, dp2, AndroidUtilities.dp(f11));
        ImageView imageView = new ImageView(context);
        this.f8048a = imageView;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, g7.e6.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        l80 l80Var = new l80(context, null);
        this.f8049b = l80Var;
        l80Var.setTypeface(AndroidUtilities.bold());
        l80Var.setTextSize(1, 14.0f);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        int i11 = org.telegram.ui.ActionBar.f6.f23061gc;
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        linearLayout.addView(l80Var, g7.e6.t(-1, -2, 7, 0, 0, 0, 3));
        l80 l80Var2 = new l80(context, null);
        this.f8050c = l80Var2;
        l80Var2.setTextSize(1, 14.0f);
        l80Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, b6Var));
        l80Var2.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        linearLayout.addView(l80Var2, g7.e6.q(-1, -2, 7));
        addView(linearLayout, g7.e6.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i9) {
        this.f8048a.setImageResource(i9);
        this.f8049b.setText(charSequence);
        this.f8050c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f8050c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f8049b.setText(charSequence);
    }
}
