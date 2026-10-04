package ei;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ok;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import w7.z5;
public final class l extends FrameLayout {
    public final ImageView f9133a;
    public final TextView f9134b;
    public final TextView f9135c;

    public l(Context context, d6 d6Var, boolean z10) {
        super(context);
        float f7;
        float f10;
        ImageView imageView = new ImageView(context);
        this.f9133a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = i6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(i6.v0(i10, d6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, z5.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
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
        addView(linearLayout, z5.d(-1, -2.0f, 23, 64.0f, f7, 24.0f, f10));
        TextView textView = new TextView(context);
        this.f9134b = textView;
        textView.setTextColor(i6.v0(i10, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, z5.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f9135c = h;
        ok.n(i6.f21224z6, d6Var, h, 1, 14.0f);
        linearLayout.addView(h, z5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f9133a.setImageResource(i10);
        this.f9134b.setText(charSequence);
        this.f9135c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f9135c.setText(charSequence);
    }
}
