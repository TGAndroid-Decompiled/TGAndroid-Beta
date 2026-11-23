package ki;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
public final class i extends FrameLayout {
    public final ImageView f18700a;
    public final TextView f18701b;
    public final TextView f18702c;

    public i(Context context, h6 h6Var, boolean z10) {
        super(context);
        float f10;
        ImageView imageView = new ImageView(context);
        this.f18700a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i7 = m6.G6;
        t6.s(imageView, i7, h6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, na.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z10) {
            f10 = 2.0f;
        } else {
            f10 = 9.8f;
        }
        addView(linearLayout, na.d(-1, -2.0f, 23, 64.0f, f10, 24.0f, z10 ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.f18701b = textView;
        t6.U(textView, i7, h6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        TextView f11 = o10.f(linearLayout, textView, na.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f18702c = f11;
        t6.U(f11, m6.f29758z6, h6Var);
        f11.setTextSize(1, 14.0f);
        linearLayout.addView(f11, na.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(int i7, CharSequence charSequence, CharSequence charSequence2) {
        this.f18700a.setImageResource(i7);
        this.f18701b.setText(charSequence);
        this.f18702c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f18702c.setText(charSequence);
    }
}
