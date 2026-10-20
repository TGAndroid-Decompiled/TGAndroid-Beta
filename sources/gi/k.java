package gi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.mk;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import w7.z5;
public final class k extends FrameLayout {
    public final ImageView f11292a;
    public final TextView f11293b;
    public final TextView f11294c;

    public k(Context context, d6 d6Var, boolean z10) {
        super(context);
        float f7;
        ImageView imageView = new ImageView(context);
        this.f11292a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = h6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(i10, d6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, z5.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z10) {
            f7 = 2.0f;
        } else {
            f7 = 9.8f;
        }
        addView(linearLayout, z5.d(-1, -2.0f, 23, 64.0f, f7, 24.0f, z10 ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.f11293b = textView;
        textView.setTextColor(h6.w0(i10, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        TextView i11 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, z5.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f11294c = i11;
        mk.o(h6.f21395z6, d6Var, i11, 1, 14.0f);
        linearLayout.addView(i11, z5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f11292a.setImageResource(i10);
        this.f11293b.setText(charSequence);
        this.f11294c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f11294c.setText(charSequence);
    }
}
