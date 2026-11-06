package hi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public final class i extends FrameLayout {
    public final ImageView f14704a;
    public final TextView f14705b;
    public final TextView f14706c;

    public i(Context context, f6 f6Var, boolean z9) {
        super(context);
        float f10;
        ImageView imageView = new ImageView(context);
        this.f14704a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i7 = k6.G6;
        r6.t(imageView, i7, f6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, ha.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z9) {
            f10 = 2.0f;
        } else {
            f10 = 9.8f;
        }
        addView(linearLayout, ha.d(-1, -2.0f, 23, 64.0f, f10, 24.0f, z9 ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.f14705b = textView;
        r6.V(textView, i7, f6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        TextView f11 = org.telegram.messenger.camera.q.f(linearLayout, textView, ha.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f14706c = f11;
        r6.V(f11, k6.f28258z6, f6Var);
        f11.setTextSize(1, 14.0f);
        linearLayout.addView(f11, ha.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(int i7, CharSequence charSequence, CharSequence charSequence2) {
        this.f14704a.setImageResource(i7);
        this.f14705b.setText(charSequence);
        this.f14706c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f14706c.setText(charSequence);
    }
}
