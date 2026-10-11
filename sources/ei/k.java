package ei;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ai;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import w7.x5;
public final class k extends FrameLayout {
    public final ImageView f9135a;
    public final TextView f9136b;
    public final TextView f9137c;

    public k(Context context, d6 d6Var, boolean z10) {
        super(context);
        float f7;
        ImageView imageView = new ImageView(context);
        this.f9135a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = h6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(i10, d6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, x5.a(24.0f, 20.0f, 11.46f, 0.0f, 0.0f, 24, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z10) {
            f7 = 2.0f;
        } else {
            f7 = 9.8f;
        }
        addView(linearLayout, x5.a(-2.0f, 64.0f, f7, 24.0f, z10 ? 4.0f : 9.8f, -1, 23));
        TextView textView = new TextView(context);
        this.f9136b = textView;
        textView.setTextColor(h6.w0(i10, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, x5.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f9137c = h;
        ai.o(h6.f21189z6, d6Var, h, 1, 14.0f);
        linearLayout.addView(h, x5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f9135a.setImageResource(i10);
        this.f9136b.setText(charSequence);
        this.f9137c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f9137c.setText(charSequence);
    }
}
