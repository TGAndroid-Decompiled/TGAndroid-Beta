package mh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public final class k extends FrameLayout {
    public final ImageView f17941a;
    public final TextView f17942b;
    public final TextView f17943c;

    public k(Context context, b6 b6Var, boolean z10) {
        super(context);
        float f10;
        float f11;
        ImageView imageView = new ImageView(context);
        this.f17941a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i9 = f6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(i9, b6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, e6.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z10) {
            f10 = 2.0f;
        } else {
            f10 = 9.8f;
        }
        if (z10) {
            f11 = 4.0f;
        } else {
            f11 = 9.8f;
        }
        addView(linearLayout, e6.d(-1, -2.0f, 23, 64.0f, f10, 24.0f, f11));
        TextView textView = new TextView(context);
        this.f17942b = textView;
        textView.setTextColor(f6.v0(i9, b6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        TextView h = j3.r0.h(linearLayout, textView, e6.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f17943c = h;
        ll.n(f6.f23386z6, b6Var, h, 1, 14.0f);
        linearLayout.addView(h, e6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i9) {
        this.f17941a.setImageResource(i9);
        this.f17942b.setText(charSequence);
        this.f17943c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f17943c.setText(charSequence);
    }
}
