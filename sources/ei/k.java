package ei;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import w7.y5;
public final class k extends FrameLayout {
    public final ImageView f8410a;
    public final TextView f8411b;
    public final TextView f8412c;

    public k(Context context, e6 e6Var, boolean z10) {
        super(context);
        float f7;
        float f10;
        ImageView imageView = new ImageView(context);
        this.f8410a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = j6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, e6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, y5.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
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
        addView(linearLayout, y5.d(-1, -2.0f, 23, 64.0f, f7, 24.0f, f10));
        TextView textView = new TextView(context);
        this.f8411b = textView;
        textView.setTextColor(j6.v0(i10, e6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, y5.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f8412c = h;
        wh.m(j6.f19464z6, e6Var, h, 1, 14.0f);
        linearLayout.addView(h, y5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f8410a.setImageResource(i10);
        this.f8411b.setText(charSequence);
        this.f8412c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f8412c.setText(charSequence);
    }
}
