package gi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.tl;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import w7.z5;
public final class k extends FrameLayout {
    public final ImageView f11314a;
    public final TextView f11315b;
    public final TextView f11316c;

    public k(Context context, g6 g6Var, boolean z10) {
        super(context);
        float f7;
        ImageView imageView = new ImageView(context);
        this.f11314a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = k6.G6;
        r6.t(imageView, i10, g6Var, PorterDuff.Mode.SRC_IN);
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
        this.f11315b = textView;
        r6.W(textView, i10, g6Var);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        TextView f10 = tl.f(linearLayout, textView, z5.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f11316c = f10;
        r6.W(f10, k6.f21589z6, g6Var);
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, z5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f11314a.setImageResource(i10);
        this.f11315b.setText(charSequence);
        this.f11316c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f11316c.setText(charSequence);
    }
}
