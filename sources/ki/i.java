package ki;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
public final class i extends FrameLayout {
    public final ImageView f18805a;
    public final TextView f18806b;
    public final TextView f18807c;

    public i(Context context, i6 i6Var, boolean z10) {
        super(context);
        float f10;
        ImageView imageView = new ImageView(context);
        this.f18805a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i7 = n6.G6;
        u6.s(imageView, i7, i6Var, PorterDuff.Mode.SRC_IN);
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
        this.f18806b = textView;
        u6.U(textView, i7, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        TextView f11 = m10.f(linearLayout, textView, na.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f18807c = f11;
        u6.U(f11, n6.f29862z6, i6Var);
        f11.setTextSize(1, 14.0f);
        linearLayout.addView(f11, na.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(int i7, CharSequence charSequence, CharSequence charSequence2) {
        this.f18805a.setImageResource(i7);
        this.f18806b.setText(charSequence);
        this.f18807c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f18807c.setText(charSequence);
    }
}
