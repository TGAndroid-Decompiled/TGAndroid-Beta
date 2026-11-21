package ki;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
public final class i extends FrameLayout {
    public final ImageView f18731a;
    public final TextView f18732b;
    public final TextView f18733c;

    public i(Context context, h6 h6Var, boolean z10) {
        super(context);
        float f10;
        ImageView imageView = new ImageView(context);
        this.f18731a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i7 = m6.G6;
        t6.s(imageView, i7, h6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, ma.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z10) {
            f10 = 2.0f;
        } else {
            f10 = 9.8f;
        }
        addView(linearLayout, ma.d(-1, -2.0f, 23, 64.0f, f10, 24.0f, z10 ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.f18732b = textView;
        t6.U(textView, i7, h6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        TextView f11 = n10.f(linearLayout, textView, ma.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f18733c = f11;
        t6.U(f11, m6.f29789z6, h6Var);
        f11.setTextSize(1, 14.0f);
        linearLayout.addView(f11, ma.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(int i7, CharSequence charSequence, CharSequence charSequence2) {
        this.f18731a.setImageResource(i7);
        this.f18732b.setText(charSequence);
        this.f18733c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f18733c.setText(charSequence);
    }
}
