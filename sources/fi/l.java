package fi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wl;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import w7.x5;
public final class l extends FrameLayout {
    public final ImageView f9794a;
    public final TextView f9795b;
    public final TextView f9796c;

    public l(Context context, f6 f6Var, boolean z10) {
        super(context);
        float f7;
        float f10;
        ImageView imageView = new ImageView(context);
        this.f9794a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = j6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, x5.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
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
        addView(linearLayout, x5.d(-1, -2.0f, 23, 64.0f, f7, 24.0f, f10));
        TextView textView = new TextView(context);
        this.f9795b = textView;
        textView.setTextColor(j6.v0(i10, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, x5.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f9796c = h;
        wl.n(j6.f21061z6, f6Var, h, 1, 14.0f);
        linearLayout.addView(h, x5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f9794a.setImageResource(i10);
        this.f9795b.setText(charSequence);
        this.f9796c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f9796c.setText(charSequence);
    }
}
