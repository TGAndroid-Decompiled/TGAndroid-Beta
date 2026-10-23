package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y90;
public final class n0 extends LinearLayout {
    public final ImageView f1851a;
    public final y90 f1852b;
    public final y90 f1853c;

    public n0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        float f7;
        float f10;
        setOrientation(0);
        if (i10 == 1) {
            f7 = 11.0f;
        } else {
            f7 = 32.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        int dp2 = AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f);
        if (i10 == 1) {
            f10 = 8.0f;
        } else {
            f10 = 12.0f;
        }
        setPadding(dp, 0, dp2, AndroidUtilities.dp(f10));
        ImageView imageView = new ImageView(context);
        this.f1851a = imageView;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, null, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        y90 y90Var = new y90(context, null);
        this.f1852b = y90Var;
        y90Var.setTypeface(AndroidUtilities.bold());
        y90Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(y90Var, i11, g6Var);
        int i12 = org.telegram.ui.ActionBar.k6.f21242gc;
        org.telegram.ui.ActionBar.r6.I(y90Var, i12, g6Var);
        linearLayout.addView(y90Var, w7.z5.t(-1, -2, 7, 0, 0, 0, 3));
        y90 y90Var2 = new y90(context, null);
        this.f1853c = y90Var2;
        y90Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(y90Var2, org.telegram.ui.ActionBar.k6.f21588z6, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var2, i12, g6Var);
        linearLayout.addView(y90Var2, w7.z5.q(-1, -2, 7));
        addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f1851a.setImageResource(i10);
        this.f1852b.setText(charSequence);
        this.f1853c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1853c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1852b.setText(charSequence);
    }
}
