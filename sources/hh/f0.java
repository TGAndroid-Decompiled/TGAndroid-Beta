package hh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p80;

public final class f0 extends LinearLayout {

    public final ImageView f9239a;

    public final p80 f9240b;

    public final p80 f9241c;

    public f0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setOrientation(0);
        setPadding(AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), 0, AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), AndroidUtilities.dp(i10 == 1 ? 8.0f : 12.0f));
        ImageView imageView = new ImageView(context);
        this.f9239a = imageView;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, h7.z5.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        p80 p80Var = new p80(context, null);
        this.f9240b = p80Var;
        p80Var.setTypeface(AndroidUtilities.bold());
        p80Var.setTextSize(1, 14.0f);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        int i12 = org.telegram.ui.ActionBar.g6.gc;
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        linearLayout.addView(p80Var, h7.z5.t(-1, -2, 7, 0, 0, 0, 3));
        p80 p80Var2 = new p80(context, null);
        this.f9241c = p80Var2;
        p80Var2.setTextSize(1, 14.0f);
        p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, c6Var));
        p80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        linearLayout.addView(p80Var2, h7.z5.q(-1, -2, 7));
        addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f9239a.setImageResource(i10);
        this.f9240b.setText(charSequence);
        this.f9241c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f9241c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f9240b.setText(charSequence);
    }
}
