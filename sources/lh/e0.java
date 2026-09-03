package lh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f90;
public final class e0 extends LinearLayout {
    public final ImageView f12315a;
    public final f90 f12316b;
    public final f90 f12317c;

    public e0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.f12315a = imageView;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.b6.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        f90 f90Var = new f90(context, null);
        this.f12316b = f90Var;
        f90Var.setTypeface(AndroidUtilities.bold());
        f90Var.setTextSize(1, 14.0f);
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        int i12 = org.telegram.ui.ActionBar.j6.f19941gc;
        f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        linearLayout.addView(f90Var, k7.b6.t(-1, -2, 7, 0, 0, 0, 3));
        f90 f90Var2 = new f90(context, null);
        this.f12317c = f90Var2;
        f90Var2.setTextSize(1, 14.0f);
        f90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20273z6, f6Var));
        f90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        linearLayout.addView(f90Var2, k7.b6.q(-1, -2, 7));
        addView(linearLayout, k7.b6.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f12315a.setImageResource(i10);
        this.f12316b.setText(charSequence);
        this.f12317c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f12317c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f12316b.setText(charSequence);
    }
}
