package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import w7.a6;
public final class l extends FrameLayout {
    public final ImageView f6733a;
    public final TextView f6734b;
    public final TextView f6735c;

    public l(Context context, f6 f6Var, boolean z10) {
        super(context);
        float f7;
        float f10;
        ImageView imageView = new ImageView(context);
        this.f6733a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = j6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, a6.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z10) {
            f7 = 2.0f;
        } else {
            f7 = 9.8f;
        }
        if (z10) {
            f10 = 4.0f;
        } else {
            f10 = 9.8f;
        }
        addView(linearLayout, a6.d(-1, -2.0f, 23, 64.0f, f7, 24.0f, f10));
        TextView textView = new TextView(context);
        this.f6734b = textView;
        textView.setTextColor(j6.v0(i10, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView, a6.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f6735c = g10;
        em.n(j6.f18325z6, f6Var, g10, 1, 14.0f);
        linearLayout.addView(g10, a6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f6733a.setImageResource(i10);
        this.f6734b.setText(charSequence);
        this.f6735c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f6735c.setText(charSequence);
    }
}
